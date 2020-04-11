
public class StatePlus implements State{
	
	private boolean plusflag = false;
	
	public void doAction(char c, Calculator calc)
	{

		if(c == '+' && !plusflag)
		{
			calc.setOperator(true);
			plusflag = true;
			return;
		}
		else if(c == '-')
		{
			calc.setOperator(false);
			calc.setState(new StateMinus());
			calc.getState().doAction(c, calc);
		}
		else if(c >= '0' && c <= '9')
		{
			calc.setState(new StatePlusAddition());
			calc.getState().doAction(c, calc);
		}
		else if(c == '$')
		{
			c = '&';
			calc.setState(new EndState());
			calc.getState().doAction(c, calc);
			/*System.out.println("Result Can't be generated as Input String is WRONG");
			System.exit(0);*/
		}
		else
		{
			calc.setState(new EndState());
			calc.getState().doAction(c, calc);
		}
	}
}
