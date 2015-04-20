package com.plan.common.service;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory {
	private static String CONFIG_FILE_LOCATION = "hibernate.cfg.xml";
    private static final ThreadLocal<Session> threadLocal = 
            new ThreadLocal<Session>();
    private static Configuration configuration = new Configuration();
    private static SessionFactory sessionFactory;
    private static String configFile = CONFIG_FILE_LOCATION;
    
    static {
        sessionFactory = configuration.configure(configFile).buildSessionFactory();
    }
    
    private HibernateSessionFactory(){
        
    }
    
    public static Session getSession(){
        Session session = threadLocal.get();
        if(session == null || !session.isOpen()){
            session = (sessionFactory != null ) ? sessionFactory.openSession():null;
            threadLocal.set(session);
        }
        return session;
    }
}
