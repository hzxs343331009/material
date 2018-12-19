package material.pojo;

import java.util.Date;

public class UserInfo {
	/***
	 *   USER_INFO_ID         varchar(40) not null,
   NAME                 varchar(20),
   CARD_NO              varchar(20),
   MANAGER_ID           varchar(40),
   JOIN_DATE            timestamp,
   SALARY               numeric(8,2),
   BIRTHDAY             timestamp,
   GENDER               char(1),
   STATION              varchar(20),
   TELEPHONE            varchar(100),
   USER_LEVEL           char(1) comment '4-鏅�氱敤鎴� 3-閮ㄩ棬缁忕悊 2-鍓�� 1-鎬荤粡鐞� 0-瓒呯骇绠＄悊鍛�',
   REMARK               varchar(600),
   ORDER_NO             int,
	 */
	private String userInfoId;
	private String name;
	private String cardNo;
	private UserInfo managerUserInfo;
	private Date joinDate;
	private Double salary;
	private Date birthday;
	private String gender;
	private String station;
	private String telephone;
	private String userLevel;
	private String remark;
	private Integer orderNo;
	public String getUserInfoId() {
		return userInfoId;
	}
	public void setUserInfoId(String userInfoId) {
		this.userInfoId = userInfoId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public UserInfo getManagerUserInfo() {
		return managerUserInfo;
	}
	public void setManagerUserInfo(UserInfo managerUserInfo) {
		this.managerUserInfo = managerUserInfo;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStation() {
		return station;
	}
	public void setStation(String station) {
		this.station = station;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getUserLevel() {
		return userLevel;
	}
	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Integer getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}
	@Override
	public String toString() {
		return "UserInfo [userInfoId=" + userInfoId + ", name=" + name + ", cardNo=" + cardNo + ", managerUserInfo="
				+ managerUserInfo + ", joinDate=" + joinDate + ", salary=" + salary + ", birthday=" + birthday
				+ ", gender=" + gender + ", station=" + station + ", telephone=" + telephone + ", userLevel="
				+ userLevel + ", remark=" + remark + ", orderNo=" + orderNo + "]";
	}
	
	
}
