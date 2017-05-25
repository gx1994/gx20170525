package jp.co.ucl.ISOPM.service;

import jp.co.ucl.ISOPM.dao.CompanyDao;
import jp.co.ucl.ISOPM.entity.Company;
//import net.minidev.json.JSONObject;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Service
public class CompanyService {
	@Autowired
	CompanyDao companyDao;

	/**
	 * list all company
	 *
	 * @return
	 */
	public List<Company> listAll() {
		return companyDao.listAll();
	}

	public List<Company> ListPortion() {
		return companyDao.ListPortion();
	}

	public Company getCompanyById(int id) {
		return companyDao.getCompanyById(id);
	}

	public Company addCompany(HttpServletRequest request,
			HttpServletResponse response) {
		Company company = new Company();
		company.setCompany_name(request.getParameter("company_name"));
		company.setCompany_address(request.getParameter("company_address"));
		company.setCompany_tel(request.getParameter("company_tel"));
		company.setCompany_mail(request.getParameter("company_mail"));

		int result = companyDao.addCompany(company);
		if (result == 1) {
			result = companyDao.addBuyerCompany(company.getCompany_id());
		}
		if (result == 1) {
			result = companyDao.addSellerCompany(company.getCompany_id());// 获取companyDao中的company_id
		}

//		JSONObject obj = new JSONObject();
//		Writer writer = null;
//		try {
//			obj.put("result", result + "");
//			writer = response.getWriter();
//			writer.write(obj.toString());
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (writer != null) {
//					writer.close();
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
    return company;

	}

	public Company updateCompany(HttpServletRequest request,
			HttpServletResponse response) {

		Company company = new Company();
		company.setCompany_name(request.getParameter("company_name"));
		company.setCompany_address(request.getParameter("company_address"));
		company.setCompany_tel(request.getParameter("company_tel"));
		company.setCompany_mail(request.getParameter("company_mail"));
		company.setCompany_id(Integer.parseInt(request
				.getParameter("company_id")));

		int result = companyDao.updateCompany(company);

//		JSONObject obj = new JSONObject();
//		Writer writer = null;
//		try {
//			obj.put("result", result + "");
//			writer = response.getWriter();
//			writer.write(obj.toString());
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (writer != null) {
//					writer.close();
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
    return company;

	}

	public void deleteCompany(HttpServletRequest request,
			HttpServletResponse response) {
		int company_id = Integer.parseInt(request.getParameter("company_id"));
		int deleteResult = companyDao.deleteCompany(company_id);
		if (deleteResult == 1) {
			deleteResult = companyDao.deleteBuyerCompany(company_id);
		}
		if (deleteResult == 1) {
			deleteResult = companyDao.deleteSellerCompany(company_id);
		}

//		JSONObject obj = new JSONObject();
//		Writer writer = null;
//		try {
//			obj.put("result", deleteResult + "");
//			writer = response.getWriter();
//			writer.write(obj.toString());
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (writer != null) {
//					writer.close();
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}

	}

	public List<Company> selectCompany(HttpServletRequest request,
			HttpServletResponse response) {
		Company company = new Company();
		String company_id_str = request.getParameter("company_id");
		if (!StringUtils.isEmpty(company_id_str)) {
			company.setCompany_id(Integer.parseInt(company_id_str));
		}
		company.setCompany_name(request.getParameter("company_name"));
		return companyDao.selectCompany(company);
	}

	public void exportCompanys(HttpServletResponse response) {
		String filePath = "E:/ddd/";
		String fileName = "333.xls";
		File file = new File(filePath);
		file.mkdirs();
		Company company = new Company();
		List<Company> companys = companyDao.selectCompany(company);
		int columeCount = 10;
		HSSFWorkbook workbook = null;
		workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("222");
		// 创建第一栏
		HSSFRow headRow = sheet.createRow(0);
		String[] titleArray = { "id", "name", "age", "email", "address",
				"phone" };
		for (int m = 0; m < titleArray.length; m++) {
			HSSFCell cell = headRow.createCell(m);
			cell.setCellType(HSSFCell.CELL_TYPE_STRING);
			sheet.setColumnWidth(m, 6000);
			HSSFCellStyle style = workbook.createCellStyle();
			HSSFFont font = workbook.createFont();
			font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
			short color = HSSFColor.RED.index;
			font.setColor(color);
			style.setFont(font);
			// 填写数据
			cell.setCellStyle(style);
			cell.setCellValue(titleArray[m]);

		}
		int index = 0;
		for (Company com : companys) {
			// logger.info("写入一行");
			HSSFRow row = sheet.createRow(index + 1);
			for (int n = 0; n < columeCount; n++) {
				row.createCell(n);
			}
			// row.getCell(0).setCellValue(com.);
			// row.getCell(1).setCellValue(entity.getName());
			// row.getCell(2).setCellValue(entity.getAge());
			// row.getCell(3).setCellValue(entity.getEmail());
			// row.getCell(4).setCellValue(entity.getAddress());
			// row.getCell(5).setCellValue(entity.getPhone());
			index++;
		}

		// 写到磁盘上
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(new File(
					filePath + fileName));
			workbook.write(fileOutputStream);
			fileOutputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		downloadFile(filePath, fileName, response);

	}

	public void downloadFile(String filePath, String fileName,
			HttpServletResponse response) {
		if (filePath != null) {
			File file = new File(filePath, fileName);
			if (file.exists()) {
				response.setContentType("application/force-download");// 设置强制下载不打开
				response.addHeader("Content-Disposition",
						"attachment;fileName=" + fileName);// 设置文件名
				byte[] buffer = new byte[1024];
				FileInputStream fis = null;
				BufferedInputStream bis = null;
				try {
					fis = new FileInputStream(file);
					bis = new BufferedInputStream(fis);
					OutputStream os = response.getOutputStream();
					int i = bis.read(buffer);
					while (i != -1) {
						os.write(buffer, 0, i);
						i = bis.read(buffer);
					}
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				} finally {
					if (bis != null) {
						try {
							bis.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					if (fis != null) {
						try {
							fis.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}
	}

}
