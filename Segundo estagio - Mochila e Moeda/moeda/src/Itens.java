public class Itens implements Comparable<Itens> {

	private int peso; 
	private int valorTotal; 
	private int valorpeso;

	public int getValorpeso() {
		return valorpeso;
	}


	public void setValorpeso(int valorpeso) {
		this.valorpeso = valorpeso;
	}


	public Itens(int peso, int valorTotal, int valorpeso) {
		this.peso = peso;
		this.valorTotal = valorTotal;
		this.valorpeso = valorpeso;
	}



	public double preco_kg() {
		return valorTotal / peso;
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(int valor) {
		this.valorTotal = valor;
	}

	@Override
	public int compareTo(Itens outro) {

		if (this.valorTotal < outro.valorTotal) {
			return -1;
		}

		if (this.valorTotal > outro.valorTotal) {
			return 1;
		}
		
		return 0;
	}

	@Override
	public String toString() {
		return "Peso dos itens: " + peso + " O valor é total: " + valorTotal;
	}
}