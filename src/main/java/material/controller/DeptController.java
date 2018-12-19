package material.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import material.pojo.Dept;
import material.service.DeptService;

@Controller
@RequestMapping("/sysadmin/dept")
public class DeptController {

	@Autowired
	private DeptService deptService;

	@RequestMapping("/list")
	public String findAll(Model model) {

		model.addAttribute("deptList", deptService.findAll());
		return "sysadmin/dept/jDeptList";
	}

	@RequestMapping("/stop")
	public String stop(@RequestParam(value = "deptId", required = false) String[] deptIds) {

		if (deptIds != null) {
			deptService.updateState(0, deptIds);
		}
		// 修改完之后让页面刷新 即发出一个列表页面的请求
		return "redirect:/sysadmin/dept/list";
	}

	@RequestMapping("/start")
	public String start(@RequestParam(value = "deptId", required = false) String[] deptIds) {

		if (deptIds != null) {
			deptService.updateState(1, deptIds);
		}
		// 修改完之后让页面刷新 即发出一个列表页面的请求
		return "redirect:/sysadmin/dept/list";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam(value = "deptId", required = false) String[] deptIds) {

		if (deptIds != null) {
			deptService.delete(deptIds);
		}
		return "redirect:/sysadmin/dept/list";
	}

	@RequestMapping("/tocreate")
	public String toCreate(Model model) {

		// 鏌ヨ鎵�鏈夌殑閮ㄩ棬骞朵笖杩斿洖
		List<Dept> depts = deptService.findAll();
		model.addAttribute("depts", depts);

		return "sysadmin/dept/jDeptCreate";
	}

	@RequestMapping("/save")
	public String save(Dept dept) {

		deptService.save(dept);

		return "redirect:/sysadmin/dept/list";
	}

	@RequestMapping("/toupdate")
	public String toUpdate(String deptId, Model model) {

		// 鏌ヨ閮ㄩ棬璇︽儏
		Dept dept = deptService.findOneById(deptId);
		model.addAttribute("dept", dept);

		// 鏌ヨ鎵�鏈夌殑閮ㄩ棬
		List<Dept> depts = deptService.findAll();
		model.addAttribute("depts", depts);

		return "sysadmin/dept/jDeptUpdate";
	}

	@RequestMapping("/update")
	public String update(Dept dept) {

		deptService.update(dept);

		return "redirect:/sysadmin/dept/list";
	}

	@RequestMapping("/toview")
	public String toView(String deptId, Model model) {

		// 鏌ヨ閮ㄩ棬璇︽儏
		Dept dept = deptService.findOneById(deptId);
		model.addAttribute("dept", dept);

		return "sysadmin/dept/jDeptView";
	}

}
