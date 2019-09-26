package com.hins.entity;

import com.hins.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 章节
 * @author qixuan.chen
 * @date 2019-09-25 21:03
 */
@Entity
@Table(name = "tb_book_chapter")
@Data
@EqualsAndHashCode(callSuper = false)
public class BookChapter extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = true, length = 20)
    private Long id;

    @Column(name = "book_id", nullable = true, length = 64)
    private Long bookId;

    @Column(name = "title", nullable = true, length = 64)
    private String title;

    @Column(name = "vip_free", nullable = true, length = 32)
    private boolean vipFree;//vip免费

    @Column(name = "sequence", nullable = true, length = 64)
    private Integer sequence;

    @Column(name = "cover_url", nullable = true, length = 256)
    private String coverUrl;

    @Column(name = "encode_name", nullable = true, length = 64)
    private String encodeName;

    @Column(name = "local_url", nullable = true, length = 256)
    private String localUrl;
}
