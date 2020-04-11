
public class InitialState implements State {

	//override
	public void doAction(char c, Calculator calc)
	{
		if(c > '0' && c <= '9'){
			calc.setState(new StateCharacter());
			calc.getState().doAction(c, calc);
		}
		/*else if(c=='$')
		{
			calc.setState(new EndState());
			calc.getState().doAction(c, calc);
		}*/
		else
		{
			calc.setState(new EndState());
			calc.getState().doAction(c, calc);
		}
	}
}
