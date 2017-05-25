package jp.co.ucl.ISOPM.dao;

import java.util.List;

import jp.co.ucl.ISOPM.entity.ProjectInformation;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
@Mapper
public interface ProjectInformationDao {
    
    @Select("SELECT * FROM bd_project_information WHERE project_id=#{id}")
    ProjectInformation getProjectInformationById(@Param("id") int id);
    
    
    
    @Insert("Insert INTO bd_project_information(project_name,start_date,end_date" +
    		"sale_to_company_id,buy_from_company_id,project_place,salesman_name," +
    		"salesman_tel,Osalesman_name,Osalesman_tel) VALUES (#{project.project_name}," +
    		"#{project.start_date},#{project.end_date},#{project.sale_to_company_id}," +
    		"#{project.buy_from_company_id},#{project.project_palce}," +
    		"#{project.salesman_name},#{project.salesman_tel},#{project.Osalesman_name}," +
    		"#{project.Osalesman_tel})")
    int addProjectInformation(@Param("project")ProjectInformation projectInformation);
   
    @Delete("Delete from bd_project_information where project_id = #{0}")
    int deleteProjectInformation(@Param("project_id") int project_id);
    
    @SelectProvider(type=SqlProvider.class,method="selectProject")
    public List<ProjectInformation> selectProject(@Param("project")ProjectInformation projectInformation);
    
    @Update("Update bd_project_information set project_name = #{project.project_name}," +
    		"start_date= #{project.start_date},end_date=#{project.end_date},sale_to_company_id=#{project.sale_to_company_id}," +
    		"buy_from_company_id=#{project.buy_from_company_id},project_place=#{project.project_place}," +
    		"salesman_name=#{project.salesman_name},salesman_tel=#{project.salesman_tel}," +
    		"Osalesman_name=#{project.Osalesman_name},Osalesman_tel=#{project.Osalesman_tel} where project_id=#{project.project_id}")
    int updateProjectInformation(@Param("project")ProjectInformation projectInformation);
   
}
