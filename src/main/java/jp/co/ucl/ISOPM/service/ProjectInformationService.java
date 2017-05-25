package jp.co.ucl.ISOPM.service;

import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.ucl.ISOPM.dao.ProjectInformationDao;
import jp.co.ucl.ISOPM.entity.ProjectInformation;

import net.minidev.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectInformationService {
	@Autowired
    ProjectInformationDao projectInformationDao;
	public List<ProjectInformation> selectProject(HttpServletRequest request,HttpServletResponse response){
		ProjectInformation pi = new ProjectInformation();
		String project_id = request.getParameter("project_id");
		if(project_id != null && ! project_id.isEmpty()){
			pi.setProject_id(Integer.parseInt(project_id));
		}
		String sale_to_company_id = request.getParameter("sale_to_company_id");
		if(sale_to_company_id != null && !sale_to_company_id.isEmpty()){
			pi.setSale_to_company_id(Integer.parseInt(sale_to_company_id));
		}
		String date = request.getParameter("time");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ");  
//	    Date date = sdf.parse(dateString);
		if(date!=null && !date.isEmpty()){
			String dates[] = date.split(" - ");
			try{
				if(dates.length > 0){
					pi.setStart_time(sdf.parse(dates[0]));
				}
				if(dates.length > 1){
					pi.setEnd_time(sdf.parse(dates[1]));
				}
			}catch (java.text.ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		List<ProjectInformation> list = projectInformationDao.selectProject(pi);
		for(ProjectInformation projectInformation:list){
			projectInformation.setDate(format.format(projectInformation.getStart_time())+"-"+format.format(projectInformation.getEnd_time()));
		}
		return list;
	}
	
	public void deleteProjectInformation(HttpServletRequest request,HttpServletResponse response){
		int project_id = Integer.parseInt(request.getParameter("project_id"));
		int result = projectInformationDao.deleteProjectInformation(project_id);
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
	
	public void addProjectInformation(HttpServletRequest request,HttpServletResponse response){
		ProjectInformation pi = new ProjectInformation();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		pi.setProject_name(request.getParameter("project_name"));
		try {
			pi.setStart_time(format.parse(request.getParameter("start_time")));
			pi.setEnd_time(format.parse(request.getParameter("end_time")));
		} catch (java.text.ParseException e) {
			e.printStackTrace();
		}
		pi.setSale_to_company_id(Integer.parseInt(request.getParameter("sale_to_company_id")));
		pi.setBuy_from_company_id(Integer.parseInt(request.getParameter("buy_from_company_id")));
		pi.setProject_place(request.getParameter("project_place"));
		pi.setSalesman_name(request.getParameter("salesman_name"));
		pi.setSalesman_tel(request.getParameter("salesman_tel"));
		pi.setOsalesman_name(request.getParameter("Osalesman_name"));
		pi.setOsalesman_tel(request.getParameter("Osalesman_tel"));
		int result = projectInformationDao.addProjectInformation(pi);
		
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
	
	public void updateProjectInformation(HttpServletRequest request,HttpServletResponse response){
		ProjectInformation pi = new ProjectInformation();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		pi.setProject_name(request.getParameter("project_name"));
		try {
			pi.setStart_time(format.parse(request.getParameter("start_time")));
			pi.setEnd_time(format.parse(request.getParameter("end_time")));
		} catch (java.text.ParseException e) {
			e.printStackTrace();
		}
		pi.setSale_to_company_id(Integer.parseInt(request.getParameter("sale_to_company_id")));
		pi.setBuy_from_company_id(Integer.parseInt(request.getParameter("buy_from_company_id")));
		pi.setProject_place(request.getParameter("project_place"));
		pi.setSalesman_name(request.getParameter("salesman_name"));
		pi.setSalesman_tel(request.getParameter("salesman_tel"));
		pi.setOsalesman_name(request.getParameter("Osalesman_name"));
		pi.setOsalesman_tel(request.getParameter("Osalesman_tel"));
		pi.setProject_id(Integer.parseInt(request.getParameter("project_id")));
		int result = projectInformationDao.updateProjectInformation(pi);
		
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
	
	public ProjectInformation getProjectInformationById(int id){
		return projectInformationDao.getProjectInformationById(id);
	}
}
