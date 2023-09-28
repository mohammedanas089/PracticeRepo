package OneInheritanceInterface;

public class Staff extends Person {
	String empid;
	String comp;
	String desg;
	public Staff(String name,String add,String mobile,String mail,String id,String comp,String desg) {
		super(name,add,mobile,mail);
		this.empid=id;
		this.comp=comp;
		this.desg=desg;
		}
	public void display() {
		System.out.println(name+add+mob+mail+empid+comp+desg);
	}
}
