package com.example.project.mapper;

import org.apache.ibatis.annotations.Select;

/**
 * Created by ttobii on 2017. 4. 27..
 */


public interface CompanyMapper {

    @Select("select now()")
    String getTime();
}
