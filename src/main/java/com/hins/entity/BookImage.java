package com.hins.entity;


import com.hins.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 章节图片
 * @author qixuan.chen
 * @date 2019-09-25 21:29
 */
@Entity
@Table(name = "tb_book_image")
@Data
@EqualsAndHashCode(callSuper = false)
public class BookImage  extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = true, length = 20)
    private Long id;

    @Column(name = "book_id", nullable = true, length = 64)
    private Long bookId;

    @Column(name = "chapter_id", nullable = true, length = 64)
    private Long chapterId;

    @Column(name = "sequence", nullable = true, length = 64)
    private Integer sequence;

    @Column(name = "url", nullable = true, length = 256)
    private String url;

    @Column(name = "encode_name", nullable = true, length = 64)
    private String encodeName;

    @Column(name = "local_url", nullable = true, length = 256)
    private String localUrl;
}
