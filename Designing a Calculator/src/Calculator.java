
public class Calculator {
	
	private State current_state;
	private int total =0;
	private boolean operator = true; 
	
	public Calculator()
	{
		current_state = new InitialState();
	}
	
	public void doAction(char c, Calculator calc)
    {
        current_state.doAction(c,this);
    }
	
	public void setTotal(int total)
	{
		if(operator)
		{
			this.total += total;
		}
		else
		{
			this.total -= total;
		}
	}
	
	public void setOperator(boolean operator)
	{
		this.operator = operator;
	}
	
	public int getTotal()
	{
		return total;
	}
	
	public State getState()
	{
		return current_state;
	}
	
	public void setState(State s)
	{
		current_state = s;
	}
}
