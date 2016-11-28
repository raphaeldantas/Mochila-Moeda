import java.util.ArrayList;

public class Moeda {

	/* 
	 *
	 *
	 ALUNO: GOSVÃMI RAPHAEL SANTOS DANTAS
	 PROFESSOR: DANIEL ABELLA
	 DISCIPLINA: ANALISE E TECNICA DE ALGORITMOS
	 FACULDADE: FACISA
	 
	 TROCO MINIMO
	 *
	 */
	
	public final int todas_moedas[] = {100, 50, 25, 10, 5, 1};
	
		public void troco_x(int troco_y){
		
		
		ArrayList<Integer> Qtd_Moedas = new ArrayList<Integer>();
		
		
		int posMoeda = 0;
		
		
		
		while(troco_y > 0){
			int moedas = troco_y / todas_moedas[posMoeda];
			Qtd_Moedas.add(moedas);
			troco_y = troco_y % todas_moedas[posMoeda];
			posMoeda++;
		}
		
		
		
		for (int i = 0; i < Qtd_Moedas.size(); i++) {
			if (Qtd_Moedas.get(i) != 0) {
				System.out.println("- O valor da moeda é: " + todas_moedas[i]); 
				System.out.println("- Temos a quantidade de:  " + Qtd_Moedas.get(i));
			}
			
		}
	}
		
		
}
