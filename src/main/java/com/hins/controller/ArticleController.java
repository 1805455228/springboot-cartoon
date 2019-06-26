package com.hins.controller;

import com.hins.common.controller.BaseController;
import com.hins.entity.Article;
import com.hins.service.IArticleService;
import com.hins.vo.MyPage;
import com.hins.vo.Result;
import io.swagger.annotations.Api;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: qixuan.chen
 * @Date: 2018/11/15 14:49
 * @describe：
 * @version: 1.0
 */

@Api(tags = "文章管理")
@RestController
@RequestMapping("/article")
public class ArticleController extends BaseController<Article, Long, IArticleService> {

    @GetMapping("/list")
    @Override
    public Result<Page<Article>> findAll(MyPage page) {
        return Result.success(baseService.findAll(page));
    }

}
