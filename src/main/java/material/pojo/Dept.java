package material.pojo;

public class Dept extends BaseEntity{

/***
 *   DEPT_ID              varchar(40) not null,
   PARENT_ID            varchar(40) comment '自关联，多对一',
   DEPT_NAME            varchar(50),
   STATE                int comment '1启用0停用',
 */
	private String deptId;
	private Dept parentDept;
	private String deptName;
	private Integer state;
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public Dept getParentDept() {
		return parentDept;
	}
	public void setParentDept(Dept parentDept) {
		this.parentDept = parentDept;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Dept [deptId=" + deptId + ", parentDept=" + parentDept + ", deptName=" + deptName + ", state=" + state
				+ "]";
	}
	
	
}
