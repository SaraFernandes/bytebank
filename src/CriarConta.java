import java.sql.ClientInfoStatus;
import java.sql.SQLClientInfoException;

public class CriarConta {
	
	public static void main(String[] args) {
		


		Cliente Sara = new Cliente("Sara", "Líder de Projetos");
		
		System.out.println("Profissão:"+ Sara.getProfissao());

		Conta ContaSara = new Conta(123,4355);
		
		ContaSara.setTitular(Sara);
		
		System.out.println("Profissão Sara:"+ ContaSara.getTitular().getProfissao());
		System.out.println("Profissão Sara:"+ ContaSara.getNumero());
		
		System.out.println(Conta.getTotal());
		

	} 

}
