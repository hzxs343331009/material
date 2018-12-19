package material.pojo;

public class Type extends BaseEntity{

	private String typeId;
	private String typeName;
	private Integer state;
	
	public Type() {
		super();
	}

	public Type(String typeId, String typeName, Integer state) {
		super();
		this.typeId = typeId;
		this.typeName = typeName;
		this.state = state;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Type [typeId=" + typeId + ", typeName=" + typeName + ", state=" + state + "]";
	}
	
}
