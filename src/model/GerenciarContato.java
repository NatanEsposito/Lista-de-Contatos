package model;
import java.util.Scanner;

public class GenrenciarContatos {
public static final int ma = 50;
private int indice;
private final Scanner input=new Scanner(System.in);
private final Contato[] c= new Contato[ma];
private Contato[] contato;

public void criar() {
	Contato c = new Contato();
	System.out.println("criando o calabreso");
if(indice<ma) {
	System.out.println("informe o nome do cagaTronco");
	c.setNome(input.nextLine());
	System.out.println("informe o telefone do linguico");
	c.setTel(input.nextLine());
	System.out.println("informe o email do valesco ");
	c.setEmail(input.nextLine());
indice++;
}else {
	System.out.println("a memoria do baguio ta lotada");
}
}

public int pesquisar(String tel) {
	
	for(int i=0; i<ma;i++) {
		Contato c = contato[i];
		if(c!=null) {
			if(tel.equals(c.getTel())){
			return i;
		}
	}
}
	return -1;
}

public void excluir() {
	System.out.println("excluir o mano ai");
    System.out.println("informe o  tel do joelmo a ser excluido");
    String tel = input.nextLine();
    int i = pesquisar(tel);
if(i!=0) {
	c[i] = null;
}
}

public void atualizar() {
	System.out.println("atualizar o caba");
    System.out.println("informe o tel do mano a ser excluido");
    String tel = input.nextLine();
    int i = pesquisar(tel);
if(i>=0) {
	Contato c = contato[i];
	System.out.println("fala o novo nome do calabreso");
	c.setNome(input.nextLine());
	System.out.println("fala o novo tel do maracujo");
	c.setTel(input.nextLine());
	System.out.println("fala o novo email do mano ai");
	c.setEmail(input.nextLine());
}
}
public void exibir() {
	System.out.println("fala o tel do periculoso");
	String tel=input.nextLine();
	int i = pesquisar(tel);
	if(i>=0) {
		Contato c = contato[i];
		System.out.println("novo nome: "+ c.getNome());
		System.out.println("novo tel: "+ c.getTel());
		System.out.println("novo email: "+ c.getEmail());
		
	}else {
		System.out.println("esse mano nao existe aqui");
	}
}

public void listar() {
	System.out.println("lista da povo que ta salvo ai");
	for(int i=0;i<ma; i++) {
		Contato c = contato[i];
		if(c!=null) {
		System.out.println(""+c);
		}
	}
}

public  void menu(String[]args) {
	 while( true ) {
	        System.out.println("Gestão de Alunos");
	        System.out.println("(C)adastrar novo aluno");
	        System.out.println("(E)xibir detalhes de um aluno");
	        System.out.println("(R)remover aluno");
	        System.out.println("(A)tualizar aluno");
	        System.out.println("(S)air");
	        char opcao = input.nextLine().toUpperCase().charAt(0);
	        if (opcao == 'C') {
	            criar();
	        } else if (opcao == 'L') {
	            listar();
	        } else if (opcao == 'R') {
	            excluir();
	        } else if (opcao == 'A') {
	            atualizar();
	        } else if (opcao == 'E') {
	            exibir();
	        } else if (opcao == 'S') {
	            System.out.println("Ate breve");
	            break;
	        }
	    }
	}



public static void main(String[]args) {
new GerenciarContatos().menu(args);	
}
}





