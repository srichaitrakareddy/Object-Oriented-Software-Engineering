
public class StateMinus implements State{


		public void doAction(char c, Calculator calc)
		{
			if(c == '-')
			{
				calc.setOperator(false);
				return;
			}
			else if(c == '+')
			{
				calc.setOperator(true);
				calc.setState(new StatePlus());
				calc.getState().doAction(c, calc);
			}
			else if(c >= '0' && c <= '9')
			{
				calc.setState(new StateMinusAddition());
				calc.getState().doAction(c, calc);
			}
			else if(c == '&')
			{
				c = '.';
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
