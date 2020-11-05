package lv.jak.bujaks;

public class Audzeknis {
	private String vards;
	private String uzvards;
	private Kurss kurss;

	public Audzeknis(String vards, String uzvards) {
		this.vards = vards;
		this.uzvards = uzvards;
		this.kurss = kurss;
	}

	public String getvards() {
		return vards;
	}

	public void setvards(String vards) {
		this.vards = vards;
	}

	public String getuzvards() {
		return uzvards;
	}

	public void setuzvards(String uzvards) {
		this.uzvards = uzvards;
	}

	public Kurss getKurss() {
		return kurss;
	}

	public void setKurss(Kurss kurss) {
		this.kurss = kurss;
	}
}
