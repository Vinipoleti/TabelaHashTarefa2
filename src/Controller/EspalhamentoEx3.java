package Controller;

import BibliLista.Lista;

@SuppressWarnings("unchecked")
public class EspalhamentoEx3 {

	Lista <Integer>[] hashTable = new Lista[10];
	Lista <Integer>[] hashTable2 = new Lista[5];

	public EspalhamentoEx3() {
		int tamanho = hashTable.length;
		for (int i = 0; i < tamanho; i++) {
			hashTable[i] = new Lista<Integer>();
		}
		int tamanho2 = hashTable2.length;
		for (int i = 0; i < tamanho2; i++) {
			hashTable2[i] = new Lista<Integer>();
		}
		
	}

	public void op() throws Exception {
		
		System.out.println("Tabela Fixa: ");
		Lista<Integer> l = hashTable[0];
		if (l.isEmpty()) {
			l.addFirst(12);
			l.addLast(647);
			l.addLast(158);
			l.addLast(136);
			l.addLast(467);
		}
		
		l = hashTable[1];
		if (l.isEmpty()) {
			l.addFirst(156);
			l.addLast(600);
			l.addLast(551);
			}
		
		l = hashTable[2];
		if (l.isEmpty()) {
			l.addFirst(263);
			l.addLast(414);
			l.addLast(882);
			l.addLast(945);
			l.addLast(914);
			l.addLast(953);
			l.addLast(629);
		}
		
		l = hashTable[3];
		if (l.isEmpty()) {
			l.addFirst(884);
			l.addLast(795);
			l.addLast(194);
			l.addLast(513);
		}
		
		l = hashTable[4];
		if (l.isEmpty()) {
			l.addFirst(591);
			l.addLast(847);
			l.addLast(66);
			l.addLast(337);
			l.addLast(979);
		}
		
		l = hashTable[5];
		if (l.isEmpty()) {
			l.addFirst(768);
			l.addLast(53);
			}
		
		l = hashTable[6];
		if (l.isEmpty()) {
			l.addFirst(114);
			l.addLast(803);
			l.addLast(90);
			l.addLast(339);
			l.addLast(550);
			}
		
		l = hashTable[7];
		if (l.isEmpty()) {
			l.addFirst(574);
			l.addLast(977);
			l.addLast(216);
			l.addLast(99);
			l.addLast(617);
			l.addLast(88);
		}
		
		l = hashTable[8];
		if (l.isEmpty()) {
			l.addFirst(142);
			l.addLast(148);
			l.addLast(227);
			l.addLast(939);
			l.addLast(585);
			l.addLast(338);
			l.addLast(206);
		}
		
		l = hashTable[9];
		if (l.isEmpty()) {
			l.addFirst(569);
			l.addLast(708);
			l.addLast(844);
		}
		
		int tamanho = hashTable.length;
			for (int i = 0; i < tamanho; i++) {
			l = hashTable[i];
			System.out.print("["+i+"]: ");
			if (!l.isEmpty()) {
				int size = l.size();
				for (int j = 0; j < size; j++) {
					System.out.print(l.get(j) + " -> ");
				}
				System.out.println("NULL");
			} else {
				System.out.println("-> NULL");
			}
		} // fim da tabela fixa.	
			
			System.out.println("Nova Tabela: ");
		
		for (int i = 0; i < tamanho; i++) {
			l = hashTable[i];
			if (!l.isEmpty()) {
				int size = l.size();
				for (int j = 0; j < size; j++) {
					int pos = hash(i);
									
					Lista<Integer> novaTabela = hashTable2[pos];
						if (novaTabela.isEmpty()) {
							novaTabela.addFirst(l.get(j));
						} else {
							novaTabela.addLast(l.get(j));
						}
				}
			}
		} // fim da montagem da nova tabela.
		 
		int tamanho2 = hashTable2.length;
		for (int i = 0; i < tamanho2; i++) {
			Lista<Integer> novaTabela = hashTable2[i];
			System.out.print("["+i+"]: ");
			if (!novaTabela.isEmpty()) {
				int size = novaTabela.size();
				for (int j = 0; j < size; j++) {
					System.out.print(novaTabela.get(j) + " -> ");
				}
				System.out.println("NULL");
			} else {
				System.out.println("-> NULL");
			}
		}

		}

	private int hash(int posicao) {
		int novaPosicao = (posicao*2)%5; 
		
		return novaPosicao;
	}
	
	
}
