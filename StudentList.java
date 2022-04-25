

// lista students
public class StudentList {
	Student[] students = new Student[60];  //quantidade maxima de students na lista
	int listSize = 0;
	
	public boolean ListVoid() {
		return(listSize == 0);
	}
	
	public boolean isFull() {
		return (listSize == students.length);
	}
	public int SizeList() {
		return listSize;
	}
	public Student search(int pos) {
		if((pos >= listSize) || (pos < 0)) {
			return null;
		}
		return students[pos];
	}
	// comparar o rgm do aluno com o rgm do aluno que está na posição pos

	public boolean compare(Student a1, Student a2) {
		if(a1.rgm == a2.rgm) {
			return false;
		}
		else {
			return true;
		}
	}
	public int retornarPosicao(Student aluno) {
		for (int i= 0; i<listSize; i++) {
			if(compare(students[i], aluno)) {
				return i;
			}
			
		}
		return -1;
	}
	public void moveRight(int pos) {
		for(int i = listSize; i > pos; i--) {
			students[i] = students[i-1];
		}
		
	}
	public boolean insertStudent(int pos, Student a1) {
		if(isFull() || (pos> listSize) || (pos < 0)) {
			return false;
		}
		moveRight(pos);
		students[pos] = a1;
		listSize++;
		return true;
	}
	public void moveLeft(int pos) {
		for(int i = pos; i <(listSize -1); i++) {
			students[i] = students[i+1];
		}
	}
	public boolean remove(int pos) {
		if( (pos>= listSize) || (pos < 0)) {
			return false;
		}
		moveLeft(pos);
		
		listSize--;
		return true;
	}
	public void viewList() {
        for (int i=0; i<listSize; i++) {
            System.out.println("\nAluno " + (i + 1) + "\nRGM: " + students[i].rgm);
            System.out.println("Disciplinas: ");
            students[i].getSubjects().DisplayList();
        }
    }
}
