
public class PizzaStore 
{	
	protected PizzaBuilder cidade;
	
	public PizzaStore(PizzaBuilder cidade)
	{
		this.cidade = cidade;
	}
	
	public void fazerPizza(){
		cidade.buildSauce();
		cidade.buildDough();
		cidade.buildCheese();
		cidade.buildClams();
		cidade.buildPepperoni();
		cidade.buildVeggies();
	}
	
	public PizzaProduto gePizza()
	{
		return cidade.getPizza();
	}

}
