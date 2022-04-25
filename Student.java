

public class Student {
	int rgm;
	SubjectList subjects = new SubjectList();
	
	public SubjectList getSubjects() {
		return subjects;
	}

	public void setdisciplinas(SubjectList subjects) {
		this.subjects = subjects;
	}

	
	public int getRgm() {
		return rgm;
	}

	public void setRgm(int rgm) {
		this.rgm = rgm;
	}
}
