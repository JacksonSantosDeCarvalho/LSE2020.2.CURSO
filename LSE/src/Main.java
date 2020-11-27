
public class Main {

	public static void main(String[] args) {
		LSEContato lista = new LSEContato();
		Contato c1 = new Contato ();
		c1.nome = "João";
		c1.telefone = "5436578";
		
		Contato c2 = new Contato ();
		c2.nome = "Maria";
		
		Contato c3 = new Contato ();
		c3.nome = "Ana";
		
		Contato c4 = new Contato ();
		c4.nome = "Jackson";
		
		lista.inserirInicio(c1);
		lista.inserirInicio(c3);
		lista.inserirFim(c2);
		lista.inserirQualquerindice(c4, 1);
		
		lista.imprimirLista();
		System.out.println("O tamanho da lista é: " + lista.tamanho01 ());
		System.out.println("------- Romovendo -------");
		System.out.println("Estou removendo o contato de nome: " + lista.removedor (1).nome);
		lista.imprimirLista ();
		System.out.println(" ");
		System.out.println("Estou removendo o contato de nome: " + lista.removerFinal ().nome);
		lista.imprimirLista ();
		System.out.println(" ");
		System.out.println("Estou removendo o contato de nome: " + lista.removerInicio ().nome);
		lista.imprimirLista ();
		System.out.println("O tamanho da lista é: " + lista.tamanho01 ());
	

	}

}
