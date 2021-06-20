package org.bjpowernode;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.bjpowernode.dao.InvocationHandlerimpl;
import org.bjpowernode.dao.SqlFactory;
import org.bjpowernode.domain.Xuesheng;
import org.bjpowernode.service.Xueshengservice;
import org.bjpowernode.service.XueshengserviceImpl;
import org.bjpowernode.util.MySqlSession;

import java.lang.reflect.InvocationHandler;

public class test {
    public static void main(String[] args) {
        Xuesheng xuesheng = new Xuesheng();
        xuesheng.setId(1111);
        xuesheng.setAge(18);
        xuesheng.setName("蔡徐坤");
        Xueshengservice xueshengservice = (Xueshengservice)SqlFactory.getservice(new XueshengserviceImpl());
        xueshengservice.insert(xuesheng);

    }


}
