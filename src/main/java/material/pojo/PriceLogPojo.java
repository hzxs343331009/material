package material.pojo;

import java.util.Date;

public class PriceLogPojo extends BaseEntity {
	/*
	 * `price_id` bigint(5) NOT NULL COMMENT '价格ID', `model_id` bigint(5) DEFAULT
	 * NULL COMMENT '型号ID', `price` double DEFAULT NULL COMMENT '价格', `create_date`
	 * date DEFAULT NULL COMMENT '更改日期', `company_id` bigint(20) DEFAULT NULL
	 * COMMENT '适用公司ID', `state` tinyint(1) DEFAULT '1' COMMENT '是否启用',
	 */
	private String priceId;
	private ModelPojo model;
	private Double price;
	private Date createDate;
	private Company company;
	private Integer state;

	public PriceLogPojo() {
		super();
	}

	public PriceLogPojo(String priceId, ModelPojo model, Double price, Date createDate, Company company,
			Integer state) {
		super();
		this.priceId = priceId;
		this.model = model;
		this.price = price;
		this.createDate = createDate;
		this.company = company;
		this.state = state;
	}

	public PriceLogPojo(ModelPojo modelPojo) {
		this.model = modelPojo;
		this.price = modelPojo.getPrice();
		this.createDate = modelPojo.getpDate();
		this.company = modelPojo.getCompany();
		this.state = modelPojo.getState();
	}

	public String getPriceId() {
		return priceId;
	}

	public void setPriceId(String priceId) {
		this.priceId = priceId;
	}

	public ModelPojo getModel() {
		return model;
	}

	public void setModel(ModelPojo model) {
		this.model = model;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompanyId(Company company) {
		this.company = company;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "PriceLogPojo [priceId=" + priceId + ", model=" + model + ", price=" + price + ", createDate="
				+ createDate + ", company=" + company + ", state=" + state + "]";
	}
	
}
