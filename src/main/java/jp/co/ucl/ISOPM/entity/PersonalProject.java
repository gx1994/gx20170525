package jp.co.ucl.ISOPM.entity;

public class PersonalProject {
	private int personal_forecast_id;
	private int project_id;
	private int staff_id;
	private double Bforecast;
	private double Sforecast;
	private int year;
	private int month;
	
	private int personal_project_id;
	private double Bmonthly;
	private double Bprice;
	private double Btask_time;
	private double Smonthly;
	private double Sprice;
	private double Stask_time;
	private double monthly_profit;
	
	private String project_name;//案件名称
	private String staff_name;
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getSale_to_company_name() {
		return sale_to_company_name;
	}
	public void setSale_to_company_name(String sale_to_company_name) {
		this.sale_to_company_name = sale_to_company_name;
	}
	private String sale_to_company_name;//买方公司名称
	
	public int getPersonal_forecast_id() {
		return personal_forecast_id;
	}
	public void setPersonal_forecast_id(int personal_forecast_id) {
		this.personal_forecast_id = personal_forecast_id;
	}
	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	public int getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}
	public double getBforecast() {
		return Bforecast;
	}
	public void setBforecast(double bforecast) {
		Bforecast = bforecast;
	}
	public double getSforecast() {
		return Sforecast;
	}
	public void setSforecast(double sforecast) {
		Sforecast = sforecast;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getPersonal_project_id() {
		return personal_project_id;
	}
	public void setPersonal_project_id(int personal_project_id) {
		this.personal_project_id = personal_project_id;
	}
	public double getBmonthly() {
		return Bmonthly;
	}
	public void setBmonthly(double bmonthly) {
		Bmonthly = bmonthly;
	}
	public double getBprice() {
		return Bprice;
	}
	public void setBprice(double bprice) {
		Bprice = bprice;
	}
	public double getBtask_time() {
		return Btask_time;
	}
	public void setBtask_time(double btask_time) {
		Btask_time = btask_time;
	}
	public double getSmonthly() {
		return Smonthly;
	}
	public void setSmonthly(double smonthly) {
		Smonthly = smonthly;
	}
	public double getSprice() {
		return Sprice;
	}
	public void setSprice(double sprice) {
		Sprice = sprice;
	}
	public double getStask_time() {
		return Stask_time;
	}
	public void setStask_time(double stask_time) {
		Stask_time = stask_time;
	}
	public double getMonthly_profit() {
		return monthly_profit;
	}
	public void setMonthly_profit(double monthly_profit) {
		this.monthly_profit = monthly_profit;
	}
	@Override
	public String toString() {
		return "PersonalProject [personal_forecast_id=" + personal_forecast_id
				+ ", project_id=" + project_id + ", staff_id=" + staff_id
				+ ", Bforecast=" + Bforecast + ", Sforecast=" + Sforecast
				+ ", year=" + year + ", month=" + month
				+ ", personal_project_id=" + personal_project_id
				+ ", Bmonthly=" + Bmonthly + ", Bprice=" + Bprice
				+ ", Btask_time=" + Btask_time + ", Smonthly=" + Smonthly
				+ ", Sprice=" + Sprice + ", Stask_time=" + Stask_time
				+ ", monthly_profit=" + monthly_profit + "]";
	}
	
}
