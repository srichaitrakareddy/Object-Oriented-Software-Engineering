import java.util.Scanner;


public class Main {
	  
	public State s;
	
	public static void main(String[] args) {
		Scanner scanner = null;
		try
		{
			System.out.println("Enter $ at the End of the string");
			scanner = new Scanner(System.in);
			String inputLine = scanner.nextLine();
			
			if (inputLine.charAt(inputLine.length() - 1) != '$')
			{
				System.out.println("Result Can't be generated. Enter $ at the End of the string.");
				System.exit(0);
			}
			
			char strArr[] = inputLine.toCharArray();
			Calculator  calc = new Calculator();
			
			for(char a : strArr)
			{
					calc.doAction(a, calc);
			}
			
			System.out.println();
			System.out.println("Answer for the equation : " + "'" + inputLine + "'" + " = " + calc.getTotal());
			
		}
		catch(Exception e )
		{
			e.printStackTrace();
		}
		finally
		{
			scanner.close();
		}
		
		
	}

}
