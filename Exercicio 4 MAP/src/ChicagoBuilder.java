
public class ChicagoBuilder extends PizzaBuilder
{

	@Override
	public void buildDough() {
		pizza.Dough = "grossa"; 
	}

	@Override
	public void buildSauce() {
		pizza.Souce = "tomate";
		
	}

	@Override
	public void buildCheese() {
		pizza.Cheese = "mussarela";
		
	}

	@Override
	public void buildVeggies() {
		pizza.Veggies = "Cebola";
	}

	@Override
	public void buildPepperoni() {
		pizza.Pepperoni = "picante";
	}

	@Override
	public void buildClams() {
		pizza.Clams = "xxxx";
		
	}

	@Override
	public void buildCidade() {
		pizza.cidade = "Chicago";
		
	}

}
