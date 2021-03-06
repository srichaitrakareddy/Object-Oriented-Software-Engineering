
public class StatePlusAddition implements State{
	
	private int n =0;

	public void doAction(char c, Calculator calc) {
		if(c >= '0' && c <= '9'){
			 n = n*10+Integer.parseInt(String.valueOf(c));  
		}
		else if (c == '+'){
			calc.setTotal(n);
			calc.setState(new StatePlus());
			calc.getState().doAction(c, calc);
		}
		else if (c == '-'){
			calc.setOperator(true);
			calc.setTotal(n);
			calc.setState(new StateMinusAddition());
			calc.getState().doAction(c, calc);
		}
		else if (c == '$'){
			calc.setTotal(n);
			calc.setState(new EndState());
			calc.getState().doAction(c, calc);
		}
		else{
			calc.setState(new EndState());
			calc.getState().doAction(c, calc);
		}

	}

}
