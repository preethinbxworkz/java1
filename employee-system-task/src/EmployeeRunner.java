import com.xworkz.employee.dto.EmployeeDto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeRunner {
    public static void main(String[] args) {
        List<EmployeeDto> collection=new ArrayList<>();
        EmployeeDto dto=new EmployeeDto(101,"Alison",30000.00,"RR Nagar","A+ve");
        EmployeeDto dto1=new EmployeeDto(102,"Baba",27000.00,"RT Nagar","o-ve");
        EmployeeDto dto2=new EmployeeDto(103,"Tokyo",32000.00,"Girinagar","A-ve");
        EmployeeDto dto3=new EmployeeDto(104,"Nairobi",15000.00,"Chickpete","B-ve");
        EmployeeDto dto4=new EmployeeDto(105,"Berlin",26000.00,"Yashwantpura","A+ve");
        EmployeeDto dto5=new EmployeeDto(106,"Rio",29000.00,"Dasralli","A-ve");
        EmployeeDto dto6=new EmployeeDto(107,"Bogota",23000.00,"Malleshwaram","o-ve");
        EmployeeDto dto7=new EmployeeDto(108,"Denver",21000.00,"Peenya","B+ve");
        EmployeeDto dto8=new EmployeeDto(109,"Alison",28000.00,"Majestic","A+ve");
        EmployeeDto dto9=new EmployeeDto(110,"Parker",40000.00,"Rajajinagar","o+ve");
        EmployeeDto dto10=new EmployeeDto(111,"Helsinki",31000.00,"Vidyanagar","B-ve");
        EmployeeDto dto11=new EmployeeDto(112,"Raquel",6000.00,"KR Pet","A+ve");

        collection.add(dto);
        collection.add(dto1);
        collection.add(dto2);
        collection.add(dto3);
        collection.add(dto4);
        collection.add(dto5);
        collection.add(dto6);
        collection.add(dto7);
        collection.add(dto8);
        collection.add(dto9);
        collection.add(dto10);
        collection.add(dto11);
//        for(EmployeeDto employee:collection){
//            System.out.println(employee);
//        }
//
        System.out.println(collection.stream().sorted(Comparator.comparingDouble(EmployeeDto::getSalary).reversed()).skip(1).findFirst());
        System.out.println(collection.stream().filter(employeeDto -> employeeDto.getSalary()>25000).collect(Collectors.toList()));
        System.out.println(collection.stream().filter(employeeDto -> employeeDto.getName().startsWith("B")).collect(Collectors.toList()));

    }
}
