package com.hins.common.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author: qixuan.chen
 * @Date: 2018/11/15 12:58
 * @describe： 通用实体类
 * @version: 1.0
 */

@MappedSuperclass
@Getter
@Setter
@ToString
public class BaseEntity implements Serializable {

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "version")
    private long version;

}
