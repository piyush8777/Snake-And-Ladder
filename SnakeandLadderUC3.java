
public class SnakeandLadderUC3 {
	public static void main(String[] args) {
    int option = (int) ((Math.random() * 3) + 1);
			switch (option) {
		case 1:
			System.out.println("Ladder");
			break;

		case 2:
			System.out.println("Snake");
			break;

		default:
			System.out.println("Stay in the same position");
			break;

		}


	}

}
