package mycreator.model;

public class Department {
	private Integer departmentId;
	private String departmentName;
	private Integer departmentAddedBy;
	private String departmentAddedOn;
	private String departmentModifiedOn;
	private Integer departmentModifiedBy;
	
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public String getDepartmentAddedOn() {
		return departmentAddedOn;
	}
	public void setDepartmentAddedOn(String departmentAddedOn) {
		this.departmentAddedOn = departmentAddedOn;
	}
	public String getDepartmentModifiedOn() {
		return departmentModifiedOn;
	}
	public void setDepartmentModifiedOn(String departmentModifiedOn) {
		this.departmentModifiedOn = departmentModifiedOn;
	}
	public Integer getDepartmentAddedBy() {
		return departmentAddedBy;
	}
	public void setDepartmentAddedBy(Integer departmentAddedBy) {
		this.departmentAddedBy = departmentAddedBy;
	}
	public Integer getDepartmentModifiedBy() {
		return departmentModifiedBy;
	}
	public void setDepartmentModifiedBy(Integer departmentModifiedBy) {
		this.departmentModifiedBy = departmentModifiedBy;
	}
	
}
