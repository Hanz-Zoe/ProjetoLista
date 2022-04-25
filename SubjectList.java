

public class SubjectList {


	Subject first = null;
	Subject last = null;
	int size = 0;
	
	// Função para verificar se está vazia
	public boolean isVoid() {
		if (size == 0)
			return true;
		
		return false;
	}
	//Identificar o tamanho da Lista
	public int ListSize() {
		return (size);
	}


	
	
	// Inserir no inicio da lista

	public void insertSubjectStart(Subject item) {
		if (isVoid())
			first = last = item;
		else {
			item.next = first;
			first = item;
		}
		size++;
	}
	// Inserir no fim da lista

	public void insertEnd(Subject item) {
		if (isVoid())
			first = last = item;
		else {
			last.next = item;
			last = item;
		}
		size++;
	}
	
	public void DisplayList() {
		Subject temp = first;
		if (!isVoid()) {
			for (int i = 0; i < size; i++) {
				System.out.println("Disciplina "+(i+1)+" | nome: "+temp.name+" | nota: "+temp.grade);
				temp = temp.next;
			}
		}
	}
}	
