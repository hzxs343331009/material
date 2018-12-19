package material.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import material.pojo.User;
import material.service.DeptService;
import material.service.UserService;

@Controller
@RequestMapping("sysadmin/user")
public class UserController extends BaseController{

	@Autowired
	private UserService userService;
	
	@Autowired
	private DeptService deptService;
	
	@RequestMapping("/list")
	public String list(Model model){
		
		model.addAttribute("users", userService.findAll());
		
		return "sysadmin/user/jUserList";
	}
	
	@RequestMapping("/start")
	public String start(@RequestParam(value="userId",required=false)String[] userIds){
		
		//鍒ゆ柇涓嶈兘涓簄ull
		if (userIds!=null) {
			
			userService.changeState(1,userIds);
		}
		
		return "redirect:/sysadmin/user/list";
		
	}
	
	@RequestMapping("/stop")
	public String stop(@RequestParam(value="userId",required=false)String[] userIds){
		
		//鍒ゆ柇涓嶈兘涓簄ull
		if (userIds!=null) {
			userService.changeState(0,userIds);
		}
		
		return "redirect:/sysadmin/user/list";
		
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam(value="userId",required=false)String[] userIds){
		
		if (userIds!=null) {
			
			userService.delete(userIds);
		}
		
		
		//濡傛灉鏈璇锋眰涓� 澧炲垹鏀规搷浣� 淇敼瀹屼箣鍚庡敖閲忎娇鐢ㄩ噸瀹氬悜锛岄伩鍏嶅埛鏂伴〉闈㈢殑鏃跺�欓噸澶嶆彁浜や慨鏀规暟鎹簱鐨勮姹�
		return "redirect:/sysadmin/user/list";
	}
	
//	鎷︽埅鏂板鐨勮姹� 杩斿洖鏂板椤甸潰
	@RequestMapping("/tocreate")
	public String toCreate(Model model){
		
		
		model.addAttribute("depts", deptService.findAll());
		model.addAttribute("users", userService.findAll());
		
		
		return "sysadmin/user/jUserCreate";
	}
	
	@RequestMapping("/save")
	public String save(User user){
		
		userService.save(user);
		return "redirect:/sysadmin/user/list";

	}
	
	@RequestMapping("/toupdate")
	public String toUpdate(String userId,Model model){
		
		//鏌ヨ鐢ㄦ埛鐨勮缁嗕俊鎭�
		User user = userService.findOne(userId);
		
		model.addAttribute("user", user);
		model.addAttribute("depts", deptService.findAll());
		model.addAttribute("users", userService.findAll());

		return "sysadmin/user/jUserUpdate";
	}
	
	
	@RequestMapping("/update")
	public String update(User user){
		
		
		userService.update(user);
		
		return "redirect:/sysadmin/user/list";
	}
	
	
	//鎷︽埅鏌ョ湅璇锋眰
	@RequestMapping("/toview")
	public String toview(String userId,Model model){
		
		//鏌ヨ鐢ㄦ埛璇︽儏
		User user = userService.findOne(userId);

		model.addAttribute("user", user);
		
		return "sysadmin/user/jUserView";
		
	}
	
	
	
	
}
