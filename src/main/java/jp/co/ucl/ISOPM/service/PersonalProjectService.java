package jp.co.ucl.ISOPM.service;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.ucl.ISOPM.dao.PersonalProjectDao;
import jp.co.ucl.ISOPM.entity.PersonalProject;

import net.minidev.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalProjectService {
    @Autowired
    PersonalProjectDao personalProjectDao;

	public List<PersonalProject> getPersonalProjectList(HttpServletRequest request,HttpServletResponse response){
		PersonalProject pp = new PersonalProject();
		pp.setStaff_id(Integer.parseInt(request.getParameter("staff_id")));
		return personalProjectDao.selectPersonalProject(pp);
	}
	
	public PersonalProject getPersonalProjectById(int id){
		return personalProjectDao.getPersonalProjectById(id);
	}
	
	public void addPersonalforecast(HttpServletRequest request,HttpServletResponse response){
		PersonalProject pp = new PersonalProject();
		pp.setProject_id(Integer.parseInt(request.getParameter("project_id")));
		pp.setStaff_id(Integer.parseInt(request.getParameter("staff_id")));
		pp.setBforecast(Double.parseDouble(request.getParameter("Bforecast")));
		pp.setSforecast(Double.parseDouble(request.getParameter("Sforecast")));
		pp.setYear(Integer.parseInt(request.getParameter("year")));
		pp.setMonth(Integer.parseInt(request.getParameter("month")));
		int result = personalProjectDao.addPersonalforecast(pp);
		
		JSONObject obj = new JSONObject();
    	Writer writer = null;
		try {
	    	obj.put("result",result+"");
			writer = response.getWriter();
			writer.write(obj.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void updatePersonalProject(HttpServletRequest request,HttpServletResponse response){
		PersonalProject pp = new PersonalProject();
		pp.setPersonal_forecast_id(Integer.parseInt(request.getParameter("personal_project_id")));
		pp.setBmonthly(Double.parseDouble(request.getParameter("Bmonthly")));
		pp.setBprice(Double.parseDouble(request.getParameter("Bprice")));
		pp.setBtask_time(Double.parseDouble(request.getParameter("Btask_time")));
		pp.setSmonthly(Double.parseDouble(request.getParameter("Smonthly")));
		pp.setSprice(Double.parseDouble(request.getParameter("Sprice")));
		pp.setStask_time(Double.parseDouble(request.getParameter("Stask_time")));
		pp.setMonthly_profit(Double.parseDouble(request.getParameter("monthly_profit")));
		String personalProjectId = request.getParameter("personal_project_id");
		int result = 0;
		if(personalProjectId == null || personalProjectId.isEmpty()){
			result = personalProjectDao.addPersonalProject(pp);
		}else{
			pp.setPersonal_project_id(Integer.parseInt(personalProjectId));
			result = personalProjectDao.updatePersonalProject(pp);
		}
		
		JSONObject obj = new JSONObject();
    	Writer writer = null;
		try {
	    	obj.put("result",result+"");
			writer = response.getWriter();
			writer.write(obj.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public List<PersonalProject> selectStaffListForProject(){
		return personalProjectDao.selectStaffListForProject();
	}
}
