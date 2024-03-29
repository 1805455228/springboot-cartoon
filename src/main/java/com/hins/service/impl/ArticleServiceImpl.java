package com.hins.service.impl;

import com.hins.common.exception.JpaCrudException;
import com.hins.repository.ArticleRepository;
import com.hins.common.service.impl.BaseServiceImpl;
import com.hins.entity.Article;
import com.hins.service.IArticleService;
import com.hins.vo.MyPage;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 * @author: qixuan.chen
 * @Date: 2018/11/15 14:27
 * @describe： 文章Service 实现类
 * @version: 1.0
 */

@Slf4j
@Service
public class ArticleServiceImpl extends BaseServiceImpl<Article, Long, ArticleRepository> implements IArticleService {

    @Override
    public Article findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Article save(Article entity) throws JpaCrudException {
        return super.save(entity);
    }

    @Override
    public Article update(Article entity) throws JpaCrudException {
        return super.update(entity);
    }

    @Override
    public void deleteById(Long aLong) throws JpaCrudException {
        super.deleteById(aLong);
    }

    @Override
    public Page<Article> findAll(MyPage page) {
        PageRequest rageRequest = PageRequest.of(page.getPage() - 1, page.getSize(), Sort.by(Sort.Direction.DESC, "upTime"));
        Page<Article> all = null;
        if (page.getCid() != null && page.getCid() > 0) {
            all = baseRepository.findAllByCategoryId(rageRequest, page.getCid());
        } else if (page.getSearch() != null && StringUtils.isNotEmpty(page.getSearch())) {
            // 搜索方法
            all = baseRepository.findAllBySearch(rageRequest, page.getSearch());
        } else {
            all = baseRepository.findAll(rageRequest);
        }
        return all;
    }

}
