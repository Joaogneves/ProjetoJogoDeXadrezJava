package boardgame;

public class Position {
	private Integer row;
	private Integer Colunm;
	
	public Position() {
	}

	public Position(Integer row, Integer collunm) {
		super();
		this.row = row;
		Colunm = collunm;
	}

	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public Integer getColunm() {
		return Colunm;
	}

	public void setColunm(Integer colunm) {
		Colunm = colunm;
	}
	
	public void setValues(int row, int collunm) {
	}

	@Override
	public String toString() {
		return "Position [row=" + row + ", Colunm=" + Colunm + "]";
	}
	
	
}
