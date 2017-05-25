package jp.co.ucl.ISOPM.entity;


import javax.management.loading.PrivateClassLoader;

import java.util.Date;

/**
 * Company Entity
 */
public class Company extends BaseEntity {

    private int company_id;

    private String company_name;
    
    private String company_tel;
     
    private String company_mail;
    
    private String company_address;
    
    private int sale_to_company_id;
    
    private int buy_from_company_id;
    
    private int project_amount;

	

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getCompany_tel() {
		return company_tel;
	}

	public void setCompany_tel(String company_tel) {
		this.company_tel = company_tel;
	}

	public String getCompany_mail() {
		return company_mail;
	}

	public void setCompany_mail(String company_mail) {
		this.company_mail = company_mail;
	}

	public String getCompany_address() {
		return company_address;
	}

	public void setCompany_address(String company_address) {
		this.company_address = company_address;
	}

	public int getCompany_id() {
		return company_id;
	}

	public void setCompany_id(int company_id) {
		this.company_id = company_id;
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

	public int getProject_amount() {
		return project_amount;
	}

	public void setProject_amount(int project_amount) {
		this.project_amount = project_amount;
	}

	@Override
	public String toString() {
		return "Company [company_id=" + company_id + ", company_name="
				+ company_name + ", company_tel=" + company_tel
				+ ", company_mail=" + company_mail + ", company_address="
				+ company_address + ", sale_to_company_id="
				+ sale_to_company_id + ", buy_from_company_id="
				+ buy_from_company_id + ", project_count=" + project_amount
				+ "]";
	}

	

}
