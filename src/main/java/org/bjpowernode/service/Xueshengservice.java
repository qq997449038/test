package org.bjpowernode.service;

import org.apache.ibatis.session.SqlSession;
import org.bjpowernode.domain.Xuesheng;

import java.util.List;

public interface Xueshengservice {
    List<Xuesheng> select();

    void insert(Xuesheng a);

}
