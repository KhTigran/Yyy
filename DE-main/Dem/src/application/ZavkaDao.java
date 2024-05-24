package application;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.cj.jdbc.MysqlDataSource;

public class ZavkaDao {
	JdbcTemplate jb;
	
	List<Zavka> getAll(){
		List<Zavka> zavk = jb.query("select * from zavka",
				(resultSet ,rowNum) -> {
					Zavka zav = new Zavka();
					zav.setNomer(resultSet.getString("Nomer"));
					zav.setData_nach(resultSet.getString("Data_nach"));
					zav.setData_conc(resultSet.getString("Data_conc"));
					zav.setVid_texniki(resultSet.getString("Vid_texniki"));
					zav.setModel(resultSet.getString("Model"));
					zav.setStatus(resultSet.getString("Status"));
					zav.setOpis(resultSet.getString("Opisanie"));
					zav.setTip_remonta(resultSet.getInt("Tip_remonta_ID"));
					zav.setMaster_id(resultSet.getInt("Master_ID"));
					zav.setUser_Id(resultSet.getInt("User_ID"));
					zav.setKommit(resultSet.getString("Kommit"));
					return zav;
		});
		return zavk;
	}
	
	void save(Zavka zav) {
		jb.update("insert into zavka(Nomer,Data_nach,Data_conc,Vid_texniki,Model,Status,Opisanie,Tip_remonta_ID,Master_ID,User_ID,Kommit) "
				+ "values (?,?,?,?,?,?,?,?,?,?,?)", 
				zav.getNomer(),zav.getData_nach(),zav.getData_conc(),zav.getVid_texniki(),zav.getModel(),
				zav.getStatus(),zav.getOpis(),zav.getTip_remonta(),zav.getMaster_id(),zav.getUser_Id(),zav.getKommit());
	}
	
	
	
	public ZavkaDao (MysqlDataSource data) {
		super();
		jb = new JdbcTemplate(data);
		
	}

}
