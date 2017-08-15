
public class ContaBancariaApp extends ContaBancaria
{
	public ContaBancariaApp(String cpf, String nome, double saldo)
	{
		super(contaNumero, cpf, nome, saldo);
		
	}

	public static void main (String [] args)
	{
		ContaBancaria conta = new ContaBancaria(12345, "023456654"," Fulano", 0);
		System.out.println(conta);
		conta.imprimirSaldo();
		System.out.println("Apos o deposito o saldo é:");
		conta.depositar(100);
		conta.imprimirSaldo();
	}
	

}
