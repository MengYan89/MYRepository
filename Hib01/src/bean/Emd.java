package bean;

public class Emd {
	Integer id;
	String name;
	float salary;
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString(){
		String str = "[ id:"+id+" name:"+name+" salary:"+salary+"]";
		return str;
		
	}
	

}
