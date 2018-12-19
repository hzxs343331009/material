package material.pojo;

public class Role extends BaseEntity{

	/***
	 *   ROLE_ID              VARCHAR(40) NOT NULL,
   NAME                 VARCHAR(30),
   REMARKS              VARCHAR(100),
   ORDER_NO             INT
	 */
	private String roleId;
	private String name;
	private String remarks;
	private Integer orderNo;
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Integer getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", name=" + name + ", remarks=" + remarks + ", orderNo=" + orderNo + "]";
	}
	
	
}
