package material.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	
	@RequestMapping("/home")
	public String homeAction(){
		
		return "home/fmain";
	}
	@RequestMapping("/title.action")
	public String titleAction(){
		
		return "home/title";
	}
//	//首页
//	@RequestMapping("/homeLeft.action")
//	public String homeLeftAction(){
//		
//		return "home/left";
//	}
//	@RequestMapping("/homeMain.action")
//	public String homeMainAction(){
//		
//		return "home/main";
//	}
//	
//	//系统管理
//	@RequestMapping("/sysadminLeft.action")
//	public String sysadminLeftAction(){
//		
//		return "sysadmin/left";
//	}
//	@RequestMapping("/sysadminMain.action")
//	public String sysadminMainAction(){
//		
//		return "sysadmin/main";
//	}
//	
////	基础信息
//	@RequestMapping("/baseinfoLeft.action")
//	public String baseinfoLeftAction(){
//		
//		return "baseinfo/left";
//	}
//	@RequestMapping("/baseinfoMain.action")
//	public String baseinfoMainAction(){
//		
//		return "baseinfo/main";
//	}
//	//货运管理
//	@RequestMapping("/cargoLeft.action")
//	public String cargoLeftAction(){
//		
//		return "cargo/left";
//	}
//	@RequestMapping("/cargoMain.action")
//	public String cargoMainAction(){
//		
//		return "cargo/main";
//	}
	
//	localhost:8090/xiaoming/18/register.action
//	 /{name}/{age}/register.action

	@RequestMapping("/{name}/Left.action")
	public String leftAction(@PathVariable String name){
		
		return name+"/left";
	}
	@RequestMapping("/{name}/Main.action")
	public String mainAction(@PathVariable String name){
		
		return name+"/main";
	}
	
	
	
}
