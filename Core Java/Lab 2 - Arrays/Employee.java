import java.util.Collection;


class Employee {

String name;
int salary;

Employee(String name, int salary) {
this.name = name;
this.salary = salary;
}

public String getName(){
return name;
}

public void setName(String name){
this.name = name;
}

public String getSalary(){
return salary;
}

public void setSalary(int salary){
this.salary = salary;
}

public String toString(){
return "[<name: "+name +" salary: "+salary+">]";
}


}

class EmployeeInfo{

enum SortMethod{
BYNAME,BYSALARY;
}

public List<Employee> sort(List<Employee> emps, final SortMethod method){
if(SortMethod.BYNAME == method){
emps.sort((e1,e2) -> e1.getName().compareToe2.getName());
}
else if(SortMethod.BYSALARY == method){
emps.sort((e1,e2) -> e1.getSalary()-e2.getSalary());
}
return emps;
}

public boolean isCharacterPresentInAllNames(Collection<Employee> entities, String character){
return true;
}

}