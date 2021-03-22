package rs.ac.bg.fon.ai.MavenBiblioteka;

public class Knjiga {
	
	private String naslov;

	public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) {
		if(naslov == null)
			throw new NullPointerException("Naslov ne sme biti null");
		
		this.naslov = naslov;
	}
	
	

}
