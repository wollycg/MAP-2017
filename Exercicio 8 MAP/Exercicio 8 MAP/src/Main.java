
public class Main 
{	
	public static void main(String[] args) {
		Funcionario umFuncionario = new Funcionario(Funcionario.DESENVOLVEDOR,
				3200, 1);
		System.out.println("Desenvolvedor = " + umFuncionario.calcularGratificacao());
		
		Funcionario segundoFuncionario = new Funcionario(Funcionario.DBA,
				1900, 2);
		System.out.println("dba = " + segundoFuncionario.calcularGratificacao());
		
		Funcionario terceiroFuncionario = new Funcionario(Funcionario.GERENTE,
				4000, 2);
		System.out.println("gerente = " + terceiroFuncionario.calcularGratificacao());
		
		Funcionario quartoFuncionario = new Funcionario(Funcionario.LIDER,
				5000, 2);
		System.out.println("lider = " + quartoFuncionario.calcularGratificacao());
	}

}
