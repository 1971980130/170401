package com.ysd.entity;

public class Classes {
	private Integer classesid;
	private String classesName;
	public Integer getClassesid() {
		return classesid;
	}
	public void setClassesid(Integer classesid) {
		this.classesid = classesid;
	}
	public String getClassesName() {
		return classesName;
	}
	public void setClassesName(String classesName) {
		this.classesName = classesName;
	}
	@Override
	public String toString() {
		return "Classes [classesid=" + classesid + ", classesName=" + classesName + "]";
	}
	

}
