package boardgame;

public class Position {
	private Integer row;
	private Integer Collunm;
	
	public Position() {
	}

	public Position(Integer row, Integer collunm) {
		super();
		this.row = row;
		Collunm = collunm;
	}

	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public Integer getCollunm() {
		return Collunm;
	}

	public void setCollunm(Integer collunm) {
		Collunm = collunm;
	}
	
	public void setValues(int row, int collunm) {
	}

	@Override
	public String toString() {
		return "Position [row=" + row + ", Collunm=" + Collunm + "]";
	}
	
	
}
