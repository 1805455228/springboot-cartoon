package com.hins.repository;

import com.hins.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author: qixuan.chen
 * @Date: 2018/11/15 13:54
 * @describe： 文章类目  dao 接口
 * @version: 1.0
 */

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    /**
     *@describe  根据省份获取类目
     *@date 2018/11/16
     *@author  qixuan.chen
     */
    List<Category> findAllByRegion(String region);


}
