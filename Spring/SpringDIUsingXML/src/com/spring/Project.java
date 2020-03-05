package com.spring;

public class Project {
	FrontEndDeveloper fdeveloper;
	BackEndDeveloper bdeveloper;
	
//	Project(FrontEndDeveloper fdeveloper, BackEndDeveloper bdeveloper) {
//		this.fdeveloper = fdeveloper;
//		this.bdeveloper = bdeveloper;
//	}
	
	
	
	public String toString() {
		return fdeveloper.getName() +" "+bdeveloper.getName() ;
	}

	public FrontEndDeveloper getFdeveloper() {
		return fdeveloper;
	}

	public void setFdeveloper(FrontEndDeveloper fdeveloper) {
		this.fdeveloper = fdeveloper;
	}

	public BackEndDeveloper getBdeveloper() {
		return bdeveloper;
	}

	public void setBdeveloper(BackEndDeveloper bdeveloper) {
		this.bdeveloper = bdeveloper;
	}
}
