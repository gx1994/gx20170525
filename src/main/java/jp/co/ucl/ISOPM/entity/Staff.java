package jp.co.ucl.ISOPM.entity;

import javax.management.loading.PrivateClassLoader;

import java.util.Date;

/**
 * Staff Entity
 * Created by ZhenYang on 2017/02/19.
 */
public class Staff extends BaseEntity {

    private int staffId;

    private String staffName;

    private String sex;

    private Date birthday;
    
    private String staffTel;
    
    private String nationality;
     
    private String staffMail;
    
    private String staffAddress;
   
	private String company;
    
    private String department;
    
    private Date entryTime;
    
    private String profileUrl;
    
    private String avatarUrl;

	


	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	

	public String getStaffTel() {
		return staffTel;
	}

	public void setStaffTel(String staffTel) {
		this.staffTel = staffTel;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getStaffMail() {
		return staffMail;
	}

	public void setStaffMail(String staffMail) {
		this.staffMail = staffMail;
	}
	
	public String getStaffAddress() {
	    return staffAddress;
	}

	public void setStaffAddress(String staffAddress) {
		this.staffAddress = staffAddress;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	
//
//	public String getBirthday() {
//		return birthday;
//	}
//
//	public void setBirthday(String birthday) {
//		this.birthday = birthday;
//	}
//
//	public String getEntryTime() {
//		return entryTime;
//	}
//
//	public void setEntryTime(String entryTime) {
//		this.entryTime = entryTime;
//	}

	public String getProfileUrl() {
		return profileUrl;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}

	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}
    public Staff() {
		
	}

	

}
