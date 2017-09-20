package com.test.service;

import java.util.List;

import com.test.dao.SubjectDAO;
import com.test.dao.SubjectDAOImpl;
import com.test.po.Subject;
import com.test.po.SubjectInf;
import com.test.util.Page;
import com.test.util.PageResult;
import com.test.util.PageUtil;

public class SubjectServiceImpl implements SubjectService{
	private SubjectDAO subjectDAO =  new SubjectDAOImpl();
	/*
	public boolean saveSubject(Subject subject) {
		String subject_title = subject.getSubject_title();
		if(subjectDAO.findSubjectByTitle(subject_title) == null){ //�����������ⲻ���ڣ��������
			subjectDAO.addSubject(subject);
			return true;
		}else {
			return false;
		}
	}

	public PageResult querySubjectByPage(Page page) {
		page = PageUtil.createPage(page.getEveryPage(),
				subjectDAO.findSubjectCount(),page.getCurrentPage());//�����ܼ�¼��������ҳ��Ϣ
		List<Subject> list = subjectDAO.findSubjectByPage(page);//ͨ����ҳ��Ϣȡ������
		PageResult result = new PageResult(page,list);//��װ��ҳ��Ϣ�ͼ�¼��Ϣ�����ظ����ô�
		return result;
	}

	public Subject showSubjectByID(int subject_id) {
		return subjectDAO.findSubjectByID(subject_id);
	}
	
	public List<Subject> showSubjectByClass(int subject_class) {
		return subjectDAO.findSubjectByClass(subject_class);
	}
	
	public void updateSubject(Subject subject) {
		subjectDAO.updateSubject(subject);
	}

	public void deleteSubject(int subjectID) {
		subjectDAO.deleteSubject(subjectID);
	}

	public PageResult likeQueryBySubjectTitle(String subjectTitle, Page page) {
		page = PageUtil.createPage(page.getEveryPage(),
				subjectDAO.findLinkQueryCount(subjectTitle),page.getCurrentPage());//�����ܼ�¼��������ҳ��Ϣ
		List<Subject> list = subjectDAO.likeQueryByTitle(subjectTitle, page);//ͨ����ҳ��Ϣģ����ѯ����
		PageResult result = new PageResult(page,list);//��װ��ҳ��Ϣ�ͼ�¼��Ϣ�����ظ����ô�
		return result;
	}
	*/
	public Subject findSubjectByClasses(int subject_class){
		return subjectDAO.findSubjectByClasses(subject_class);
	}
	public Subject showSubjectByID(int subject_id) {
		return subjectDAO.findSubjectByID(subject_id);
	}
	
	public List<SubjectInf> findAllSubject(){
		return subjectDAO.findAllSubject();
	}
	
	public List<Subject> showAllSubject() {
		return subjectDAO.showAllSubject();
	}
	public int numClasses(){
		return subjectDAO.numClasses();
	}
	public int numSubjectByClasses(int classes_id){
		return subjectDAO.numSubjectByClasses(classes_id);
	}
	
	/*
	public int accountResult(List<Integer> subjectIDs,
			List<String> studentAnswers) {
		int GeneralPoint = 0;//�ܷ�
		for(int i = 0; i < subjectIDs.size(); i++) {
			String rightAnswer = subjectDAO.
				findSubjectByID(subjectIDs.get(i)).getSubjectAnswer();//�õ���ȷ�𰸣�ͨ������ID
			if(rightAnswer.equals(studentAnswers.get(i))) {
				GeneralPoint += 5;//��5��
			}
		}
		return GeneralPoint;
	}
	*/
}
