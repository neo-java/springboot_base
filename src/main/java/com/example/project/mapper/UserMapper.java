package com.example.project.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by ttobii on 2017. 4. 27..
 */

public interface UserMapper {

    String getCurrentDateTime();

    @Select("select now()")
    String getTime();
}
