package LAB03_1;

public class Student {
	private String stID;
	private String stName;
	private String stClass;

	public Student() {
		this.stID = "";
		this.stName = "";
		this.stClass = "";
	}

	public Student(String stID, String stName, String stClass) {
		this.stID = stID;
		this.stName = stName;
		this.stClass = stClass;
	}

	public Student(Student st) {
		this.stID = st.stID;
		this.stName = st.stName;
		this.stClass = st.stName;
	}

	public String getStID() {
		return this.stID;
	}

	public String getStName() {
		return this.stName;
	}

	public String getStClass() {
		return this.stClass;
	}

	public void setStID(String id) {
		this.stID = id;
	}

	public void setStName(String name) {
		this.stName = name;
	}

	public void setStClass(String Class) {
		this.stClass = Class;
	}

	public String toString() {
		return ("Student [ID : " + this.stID + ",  Name : " + this.stName + ",  Class : " + this.stClass + "]");
	}
}