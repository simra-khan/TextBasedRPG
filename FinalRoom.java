// This class is for the one final room at the very end of the game
// all of the movement is disabled and a congratulations message is shown
public class FinalRoom extends Room {

	public FinalRoom(int s) {
		super(s);
	}

	// blank room is shown
	public void drawRoom() {
		System.out.println("************************");
		for (int i = 0; i < 10; i++) {
			System.out.println("*                      *");
		}
		System.out.println("************************");
	}

	// congratulations message
	public void listDirections() {
		System.out.println("Congratulations! You have reached the end.");
		System.out.println("You succesfully collected all four of the magic words and defeated all of the monsters!");
		System.out.println("You are the best warrior this world has ever seen!");
		Title.gameRunning = false;
	}

	// movement is disabled
	public void moveRoom() {

	}
}
