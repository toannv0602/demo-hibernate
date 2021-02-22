package vn.edu.hou.persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import vn.edu.hou.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersistenceManager {
    public void persiesTest(){
        Employee emp= new Employee(3,"Nguyen Van B",10000);
        EntityManagerFactory entityManFac= Persistence.createEntityManagerFactory("test");
        EntityManager entityMan= entityManFac.createEntityManager();
        EntityTransaction trans=entityMan.getTransaction();
        trans.begin();
        entityMan.persist(emp);
        trans.commit();
        entityMan.close();
    }
}
