package zad3;

public class SportskiKlub implements Comparable<SportskiKlub> {
	private String ime;
	private String sport;
	private int brojClenovi;
	
	public SportskiKlub(String ime, String sport, int brojClenovi) {
		this.ime = ime;
		this.sport = sport;
		this.brojClenovi = brojClenovi;
	}
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	
	public int getBrojClenovi() {
		return brojClenovi;
	}
	public void setBrojClenovi(int brojClenovi) {
		this.brojClenovi = brojClenovi;
	}
	
	public int compareTo(SportskiKlub obj) {
		SportskiKlub a = (SportskiKlub) obj;
		if (this.ime.equals(a.ime))
			return 0;
		else
			return this.ime.compareTo(a.ime);
	}
}