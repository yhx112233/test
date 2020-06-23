package com.ischoolbar.programmer.service.admin.impl;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ischoolbar.programmer.dao.admin.StudentDao;
import com.ischoolbar.programmer.entity.admin.Student;
import com.ischoolbar.programmer.service.admin.StudentService;
//学科专业实现类
@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public int add(Student student) {
		// TODO Auto-generated method stub
		return studentDao.add(student);
	}

	@Override
	public int edit(Student student) {
		// TODO Auto-generated method stub
		return studentDao.edit(student);
	}

	@Override
	public List<Student> findList(Map<String, Object> qureyMap) {
		// TODO Auto-generated method stub
		return studentDao.findList(qureyMap);
	}

	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return studentDao.delete(id);
	}

	@Override
	public Integer getTotal(Map<String, Object> qureyMap) {
		// TODO Auto-generated method stub
		return studentDao.getTotal(qureyMap);
	}
}
