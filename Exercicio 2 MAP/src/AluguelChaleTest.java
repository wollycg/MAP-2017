
public class AluguelChaleTest 
{	
	public static void main (String[]args)
	{	
		alugarChale("001");
		alugarChale("001");
		
	}
	private static void alugarChale( String chale){
		AluguelChale a = new AluguelChale();
		System.out.println(a.disponibilidade(chale));
	}

}
