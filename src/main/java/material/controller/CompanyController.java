package material.controller;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import material.pojo.Company;
import material.pojo.ModelPojo;
import material.pojo.Type;
import material.service.CompanyService;
import material.service.ModelService;
import material.service.TypeService;
import net.sf.json.JSONArray;

@Controller
@RequestMapping("/material/company")
public class CompanyController {

	@Autowired
	private CompanyService companyService;
	@Autowired
	private ModelService ModelService;
	
	@RequestMapping("/list")
	public String findAll(Model model){
		model.addAttribute("companyList", companyService.findAll());
		return "/material/company/jCompanyList";
	}
	
	@RequestMapping("/stop")
	public String stop(@RequestParam(value="companyId",required=false)String[] companyIds){
		
		if (companyIds !=null) {
			companyService.updateState(0,companyIds);
		}
		return "redirect:/material/company/list";
	}
	
	@RequestMapping("/start")
	public String start(@RequestParam(value="companyId",required=false)String[] companyIds){
		
		if (companyIds !=null) {
			companyService.updateState(1,companyIds);
		}
		return "redirect:/material/company/list";
	}
	
	@RequestMapping("/tocreate")
	public String toCreate(Model model) {
		List<Company> companyList = companyService.findAll();
		model.addAttribute("companyList", companyList);
		String jsonCompanyList = JSONArray.fromObject(companyList).toString();
		model.addAttribute("companys", jsonCompanyList);
		return "/material/company/jCompanyCreate";
	}
	
	@RequestMapping(value="/ajaxgetcompany", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, String> ajaxGetCompany(String companyId) {
		Map<String, String> map = new HashedMap();
		Company company = companyService.findCompanyByCompanyId(companyId);
		map.put("simpleName", company.getSimpleName());
		map.put("dutyNo", company.getDutyNo());
		return map;
	}
	
	@RequestMapping("/save")
	public String save(Company company) {
		if(company.getCompanyId() != null) {
			Company company2 = companyService.findCompanyByCompanyId(company.getCompanyId());
			company.setCompanyName(company2.getCompanyName());
		}
		companyService.save(company);
		return "redirect:/material/company/list";
	}
	
	@RequestMapping("/toupdate")
	public String toupdate(String companyId, Model model) {
		Company company = companyService.findCompanyByCompanyId(companyId);
		model.addAttribute("company", company);
		return "/material/company/jCompanyUpdate";
	}
//	
//	@RequestMapping("/update")
//	public String update(Type type) {
//		typeService.update(type);
//		return "redirect:/material/type/list";
//	}
//	
//	@RequestMapping("/delete")
//	public String delete(@RequestParam(value="typeId",required=false)String[] typeIds) {
//		typeService.delete(typeIds);
//		return "redirect:/material/type/list";
//	}
//	
//	@RequestMapping("/toview")
//	public String toView(String typeId,Model model){
//		Type type = typeService.findOneById(typeId);
//		List<ModelPojo> modelList = ModelService.findAllByType(typeId);
//		model.addAttribute("type", type);
//		model.addAttribute("modelList", modelList);
//		return "material/type/jTypeView";
//	}

}