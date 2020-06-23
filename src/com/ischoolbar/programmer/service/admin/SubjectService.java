package com.ischoolbar.programmer.service.admin;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ischoolbar.programmer.entity.admin.Subject;
@Service
public interface SubjectService {
	public int add(Subject subject);
	public int edit(Subject subject);
	public List<Subject> findList(Map<String,Object> qureyMap);
	public int delete(Long id); 
	public Integer getTotal(Map<String,Object> qureyMap);
}
