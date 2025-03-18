package TestJava;

public class DuplicateChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name= "Abhilasha";
		int count;    
        
        //Converts given string into character array    
        char unit[] = name.toCharArray();    
            
        System.out.println("Duplicate characters in a given string: ");    
        //Counts each character present in the string    
        for(int i = 0; i <unit.length; i++)
        {    
            count = 1;    
            
            for(int j = i+1; j <unit.length; j++)
            {    
                if(unit[i] == unit[j] && unit[i] != ' ') {    
                   
                	count++;    
                    //Set string[j] to 0 to avoid printing visited character    
                    unit[j] = '0';    
                }    
            }    
            //A character is considered as duplicate if count is greater than 1    
            if(count > 1 && unit[i] != '0')    
                System.out.println(unit[i]);    
        }    
    }    
  
		
		

	}

