import java.util.HashSet;
import java.util.Set;

public class AluguelChaleSingleton 
{
	private static  AluguelChaleSingleton INSTANCE= new AluguelChaleSingleton();
	private Set<String> chalesDisponiveis;
	
	
	
	public static AluguelChaleSingleton getInstance() 
	{	
		if(INSTANCE== null){
			synchronized (AluguelChaleSingleton.class){
				if(INSTANCE == null){
					INSTANCE = new AluguelChaleSingleton();
				}
			}
			
		}
		return INSTANCE;
	}

	private AluguelChaleSingleton()
	{	
		this.chalesDisponiveis=  new HashSet<>();
		chalesDisponiveis.add("001");
		chalesDisponiveis.add("002");
	}

	public boolean disponibilidade(String chale){
		return chalesDisponiveis.remove(chale);
	}
}
