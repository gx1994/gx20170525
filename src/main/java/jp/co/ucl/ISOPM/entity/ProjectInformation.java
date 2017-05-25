package jp.co.ucl.ISOPM.entity;

import java.util.Date;

public class ProjectInformation extends BaseEntity {

	/**
	 * @param 案件信息管理
	 */
	private int project_id ;
	
    private String project_name;
	
	private Date start_time;
	
	private Date end_time;
	
	private int sale_to_company_id;
	
	private int buy_from_company_id;
	
	private String project_place;
	
	private String salesman_name;
	
	private String salesman_tel;
	
	private String Osalesman_name;
	
	private String Osalesman_tel;
	
	private String date;
	

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public Date getStart_time() {
		return start_time;
	}

	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}

	public Date getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}


	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public int getSale_to_company_id() {
		return sale_to_company_id;
	}

	public void setSale_to_company_id(int sale_to_company_id) {
		this.sale_to_company_id = sale_to_company_id;
	}

	public int getBuy_from_company_id() {
		return buy_from_company_id;
	}

	public void setBuy_from_company_id(int buy_from_company_id) {
		this.buy_from_company_id = buy_from_company_id;
	}

	public String getProject_place() {
		return project_place;
	}

	public void setProject_place(String project_place) {
		this.project_place = project_place;
	}

	public String getSalesman_name() {
		return salesman_name;
	}

	public void setSalesman_name(String salesman_name) {
		this.salesman_name = salesman_name;
	}

	public String getSalesman_tel() {
		return salesman_tel;
	}

	public void setSalesman_tel(String salesman_tel) {
		this.salesman_tel = salesman_tel;
	}

	public String getOsalesman_name() {
		return Osalesman_name;
	}

	public void setOsalesman_name(String osalesman_name) {
		Osalesman_name = osalesman_name;
	}

	public String getOsalesman_tel() {
		return Osalesman_tel;
	}

	public void setOsalesman_tel(String osalesman_tel) {
		Osalesman_tel = osalesman_tel;
	}

	
	
	
}
