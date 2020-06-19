package com.bl.demo.greeting.dao;
import com.bl.demo.greeting.model.User;
import com.mysql.cj.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {
    @Autowired
    private EntityManager entityManager;
    @Override
    public List<User> get() {
        Session currentSession=entityManager.unwrap(Session.class);
        Query<User>query=currentSession.createQuery("from User",User.class);
        List<User>list=query.getResultList();
        return list;
    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void delete(int id) {

    }
}
