package org.bjpowernode.service;

import org.bjpowernode.dao.Xueshengdao;
import org.bjpowernode.domain.Xuesheng;
import org.bjpowernode.util.MySqlSession;

import java.util.List;

public class XueshengserviceImpl implements Xueshengservice {

    private  Xueshengdao xueshengdao = MySqlSession.getSqlSession().getMapper(Xueshengdao.class);
    @Override
    public List<Xuesheng> select() {

        return null;
    }

    @Override
    public void insert(Xuesheng a) {
        xueshengdao.insert(a);

    }
}
