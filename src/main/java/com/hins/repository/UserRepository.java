package com.hins.repository;

import com.hins.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author: qixuan.chen
 * @Date: 2018/11/15 13:54
 * @describe： 用户dao接口
 * @version: 1.0
 */

public interface UserRepository extends JpaRepository<User, String> {

    /**
     * @describe 根据账号查询出用户信息
     * @date 2018/11/15
     * @author qixuan.chen
     */
    User findByAccount(String account);

    /**
     * @describe 根据微信的openId查询出用户信息
     * @date 2018/11/15
     * @author qixuan.chen
     */
    User findByOpenId(String openId);

    /**
     * @describe 查询出某个部门下用户数量
     * @date 2018/11/16
     * @author qixuan.chen
     */
    int countByDept(Integer deptId);

    /**
     *@describe 判断账号是否存在
     *@date 2018/11/17
     *@author  qixuan.chen
     */
    @Query(value = "select count(u) from User as u where u.account = ?1 or u.mail = ?1 ")
    Integer countByAccountOrMail(String account);

}
