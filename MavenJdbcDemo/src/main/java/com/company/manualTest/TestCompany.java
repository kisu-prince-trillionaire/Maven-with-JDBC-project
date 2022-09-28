package com.company.manualTest;

import com.company.bean.Company;
import com.company.dao.CompanyDao;

public class TestCompany {

	public static void main(String[] args) {
		addCompany();
//		updateCompany();
//		getAllCompany();
	}

	public static void addCompany() {
		try {
			Company company = new Company(111, "Bhavna", 30000, "Banglore", "2022-10-11");
			CompanyDao obj = new CompanyDao();
			int i = obj.addCompany(company);
			if (i > 0) {
				System.out.println("Record Inserted");
			} else {
				System.out.println("Not Inserted");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	public static void updateCompany() {
		try {
			Company company = new Company(103, "Bhavna", 30000, "Banglore", "2022-10-11");
			CompanyDao obj = new CompanyDao();
			int i = obj.updateCompany(company);
			if (i > 0) {
				System.out.println("Record Updated");
			} else {
				System.out.println("Not Updated");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void getAllCompany() {
		try {
			Company company = new Company();
			CompanyDao obj = new CompanyDao();
			int i = obj.updateCompany(company);
			if (i > 0) {
				System.out.println("Record Inserted");
			} else {
				System.out.println("Not Inserted");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
