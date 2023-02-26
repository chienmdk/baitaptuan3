package LAB03_1;

public class LibraryCard {
	private long lbCode;
	private String owner;
	private int borrowCount;

	public LibraryCard() {
	}

	public LibraryCard(long lbCode, String owner, int borrowCount) {
		this.lbCode = lbCode;
		this.owner = owner;
		this.borrowCount = borrowCount;
	}

	public long getLbCode() {
		return this.lbCode;
	}

	public String getOwner() {
		return this.owner;
	}

	public int getBorrowCount() {
		return this.borrowCount;
	}

	public void setLbCode(long code) {
		this.lbCode = code;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setBorrowCount(int borrowCount) {
		this.borrowCount = borrowCount;
	}

	public void checkOut(int num) {
		if (num > 0) {
			System.out.println("Trả số tiền đã mượn sách theo yêu cầu : " + num);
		} else {
			System.out.println("Bạn không cần trả tiền vì chưa mượn 1 cuốn sách nào cả !");
		}
	}

	public String toString() {
		return ("LibraryCard [ Code : " + this.lbCode + ", Owner : " + this.owner + ", BorrowCount : "
				+ this.borrowCount + "]");
	}
}
