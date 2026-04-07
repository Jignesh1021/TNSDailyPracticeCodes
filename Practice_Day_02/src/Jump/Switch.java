package Jump;

public class Switch {

	public static void main(String[] args) {
		char UserInput='u';
		switch (UserInput)
		{
		case 'a':
		case 'A':
			System.out.println(UserInput+ " for apple ");
			break;
		case 'b':
		case 'B':
			System.out.println(UserInput+ " for Ball ");
			break;
		case 'c':
		case 'C':
			System.out.println(UserInput+ " for Cat ");
			break;
		case 'd':
		case 'D':
			System.out.println(UserInput+ " for dog ");
			break;
		case 'e':
		case 'E':
			System.out.println(UserInput+ " for Elephant ");
			break;
			default:
				System.out.println(UserInput+" is other than"
						+ " the availble options so kindly put "
						+ "correct alphabet ");
				break;
			
			
		}

	}

}
