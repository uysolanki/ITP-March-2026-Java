package day11;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadEmployeeFromJSON {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		List<Employee> employees=null;
        try {
            employees = mapper.readValue(
            	//new File("D:\\EclipseJavaprogs2\\Test\\json\\employee.json"),	   //absolute path
                new File("data/employee.json"),									  //relative path
                new TypeReference< List<Employee>>() {}
            );
            
        

       
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        System.out.println(employees);

        //display name of all employees
       List<String> employeeNames=employees.stream()
        .map(Employee::getName)
        .toList();
       
       System.out.println(employeeNames);
       
       //group employees based on thier first char
       
       Map<Character, List<String>> hashmap=
    		   employees.stream()
    		   .map(Employee::getName)
    		   .collect(Collectors.groupingBy(str->str.charAt(0)));
       
       System.out.println(hashmap);
       
       
       Map<Character, String> hashmap1=
    		   employees.stream()
    		   .map(Employee::getName)
    		   .collect(Collectors.groupingBy(str->str.charAt(0),Collectors.joining("-")));
       
       System.out.println(hashmap1);
       
       Map<Character, Long> hashmap2=
    		   employees.stream()
    		   .map(Employee::getName)
    		   .collect(Collectors.groupingBy(str->str.charAt(0),Collectors.counting()));
       
       System.out.println(hashmap2);
       
       char maxChar=hashmap2.entrySet()
       .stream()
       .max(Map.Entry.comparingByValue())
       .map(Map.Entry::getKey)
       .orElse(null);
       
       System.out.println(maxChar);
	}

}

//{A=[August, April], S=[September], D=[December], F=[February], J=[June, January, July], M=[May, March], N=[November], O=[October]}

//{A="August-April", S=[September], D=[December], F=[February], J=[June, January, July], M=[May, March], N=[November], O=[October]}

