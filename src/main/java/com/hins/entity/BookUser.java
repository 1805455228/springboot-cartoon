package com.hins.entity;

import com.hins.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author qixuan.chen
 * @date 2019-09-25 21:35
 */
@Entity
@Table(name = "tb_book_user")
@Data
@EqualsAndHashCode(callSuper = false)
public class BookUser extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private String userId;

    @Column(name = "name", nullable = true, length = 20)
    private String name;

    @Column(name = "password", nullable = true, length = 20)
    private String password;

    @Column(name = "email", nullable = true, length = 20)
    private String email;

    @Column(name = "mobile", nullable = true, length = 20)
    private String mobile;

    @Column(name = "avatar", nullable = true, length = 128)
    private String avatar;

    @Column(name = "age", nullable = true, length = 4)
    private int age;

    @Column(name = "status", nullable = true, length = 10)
    private String status;

    @Column(name = "is_vip", nullable = true, length = 32)
    private boolean isVip;//vip免费

    @Column(name = "money", nullable = true, length = 32)
    private float money;//用户金额（虚拟）
}
