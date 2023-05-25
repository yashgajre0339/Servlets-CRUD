package com.jsp.service;


import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentService {
	
	public Student savesStudent(Student student) {
		StudentDao studentdao= new StudentDao();
		
		return studentdao.saveStudent(student);


}
}
