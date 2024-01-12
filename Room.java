// This class determines the directions/exits of the rooms, draws the rooms, and moves the rooms based on user input
import java.util.Scanner;

public class Room {
	boolean north;
	boolean east;
	boolean south;
	boolean west;
	boolean up = false;
	static int currentRoom = 0;
	static int currentFloor = 0;
	// the type of room based on how many and which exits are there
	int style;

	public Room(int s) {
		this.style = s;
	}

	public Room(int s, boolean u) {
		this.style = s;
		this.up = u;
	}

	// sets all of the different exits based on the room style
	public void createRoom() {
		if (this.style == 0) {
			this.north = false;
			this.east = false;
			this.south = false;
			this.west = false;

		} else if (this.style == 1) {
			this.north = true;
			this.east = false;
			this.south = false;
			this.west = false;

		} else if (this.style == 2) {
			this.north = false;
			this.east = true;
			this.south = false;
			this.west = false;

		} else if (this.style == 3) {
			this.north = false;
			this.east = false;
			this.south = true;
			this.west = false;

		} else if (this.style == 4) {
			this.north = false;
			this.east = false;
			this.south = false;
			this.west = true;

		} else if (this.style == 5) {
			this.north = true;
			this.east = true;
			this.south = false;
			this.west = false;

		} else if (this.style == 6) {
			this.north = true;
			this.east = false;
			this.south = true;
			this.west = false;

		} else if (this.style == 7) {
			this.north = true;
			this.east = false;
			this.south = false;
			this.west = true;

		} else if (this.style == 8) {
			this.north = false;
			this.east = true;
			this.south = true;
			this.west = false;

		} else if (this.style == 9) {
			this.north = false;
			this.east = true;
			this.south = false;
			this.west = true;

		} else if (this.style == 10) {
			this.north = false;
			this.east = false;
			this.south = true;
			this.west = true;

		} else if (this.style == 11) {
			this.north = false;
			this.east = true;
			this.south = true;
			this.west = true;

		} else if (this.style == 12) {
			this.north = true;
			this.east = false;
			this.south = true;
			this.west = true;

		} else if (this.style == 13) {
			this.north = true;
			this.east = true;
			this.south = false;
			this.west = true;

		} else if (this.style == 14) {
			this.north = true;
			this.east = true;
			this.south = true;
			this.west = false;

		} else if (this.style == 15) {
			this.north = true;
			this.east = true;
			this.south = true;
			this.west = true;

		}
	}

	// draws the room based on which exits are there
	public void drawRoom() {
		System.out.println("************************");
		for (int i = 0; i < 3; i++) {
			System.out.print("*");
			System.out.print("        ");
			if (this.north) {
				System.out.print("|");
			} else {
				System.out.print(" ");
			}
			System.out.print("    ");
			if (this.north) {
				System.out.print("|");
			} else {
				System.out.print(" ");
			}
			System.out.print("        ");
			System.out.print("*");
			System.out.println();
		}
		System.out.print("*");
		if (this.west) {
			System.out.print("--------");
		} else {
			System.out.print("        ");
		}

		if (this.north) {
			System.out.print("      ");
		} else {
			System.out.print("------");
		}

		if (this.east) {
			System.out.print("--------");
		} else {
			System.out.print("        ");
		}
		System.out.print("*");
		System.out.println();
		for (int i = 0; i < 2; i++) {
			System.out.print("*");
			System.out.print("        ");
			if (this.west) {
				System.out.print(" ");
			} else {
				System.out.print("|");
			}
			if (this.up) {
				System.out.print("####");
			} else {
				System.out.print("    ");
			}
			if (this.east) {
				System.out.print(" ");
			} else {
				System.out.print("|");
			}
			System.out.print("        ");
			System.out.print("*");
			System.out.println();
		}
		System.out.print("*");
		if (this.west) {
			System.out.print("--------");
		} else {
			System.out.print("        ");
		}
		if (this.south) {
			System.out.print("      ");
		} else {
			System.out.print("------");
		}
		if (this.east) {
			System.out.print("--------");
		} else {
			System.out.print("        ");
		}
		System.out.print("*");
		System.out.println();
		for (int i = 0; i < 3; i++) {
			System.out.print("*");
			System.out.print("        ");
			if (this.south) {
				System.out.print("|");
			} else {
				System.out.print(" ");
			}
			System.out.print("    ");
			if (this.south) {
				System.out.print("|");
			} else {
				System.out.print(" ");
			}
			System.out.print("        ");
			System.out.print("*");
			System.out.println();
		}
		System.out.println("************************");
		System.out.println();

	}

	// prompts the user for input, so that the room can be moved
	public void listDirections() {
		System.out.println("Click a key to move in that direction.");
		if (this.north) {
			System.out.print("N:Go North ");
		}
		if (this.east) {
			System.out.print("E:Go East ");
		}
		if (this.south) {
			System.out.print("S:Go South ");
		}
		if (this.west) {
			System.out.print("W:Go West ");
		}
		if (this.up) {
			System.out.print("U:Go Up ");
		}
		System.out.println();

	}

	// moves the room based on the user input
	public void moveRoom() {
		Scanner theScanner = new Scanner(System.in);
		boolean roomMoved = false;
		while (!roomMoved) {
			String input = theScanner.nextLine();
			if (input.equals("E") && this.east) {
				Room.currentRoom++;
				roomMoved = true;
			} else if (input.equals("W") && this.west) {
				Room.currentRoom--;
				roomMoved = true;
			} else if (input.equals("S") && this.south) {
				Room.currentRoom = Room.currentRoom + 5;
				roomMoved = true;
			} else if (input.equals("N") && this.north) {
				Room.currentRoom = Room.currentRoom - 5;
				roomMoved = true;
			} else if (input.equals("U") && this.up) {
				Room.currentFloor++;
				Room.currentRoom = 0;
				roomMoved = true;
			} else {
				System.out.println("Please enter a valid direction.");
			}
		}
	}
}
