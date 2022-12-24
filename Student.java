package hashcodeAndEquals.co;
public class Student { 

  

private int id; 

  

public int getId() { 

return id; 

} 

  

public void setId(int id) { 

this.id = id; 

} 

  

public Student(int id) { 

super(); 

this.id = id; 

} 

  

  

 

@Override 

public int hashCode() { 

 

final int prime = 31; 

 

int result = 1; 

 

result = prime * result + id; 

 

return result; 

} 

  

@Override 

public boolean equals(Object obj) { 

 

if (this == obj) 

 

return true; 

 

if (obj == null) 

 

return false; 

 

if (getClass() != obj.getClass()) 

 

return false; 

 

Student other = (Student) obj; 

 

if (id != other.id) 

 

return false; 

 

return true; 

} 

  

@Override 

public String toString() { 

return "Student [id=" + id + "]"; 

} 

} 

 

 