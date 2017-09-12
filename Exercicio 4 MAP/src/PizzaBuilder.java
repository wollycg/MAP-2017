

public abstract class PizzaBuilder 
{	
	protected PizzaProduto pizza = new PizzaProduto();
	public abstract void buildDough();
	public abstract void buildSauce();
	public abstract void buildCheese();
	public abstract void buildVeggies();
	public abstract void buildPepperoni();
	public abstract void buildClams();
	public abstract void buildCidade();
	
	public PizzaProduto getPizza()
	{
		return pizza;
	}
	
	


}
