package jp.co.ucl.ISOPM.entity;

import javax.management.loading.PrivateClassLoader;

import java.util.Date;

/**
 * 登录人员信息
 */
public class User extends BaseEntity {
       private int login_id;
       private String uesr_name;
       private String password;
       private int privilege_id;
       private String privilege_name;
       private String avatar_url;
       
 





	public String getUesr_name() {
		return uesr_name;
	}





	public void setUesr_name(String uesr_name) {
		this.uesr_name = uesr_name;
	}





	public String getPassword() {
		return password;
	}





	public void setPassword(String password) {
		this.password = password;
	}





	





	public int getLogin_id() {
		return login_id;
	}





	public void setLogin_id(int login_id) {
		this.login_id = login_id;
	}





	public int getPrivilege_id() {
		return privilege_id;
	}





	public void setPrivilege_id(int privilege_id) {
		this.privilege_id = privilege_id;
	}





	public String getPrivilege_name() {
		return privilege_name;
	}





	public void setPrivilege_name(String privilege_name) {
		this.privilege_name = privilege_name;
	}





	public String getAvatar_url() {
		return avatar_url;
	}





	public void setAvatar_url(String avatar_url) {
		this.avatar_url = avatar_url;
	}


}
