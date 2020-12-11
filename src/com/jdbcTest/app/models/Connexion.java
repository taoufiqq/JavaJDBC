package com.jdbcTest.app.models;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Connexion {

	private String url;
	private String username;
	private String password;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Connexion(String url, String username, String password) {
		super();
		this.url = url;
		this.username = username;
		this.password = password;
	}

	public Connexion() {

	}

	public Connection connection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(this.url, this.username, this.password);
			return conn;

		} catch (SQLException ex) {
			ex.printStackTrace();
			return null;

		}

	}

}
