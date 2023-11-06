package Controller;

import BibliLista.Lista;

@SuppressWarnings("unchecked")

	public class EspalhamentoEx1 {
		
		
		Lista <Integer>[] hashTable = new Lista[100];

		public EspalhamentoEx1() {
			int tamanho = hashTable.length;
			for (int i = 0; i < tamanho; i++) {
				hashTable[i] = new Lista<Integer>();
			}
		}

		public void op(int[] vet) throws Exception {
			for (int i : vet) {
				int pos = hash(i);
				Lista<Integer> l = hashTable[pos];
				if (l.isEmpty()) {
					l.addFirst(i);
				} else {
					l.addLast(i);
				}
			}

			int tamanho = hashTable.length;
			for (int i = 0; i < tamanho; i++) {
				Lista<Integer> l = hashTable[i];
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
			}
		}

		private int hash(int valor) {
			int posicao =  (int) (100*(((Math.sqrt(7)-1)/2*valor)%1));
			
			return posicao;
		}

	}