package jp.co.ucl.ISOPM.api;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.ucl.ISOPM.entity.PersonalProject;
import jp.co.ucl.ISOPM.service.PersonalProjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/personalProject")
@RestController
public class PersonalProjectApi {

	@Autowired
    PersonalProjectService personalProjectService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<PersonalProject> listCompanys(HttpServletRequest request,HttpServletResponse response) {
    	List<PersonalProject> personalProjects = personalProjectService.getPersonalProjectList(request, response);
    	return personalProjects;
    }
    
    @RequestMapping(value = "/new/{id}", method = RequestMethod.GET)
    public PersonalProject getPersonalProjectById(@PathVariable int id) {
        return personalProjectService.getPersonalProjectById(id);
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public void addPersonalforecast(HttpServletRequest request,HttpServletResponse response) {
        personalProjectService.addPersonalforecast(request, response);
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public void updatePersonalProject(HttpServletRequest request,HttpServletResponse response) {
        personalProjectService.updatePersonalProject(request, response);
    }
    
    //员工列表
    @RequestMapping(value = "/staff", method = RequestMethod.GET)
    public void selectStaffListForProject(HttpServletRequest request,HttpServletResponse response) {
        personalProjectService.selectStaffListForProject();
    }
}
