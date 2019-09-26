package com.hins.entity;

import com.hins.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author qixuan.chen
 * @date 2019-09-25 17:56
 */
@Entity
@Table(name = "tb_book")
@Data
@EqualsAndHashCode(callSuper = false)
public class Book extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_id")
    private String bookId;

    @Column(name = "name", nullable = true, length = 64)
    private String name;

    @Column(name = "author", nullable = true, length = 64)
    private String author;

    @Column(name = "cover_url", nullable = true, length = 256)
    private String coverUrl;

    @Column(name = "categoryId", nullable = true, length = 32)
    private String categoryId;

    @Column(name = "type", nullable = true, length = 64)
    private String type;

    @Column(name = "status", nullable = true, length = 64)
    private String status;

    @Column(name = "chapter_count", nullable = true, length = 4)
    private Integer chapterCount;

    @Column(name = "tags", nullable = true, length = 128)
    private String tags;

    @Column(name = "recommend", nullable = true, length = 128)
    private String recommend;//推荐（头图，热门）

    @Column(name = "free_flag", nullable = true, length = 128)
    private String freeFlag;//是否免费

    @Column(name = "vip_free", nullable = true, length = 32)
    private boolean vipFree;//vip免费

    @Column(name = "chapter_points", nullable = true, length = 32)
    private float chapterPoints;//章节金币

    @Column(name = "read_count", nullable = true, length = 32)
    private Integer readCount;//观看数

    @Column(name = "description", nullable = true, length = 500)
    private String description;

    @Column(name = "keywords", nullable = true, length = 128)
    private String keywords;

    @Column(name = "encode_name", nullable = true, length = 64)
    private String encodeName;

    @Column(name = "local_url", nullable = true, length = 256)
    private String localUrl;


}
