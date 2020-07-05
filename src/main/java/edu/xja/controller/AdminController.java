package edu.xja.controller;

import edu.xja.domain.Admin;
import edu.xja.service.AdminService;
import edu.xja.vo.FrameResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @project: aomaomanage
 * @description: 控制层：管理员
 * @author: dell
 * @date: 2020/7/3 - 22:38
 * @version: 1.0
 * @website:
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Resource
    private AdminService adminService;

    @PostMapping("/exists")
    public FrameResponse exists(String adminAccount,String adminPass){
        Admin admin=adminService.selectByAccountAndPass(adminAccount,adminPass);
        if (admin!=null){
           return FrameResponse.success("success");
        }
        else {
            return FrameResponse.failure("fail");
        }
    }
    @PostMapping("/getAdmin")
    public FrameResponse getAdmin(String adminAccount){
        Admin admin=adminService.selectByAccount(adminAccount);
        if (admin!=null){
           return FrameResponse.success(admin);
        }
        else {
            return FrameResponse.failure("fail");
        }
    }

    /**
     * 修改密码
     * @param admin
     * @return
     */
    @PostMapping("/update")
    public FrameResponse updateAdminPass(Admin admin) {
        int res = adminService.updateByPrimaryKeySelective(admin);
        if (res == 1) {
            return FrameResponse.success("Successfully update adminPass!!!");
        } else {
            return FrameResponse.failure("fail");
        }
    }
}
