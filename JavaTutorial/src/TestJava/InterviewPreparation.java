package TestJava;

public class InterviewPreparation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="12fd33fvv76vvfgf";
        StringBuilder str1=new StringBuilder();

		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
          if(ch>='0'&& ch<='9')

		{
           str1.append(ch);

		}
	else

		{
		if (str1.length() > 0) 
        {
		System.out.println(str1.toString());
        str1.setLength(0);
        }
		}

		}

	}

}
