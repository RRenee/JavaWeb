package com.test.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.test.hibernate.HibernateSessionFactory;
import com.test.po.Classes;
import com.test.po.Subject;
import com.test.util.Page;

public class ClassesDAOImpl implements ClassesDAO{
	/*
	public void addClasses(Classes classes){
		Session session = HibernateSessionFactory.getSession();
		Transaction  transaction = null;
		try{
			transaction = session.beginTransaction();
			session.save(classes);
			transaction.commit();
		}catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback();
		}
		HibernateSessionFactory.closeSession();
	}
	*/
	public Classes showClassesByID(int classes_id){
		Session session = HibernateSessionFactory.getSession();
		Classes classes = (Classes) session.get(Classes.class, classes_id);
		HibernateSessionFactory.closeSession();		//�ر�Session����
		return classes;
	}
	
	public Classes findClassesByTitle(String classes_title){
		Session session = HibernateSessionFactory.getSession();//���Session����
		Query query = session.createQuery("from Classes where Classes.classes_title = ?");
		query.setString(0, classes_title);
		List list = query.list();					//��ѯ������浽list��
		HibernateSessionFactory.closeSession();		//�ر�Session����
		if(list.size() == 0) {
			return null;							//����null
		}else {
			return (Classes) list.get(0);			//���ص�һ������
		}
	}
	/*
	public void updateClasses(Classes classes){
		Session session = HibernateSessionFactory.getSession();//���Session����
		Transaction  transaction = null;//����һ���������
		try{
			transaction = session.beginTransaction();//��������
			session.update(classes);//����������Ϣ
			transaction.commit();//�ύ����
		}catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback();//����ع�
		}
		HibernateSessionFactory.closeSession();//�ر�Session����
	}
	
	public void deleteClasses(int classes_id){
		Session session = HibernateSessionFactory.getSession();//���Session����
		Classes classes = (Classes) session.get(Classes.class, classes_id);
		Transaction  transaction = null;//����һ���������
		try{
			transaction = session.beginTransaction();//��������
			session.delete(classes);
			transaction.commit();//�ύ����
		}catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback();//����ع�
		}
		HibernateSessionFactory.closeSession();//�ر�Session����
	}
	*/
}
