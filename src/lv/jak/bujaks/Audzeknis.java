package lv.jak.bujaks;

public class Audzeknis {

	String vards;
	String uzvards;
	int atzime;

	public Audzeknis() {

	}

	public Audzeknis(String vards, String uzvards, int atzime) {
		this.vards = vards;
		this.uzvards = uzvards;
		this.atzime = atzime;
	}

	public String getVards() {
		return vards;
	}

	public void setVards(String vards) {
		this.vards = vards;
	}

	public String getUzvards() {
		return uzvards;
	}

	public void setUzvards(String uzvards) {
		this.uzvards = uzvards;
	}

	public int getAtzime() {
		return atzime;
	}

	public void setAtzime(int atzime) {
		this.atzime = atzime;
	}
}