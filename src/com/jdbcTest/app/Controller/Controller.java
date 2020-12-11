package com.jdbcTest.app.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jdbcTest.app.models.Connexion;



public class Controller {

	String url ;
	String username ;
	String password ;

	Connexion cnx = new Connexion( "jdbc:mysql://localhost:3306/test","root","");

	public void add(String name, String description, String cin) throws ClassNotFoundException, SQLException {



		String query = " insert into youcodeTest (name, description, cin)" + " values (?, ?, ?)";



		Connection con = cnx.connection();
		PreparedStatement preparedStmt = con.prepareStatement(query);
		preparedStmt.setString(1, name);
		preparedStmt.setString(2, description);
		preparedStmt.setString(3, cin);


		preparedStmt.execute();
	}
}
