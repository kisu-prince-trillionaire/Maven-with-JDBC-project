package com.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bhavna.jdbcDemo.MyConnection;
import com.company.bean.Company;

public class CompanyDao {
	public int addCompany(Company company) {
		int i = 0;
		PreparedStatement statement = null;
		Connection connection = null;
		try {
			connection = MyConnection.getConnection();
			statement = connection.prepareStatement("INSERT INTO COMPANY VALUES(?,?,?,?,?)");
			int vcid = company.getcId();
			String vName = company.getName();
			long vTurnOver = company.getTurnOver();
			String vAdress = company.getAddress();
			String vDate = company.getDateOfEstb();
//			String sql = "INSERT INTO COMPANY VALUES(?,?,?,?,?)";
			statement.setInt(1, vcid);
			statement.setString(2, vName);
			statement.setLong(3, vTurnOver);
			statement.setString(4, vAdress);
			statement.setString(5, vDate);
			i = statement.executeUpdate();
		} catch(Exception e) {
			System.out.println(e);
		}
		return i;
	}
	
	public int updateCompany(Company company) {
		int i = 0;
		PreparedStatement statement = null;
		Connection connection = null;
		try {
			connection = MyConnection.getConnection();
			int vcid = company.getcId();
			String vName = company.getName();
			String sql = "UPDATE COMPANY SET  NAME = '" + vName + "' WHERE C_ID = " + vcid; 
			statement = connection.prepareStatement(sql);

			i = statement.executeUpdate(sql);
		} catch(Exception e) {
			System.out.println(e);
		}
		return i;
	}
	
	public Company getCompanyById(int cid) {
		int i = 0;
		PreparedStatement statement = null;
		Connection connection = null;
		Company company = new Company();
		ResultSet res = null;
		try {
			connection = MyConnection.getConnection();
			String sql = "SELECT * FROM COMPANY WHERE C_ID = " + cid;
			statement = connection.prepareStatement(sql);
			res = statement.executeQuery(sql);
			if(res.next()) {
				company.setcId(res.getInt(1));
				company.setName(res.getString(2));
				company.setTurnOver(res.getLong(3));
				company.setAddress(res.getString(4));
				company.setDateOfEstb(res.getString(5));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return company;
	}
	
	public List<Company> getAllCompany() {
		int i =0;
		PreparedStatement statement = null;
		Connection connection = null;
		List<Company> companyList = new ArrayList<Company>();
		ResultSet res = null;
		try {
			connection = MyConnection.getConnection();
			String sql = "SELECT * FROM COMPANY";
			statement = connection.prepareStatement(sql);
			
			res = statement.executeQuery(sql);
			if(res.next()) {
				do {
					Company company = new Company();
					company.setcId(res.getInt(1));
					company.setName(res.getString(2));
					company.setTurnOver(res.getLong(3));
					company.setAddress(res.getString(4));
					company.setDateOfEstb(res.getString(5));
					
					companyList.add(company);
				}while(res.next());
			}else {
				System.out.println("Please try again");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return companyList;
	}
}
