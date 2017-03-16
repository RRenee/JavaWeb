package com.test.dao;

import java.util.List;
import com.test.po.Subject;
import com.test.po.SubjectInf;
import com.test.util.Page;

public interface SubjectDAO {
	//public void addSubject(Subject subject);//���淽����������������
	
	//public Subject findSubjectByTitle(String subject_title);//������������������
	
	//public List<Subject> findSubjectByPage(Page page);//��ҳ��ѯ����
	
	//public int findSubjectCount();//��ѯ��������
	public Subject findSubjectByClasses(int subject_class);
	public Subject findSubjectByID(int subject_id);//��������ID��������
	public int numClasses();
	public int numSubjectByClasses(int classes_id);
	
	//public List<Subject> findSubjectByClass(int subject_class);//�����������Ͳ�������
	
	//public void updateSubject(Subject subject);//���·�����������������
	
	//public void deleteSubject(int subject_id);//��������IDɾ������
	
	//public List<Subject> likeQueryByTitle(String subjectTitle,Page page);//�����������ģ����ѯ����
	
	//public int findLinkQueryCount(String subject_title);//��ѯģ����¼��
	
	public List<Subject> showAllSubject();//ȡ����¼
	public List<SubjectInf> findAllSubject();

}
