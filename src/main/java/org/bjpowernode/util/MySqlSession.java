package org.bjpowernode.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;

public class MySqlSession {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        String config = "mybatis.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(config);
        } catch (IOException e) {
            e.printStackTrace();
        }

        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<SqlSession>();
    public static SqlSession getSqlSession(){

        SqlSession sqlSession = threadLocal.get();

        if (sqlSession==null){

            sqlSession = sqlSessionFactory.openSession();

            threadLocal.set(sqlSession);
        }
        return sqlSession;
    }



    public  static void guanbisqlSession(SqlSession sqlSession){
        if (sqlSession!=null){
            sqlSession.close();
            threadLocal.remove();
        }
    }
}
