package configure;

import java.util.ArrayList;

public class UserDetails {

	private String name;
	private int empid;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	/*UserDetails(String name, int empid, String address){
		this.name = name;
		this.empid = empid;
		this.address = address;
	}*/
	
	public ArrayList getInfo() {
	
		//UserDetails ud = new UserDetails("Ram",101,"Pune");
		UserDetails ud1 = new UserDetails();
		ud1.setName("LMS");
		ud1.setEmpid(101);
		ud1.setAddress("pune");
		
		UserDetails ud2 = new UserDetails();
		ud2.setName("LOS");
		ud2.setEmpid(102);
		ud2.setAddress("pune 52");
		
		UserDetails ud3 = new UserDetails();
		ud3.setName("Collection");
		ud3.setEmpid(103);
		ud3.setAddress("nsk");
		
		ArrayList list = new ArrayList();
		list.add(ud1);
		list.add(ud2);
		list.add(ud3);
		//System.out.println(ud.getAddress());
		return list;
		
		
	}
	
}
