package org.bjpowernode.dao;

public class SqlFactory {
    private  int a;

    public static Object getservice(Object object){
        return new InvocationHandlerimpl(object).Poxy();
    }
}
