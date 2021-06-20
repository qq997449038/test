package org.bjpowernode.dao;

import org.bjpowernode.domain.Xuesheng;

import java.util.List;

public interface Xueshengdao {
    List<Xuesheng> select();

    void insert(Xuesheng a);
}
