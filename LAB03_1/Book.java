package LAB03_1;

public class Book {
	private String boCode;
	private String boTitle;
	private String boAuthor;

	public Book() {
	}

	public Book(String boCode, String boTitle, String boAuthor) {
		this.boAuthor = boAuthor;
		this.boCode = boCode;
		this.boTitle = boTitle;
	}

	public Book(Book bo) {
		this.boAuthor = bo.boAuthor;
		this.boCode = bo.boCode;
		this.boTitle = bo.boTitle;
	}

	public String getBoCode() {
		return this.boCode;
	}

	public String getBoTitle() {
		return this.boTitle;
	}

	public String getAuthor() {
		return this.boAuthor;
	}

	public void setBoCode(String boCode) {
		this.boCode = boCode;
	}

	public void setBoTitle(String boTitle) {
		this.boTitle = boTitle;
	}

	public void setBoAuthor(String boAuthor) {
		this.boAuthor = boAuthor;
	}

	public String toString() {
		return ("Book [Code : " + this.boCode + ", Title : " + this.boTitle + ", Author : " + this.boAuthor + "]");
	}
}