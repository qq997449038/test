package org.bjpowernode.dao;

import org.apache.ibatis.session.SqlSession;
import org.bjpowernode.util.MySqlSession;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class InvocationHandlerimpl implements InvocationHandler {
    private Object abc;

    public InvocationHandlerimpl(Object abc) {
        this.abc = abc;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj=null;
        SqlSession sqlSession = MySqlSession.getSqlSession();
        obj = method.invoke(abc,args);
        sqlSession.commit();
        return obj;
    }
    public Object Poxy(){
        return Proxy.newProxyInstance(abc.getClass().getClassLoader(),abc.getClass().getInterfaces(),this);
    }
}
