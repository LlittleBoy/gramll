package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;


public interface UserService {
    List<UmsMember> selectAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddAddressByMemberId(String memberId);
}
