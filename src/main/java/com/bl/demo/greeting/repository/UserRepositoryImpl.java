package com.bl.demo.greeting.repository;
import com.bl.demo.greeting.model.User;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;
import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

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
        Session currentSession=entityManager.unwrap(Session.class);
        User user=currentSession.get(User.class,id);
        return user;
    }

    @Override
    public void save(User user) {
       Session currentSession= entityManager.unwrap(Session.class);
       currentSession.save(user);
    }

    @Override
    public void delete(int id) {
        Session currentSession=entityManager.unwrap(Session.class);
        User user=currentSession.get(User.class,id);
        currentSession.delete(user);
    }
}
