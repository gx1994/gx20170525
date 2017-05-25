package jp.co.ucl.ISOPM.api;

import jp.co.ucl.ISOPM.entity.Company;
import jp.co.ucl.ISOPM.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RequestMapping("/api/company")
@RestController
public class CompanyApi {
	@Autowired
	CompanyService companyService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Company> listCompanys() {
		List<Company> companys = companyService.ListPortion();
		System.out.println(companys.get(0));
		return companyService.ListPortion();
	}

	@RequestMapping(value = "/export", method = RequestMethod.GET)
	public void exportCompanys(HttpServletResponse response) {
		companyService.exportCompanys(response);
	}

	@RequestMapping(value = "/new/{id}", method = RequestMethod.GET)
	public Company getCompanyById(@PathVariable int id) {
		return companyService.getCompanyById(id);
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void addCompany(HttpServletRequest request,
			HttpServletResponse response) {
		companyService.addCompany(request, response);
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public List<Company> selectCompany(HttpServletRequest request,
			HttpServletResponse response) {
		return companyService.selectCompany(request, response);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public void updateCompany(HttpServletRequest request,
			HttpServletResponse response) {
		companyService.updateCompany(request, response);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public void deleteCompany(HttpServletRequest request,
			HttpServletResponse response) {
		companyService.deleteCompany(request, response);
	}

}
