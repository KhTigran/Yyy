package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.cj.jdbc.MysqlDataSource;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class LoginController implements Initializable{

    @FXML
    private Button btn1;

    @FXML
    private TextField txt1;

    @FXML
    private TextField txt2;

    MysqlDataSource dataSource;
    JdbcTemplate jdbc;
    
    @FXML
    void onbtn1(ActionEvent event) throws IOException {
    	String login = txt1.getText();
    	String pass = txt2.getText();
    	
    	jdbc = new JdbcTemplate(dataSource);
    	var rez = jdbc.query("select pass from usr where login='"+login+"'", (resultSet, rowNum) -> {
    		return resultSet.getString("pass");
    	});
    	if (rez.size()>0 && rez.get(0).equals(pass)) {
    		try {
    			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
    			Stage st = (Stage) btn1.getScene().getWindow(); 
    			Scene scene = new Scene(root,400,400);
    			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
    			st.setScene(scene);
    			st.show();
    		} catch(Exception e) {
    			e.printStackTrace();
    		}
    	
    	}else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setContentText("Неверный логин или пароль");
			alert.showAndWait();
		}
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		dataSource = new MysqlDataSource();
		dataSource.setServerName("localhost");
		dataSource.setPort(3306);
		dataSource.setDatabaseName("dem");
		dataSource.setUser("root");
		dataSource.setPassword("");
	}

}

