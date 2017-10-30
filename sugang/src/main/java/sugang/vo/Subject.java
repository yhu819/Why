package sugang.vo;

import java.io.Serializable;

public class Subject implements Serializable{
	
	private int subjectId;
	private String code;
	private String subjectName;
	private int subjectCredit;
	private String day;
	private String time;
	
	public Subject() {}

	public Subject(int subjectId, String code, String subjectName, int subjectCredit, String day, String time) {
		super();
		this.subjectId = subjectId;
		this.code = code;
		this.subjectName = subjectName;
		this.subjectCredit = subjectCredit;
		this.day = day;
		this.time = time;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubjectCredit() {
		return subjectCredit;
	}

	public void setSubjectCredit(int subjectCredit) {
		this.subjectCredit = subjectCredit;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + subjectCredit;
		result = prime * result + subjectId;
		result = prime * result + ((subjectName == null) ? 0 : subjectName.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
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
		Subject other = (Subject) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		if (subjectCredit != other.subjectCredit)
			return false;
		if (subjectId != other.subjectId)
			return false;
		if (subjectName == null) {
			if (other.subjectName != null)
				return false;
		} else if (!subjectName.equals(other.subjectName))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", code=" + code + ", subjectName=" + subjectName
				+ ", subjectCredit=" + subjectCredit + ", day=" + day + ", time=" + time + "]";
	}
	
	

}
