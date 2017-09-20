
public class Aviao 
{
	private String prefixo;
	private int numTurbinas;
	
	public Aviao(String prefixo, int numTurbinas) 
    {
		Veiculo v = new Veiculo("Boing", 200, 300, 2017, "Preto");
		this.prefixo = prefixo;
		this.numTurbinas = numTurbinas;
	}
}
