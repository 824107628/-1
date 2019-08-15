package com.pinyougou.mapper;

import com.pinyougou.pojo.Brand;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


import java.util.List;

public interface BrandMapper {

//     @Select()  @Delete() @Update() @Insert()
//  注解 查询 所有 品牌  按id从小到大排列 升序
    @Select("SELECT * FROM tb_brand ORDER BY id ASC ")
    List<Brand> findAll();


}
