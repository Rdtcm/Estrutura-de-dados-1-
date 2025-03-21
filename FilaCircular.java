public class FilaCircular {
	// Constante e Atributos Privados
	private static int TAM_DEFAULT = 100;
	private int inicio, fim, qtde;
	private int e[ ];
	// Métodos públicos
	public FilaCircular(int tamanho) {// construtor 1 (com tamanho)
		  this.inicio = this.fim = this.qtde = 0;
		  e = new int[tamanho];
	}
	
	public FilaCircular() {  // construtor 2 (sem parâmetros).
		this(TAM_DEFAULT);
	}

	// verifica se a fila está vazia
	public boolean qIsEmpty() {
		return (qtde == 0);
	}
	
	// Verifica se a fila está cheia
    public boolean qIsFull() {
    	return (qtde == e.length); 	
    }
    
    // insere um elemento no final da fila
	public void enqueue(int e) {
		if (! qIsFull( )){
			    this.e[this.fim++] = e;
			    this.fim = this.fim % this.e.length;
			    this.qtde++;
		}
		else 
			    System.out.println("Oveflow - Estouro de Fila");	
	}
	// remove um elemento do final da fila
    public int dequeue() {
    	  int aux;
    	  if (! qIsEmpty( )){
    	   aux =  this.e[ this.inicio];
    	   this.inicio = ++this.inicio % this.e.length;
    	   this.qtde--;
    	   return aux;
    	  }else{
    	    System.out.println("underflow - Esvaziamento de Fila");
    	    return -1;
    	  }
    }
    // retorna quem está no início da fila
    // caso a fila não esteja vazia
	public int front() {
		if (! qIsEmpty())
			return e[inicio];
		else{
			System.out.println("underflow - Esvaziamento de Fila");
			return -1;
		}			
	}
	// retorna quem está no final da fila caso ela não esteja vazia
	public int rear() {
		if (! qIsEmpty()){
			  int pfinal;
			  if (this.fim != 0) pfinal = this.fim - 1;
			  else pfinal = this.e.length - 1;
			  return this.e[pfinal];
		}else{
			  System.out.println("underflow - Esvaziamento de Fila");
			  return -1;
		}			
	}
	// Retorna o total de elementos da fila
	public	int totalElementos(){
		return qtde;
	}

	public String toString() {
		if (qIsEmpty()) {
			return "A fila esta vazia";
		}

		StringBuilder sb = new StringBuilder();
		sb.append(" [");

		int i = inicio;
		for (int j = 0; j < qtde; j++) {
			sb.append(e[i]);
			if (j < qtde - 1) {
				sb.append(", ");
			}
			i = (i+1) % e.length; 
		}

		sb.append("]");
		return sb.toString();
	}
}