package com.nsksoft.repositry;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerRepositry {

	@Autowired
	DataSource datasource;
	
	public void getCustomer(String mobile)
	{
		
		try {
			Connection conn = datasource.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from customer where mobile=" +mobile);
			if (rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	}
	
	

