package jp.co.ucl.ISOPM.dao;

import java.util.Map;

import org.springframework.util.StringUtils;

import jp.co.ucl.ISOPM.entity.Company;
import jp.co.ucl.ISOPM.entity.PersonalProject;
import jp.co.ucl.ISOPM.entity.ProjectInformation;

public class SqlProvider {

	public String selectCompany(Map<String,Object> param){
		String sql  ="SELECT (select count(*) from bd_project_information where "
	    		+"sale_to_company_id=bd_company_information.company_id or "
	    		+"buy_from_company_id=bd_company_information.company_id) as "
	    		+"project_amount,bd_company_information.company_id,bd_buyer_company.buy_from_company_id, bd_seller_company.sale_to_company_id,"
	    		+ " bd_company_information.company_name, company_tel"
	    		+ " FROM bd_buyer_company, bd_seller_company, bd_company_information"
	    		+ " WHERE bd_company_information.company_id=bd_buyer_company.company_id"
	    		+ " AND bd_company_information.company_id=bd_seller_company.company_id";
		
		Company company = (Company)param.get("company");
		if(company.getCompany_id() != 0){
			sql += " and company_id=" + company.getCompany_id();
		}
		if(!StringUtils.isEmpty(company.getCompany_name())){
			sql += " and company_name=" + company.getCompany_name();
		}
		sql += " GROUP BY bd_company_information.company_id";
		return sql;
	}
	
	public String selectProject(Map<String,Object> param){
		String sql  ="SELECT t1.project_id,t1.start_date,t1.end_date," +
				"t1.project_name,t2.company_name " +
				"from bd_project_information t1 left join bd_company_information t2 " +
				"on t1.sale_to_comapny_id=t2.company_id where 1=1";
		
		ProjectInformation projectInformation = (ProjectInformation)param.get("project");
		if(projectInformation.getProject_id() != 0){
			sql += " and t1.project_id=" + projectInformation.getProject_id();
		}
		if(projectInformation.getSale_to_company_id() != 0){
			sql += " and t1.sale_to_company_id=" + projectInformation.getSale_to_company_id();
		}
		if(projectInformation.getStart_time() != null){
			sql += " and t1.start_date>" + projectInformation.getStart_time();
		}
		if(projectInformation.getEnd_time() != null){
			sql += " and t1.end_time < " + projectInformation.getEnd_time();
		}
		return sql;
	}
	
	public String selectPersonalProject(Map<String,Object> param){
		PersonalProject personalProject = (PersonalProject)param.get("personalProject");
		String sql  ="SELECT t3.project_name,t4.company_name,t1.personal_forecast_id," +
				"t1.Bforecast,t1.Sforecast,t2.personal_project_id,t2.Bmonthly," +
				"t2.Bprice,t2.Btask_time,t2.Smonthly,t2.Sprice,t2.Stask_time," +
				"t2.monthly_profit " +
				"from bd_personal_forecast t1 left join bd_personal_project t2 " +
				"on t1.personal_forecast_id=t2.personal_forecast_id left join " +
				"project_information t3 on t1.project_id=t3.project_id left join " +
				"company_information t4 on t3.sale_to_company_id = t4.company_id" +
				" where staff_id=" + personalProject.getStaff_id();
//		if(personalProject.getYear() != 0){
//			sql += " and t1.year < " + personalProject.getYear();
//		}
//		if(personalProject.getMonth() != 0){
//			sql += " and t1.month < " + personalProject.getMonth();
//		}
//		if(personalProject.getBforecast() != 0){
//			sql += " and t1.Bforecast < " + personalProject.getBforecast();
//		}
//		if(personalProject.getSforecast() != 0){
//			sql += " and t1.Sforecast < " + personalProject.getSforecast();
//		}
		return sql;
	}
	
	public String selectPersonalProjectById(Map<String,Object> param){
		int personal_forecast_id = (Integer)param.get("id");
		String sql  ="SELECT t3.project_name,t4.company_name,t1.personal_forecast_id," +
				"t1.Bforecast,t1.Sforecast,t2.personal_project_id,t2.Bmonthly," +
				"t2.Bprice,t2.Btask_time,t2.Smonthly,t2.Sprice,t2.Stask_time," +
				"t2.monthly_profit " +
				"from bd_personal_forecast t1 left join bd_personal_project t2 " +
				"on t1.personal_forecast_id=t2.personal_forecast_id left join " +
				"project_information t3 on t1.project_id=t3.project_id left join " +
				"company_information t4 on t3.sale_to_company_id = t4.company_id" +
				" where t1.personal_forecast_id=" + personal_forecast_id;
//		if(personalProject.getYear() != 0){
//			sql += " and t1.year < " + personalProject.getYear();
//		}
//		if(personalProject.getMonth() != 0){
//			sql += " and t1.month < " + personalProject.getMonth();
//		}
//		if(personalProject.getBforecast() != 0){
//			sql += " and t1.Bforecast < " + personalProject.getBforecast();
//		}
//		if(personalProject.getSforecast() != 0){
//			sql += " and t1.Sforecast < " + personalProject.getSforecast();
//		}
		return sql;
	}
}
