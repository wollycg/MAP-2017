import java.util.HashSet;
import java.util.Set;

public class AluguelChale
{	
	private Set<String> chalesDisponiveis;

	public AluguelChale()
	{	
		this.chalesDisponiveis=  new HashSet<>();
		chalesDisponiveis.add("001");
		chalesDisponiveis.add("002");
	}
	
	public boolean disponibilidade(String chale){
		return chalesDisponiveis.remove(chale);
	}
}
