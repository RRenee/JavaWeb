package com.test.dao;

import java.util.List;
import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.test.hibernate.HibernateSessionFactory;
import com.test.po.Subject;
import com.test.po.SubjectInf;
import com.test.po.Classes;
import com.test.util.Page;


public class SubjectDAOImpl implements SubjectDAO{
	//��һ���֣�����subject_class��ѯ��Ŀ
	public Subject findSubjectByClasses(int subject_class){
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery("from Subject");
		Subject subject=new Subject();
		List<Subject> list = query.list();
		HibernateSessionFactory.closeSession();	
		for(int j=0;j<list.size();++j){	
			if(list.get(j).getSubject_class()==subject_class){
				subject=list.get(j);
			}
		}
		return subject;
		
	}
	public int numClasses(){
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery("from Classes");
		List list = query.list();
		HibernateSessionFactory.closeSession();
		return list.size();
	}
	public int numSubjectByClasses(int classes_id){
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery("from Subject");
		List<Subject> list = query.list();
		int numSubject=0;
		for(int i=0;i<list.size();++i){
			if (list.get(i).getSubject_class()==classes_id){
				numSubject+=1;
			}
		}
		HibernateSessionFactory.closeSession();
		return numSubject;
	}
	
	public Subject findSubjectByID(int subject_id) {
		Session session = HibernateSessionFactory.getSession();//���Session����
		Subject subject = (Subject) session.get(Subject.class, subject_id);
		HibernateSessionFactory.closeSession();		//�ر�Session����
		return subject;
	}
	
	public List<Subject> showAllSubject() {
		Session session = HibernateSessionFactory.getSession();//���Session����
		Query query = session.createQuery("from Subject");
		List list = query.list();	//��ѯ������浽list��
		HibernateSessionFactory.closeSession();//�ر�Session����
		return list;
	}
	//��ȡ�ڶ�����������Ŀ
	public List<SubjectInf> findAllSubject() {
		Session session = HibernateSessionFactory.getSession();
		List<SubjectInf> subjectinf=new ArrayList<SubjectInf>();
		Query query = session.createQuery("from Subject");//��ȡ������Ŀ
		List<Subject> list = query.list();
		int subject_class=1;
		for(int i=1;i<=2;++i){	
			Classes classes = (Classes) session.get(Classes.class, subject_class);
			SubjectInf su=new SubjectInf();
			su.subject_class=classes.getClasses_title();
			for(int j=0;j<list.size();++j){			
				if(list.get(j).getSubject_class()==subject_class){
					System.out.println(list.get(j).getSubject_title());
					su.addSubject(list.get(j));
				}			
			}
			++subject_class;
			subjectinf.add(su);
		}
		HibernateSessionFactory.closeSession();//�ر�Session����
		return subjectinf;
	}

}
