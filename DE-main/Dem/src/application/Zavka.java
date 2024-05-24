package application;

public class Zavka {
	Integer Id;
	String Nomer;
	String data_nach;
	String data_conc;
	String Vid_texniki;
	String Model;
	String Status;
	String Opis;
	Integer tip_remonta;
	Integer master_id;
	Integer User_Id;
	String Kommit;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getNomer() {
		return Nomer;
	}
	public void setNomer(String nomer) {
		Nomer = nomer;
	}
	public String getData_nach() {
		return data_nach;
	}
	public void setData_nach(String data_nach) {
		this.data_nach = data_nach;
	}
	public String getData_conc() {
		return data_conc;
	}
	public void setData_conc(String data_conc) {
		this.data_conc = data_conc;
	}
	public String getVid_texniki() {
		return Vid_texniki;
	}
	public void setVid_texniki(String vid_texniki) {
		Vid_texniki = vid_texniki;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getOpis() {
		return Opis;
	}
	public void setOpis(String opis) {
		Opis = opis;
	}
	public Integer getTip_remonta() {
		return tip_remonta;
	}
	public void setTip_remonta(Integer tip_remonta) {
		this.tip_remonta = tip_remonta;
	}
	public Integer getMaster_id() {
		return master_id;
	}
	public void setMaster_id(Integer master_id) {
		this.master_id = master_id;
	}
	public Integer getUser_Id() {
		return User_Id;
	}
	public void setUser_Id(Integer user_Id) {
		User_Id = user_Id;
	}
	public String getKommit() {
		return Kommit;
	}
	public void setKommit(String kommit) {
		Kommit = kommit;
	}
	public Zavka(String nomer, String data_nach, String data_conc, String vid_texniki, String model, String status,
			String opis, Integer tip_remonta, Integer master_id, Integer user_Id, String kommit) {
		super();
		Nomer = nomer;
		this.data_nach = data_nach;
		this.data_conc = data_conc;
		Vid_texniki = vid_texniki;
		Model = model;
		Status = status;
		Opis = opis;
		this.tip_remonta = tip_remonta;
		this.master_id = master_id;
		User_Id = user_Id;
		Kommit = kommit;
	}
	public Zavka() {
		super();
	}
	
	
}
