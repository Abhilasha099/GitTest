package TestJava;

public class Compress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "aaabbcca";
        if (str == null || str.isEmpty()) {
            System.out.println(str);
            return;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
        	
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
                
                 
                
            } else  {
                compressed.append(count).append(str.charAt(i - 1));
                count = 1;
            }
            
            
        }

        // Append the last character and its count
        compressed.append(count).append(str.charAt(str.length() - 1));

        System.out.println("Compressed string: " + compressed.toString());
     
    }

}
