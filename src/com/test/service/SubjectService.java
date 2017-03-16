package com.test.service;

import java.util.List;

import com.test.po.Subject;
import com.test.po.SubjectInf;
import com.test.util.Page;
import com.test.util.PageResult;


public interface SubjectService {
	
	//public boolean saveSubject(Subject subject);
	
	//public PageResult querySubjectByPage(Page page);
	
	public Subject showSubjectByID(int subject_id);
	
	//public List<Subject> showSubjectByClass(int subject_class);
	
	// ����������Ϣ
	//public void updateSubject(Subject subject);
	
	// ɾ��������Ϣ
	//public void deleteSubject(int subject_id);
	
	//ģ����ѯ������Ϣ
	//public PageResult likeQueryBySubjectTitle(String subject_title,Page page);
	
	//��ȡ��������
	public List<Subject> showAllSubject();
	public int numClasses();
	public int numSubjectByClasses(int classes_id);
	public List<SubjectInf> findAllSubject();
	public Subject findSubjectByClasses(int number);
	//����ѧ���÷�
	//public int accountResult(List<Integer> subject_ids,List<String> studentAnswers);
}
