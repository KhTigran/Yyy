package application;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.cj.jdbc.MysqlDataSource;

public class SomDao {
	JdbcTemplate jdbc;
	
	public List<Som> getAll(){
		List<Som> som = jdbc.query("select * from som", (resultSet, rowNum) -> {
			Som s = new Som();
			s.setId(resultSet.getInt("id"));
			s.setCost(resultSet.getInt("cost"));
			s.setDiscription(resultSet.getString("discription"));
			return s;
		}) ;
		return som;
	}
	
	void save(Som som) {
		jdbc.update("insert into som (id,cost,discription) values (?,?,?)",
				som.getId(), som.getCost(), som.getDiscription());
	}
	
	void update(Som som) {
		jdbc.update("update som set cost=?, discription=? where (id=?)",
				som.getCost(), som.getDiscription(), som.getId());
	}
	
	void delete(Som som) {
		jdbc.update("delete from som where id=?",
			som.getId());
	}
	
	public SomDao(MysqlDataSource data) {
		super();
		jdbc = new JdbcTemplate(data);
	}
}
