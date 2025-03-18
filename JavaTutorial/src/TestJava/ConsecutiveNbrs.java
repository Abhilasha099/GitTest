package TestJava;

public class ConsecutiveNbrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String input = "abc12def34gh56ijkl78mn90";
        StringBuilder consecutiveNumbers = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar >= '0' && currentChar <= '9')
            {
                consecutiveNumbers.append(currentChar);
            }
            else 
            {
                if (consecutiveNumbers.length() > 0) 
                {
                    System.out.println(consecutiveNumbers.toString());
                    consecutiveNumbers.setLength(0);
                }
            }
        }

        // Check if there are any remaining consecutive numbers at the end of the string
        if (consecutiveNumbers.length() > 0) {
           // System.out.println(consecutiveNumbers.toString());
        }

	}

}
