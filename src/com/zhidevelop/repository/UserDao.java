package com.zhidevelop.repository;

import org.springframework.stereotype.Repository;
import com.zhidevelop.entity.Person;

import javax.persistence.Query;
import java.util.List;

/**
 * description
 * author enzoluo
 * time 2018-03-06 10:23
 * version v1.0
 **/
@Repository
public class UserDao extends BaseDao{
    public boolean verify(String loginName,String password){
        boolean bool = false;
        String hql = "from Person person where person.loginName=? and person.password=?";
        Query query = em.createQuery(hql);
        bingParam(query,loginName,password);
        List<Person> persons = query.getResultList();
        if(persons.size() != 0){
            bool = true;
        }
        return bool;
    }
}
