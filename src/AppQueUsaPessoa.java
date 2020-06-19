import java.util.Scanner;

public class AppQueUsaPessoa {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
				
		String txtNome, txtEmail, txtSalario;
		
		txtNome = input.nextLine();
		txtEmail = input.nextLine();
		txtSalario = input.nextLine();
		
		Pessoa p = new Pessoa(txtNome, txtEmail, Float.parseFloat(txtSalario));
		
		
		System.out.println(p.getNome());
		System.out.println(p.getEmail());
		System.out.println(p.getSalario());
		
		
		input.close();
		
	}

}