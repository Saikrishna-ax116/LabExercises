class EmployeeMain{

public static void main(String[] args){

EmployeeInfo info = new EmployeeInfo();

List<Employee> emps = new ArrayList<Employee>();
emps.add(new Employee("Mickey",10000));
emps.add(new Employee("Timmy",5000));
emps.add(new Employee("Anny",4000));

System.out.println(info.sort(emps, SortMethod.BYNAME));
System.out.println(info.sort(emps, SortMethod.BYSALARY));
System.out.println(info.isCharacterPresentInAllNames(emps, Anny));

}

}