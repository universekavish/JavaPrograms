package basicPrograms;

public class NestedSwitchExample{
	public static void main(String[] args){
		char branch = 'C';
		int year = 4;
		switch(year){
			case 1:
				System.out.println("English, Maths, Science");
				break;
			case 2:
				switch(branch){
					case 'C':
						System.out.println("OS, Java, DSA");
						break;
					case 'E':
						System.out.println("Logic, MicroProcessor");
						break;
					case 'M':
						System.out.println("Machines");
						break;
				}
			break;
			case 4:
				switch(branch){
					case 'C':
						System.out.println("Comm, Media");
						break;
					case 'E':
						System.out.println("Logic");
						break;
				}
			break;
			default: System.out.println("Not graduated");
			break;
		}
	}
}

