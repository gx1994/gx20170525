package jp.co.ucl.ISOPM.dao;

import jp.co.ucl.ISOPM.entity.Company;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CompanyDao {
    @Results(id = "companyResult", value = {
            @Result(property = "company_id", column = "company_id", id = true),
            @Result(property = "company_name", column = "company_name"),
            @Result(property = "company_address", column = "company_address"),
            @Result(property = "company_tel", column = "company_tel"),
            @Result(property = "company_mail", column = "company_mail"),
           
    })
    @Select("SELECT * FROM bd_company_information")
    List<Company> listAll();
    @ResultMap("companyResult")
    
//    @Select("SELECT * from bd_company_information")
  
    
    @Select("SELECT (select count(*) from bd_project_information where "
    		+"sale_to_company_id=bd_company_information.company_id or "
    		+"buy_from_company_id=bd_company_information.company_id) as "
    		+"project_amount,bd_company_information.company_id,bd_buyer_company.buy_from_company_id, bd_seller_company.sale_to_company_id,"
    		+ " bd_company_information.company_name, company_tel"
    		+ " FROM bd_buyer_company, bd_seller_company, bd_company_information"
    		+ " WHERE bd_company_information.company_id=bd_buyer_company.company_id"
    		+ " AND bd_company_information.company_id=bd_seller_company.company_id"
    		+ " GROUP BY bd_company_information.company_id")
    		 
    List<Company> ListPortion();
    
    
    @Select("SELECT * FROM bd_company_information WHERE company_id=#{id}")
    Company getCompanyById(@Param("id") int id);
    
    
    
    @Insert("Insert INTO bd_company_information(company_name,company_address,company_tel,company_mail) VALUES (#{company.company_name},#{company.company_address},#{company.company_tel},#{company.company_mail})")
    @Options(useGeneratedKeys = true, keyProperty = "company.company_id")//company_id是自增的，获取自增company_id
    int addCompany(@Param("company")Company company);
   
    
    @Insert("Insert INTO bd_buyer_company(company_id) VALUES (#{0})")
    int addBuyerCompany(@Param("company_id")int company_id);
    
    
    @Insert("Insert INTO bd_seller_company(company_id) VALUES (#{0})")
    int addSellerCompany(@Param("company_id") int company_id);
    
    
    @Delete("Delete from bd_company_information where company_id = #{0}")
    int deleteCompany(@Param("company_id") int company_id);
    
    @Delete("Delete from bd_buyer_company where company_id = #{0}")
    int deleteBuyerCompany(@Param("company_id") int company_id);
    
    @Delete("Delete from bd_seller_company where company_id = #{0}")
    int deleteSellerCompany(@Param("company_id") int company_id);
    
    @SelectProvider(type=SqlProvider.class,method="selectCompany")
    public List<Company> selectCompany(@Param("company")Company company);
    
    @Update("Update bd_company_information set company_name = #{company.company_name},company_address= #{company.company_address},company_tel= #{company.company_tel},company_mail= #{company.company_mail} where company_id = #{company.company_id} ")
    int updateCompany(@Param("company")Company company);
   
    
    
    
    
    
}
