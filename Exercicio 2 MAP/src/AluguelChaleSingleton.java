import java.util.HashSet;
import java.util.Set;

public class AluguelChaleSingleton 
{
	private static final AluguelChaleSingleton INSTANCE= new AluguelChaleSingleton();
	private Set<String> chalesDisponiveis;
	
	
	
	public static AluguelChaleSingleton getInstance() {
		return INSTANCE;
	}

	public AluguelChaleSingleton()
	{	
		this.chalesDisponiveis=  new HashSet<>();
		chalesDisponiveis.add("001");
		chalesDisponiveis.add("002");
	}

	public boolean disponibilidade(String chale){
		return chalesDisponiveis.remove(chale);
	}
}
