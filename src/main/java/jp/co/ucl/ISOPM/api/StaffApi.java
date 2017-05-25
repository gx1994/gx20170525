package jp.co.ucl.ISOPM.api;

import jp.co.ucl.ISOPM.entity.Staff;
import jp.co.ucl.ISOPM.service.StaffService;

import org.apache.ibatis.reflection.wrapper.BaseWrapper;
import org.apache.ibatis.reflection.wrapper.ObjectWrapper;
import org.apache.naming.java.javaURLContextFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RequestMapping("/api/staff")
@RestController
public class StaffApi {
    @Autowired
    StaffService staffService;

    
//	@RequestMapping(value = "createStaff", method = RequestMethod.POST)
//    public void createStaff(HttpServletRequest request, HttpServletResponse response) {
//	response.setContentType("application/json");
//	   Staff staff = new Staff();
//	     // 类型转换格式化
////	     SimpleDateFormat dbirthday = new SimpleDateFormat("yyyy-MM-dd");
////         SimpleDateFormat dentryTime = new SimpleDateFormat("yyyy-MM-dd");
////	     Date birthday = new Date();
////		try {
////			birthday = dbirthday.parse(request.getParameter("birthday"));
////			staff.setBirthday(birthday);
////		} catch (ParseException e1) {
////			// TODO Auto-generated catch block
////			e1.printStackTrace();
////		}
////	     Date entryTime = new Date();
////	     try {
////	    	  entryTime = dentryTime.parse(request.getParameter("entryTime"));
////				staff.setEntryTime(entryTime);
////			} catch (ParseException e1) {
////				// TODO Auto-generated catch block
////				e1.printStackTrace();
////			}
//	        staff.setStaffName(request.getParameter("staffName"));
//			staff.setSex(request.getParameter("sex"));
//			
//			staff.setStaffTel(request.getParameter("staffTel"));
//			staff.setNationality(request.getParameter("nationality"));
//			staff.setStaffMail(request.getParameter("staffMail"));
//			staff.setStaffAddress(request.getParameter("staffAddress"));
//			staff.setCompany(request.getParameter("company"));
//			staff.setDepartment(request.getParameter("department"));
//			staffService.createStaff(staff);
//			/*@RequestParam("avatarUrl") MultipartFile multipartFile*/
////			if(multipartFile != null&&multipartFile.getSize()!=0){
////				String[] result = FileUtils.FilesUpload_transferTo_spring(request, multipartFile, staff.getStaffId()+"\\");
////				String file = FileUtils.resizeFix(result[0], staff.getStaffId()+"\\", 600, 800);
////				staff.setAvatarUrl(file==null?"c:\\isopm\\default.jpg":file);
////			}else{
////				staff.setAvatarUrl("c:\\isopm\\default.jpg");
////			}
//			
//			try {
//				response.getWriter().write(JSON.toJSONString(staff, true));
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	}
	 @RequestMapping(value = "create", method = RequestMethod.POST)
	 @ResponseBody
	    public void createStaff(Staff staff){
	    staffService.createStaff(staff);
	 }
	 
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<Staff> listStaffs() {
        return staffService.ListPortion();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Staff getStaffById(@PathVariable int id) {
        return staffService.getStaffById(id);
    }
}
