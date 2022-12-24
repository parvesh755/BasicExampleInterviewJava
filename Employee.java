package hashcodeAndEquals.co;
public class Employee 

{ 

private Integer id; 

private String firstname; 

private String lastName; 

private String department; 

 

 

public Integer getId() { 

return id; 

} 

public void setId(Integer id) { 

this.id = id; 

} 

public String getFirstname() { 

return firstname; 

} 

public void setFirstname(String firstname) { 

this.firstname = firstname; 

} 

public String getLastName() { 

return lastName; 

} 

public void setLastName(String lastName) { 

this.lastName = lastName; 

} 

public String getDepartment() { 

return department; 

} 

public void setDepartment(String department) { 

this.department = department; 

} 

 

 

@Override 

public String toString() { 

return "Employee [id=" + id + ", firstname=" + firstname + ", lastName=" + lastName + ", department=" 

+ department + "]"; 

} 

 

  

 

@Override 

public boolean equals(Object obj) { 

if (this == obj) 

return true; 

if (obj == null) 

return false; 

if (getClass() != obj.getClass()) 

return false; 

Employee obj2 = (Employee) obj; 

 

return (this.getId() == obj2.getId()) && this.getFirstname()==obj2.getFirstname(); 

} 

  

@Override 

public int hashCode() { 

           final int prime = 31; 

int result = 1; 

result = prime * result + ((id == null) ? 0 : id.hashCode()); 

return result; 

} 

} 