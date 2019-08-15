package pinyougou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.Brand;
import com.pinyougou.service.BrandService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class BrandController {

    @Reference
    private BrandService brandService;

//    查询全部品牌
    @GetMapping("/brand/findAll")
    public List<Brand> findAll(){
        return brandService.findAll();
    }

}
