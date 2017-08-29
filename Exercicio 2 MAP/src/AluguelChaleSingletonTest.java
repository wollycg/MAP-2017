
public class AluguelChaleSingletonTest 
{	
	public static void main(String []args)
	{	
		alugarChale("001");
		alugarChale("001");
		
	}

	private static void alugarChale( String chale){
		AluguelChaleSingleton a = AluguelChaleSingleton.getInstance();
		System.out.println(a.disponibilidade(chale));
	}
}
