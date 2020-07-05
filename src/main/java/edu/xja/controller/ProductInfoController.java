package edu.xja.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.xja.domain.ProductInfo;
import edu.xja.domain.Type;
import edu.xja.service.ProductInfoService;
import edu.xja.service.TypeService;
import edu.xja.vo.FrameResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @project: aomaomanage
 * @description: 控制层：商品信息
 * @author: dell
 * @date: 2020/7/2 - 20:08
 * @version: 1.0
 * @website:
 */
@RestController
@RequestMapping("/product")
public class ProductInfoController {
    @Resource
    private ProductInfoService productInfoService;

    @PostMapping("/add")
    public FrameResponse addProductInfo(ProductInfo productInfo){
        int res=productInfoService.insert(productInfo);
        if (res==1){
            return FrameResponse.success("Successfully add product info！！！");
        }
        return FrameResponse.failure("fail");
    }
    @PostMapping("/update")
    public FrameResponse updateProductInfo(ProductInfo productInfo){
        int res=productInfoService.updateByPrimaryKeySelective(productInfo);
        if (res==1){
            return FrameResponse.success("Successfully update product info!!!");
        }
        else {
            return FrameResponse.failure("fail");
        }
    }

    @DeleteMapping("/delete/{id}")
    public FrameResponse deleteProductInfo(@PathVariable int id){
        int res=productInfoService.updateDeleteFlagByPrimaryKey(id);
        if (res==1){
            return FrameResponse.success("successfully deleted!!!");
        }
        else
        {
            return FrameResponse.failure("fail");
        }
    }
    @GetMapping("/searchProductInfo")
    public FrameResponse searchProductInfo(Integer page,Integer pageSize,String productName){
        PageHelper.startPage(page,pageSize);
        List<ProductInfo> productInfos=productInfoService.search(productName);
//        System.out.println(productInfos.get(0));
        PageInfo<ProductInfo> pageInfo=new PageInfo<ProductInfo>(productInfos);
//        System.out.println(pageInfo.getList().get(0));
        return FrameResponse.success(pageInfo);
    }
}
