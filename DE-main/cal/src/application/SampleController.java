package application;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.cj.jdbc.MysqlDataSource;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class SampleController implements Initializable{

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private ListView<Som> lv1;

    @FXML
    private TextField txt1;

    @FXML
    private TextField txt2;

    @FXML
    void onbtn1(ActionEvent event) {
    	Integer cost = Integer.parseInt(txt1.getText());
    	somDao = new SomDao(dataSource);
    	Som som1 = new Som(null, cost, txt2.getText());
    	somDao.save(som1);
    	som.clear();
    	som.addAll(somDao.getAll());
    	lv1.refresh();
    }

    @FXML
    void onbtn2(ActionEvent event) {
    	Integer cost = Integer.parseInt(txt1.getText());
    	somDao = new SomDao(dataSource);
    	Som som1 = (Som)lv1.getSelectionModel().getSelectedItem();
    	som1.setCost(cost);
    	som1.setDiscription(txt2.getText());
    	somDao.update(som1);
    	txt1.clear();
    	txt2.clear();
    	som.clear();
    	som.addAll(somDao.getAll());
    	lv1.refresh();
    }
    
    MysqlDataSource dataSource;
    JdbcTemplate jdbc;
    ObservableList<Som> som = FXCollections.observableArrayList();
    SomDao somDao;
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		dataSource = new MysqlDataSource();
		dataSource.setServerName("localhost");
		dataSource.setPort(3306);
		dataSource.setDatabaseName("dem");
		dataSource.setUser("root");
		dataSource.setPassword("");
		somDao = new SomDao(dataSource);
		som.addAll(somDao.getAll());
		lv1.setItems(som);
		lv1.getItems().clear();
		som.clear();
		som.addAll(somDao.getAll());
		lv1.setItems(som);
	}

}
