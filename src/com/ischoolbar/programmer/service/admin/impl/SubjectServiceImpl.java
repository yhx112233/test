package com.ischoolbar.programmer.service.admin.impl;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ischoolbar.programmer.dao.admin.SubjectDao;
import com.ischoolbar.programmer.entity.admin.Subject;
import com.ischoolbar.programmer.service.admin.SubjectService;
//学科专业实现类
@Service
public class SubjectServiceImpl implements SubjectService{
	
	@Autowired
	private SubjectDao subjectDao;
	@Override
	public int add(Subject subject) {
		// TODO Auto-generated method stub
		return subjectDao.add(subject);
	}

	@Override
	public int edit(Subject subject) {
		// TODO Auto-generated method stub
		return subjectDao.edit(subject);
	}

	@Override
	public List<Subject> findList(Map<String, Object> qureyMap) {
		// TODO Auto-generated method stub
		return subjectDao.findList(qureyMap);
	}

	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return subjectDao.delete(id);
	}

	@Override
	public Integer getTotal(Map<String, Object> qureyMap) {
		// TODO Auto-generated method stub
		return subjectDao.getTotal(qureyMap);
	}

}
