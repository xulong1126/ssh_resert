package com.xu.dao.impl;

import com.xu.dao.IUserDao;
import com.xu.entity.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;

import java.util.List;

public class UserDaoImpl  extends HibernateTemplate implements IUserDao {


    @Override
    public User queryOne(Integer id) {

        return super.get(User.class,1);
    }

    @Override
    public List<User> queryAll() {
//        super.bulkUpdate("select count(*) from User");
        super.execute(new HibernateCallback<Integer>() {
            @Override
            public Integer doInHibernate(Session session) throws HibernateException {
                Long a = (Long) session.createQuery("").uniqueResult();
                return a.intValue();
            }
        });
        return null;
    }

    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public int modifyUser(User user) {
        return 0;
    }

    @Override
    public int deleteUser(Integer id) {
        return 0;
    }


}
