
public enum GratificacaoENUM implements Gratificacao
{	
	DESENVOLVEDOR{
	@Override
    public double calcularGratificacao(Funcionario umFuncionario) {
          if (umFuncionario.getNivel() >= 2) {
              return umFuncionario.getSalarioBase() * 1.25;
          }
          return umFuncionario.getSalarioBase() * 1.15;
    	}
	},

	DBA{
	@Override
	public double calcularGratificacao(Funcionario umFuncionario) {
          if (umFuncionario.getNivel() >= 2) {
              return umFuncionario.getSalarioBase() * 1.30;
          }
          return umFuncionario.getSalarioBase() * 1.20;
    	}
	},

	GERENTE{
	@Override
    public double calcularGratificacao(Funcionario umFuncionario) {
          if (umFuncionario.getNivel() >= 2) {
              return umFuncionario.getSalarioBase() * 1.35;
          }
          return umFuncionario.getSalarioBase() * 1.25;
    	}
	},

	LIDER{
	@Override
    public double calcularGratificacao(Funcionario umFuncionario) {
          if (umFuncionario.getNivel() >= 2) {
              return umFuncionario.getSalarioBase() * 1.30;
          }
       	   return umFuncionario.getSalarioBase() * 1.20;
    	}
	}
}


