package jp.co.ucl.ISOPM.dao;

import jp.co.ucl.ISOPM.entity.Staff;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Update;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 人员管理dao
 * 顺序: 增删改查
 * 作者:王菲
 */
@Mapper
public interface StaffDao {
	@Insert("INSERT INTO gad_personal_information(staff_name, sex, birthday, staff_tel, nationality, staff_mail, staff_address, company, department, entry_time) "
			+ "VALUES (#{staff.staffName},#{staff.sex},#{staff.birthday},#{staff.staffTel},#{staff.nationality},#{staff.staffMail},#{staff.staffAddress},#{staff.company},#{staff.department},#{staff.entryTime})")
	@Options(useGeneratedKeys = true, keyProperty = "staff.staffId")
	int addStaff(@Param("staff") Staff staff);
   
	@Results(id = "staffResult", value = {
            @Result(property = "staffId", column = "staff_id", id = true),
            @Result(property = "staffName", column = "staff_name"),
            @Result(property = "sex", column = "sex"),
            @Result(property = "birthday", column = "birthday"),
            @Result(property = "staffTel", column = "staff_tel"),
            @Result(property = "nationality", column = "nationality"),
            @Result(property = "staffMail", column = "staff_mail"),
            @Result(property = "staffAddress", column = "staff_address"),
            @Result(property = "company", column = "buy_from_company_id"),
            @Result(property = "department", column = "department"),
            @Result(property = "entryTime", column = "entry_time"),
            @Result(property = "profileUrl", column = "profile_url"),
            @Result(property = "avatarUrl", column = "avatar_url"),
            @Result(property = "createdAt", column = "created_at"),
            @Result(property = "updatedAt", column = "updated_at"),
            @Result(property = "deletedAt", column = "deleted_at"),
            
    })
    @Select("SELECT * FROM gad_personal_information")
    List<Staff> listAll();
    @ResultMap("staffResult")
    
    @Select("SELECT staff_id, staff_name, staff_tel, staff_mail, buy_from_company_id from gad_personal_information")
    List<Staff> ListPortion();
    @Results(
        {
            @Result(property = "staffId", column = "staff_id", id = true),
            @Result(property = "staffName", column = "staff_name"),
            @Result(property = "staffTel", column = "staff_tel"),
            @Result(property = "staffMail", column = "staff_mail"),
            @Result(property = "company", column = "buy_from_company_id")
            
    })
  
    @Select("SELECT * FROM gad_personal_information WHERE staff_id=#{id}")
    Staff getStaffById(@Param("id") int id);
    

}
