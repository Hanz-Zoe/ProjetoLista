


public class Subject {

	// Atributos da disciplina 
	String name;
	Double grade;
	Subject next;
	
	// Getters and Setters nome

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	// Getters and Setters nota

	public Double getGrades() {
		return grade;
	}
	public void setGrades(Double grade) {
		this.grade = grade;
	}
	// Getters and Setters next
	
	public Subject getNext() {
		return next;
	}
	public void setNext(Subject next) {
		this.next = next;
	}
	
}
