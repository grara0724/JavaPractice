package abc;

public class StudentPackage {
	private int no;
	private String name;

	public StudentPackage(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public String toString() {
		return "no:" + no + " name:" + name;

	}

	public void showInfo() {
		System.out.println("no:" + no + "\r\nname:" + name);

	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
