package com.serialize;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable{
	private int empId;
	private String empName;
	transient private Date dtOfJoining;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Date getDtOfJoining() {
		return dtOfJoining;
	}
	public void setDtOfJoining(Date dtOfJoining) {
		this.dtOfJoining = dtOfJoining;
	}
	public Employee(int empId, String empName, Date dtOfJoining) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dtOfJoining = dtOfJoining;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dtOfJoining=" + dtOfJoining + "]";
	}
	
	
	private void writeObject(ObjectOutputStream oos) throws IOException {
		System.out.println("writeObject() invoked");
		oos.defaultWriteObject(); //serialize everything that you can serialize
		oos.writeInt(this.getDtOfJoining().getDd());
		oos.writeInt(this.getDtOfJoining().getMm());
		oos.writeInt(this.getDtOfJoining().getYy());
	}
	
	private void readObject(ObjectInputStream  ois) throws ClassNotFoundException, IOException {
		System.out.println("readObject() invoked");
		ois.defaultReadObject();//object
		//System.out.println(ois.readInt() +" , "+ois.readInt()+" , "+ois.readInt());
		this.dtOfJoining=new Date(ois.readInt(),ois.readInt(),ois.readInt());
	}
}
