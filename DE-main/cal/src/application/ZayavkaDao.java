package application;

import java.util.List;
import java.sql.ResultSet;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.cj.jdbc.MysqlDataSource;

public class ZayavkaDao {
	JdbcTemplate jb;
	
	public List<Zayavka> getAll(){
		List<Zayavka> zayavka = jb.query("select * from zayavka", (resultSet, rowNum) -> {
			Zayavka zav = new Zayavka();
			zav.setId(resultSet.getInt("id"));
			zav.setDat(resultSet.getString("dat"));
			zav.setStatus(resultSet.getString("status"));
			zav.setOborud(resultSet.getInt("oborud"));
			zav.setIsp(resultSet.getInt("isp"));
			return zav;
		});
		return zayavka;
		}
	
	void save(Zayavka zav) {
		jb.update("insert into zayavka (id, dat, status, oborud, isp) values(?,?,?,?,?)",
				zav.getDat(), zav.getStatus(), zav.getOborud(), zav.getIsp(), zav.getId());
	}
	
	void update(Zayavka zav) {
		jb.update("update zayavka set dat=?, status=?, oborud=?, isp=? where (id=?)",
				zav.getId(), zav.getDat(), zav.getStatus(), zav.getOborud(), zav.getIsp());
	}
	
	void delete(Zayavka zav) {
		jb.update("delete from zayavka where id=?",
				zav.getId());
	}
	
	public ZayavkaDao(MysqlDataSource data) {
		super();
		jb = new JdbcTemplate(data);
	}
}

