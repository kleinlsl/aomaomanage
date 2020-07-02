package edu.xja.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.xja.domain.Type;
import edu.xja.domain.UserInfo;
import edu.xja.service.TypeService;
import edu.xja.vo.FrameResponse;
import io.swagger.models.auth.In;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @project: aomaomanage
 * @description: 控制层:商品类别
 * @author: dell
 * @date: 2020/7/2 - 17:29
 * @version: 1.0
 * @website:
 */
@RestController
@RequestMapping("/type")
public class TypeController {
    @Resource
    private TypeService typeService;

    @PostMapping("/addType")
    public FrameResponse addProductType(String adminName, String typeName){
        if (adminName!=""&&typeName!=""){
            FrameResponse.failure("Parameter error! ! !");
        }
        else if (true/*adminName存在*/){
            Type typeInfo=new Type();
            typeInfo.setName(typeName);
            typeInfo.setCreator(adminName);
            int res=typeService.insert(typeInfo);
            if (res==1){
                FrameResponse.success("success");
            }
            else {
                /**
                 * 可能是因为：
                 * 1、类别名已存在
                 * 2、其他原因
                 */
                FrameResponse.failure("fail");
            }
        }
        else {
            return FrameResponse.failure("user information does not exist!!!");
        }
        return FrameResponse.failure("fail");
    }
    @PostMapping("/updateType")
    public FrameResponse updateType(Type typeInfo){
        int res=typeService.updateByPrimaryKeySelective(typeInfo);
        if (res==1){
            return FrameResponse.success("Successfully updated product category!!!");
        }
        else {
            return FrameResponse.failure("fail");
        }
    }

    @DeleteMapping("delete/{id}")
    public FrameResponse deleteType(@PathVariable int id){
        int res=typeService.updateDeleteFlagByPrimaryKey(id);
        if (res==1){
            return FrameResponse.success("successfully deleted!!!");
        }
        else
        {
            return FrameResponse.failure("fail");
        }
    }
    @GetMapping("/searchType")
    public FrameResponse serchType(Integer page,Integer pageSize,String typeName){
        PageHelper.startPage(page,pageSize);
        List<Type> typeList=typeService.search(typeName);
        PageInfo<Type> pageInfo=new PageInfo<Type>(typeList);
        return FrameResponse.success(pageInfo);
    }
}
