package application;

public class Remont {
	Integer ID;
	String Status_remont;
	String Nomer_zavki;
	public String getStatus_remont() {
		return Status_remont;
	}
	public void setStatus_remont(String status_remont) {
		Status_remont = status_remont;
	}
	public String getNomer_zavki() {
		return Nomer_zavki;
	}
	public void setNomer_zavki(String nomer_zavki) {
		Nomer_zavki = nomer_zavki;
	}
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public Remont(String status_remont, String nomer_zavki) {
		super();
		Status_remont = status_remont;
		Nomer_zavki = nomer_zavki;
	}
	public Remont() {
		super();
	}
	
	
}
