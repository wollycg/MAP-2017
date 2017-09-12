
public class Pedidos
{	
	public static void main(String []args)
	{
		PizzaStore cidade = new PizzaStore(new ChicagoBuilder());
		cidade.fazerPizza();
		PizzaProduto pizza = cidade.gePizza();
		System.out.println("Pizza: "+ pizza.Dough +"/" + pizza.Souce + "/"
							+ pizza.Cheese +"/" + pizza.Pepperoni + "/" + pizza.Veggies +"/"
							+ pizza.cidade);

		cidade = new PizzaStore(new NewYorkBuilder());
		cidade.fazerPizza();
		pizza = cidade.gePizza();
		System.out.println("Pizza: "+ pizza.Dough +"/" + pizza.Souce + "/"
							+ pizza.Cheese +"/" + pizza.Pepperoni + "/" + pizza.Veggies +"/" 
							+ pizza.cidade + "/"+ pizza.Clams);

	}
}
