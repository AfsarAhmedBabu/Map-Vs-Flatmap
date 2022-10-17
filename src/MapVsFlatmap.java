import com.example.model.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapVsFlatmap {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        List<String> cityList1 = new ArrayList<>();
        cityList1.add("Dhaka");
        cityList1.add("Sylhet");
        List<String> cityList2 = new ArrayList<>();
        cityList2.add("Chottogram");
        cityList2.add("Barishal");
        List<String> cityList3 = new ArrayList<>();
        cityList3.add("Rajshahi");
        cityList3.add("Dhaka");
        cityList3.add("Sylhet");

        Employee employee1 = new Employee("Ahmed susmoy", 1L, cityList1);
        Employee employee2 = new Employee("Json Holder", 2L, cityList2);
        Employee employee3 = new Employee("Tasin Hossain", 3L, cityList3);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        System.out.println("Map Output: ");
        List<List<String>> empList = employeeList.stream().map(map -> map.getCities()).collect(Collectors.toList());
        System.out.println(empList.toString());

        System.out.println("Flat Map Output: ");
        Set<String> flatMap = employeeList.stream().flatMap(map -> map.getCities().stream()).collect(Collectors.toSet());
        System.out.println(flatMap.toString());

    }

}
