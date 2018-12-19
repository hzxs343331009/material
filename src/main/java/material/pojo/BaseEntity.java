package material.pojo;

import java.util.Date;

public abstract class BaseEntity {


	
	private String createBy;
	private String createDept;
	private Date createTime;
	private String updateBy;
	private Date updateTime;
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getCreateDept() {
		return createDept;
	}
	public void setCreateDept(String createDept) {
		this.createDept = createDept;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "BaseEntity [createBy=" + createBy + ", createDept=" + createDept + ", createTime=" + createTime
				+ ", updateBy=" + updateBy + ", updateTime=" + updateTime + "]";
	}
	
}
