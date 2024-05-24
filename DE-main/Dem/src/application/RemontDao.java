package application;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.cj.jdbc.MysqlDataSource;

public class RemontDao {
	JdbcTemplate jb;
	
	List<Remont> getAll(){
		List<Remont> zavk = jb.query("select * from remont",
				(resultSet ,rowNum) -> {
					Remont zav = new Remont();
					zav.setNomer_zavki(resultSet.getString("Zavka_Id"));
					zav.setStatus_remont(resultSet.getString("Status_remonta"));
					return zav;
		});
		return zavk;
	}
	
	
	
	public RemontDao (MysqlDataSource data) {
		super();
		jb = new JdbcTemplate(data);
		
	}
}
