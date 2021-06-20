package org.bjpowernode.dao;

public class SqlFactory {

    public static Object getservice(Object object){
        return new InvocationHandlerimpl(object).Poxy();
    }
}
