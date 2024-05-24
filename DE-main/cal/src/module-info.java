module cal {
	requires javafx.controls;
	requires javafx.fxml;
	requires spring.jdbc;
	requires mysql.connector.j;
	requires java.sql;
	requires javafx.graphics;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
}
