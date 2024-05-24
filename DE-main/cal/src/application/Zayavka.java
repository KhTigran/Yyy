package application;

public class Zayavka {
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDat() {
		return dat;
	}
	public void setDat(String dat) {
		this.dat = dat;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getOborud() {
		return oborud;
	}
	public void setOborud(Integer oborud) {
		this.oborud = oborud;
	}
	public Integer getIsp() {
		return isp;
	}
	public void setIsp(Integer isp) {
		this.isp = isp;
	}
	Integer id;
	public Zayavka(Integer id, String dat, String status, Integer oborud, Integer isp) {
		super();
		this.id = id;
		this.dat = dat;
		this.status = status;
		this.oborud = oborud;
		this.isp = isp;
	}
	public Zayavka() {
		// TODO Auto-generated constructor stub
	}
	String dat;
	@Override
	public String toString() {
		return "Zayavka [id=" + id + ", dat=" + dat + ", status=" + status + ", oborud=" + oborud + ", isp=" + isp
				+ "]";
	}
	String status;
	Integer oborud;
	Integer isp;
}
