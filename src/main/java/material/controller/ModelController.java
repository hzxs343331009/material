package material.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import material.pojo.Company;
import material.pojo.ModelPojo;
import material.pojo.PriceLogPojo;
import material.pojo.Type;
import material.service.CompanyService;
import material.service.ModelService;
import material.service.PriceLogService;
import material.service.TypeService;

@Controller
@RequestMapping("/material/model")
public class ModelController {

	@Autowired
	private ModelService modelService;
	@Autowired
	private TypeService typeService;
	@Autowired
	private CompanyService companyService;
	@Autowired
	private PriceLogService priceLogService;

	@RequestMapping("/list")
	public String findAll(Model model) {

		model.addAttribute("modelList", modelService.findAll());
		return "/material/model/jModelList";
	}

	@RequestMapping("/stop")
	public String stop(@RequestParam(value = "modelId", required = false) String[] modelIds,
			@RequestParam(value = "typeId", required = false) String typeId, Model model) {
		if (modelIds != null) {
			modelService.updateState(0, modelIds);
		}
		if (typeId != null && !typeId.equals("")) {
			model.addAttribute("typeId", typeId);
			return "redirect:/material/type/toview";
		} else {
			return "redirect:/material/model/list";
		}
	}

	@RequestMapping("/start")
	public String start(@RequestParam(value = "modelId", required = false) String[] modelIds, String typeId,
			Model model) {
		if (modelIds != null) {
			modelService.updateState(1, modelIds);
		}
		if (typeId != null && !typeId.equals("")) {
			model.addAttribute("typeId", typeId);
			return "redirect:/material/type/toview";
		} else {
			return "redirect:/material/model/list";
		}
	}

	@RequestMapping("/tocreate")
	public String toCreate(Model model) {
		List<Type> typeList = typeService.findAll();
		model.addAttribute("typeList", typeList);
		List<Company> companyList = companyService.findAll();
		model.addAttribute("companyList", companyList);
		return "/material/model/jModelCreate";
	}

	@RequestMapping("/save")
	public String save(ModelPojo modelPojo) {
		modelService.save(modelPojo);
		return "redirect:/material/model/list";
	}

	@RequestMapping("/toupdate")
	public String toupdate(String modelId, Model model) {
		ModelPojo modelPojo = modelService.findOneById(modelId);
		model.addAttribute("modelPojo", modelPojo);
		List<Type> typeList = typeService.findAll();
		model.addAttribute("typeList", typeList);
		List<Company> companyList = companyService.findAll();
		model.addAttribute("companyList", companyList);
		return "/material/model/jModelUpdate";
	}

	@RequestMapping("/update")
	public String update(String modelOldStr, String priceOld, String companyOld, ModelPojo modelPojo) {
		if (modelOldStr != null && modelOldStr.equals(modelPojo.getModelStr())) {
			modelPojo.setpDate(new Date());
			if (priceOld != null && !new Double(priceOld).equals(modelPojo.getPrice())) {
				if (companyOld != null && !companyOld.equals(modelPojo.getCompany().getCompanyId())) {
					priceLogService.save(modelPojo);
				}
			}
			modelService.update(modelPojo);
		} else {
			modelService.save(modelPojo);
		}
		return "redirect:/material/model/list";
	}

	@RequestMapping("/toview")
	public String toview(String modelId, Model model) {
		ModelPojo modelPojo = modelService.findOneById(modelId);
		List<PriceLogPojo> priceLogs = priceLogService.findAllByModelId(modelId);
		model.addAttribute("modelPojo", modelPojo);
		model.addAttribute("priceLogs", priceLogs);
		return "/material/model/jModelView";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam(value = "modelId", required = false) String[] modelIds) {
		if(modelIds != null) {
			modelService.delete(modelIds);
		}
		return "redirect:/material/model/list";
	}

	/*
	 * @RequestMapping("/tocreate") public String toCreate() { return
	 * "/material/type/jTypeCreate"; }
	 * 
	 * @RequestMapping("/save") public String save(Type type) {
	 * typeService.save(type); return "redirect:/material/type/list"; }
	 * 
	 * @RequestMapping("/toupdate") public String toupdate(String typeId, Model
	 * model) { Type type = typeService.findOneById(typeId);
	 * model.addAttribute("type", type); return "/material/type/jTypeUpdate"; }
	 * 
	 * @RequestMapping("/update") public String update(Type type) {
	 * typeService.update(type); return "redirect:/material/type/list"; }
	 * 
	 * @RequestMapping("/delete") public String
	 * delete(@RequestParam(value="typeId",required=false)String[] typeIds) {
	 * typeService.delete(typeIds); return "redirect:/material/type/list"; }
	 */
}
