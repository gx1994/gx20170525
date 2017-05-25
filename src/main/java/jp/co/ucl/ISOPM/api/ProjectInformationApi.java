package jp.co.ucl.ISOPM.api;

import jp.co.ucl.ISOPM.entity.ProjectInformation;
import jp.co.ucl.ISOPM.service.CompanyService;
import jp.co.ucl.ISOPM.service.ProjectInformationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RequestMapping("/api/project")
@RestController
public class ProjectInformationApi {
    @Autowired
    CompanyService companyService;
    @Autowired
    ProjectInformationService projectInformationService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<ProjectInformation> listCompanys(HttpServletRequest request,HttpServletResponse response) {
    	List<ProjectInformation> projectInformations = projectInformationService.selectProject(request, response);
    	System.out.println(projectInformations.get(0));
        return projectInformations;
    }

    @RequestMapping(value = "/new/{id}", method = RequestMethod.GET)
    public ProjectInformation getProjectInformationById(@PathVariable int id) {
        return projectInformationService.getProjectInformationById(id);
    }
    
    
    @RequestMapping(value ="/search", method = RequestMethod.POST)
    public List<ProjectInformation> selectCompany(HttpServletRequest request,HttpServletResponse response){
    	return projectInformationService.selectProject(request, response);
    }
   
    @RequestMapping(value ="/update", method = RequestMethod.POST)
    public void updateProjectInformation  (HttpServletRequest request,HttpServletResponse response){
    	projectInformationService.updateProjectInformation(request, response);
    }
   
    @RequestMapping(value ="/delete", method = RequestMethod.POST)
    public void deleteProjectInformation  (HttpServletRequest request,HttpServletResponse response){
    	projectInformationService.deleteProjectInformation(request, response);
    }
    
    @RequestMapping(value ="/add", method = RequestMethod.POST)
    public void addProjectInformation(HttpServletRequest request,HttpServletResponse response){
    	projectInformationService.addProjectInformation(request, response);
    }
    
}
