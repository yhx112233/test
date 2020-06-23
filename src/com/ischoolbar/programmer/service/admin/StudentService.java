package com.ischoolbar.programmer.service.admin;
/*
 * Service �ӿ� �� Dao ��ķ�����Ӧ
 * ServiceImplʵ����ʵ��Service�ӿڣ�ServiceImpl����Dao�㷽����ʵ�ֶ����ݿ�ķ���
 */
import java.util.List;
import java.util.Map;
//ctrl+shift+o  ����û��ʹ�ù��İ�
/*
 * ����service
 */
import org.springframework.stereotype.Service;

import com.ischoolbar.programmer.entity.admin.Student;
@Service
public interface StudentService {
	public int add(Student student);//���
	public int edit(Student student);//�༭
	public List<Student> findList(Map<String,Object> qureyMap);//��ѯ
	public int delete(Long id); //ɾ��
	public Integer getTotal(Map<String,Object> qureyMap);
}
