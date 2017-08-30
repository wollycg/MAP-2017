
public class ContaBancaria 
{
	protected static int contaNumero;
	protected String cpf;
	protected String nome;
	protected double saldo;
	
	
	
	public ContaBancaria(int contaNumero, String cpf, String nome, double saldo) 
	{
		this.contaNumero = contaNumero;
		this.cpf = cpf;
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public ContaBancaria(String cpf)
	{
		this.cpf = cpf;
	}
	
	
	
	public void depositar(double quantia)
	{	
		this.saldo += quantia;
		
	}

	public void imprimirSaldo()
	{
		System.out.println("o saldo é " + saldo);
	}

	

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

	public static int getContaNumero() {
		return contaNumero;
	}

	public static void setContaNumero(int contaNumero) {
		ContaBancaria.contaNumero = contaNumero;
	}

	@Override
	public String toString() {
		return "ContaBancaria [contaNumero =" + contaNumero + " , cpf=" + cpf + ", nome=" + nome + ", saldo=" + saldo + "]";
	}

	

	

	

}
