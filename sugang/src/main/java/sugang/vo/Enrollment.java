package sugang.vo;

import java.io.Serializable;

public class Enrollment implements Serializable{
	private int studentId; // 학번
	private int subjectId; // 과목코드
	public Enrollment(int studentId, int subjectId) {
		this.studentId = studentId;
		this.subjectId = subjectId;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studentId;
		result = prime * result + subjectId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Enrollment other = (Enrollment) obj;
		if (studentId != other.studentId)
			return false;
		if (subjectId != other.subjectId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Enrollment [studentId=" + studentId + ", subjectId=" + subjectId + "]";
	}
	
	
	
}
