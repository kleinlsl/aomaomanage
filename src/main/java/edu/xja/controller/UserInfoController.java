package edu.xja.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.xja.domain.UserInfo;
import edu.xja.service.UserInfoService;
import edu.xja.vo.FrameResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @project: aomaomanage
 * @description: 控制层: 会员管理
 * @author: dell
 * @date: 2020/6/30 - 15:11
 * @version: 1.0
 * @website:
 */
@RestController
@RequestMapping("/user")
public class UserInfoController {
    @Resource
    private UserInfoService userInfoService;

    /**
     * @description: 修改会员状态
     * @param: userId:用户ID
     * @param: status:更改后的状态(0?1)
     * @param: status:更改者名字
     * @date: 2020/6/30 - 16:42
     * @return: edu.xja.vo.FrameResponse
     */
    @PostMapping("/updateStatus")
    public FrameResponse updateStatus(Integer userId, Integer status,String operator){
        UserInfo userInfo=userInfoService.selectByPrimaryKey(userId);
        if (userInfo==null||!(status==0||status==1)){
            return FrameResponse.failure("parameter error");
        }
        else {
            userInfo.setStatus(status);
            userInfo.setOperator(operator);
            int res = userInfoService.updateByPrimaryKeySelective(userInfo);
            if (res!=0){
                return FrameResponse.success("success");
            }
            else {
                return FrameResponse.failure("Unknown error, please try again！");
            }
        }
    }

    @GetMapping("/selectUser")
    public FrameResponse selectUser(Integer page,Integer pageSize){
        PageHelper.startPage(page,pageSize);
        List<UserInfo> userInfoList=userInfoService.findAll();
        PageInfo<UserInfo> pageInfo=new PageInfo<UserInfo>(userInfoList);
        return FrameResponse.success(pageInfo);
    }
}
