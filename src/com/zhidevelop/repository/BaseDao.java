package com.zhidevelop.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * description
 * author enzoluo
 * time 2018-03-06 10:36
 * version v1.0
 **/
@Repository
public class BaseDao {
    @PersistenceContext
    public EntityManager em;

    /**
     * Method bingParam
     * Description  给query 绑定多个参数
     * params [query, params]
     * return void
     * Data 2017/9/19 9:54
     * Author EnzoLuo
     */
    public void bingParam(Query query, Object... params) {

        for (int i = 0; i < params.length; i++) {
            query.setParameter(i + 1, params[i]);
        }
    }

    /**
     * Method bingParam
     * Description 给 query 绑定集合
     * params [query, paramList]
     * return void
     * Data 2017/9/19 9:55
     * Author EnzoLuo
     */
    public void bingParam(Query query, List<Object> paramList) {

        for (int i = 0; i < paramList.size(); i++) {
            query.setParameter(i + 1, paramList.get(i));
        }

    }

    /**
     * Method bingParam
     * Description 给 ps 绑定多个参数
     * params [ps, params]
     * return void
     * Data 2017/9/19 9:55
     * Author EnzoLuo
     */
    public static void bingParam(PreparedStatement ps, Object... params) throws SQLException {

        for (int i = 0; i < params.length; i++) {
            ps.setObject(i + 1, params[i]);
        }
    }

    /**
     * Method bingParam
     * Description 给 ps 绑定集合
     * params [ps, paramList]
     * return void
     * Data 2017/9/19 9:55
     * Author EnzoLuo
     */
    public static void bingParam(PreparedStatement ps, List<Object> paramList) throws SQLException {

        for (int i = 0; i < paramList.size(); i++) {
            ps.setObject(i + 1, paramList.get(i));
        }
    }
}
