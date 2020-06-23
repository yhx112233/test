package com.ischoolbar.programmer.dao.admin;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ischoolbar.programmer.entity.admin.Student;

//Ñ§ÉúDao
@Repository
public interface StudentDao {
	public int add(Student student);
	public int edit(Student student);
	public List<Student> findList(Map<String,Object> qureyMap);
	public int delete(Long id); 
	public Integer getTotal(Map<String,Object> qureyMap);
}
