package core_java;

public class factorial {

	public static void main(String[] args) {
		int number = 6;
        long fact = 1;
        int i = 1;
        while(i<=number)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
	}

