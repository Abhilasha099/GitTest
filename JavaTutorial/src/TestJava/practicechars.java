package TestJava;

public class practicechars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="12fd3h44nn22";
	StringBuilder str=new StringBuilder();
        String consnb = null;
for(int i=0;i<name.length()-1;i++)
	
{
	 char currentChar = name.charAt(i);

	if(currentChar>='0' && currentChar<='9')
		
	{
		str.append(currentChar);
	}
	
	else
	{
		if(str.length()>0)
		{
		System.out.println(str.toString());
		str.setLength(0);
		
		}
	}
}

if(str.length()>0)
{
	System.out.println(str.toString());
	}


			
		}

	}


