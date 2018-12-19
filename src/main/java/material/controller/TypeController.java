package material.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import material.pojo.ModelPojo;
import material.pojo.Type;
import material.service.ModelService;
import material.service.TypeService;

@Controller
@RequestMapping("/material/type")
public class TypeController {

	@Autowired
	private TypeService typeService;
	@Autowired
	private ModelService ModelService;
	
	@RequestMapping("/list")
	public String findAll(Model model){
		
		model.addAttribute("typeList", typeService.findAll());
		return "/material/type/jTypeList";
	}
	
	@RequestMapping("/stop")
	public String stop(@RequestParam(value="typeId",required=false)String[] typeIds){
		
		if (typeIds!=null) {
			typeService.updateState(0,typeIds);
		}
		return "redirect:/material/type/list";
	}
	
	@RequestMapping("/start")
	public String start(@RequestParam(value="typeId",required=false)String[] typeIds){
		
		if (typeIds!=null) {
			typeService.updateState(1,typeIds);
		}
		return "redirect:/material/type/list";
	}
	
	@RequestMapping("/tocreate")
	public String toCreate() {
		return "/material/type/jTypeCreate";
	}
	
	@RequestMapping("/save")
	public String save(Type type) {
		typeService.save(type);
		return "redirect:/material/type/list";
	}
	
	@RequestMapping("/toupdate")
	public String toupdate(String typeId, Model model) {
		Type type = typeService.findOneById(typeId);
		model.addAttribute("type", type);
		return "/material/type/jTypeUpdate";
	}
	
	@RequestMapping("/update")
	public String update(Type type) {
		typeService.update(type);
		return "redirect:/material/type/list";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam(value="typeId",required=false)String[] typeIds) {
		typeService.delete(typeIds);
		return "redirect:/material/type/list";
	}
	
	@RequestMapping("/toview")
	public String toView(String typeId,Model model){
		Type type = typeService.findOneById(typeId);
		List<ModelPojo> modelList = ModelService.findAllByType(typeId);
		model.addAttribute("type", type);
		model.addAttribute("modelList", modelList);
		return "material/type/jTypeView";
	}

//	@RequestMapping("/delete")
//	public String delete(@RequestParam(value="deptId",required=false)String[] deptIds){
//		
//		if (deptIds!=null) {
//			deptService.delete(deptIds);
//		}
//		return "redirect:/sysadmin/dept/list";
//	}
//	
//	@RequestMapping("/tocreate")
//	public String toCreate(Model model){
//		
//		//鏌ヨ鎵�鏈夌殑閮ㄩ棬骞朵笖杩斿洖
//		List<Dept> depts = deptService.findAll();
//		model.addAttribute("depts", depts);
//
//		return "sysadmin/dept/jDeptCreate";
//	}
//	
//	@RequestMapping("/save")
//	public String save(Dept dept){
//		
//		deptService.save(dept);
//		
//		return "redirect:/sysadmin/dept/list";
//	}
//	
//	@RequestMapping("/toupdate")
//	public String toUpdate(String deptId,Model model){
//		
//		//鏌ヨ閮ㄩ棬璇︽儏
//		Dept dept = deptService.findOneById(deptId);
//		model.addAttribute("dept", dept);
//		
//		//鏌ヨ鎵�鏈夌殑閮ㄩ棬
//		List<Dept> depts = deptService.findAll();
//		model.addAttribute("depts", depts);
//		
//		return "sysadmin/dept/jDeptUpdate";
//	}
//	
//	@RequestMapping("/update")
//	public String update(Dept dept){
//		
//		deptService.update(dept);
//		
//		return "redirect:/sysadmin/dept/list";
//	}
//	
//	@RequestMapping("/toview")
//	public String toView(String deptId,Model model){
//		
//		Dept dept = deptService.findOneById(deptId);
//		model.addAttribute("dept", dept);
//		
//		return "sysadmin/dept/jDeptView";
//	}
//	
	
}
