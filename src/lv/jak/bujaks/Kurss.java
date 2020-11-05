package lv.jak.bujaks;

public class Kurss {
	private String nosaukums;
	private int skolenuSkaits;
	private Audzeknis audzeknis;

	public Kurss(String nosaukums, Audzeknis audzeknis) {
		this.nosaukums = nosaukums;
		this.audzeknis = audzeknis;
	}

	public String getNosaukums() {
		return nosaukums;
	}

	public void setNosaukums(String nosaukums) {
		this.nosaukums = nosaukums;
	}

	public int getSkolenuSkaits() {
		return skolenuSkaits;
	}

	public void setSkolenuSkaits(int skolenuSkaits) {
		this.skolenuSkaits = skolenuSkaits;
	}

}
