package com.zhidevelop.repository;

import com.zhidevelop.entity.Person;
import org.springframework.data.annotation.Persistent;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import java.util.List;

/**
 * description
 * author enzoluo
 * time 2018-03-06 10:23
 * version v1.0
 **/
@Repository
public class UserDao extends BaseDao {
    /**
     * Method verify
     * Description 验证用户名和密码
     *
     * @return boolean
     * Date 2018-3-8 11:23
     * Author EnzoLuo
     * @params loginName
     * @params password
     */
    public boolean verify(String loginName, String password) {
        boolean bool = false;
        String hql = "from Person person where person.loginName=? and person.password=?";
        Query query = em.createQuery(hql);
        bingParam(query, loginName, password);
        List<Person> persons = query.getResultList();
        if (persons.size() != 0) {
            bool = true;
        }
        return bool;
    }

    /**
     * Method addUser
     * Description 添加用户
     * @params Person
     * @return boolean
     * Date 2018-3-8 11:30
     * Author EnzoLuo
     */
    @Transactional
    public boolean save(Person person) {
        boolean bool = false;
        em.persist(person);
        return bool;
    }
}
