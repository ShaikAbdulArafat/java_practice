package collections;

//		Creating a Student Class 

public class Student {
	private String studentName;
	private int studentId;
	
	public Student(){}
	
	public Student(String studentName, int studentId){
		this.setStudentName(studentName);
		this.setStudentId(studentId);
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	
	}
