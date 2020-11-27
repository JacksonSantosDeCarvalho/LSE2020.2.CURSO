
public class LSEContato {
	public Contato cabeca = null;
	public Contato cauda = null;
	public int tamanhoDaLista = 0;
	
	public void inserirInicio (Contato novo) {
		if (cabeca == null) {
			cabeca = novo;
			cauda = novo;
		}
		else {
			novo.proximo = cabeca;
			cabeca = novo;
		}
		tamanhoDaLista++;
	}
	public void inserirFim (Contato novo) {
		if (cabeca == null) {
			cabeca = novo;
			cauda = novo;
		}
		else {
			cauda.proximo = novo;
			cauda = novo;
		}
		tamanhoDaLista++;
	}
	public void inserirQualquerindice (Contato novo, int i) {
		if (i == 0) {
			inserirInicio (novo);
		}else if (i == tamanho01 ()) {
			inserirFim (novo);
		} else {
		Contato aux = cabeca;
		for (int j = 1; j < i; j++) {
			aux = aux.proximo;
		}
		novo.proximo = aux.proximo;
		aux.proximo = novo;
		}
		tamanhoDaLista++;
	}
	
	public int tamanho01 () {
		return tamanhoDaLista;
	}
	
	public Contato removerInicio () {
		Contato aux = cabeca;
		if (cabeca == null) {
			System.out.println("Lista Vazia");
			return null;
		}else if (cabeca == cauda) {
			cabeca = null;
			cauda = null;
			tamanhoDaLista --;
			return aux;
		}else {
			cabeca = aux.proximo;
			aux.proximo = null;
			tamanhoDaLista --;
			return aux;
		}
	}
	
	public Contato removerFinal () {
		Contato aux = this.cabeca;
		if (cauda == null) {
			System.out.println("Lista Vazia");
			return null;
		}else if (cauda == cabeca) {
			cabeca = null;
			cauda = null;
			tamanhoDaLista --;
			return aux;
		} else {
			for (int j = 1; j <= tamanhoDaLista - 2; j++){
			aux = aux.proximo;	
		}
		Contato r = aux.proximo;
		aux.proximo = null;
		cauda = aux;
	    tamanhoDaLista--;
		return r;
		}
	}
	
	public Contato removedor (int i) {
		if (i == 0) {
			return removerInicio ();
		}else if (i == tamanhoDaLista - 1) {
			return removerFinal();
		}else {
			Contato aux = cabeca;
			for (int cont = 0; cont < i - 1; cont++) {
				aux = aux.proximo;
			}
			Contato r = aux.proximo;
			aux.proximo = r.proximo;
			r.proximo = null;
			tamanhoDaLista --;
			return r;
		}
		
	}
	
	public void imprimirLista () {
		if (cauda == null) {
			System.out.println("Lista Vazia!");
		}
		else {
			Contato aux = cabeca;
			while (aux != null) {
				System.out.print("| "+aux.nome+" | ");
				aux = aux.proximo;
			}
		}
	}
}
