module Dem {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires mysql.connector.j;
	requires java.sql;
	requires spring.jdbc;
	requires java.desktop;
	
	opens application to javafx.graphics, javafx.fxml, javafx.base;
}
