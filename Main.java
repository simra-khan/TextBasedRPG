// This is a text based RPG with 4 floors and 100 rooms in total
// Users can move throughout the rooms using the keyboard
// There are plaques with magic words on them, and they must be collected before monsters can be defeated

public class Main {
	static Room[][] theRooms = new Room[4][25];

	public static void main(String args[]) {
		// titlescreen
		Title.drawTitle();
		// sets the directions/exits for all 100 rooms
		setRooms();
		// draws the rooms (runs the game)
		while (Title.gameRunning) {
			theRooms[Room.currentFloor][Room.currentRoom].drawRoom();
			theRooms[Room.currentFloor][Room.currentRoom].listDirections();
			theRooms[Room.currentFloor][Room.currentRoom].moveRoom();
		}
	}

	// sets all the rooms' directions, exits, magic words, and monsters
	public static void setRooms() {
		theRooms[0][0] = new Room(8);
		theRooms[0][1] = new Room(11);
		theRooms[0][2] = new Room(10);
		theRooms[0][3] = new Room(8);
		theRooms[0][4] = new Room(10);
		theRooms[0][5] = new Room(5);
		theRooms[0][6] = new Room(15);
		theRooms[0][7] = new Room(15);
		theRooms[0][8] = new Room(13);
		theRooms[0][9] = new Room(7);
		theRooms[0][10] = new Room(8);
		theRooms[0][11] = new Room(15);
		theRooms[0][12] = new Room(7);
		theRooms[0][13] = new Room(2, true);
		theRooms[0][14] = new Room(10);
		theRooms[0][15] = new Room(6);
		theRooms[0][16] = new Room(6);
		theRooms[0][17] = new Room(8);
		theRooms[0][18] = new Room(10);
		theRooms[0][19] = new BossRoom(6, "JIYAI");
		theRooms[0][20] = new Room(1);
		theRooms[0][21] = new PasswordRoom(5, "JIYAI");
		theRooms[0][22] = new Room(7);
		theRooms[0][23] = new Room(5);
		theRooms[0][24] = new Room(7);

		theRooms[1][0] = new Room(3);
		theRooms[1][1] = new Room(2, true);
		theRooms[1][2] = new BossRoom(9, "VILROE");
		theRooms[1][3] = new Room(10);
		theRooms[1][4] = new Room(3);
		theRooms[1][5] = new Room(6);
		theRooms[1][6] = new Room(8);
		theRooms[1][7] = new Room(9);
		theRooms[1][8] = new PasswordRoom(13, "VILROE");
		theRooms[1][9] = new Room(12);
		theRooms[1][10] = new Room(14);
		theRooms[1][11] = new Room(13);
		theRooms[1][12] = new Room(11);
		theRooms[1][13] = new Room(11);
		theRooms[1][14] = new Room(7);
		theRooms[1][15] = new Room(6);
		theRooms[1][16] = new Room(8);
		theRooms[1][17] = new Room(7);
		theRooms[1][18] = new Room(5);
		theRooms[1][19] = new Room(10);
		theRooms[1][20] = new Room(5);
		theRooms[1][21] = new Room(13);
		theRooms[1][22] = new Room(9);
		theRooms[1][23] = new Room(9);
		theRooms[1][24] = new Room(7);

		theRooms[2][0] = new Room(3);
		theRooms[2][1] = new Room(8);
		theRooms[2][2] = new Room(10);
		theRooms[2][3] = new Room(3);
		theRooms[2][4] = new Room(3);
		theRooms[2][5] = new Room(6);
		theRooms[2][6] = new Room(5);
		theRooms[2][7] = new Room(12);
		theRooms[2][8] = new Room(14);
		theRooms[2][9] = new Room(12);
		theRooms[2][10] = new Room(5);
		theRooms[2][11] = new Room(9);
		theRooms[2][12] = new Room(15);
		theRooms[2][13] = new Room(7);
		theRooms[2][14] = new Room(1);
		theRooms[2][15] = new Room(3, true);
		theRooms[2][16] = new Room(8);
		theRooms[2][17] = new PasswordRoom(15, "BAJOC");
		theRooms[2][18] = new Room(9);
		theRooms[2][19] = new Room(10);
		theRooms[2][20] = new Room(5);
		theRooms[2][21] = new BossRoom(7, "BAJOC");
		theRooms[2][22] = new Room(5);
		theRooms[2][23] = new Room(9);
		theRooms[2][24] = new Room(7);

		theRooms[3][0] = new Room(2);
		theRooms[3][1] = new Room(9);
		theRooms[3][2] = new Room(9);
		theRooms[3][3] = new Room(9);
		theRooms[3][4] = new Room(10);
		theRooms[3][5] = new Room(8);
		theRooms[3][6] = new Room(9);
		theRooms[3][7] = new Room(9);
		theRooms[3][8] = new Room(10);
		theRooms[3][9] = new Room(6);
		theRooms[3][10] = new Room(6);
		theRooms[3][11] = new Room(8);
		theRooms[3][12] = new FinalRoom(0);
		theRooms[3][13] = new Room(6);
		theRooms[3][14] = new Room(6);
		theRooms[3][15] = new Room(6);
		theRooms[3][16] = new Room(5);
		theRooms[3][17] = new Room(9);
		theRooms[3][18] = new BossRoom(7, "TISUCAT");
		theRooms[3][19] = new Room(6);
		theRooms[3][20] = new Room(5);
		theRooms[3][21] = new Room(9);
		theRooms[3][22] = new Room(9);
		theRooms[3][23] = new Room(9);
		theRooms[3][24] = new PasswordRoom(7, "TISUCAT");

		for (int j = 0; j < theRooms.length; j++) {
			for (int i = 0; i < theRooms[0].length; i++) {
				theRooms[j][i].createRoom();
			}
		}
	}
}
