package com.ischoolbar.programmer.service.admin;
/*
 * Service 接口 与 Dao 层的方法对应
 * ServiceImpl实现类实现Service接口，ServiceImpl调用Dao层方法，实现对数据库的访问
 */
import java.util.List;
import java.util.Map;
//ctrl+shift+o  清理没有使用过的包
/*
 * 考生service
 */
import org.springframework.stereotype.Service;

import com.ischoolbar.programmer.entity.admin.Student;
@Service
public interface StudentService {
	public int add(Student student);//添加
	public int edit(Student student);//编辑
	public List<Student> findList(Map<String,Object> qureyMap);//查询
	public int delete(Long id); //删除
	public Integer getTotal(Map<String,Object> qureyMap);
}
