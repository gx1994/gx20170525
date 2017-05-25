package jp.co.ucl.ISOPM.dao;

import java.util.List;

import jp.co.ucl.ISOPM.entity.PersonalProject;
import jp.co.ucl.ISOPM.entity.ProjectInformation;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
@Mapper
public interface PersonalProjectDao {

	@SelectProvider(type=SqlProvider.class,method="selectPersonalProjectById")
    PersonalProject getPersonalProjectById(@Param("id") int id);
    
    
    
    @Insert("Insert INTO bd_personal_forecast(project_id,staff_id,Bforecast,Sforecast" +
    		"year,month VALUES(#{project.project_id},#{project.staff_id}," +
    		"#{project.Bforecast},#{project.Sforecast},#{project.year},#{project.month})")
    int addPersonalforecast(@Param("project")PersonalProject personalProject);
    
    @Insert("Insert INTO bd_personal_project(personal_forecast_id,Bmonthly,Bprice,Btask_time" +
    		"Smonthly,Sprice,Stask_time,monthly_profit VALUES(#{project.personal_forecast_id}," +
    		"#{project.Bmonthly},#{project.Bprice},#{project.Btask_time},#{project.Smonthly}," +
    		"#{project.Sprice},#{project.Stask_time},#{project.monthly_profit})")
    int addPersonalProject(@Param("project")PersonalProject personalProject);
   
    @SelectProvider(type=SqlProvider.class,method="selectPersonalProject")
    public List<PersonalProject> selectPersonalProject(@Param("personalProject")PersonalProject personalProject);
    
    @Update("Update bd_personal_project set Bmonthly = #{project.Bmonthly}," +
    		"Bprice= #{project.Bprice},Btask_time=#{project.Btask_time},Smonthly=#{project.Smonthly}," +
    		"Sprice=#{project.Sprice},Stask_time=#{project.Stask_time}," +
    		"monthly_profit=#{project.monthly_profit} where personal_project_id=#{project.personal_project_id}")
    int updatePersonalProject(@Param("project")PersonalProject personalProject);
   
    @Select("Select t1.staff_id,t1.staff_name as staff_name,t2.project_id,t3.project_name from as project_name " +
    		"gad_personal_information t1 left join (select * from (select * from bd_personal_forecast " +
    		"order by (year*100+month) desc,staff_id asc) a  group by staff_id) t2 on t1.staff_id= " +
    		"t2.staff_id left join bd_project_information t3 on t2.project_id = t3.project_id")
    public List<PersonalProject> selectStaffListForProject();
    
}
