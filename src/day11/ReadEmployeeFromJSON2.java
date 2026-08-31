package day11;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadEmployeeFromJSON2 {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		List<Employee> employees=null;
        try {
            employees = mapper.readValue(
            	//new File("D:\\EclipseJavaprogs2\\Test\\json\\employee.json"),	   //absolute path
                new File("data/employee2.json"),									  //relative path
                new TypeReference< List<Employee>>() {}
            );
            
        

       
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        System.out.println(employees);
        
       List<String> projectNames= employees.stream()
        .flatMap(emp->emp.getProjects().stream())
        .map(Project::getProjectName)
        .distinct()
        .toList();

       System.out.println(projectNames);
	}

}
