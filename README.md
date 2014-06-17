org.boldust.RedBlackIndex
=========================

Create index of ArrayList using RedBlack Binary Tree

If you want to do binary search and you don't want to change the order of objects in an ArrayList, how do you want to do? 

This class can help to create an index with the object values like database. A Comparator can be created and pass to the index. If the objects in ArrayList is Comparable, comparator is not required.

Future version plan to support Array as well. This index fits the situation of both unique and non-unique values but not very efficient for the field with few value ranges e.g., genders is only of male, female, and other.

Usage:

ArrayList<Employee> al = new ArrayList();

//Fetch many employees from database, e.g.,

RedBlackIndex rbi = new RedBlackIndex(al);

rbi.setComparator(new EmployeeComparator(...));

int i = rbi.getArrayIndex(new Employee(30032, "nageren", "fuxi", "Shanghai"));


//Entity class and its comparator.

public class Employee {

  private Integer id;
  
  private String fname;
  
  
  private String lname;
  
  private String city;

  public Employee(int empid, String firstname, String lastname, String thecity) {
  
    id = empid;
  
    fname = firstname;
  
    lname = lastname,
  
    city = thecity;
    
  }
  
  public Integer getId() {
  
    return id;
    
  }
  public String getName() {
  
    return fname + lname;
    
  }
  public String getCity() {
  
    return city;
    
  }
  
  ...
  
}

public class EmployeeComparator implements Comparator {

  ...

}
