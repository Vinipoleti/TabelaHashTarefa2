package Controller;

import BibliLista.Lista;

@SuppressWarnings("unchecked")

	public class EspalhamentoEx2 {
		
		
		Lista <Integer>[] hashTable = new Lista[2];

		public EspalhamentoEx2() {
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
				if (i==0) {
				System.out.print("Pares - ["+i+"]: ");
				} else {
					System.out.print("Ímpar - ["+i+"]: ");
				}
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
			if (valor%2==0) {
			return 0;
			} else {
				return 1;
			}
			}
	}