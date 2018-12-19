package material.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import material.pojo.Role;
import material.service.RoleService;

@Controller
@RequestMapping("/sysadmin/role")
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	
	@RequestMapping("/list")
	public String list(Model model){
		
		model.addAttribute("roles", roleService.findAll());
		
		return "sysadmin/role/jRoleList";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam(value="roleId",required=false)String[] roleIds){
		
		if (roleIds!=null) {
			roleService.delete(roleIds);
		}
		
		return "redirect:/sysadmin/role/list";
	}
	
	@RequestMapping("/tocreate")
	public String tocreate(){
		
		return "sysadmin/role/jRoleCreate";
	}
	
	@RequestMapping("/save")
	public String save(Role role){
		
		roleService.save(role);
		
		return "redirect:/sysadmin/role/list";
	}
	@RequestMapping("/toupdate")
	public String toupdate(String roleId,Model model){
		
		//通过id查询角色详情
		Role role = roleService.findOne(roleId);
		
		model.addAttribute("role", role);
		
		return "sysadmin/role/jRoleUpdate";
	}
	
	@RequestMapping("/update")
	public String update(Role role){
		
		roleService.update(role);
		
		return "redirect:/sysadmin/role/list";

	}
	
	@RequestMapping("/toview")
	public String toview(String roleId,Model model){
		
		//通过id查询角色详情
		Role role = roleService.findOne(roleId);
		
		model.addAttribute("role", role);
		
		return "sysadmin/role/jRoleView";
	}
}
