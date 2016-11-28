import java.util.ArrayList;
import java.util.Collections;

public class Principal {

	/* 
	 *
	 *
	 ALUNO: GOSVÃMI RAPHAEL SANTOS DANTAS
	 PROFESSOR: DANIEL ABELLA
	 DISCIPLINA: ANALISE E TECNICA DE ALGORITMOS
	 FACULDADE: FACISA
	 PROBLEMA DA MOCHILA
	 *
	 */
	public static void main(String[] args) {
		
		
		ArrayList<Itens> total_de_Itens = new ArrayList<Itens>();
		total_de_Itens.add(new Itens(10, 60, 6));
		total_de_Itens.add(new Itens(100, 20, 5));
		total_de_Itens.add(new Itens(120, 30, 4));

		ArrayList<Itens> roubados = consertar(total_de_Itens, 200, 40, 30);
		
		for (Itens roubo : roubados) {
			System.out.println(roubo);
		}
		
		}
	
		public void Mochila() {
		}
		
		public static ArrayList<Itens> consertar(ArrayList<Itens> total_itens, int max_itens, int peso_max, int valorpeso) {
			
			ArrayList<Itens> mochila = new ArrayList<Itens>(max_itens);
			
			Collections.sort(total_itens);
			
		    int    pesoDaMochila = 0;
		    int    pos = 0;
		    
		    while(pesoDaMochila > 0) {
		    
		    	Itens x = total_itens.get(pos);
		        
		    	if(pesoDaMochila + x.getPeso() <= peso_max) {
		            mochila.add(x);
		            pesoDaMochila += x.getPeso();
		        }
		    	
		        pos++;
		    }
		    
			return mochila;
			
		}
	}
