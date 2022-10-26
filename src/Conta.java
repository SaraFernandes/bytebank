public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int totalContas = 0; // É um atributo da Classe e não de cada objeto (tipo static) a ser criando. Utilizado para contar a qtd de conta criadas

	
	
	
	public Conta(int agencia, int numero) {
		// Construtor = Médotdo de inicialização. Ele só executado uma única vez para um objeto
		Conta.totalContas ++;
		setAgencia(agencia);
		setNumero(numero);
		
		System.out.println("Construtor da classe conta sendo inicializado e criando uma conta");
	}
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotal(){
	    return Conta.totalContas;
	}

}