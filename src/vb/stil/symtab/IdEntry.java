package vb.stil.symtab;

public class IdEntry {
	public static final int VAR = 0;
	public static final int CONST = 1;
	
	private int level = -1;
	private int type = -1;

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}
