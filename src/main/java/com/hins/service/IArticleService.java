package com.hins.service;

import com.hins.common.service.IBaseService;
import com.hins.entity.Article;
import com.hins.vo.MyPage;
import org.springframework.data.domain.Page;

/**
 * @author: qixuan.chen
 * @Date: 2018/11/15 14:24
 * @describe：
 * @version: 1.0
 */

public interface IArticleService extends IBaseService<Article, Long> {

    // 根据类目分页
    Page<Article> findAll(MyPage page);



}
