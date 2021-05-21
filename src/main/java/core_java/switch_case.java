package core_java;

public class switch_case {

	public static void main(String[] args) {
		int marks=75;
		int mm=2;

		if(marks>80) {
			System.out.println("First Division");
			mm=1;
		}
		else {
			if(marks>=60  && marks<80) {
				mm=2;
			}
			else {
				if(marks>=35  && marks<60) {
					mm=3;
				}
				else {
					mm=4;
				}
			}
		}

		switch(mm) {
		case 1 : System.out.println("Grade A");
		break;
		case 2 : System.out.println("Grade B");
		break;
		case 3 : System.out.println("Grade C");
		break;
		case 4 : System.out.println("Grade D");
		break;
		default : System.out.println("invalid choice");
		}

	}


}


	


