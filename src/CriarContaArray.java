import java.sql.ClientInfoStatus;
import java.sql.SQLClientInfoException;
import java.util.ArrayList;

public class CriarContaArray {
	
	public static void main(String[] args) {
		
		
		ArrayList<Cliente> clientes = new ArrayList<>();
		Cliente cc1 = new Cliente("Sara Fernandes", "Líder de projetos");//Criei uma referência/variável cc1 que recebe um objeto do tipo 'Cliente'

		
		Cliente arrayCliente [] = new Cliente[5]; // Criei um Array de de Clientes
		

		
		//cc1.setProfissao("teste");
		arrayCliente[0] = cc1;
		
		System.out.println("Dados Cliente: "+arrayCliente[0].getProfissao());
		
		
		
for (int i=0; i<=arrayCliente.length;i++) {//length retorna o tamanho do array
			
			System.out.println("Dados Cliente FOR: "+arrayCliente[i].getProfissao());
			System.out.println("Dados Cliente FOR: "+arrayCliente[i].getNome());
			
		}
		


	} 

}
