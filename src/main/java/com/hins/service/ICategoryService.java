package com.hins.service;

import com.hins.common.service.IBaseService;
import com.hins.entity.Category;

import java.util.List;

/**
 * @author: qixuan.chen
 * @Date: 2018/11/15 14:24
 * @describe：
 * @version: 1.0
 */

public interface ICategoryService extends IBaseService<Category, Integer> {

    /**
     *@describe  根据省份获取类目
     *@date 2018/11/16
     *@author  qixuan.chen
     */
    List<Category> findAllByRegion(String region);

}
