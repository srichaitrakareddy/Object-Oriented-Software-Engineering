
public class EndState implements State {

	public void doAction(char c, Calculator calc) {
		 if(c == '$'){
			 System.out.println();
			System.out.println("Result will be generated as Input String is CORRECT");
		 }
		 else{
			System.out.println("Result Can't be generated as Input String is WRONG");
			System.exit(0);
		 }
	}
	
}
