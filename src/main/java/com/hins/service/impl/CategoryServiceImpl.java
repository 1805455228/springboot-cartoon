package com.hins.service.impl;

import com.hins.common.exception.JpaCrudException;
import com.hins.repository.CategoryRepository;
import com.hins.common.service.impl.BaseServiceImpl;
import com.hins.entity.Category;
import com.hins.service.ICategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: qixuan.chen
 * @Date: 2018/11/15 14:27
 * @describe： 类目Service 实现类
 * @version: 1.0
 */

@Slf4j
@Service
@CacheConfig(cacheNames = "categorys")
public class CategoryServiceImpl extends BaseServiceImpl<Category, Integer, CategoryRepository> implements ICategoryService {

    @Override
    @Cacheable(key = "#p0")
    public List<Category> findAllByRegion(String region) {
        return baseRepository.findAllByRegion(region);
    }

    @Override
    @CacheEvict(key = "#p0", allEntries = true)
    public void deleteById(Integer integer) throws JpaCrudException {
        super.deleteById(integer);
    }

}
