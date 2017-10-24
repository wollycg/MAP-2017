
public class GratificacaoGerente implements Gratificacao
{	
	public double calcularGratificacao(Funcionario umFuncionario) {
    if (umFuncionario.getNivel() >= 2) {
        return umFuncionario.getSalarioBase() * 1.55;
    	}
    return umFuncionario.getSalarioBase() * 1.55;
	}

}
