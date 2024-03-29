package com.yhzhcs.dispatchingsystemjzfp.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Auto-generated: 2018-02-09 11:34:3
 *
 * @author aTool.org (i@aTool.org)
 * @website http://www.atool.org/json2javabean.php
 */
public class Poorlist implements Parcelable {

    private int age;
    private double averageIncome;
    private String bankCard;
    private String city;
    private String companyId;
    private String companyName;
    private String county;
    private String cradNumber;
    private String createdBy;
    private Createddate createdDate;
    private String departmentId;
    private String departmentName;
    private String depositBank;
    private String education;
    private String enableWoking;
    private int enabledFlag;
    private String familyNumber;
    private String group;
    private String groupId;
    private String health;
    private String houseId;
    private String id;
    private String isCooperative;
    private String isEat;
    private String isEmployeeInsurance;
    private String isEndowmentInsurance;
    private String isHe;
    private String isLife;
    private String isRuralMedicine;
    private String isTeach;
    private String isWear;
    private String lastUpdatedBy;
    private Lastupdateddate lastUpdatedDate;
    private String mainPoorCause;
    private String missionAndPoorhouse;
    private String name;
    private String nation;
    private String notPoorYear;
    private String parentId;
    private String personId;
    private String phone;
    private String photo;
    private String poorProperty;
    private String poverty;
    private String projectPoorYear;
    private String province;
    private String sex;
    private String studyInfo;
    private String town;
    private String townId;
    private String userTown;
    private String userTownId;
    private String village;
    private String villageId;
    private String withNelation;
    private String workingInfo;
    private String workingTimeLimit;
    private String year;

    protected Poorlist(Parcel in) {
        age = in.readInt();
        averageIncome = in.readDouble();
        bankCard = in.readString();
        city = in.readString();
        companyId = in.readString();
        companyName = in.readString();
        county = in.readString();
        cradNumber = in.readString();
        createdBy = in.readString();
//        createdDate = in.readParcelable(Createddate.class.getClassLoader());
        departmentId = in.readString();
        departmentName = in.readString();
        depositBank = in.readString();
        education = in.readString();
        enableWoking = in.readString();
        enabledFlag = in.readInt();
        familyNumber = in.readString();
        group = in.readString();
        groupId = in.readString();
        health = in.readString();
        houseId = in.readString();
        id = in.readString();
        isCooperative = in.readString();
        isEat = in.readString();
        isEmployeeInsurance = in.readString();
        isEndowmentInsurance = in.readString();
        isHe = in.readString();
        isLife = in.readString();
        isRuralMedicine = in.readString();
        isTeach = in.readString();
        isWear = in.readString();
        lastUpdatedBy = in.readString();
//        lastUpdatedDate = in.readParcelable(Lastupdateddate.class.getClassLoader());
        mainPoorCause = in.readString();
        missionAndPoorhouse = in.readString();
        name = in.readString();
        nation = in.readString();
        notPoorYear = in.readString();
        parentId = in.readString();
        personId = in.readString();
        phone = in.readString();
        photo = in.readString();
        poorProperty = in.readString();
        poverty = in.readString();
        projectPoorYear = in.readString();
        province = in.readString();
        sex = in.readString();
        studyInfo = in.readString();
        town = in.readString();
        townId = in.readString();
        userTown = in.readString();
        userTownId = in.readString();
        village = in.readString();
        villageId = in.readString();
        withNelation = in.readString();
        workingInfo = in.readString();
        workingTimeLimit = in.readString();
        year = in.readString();
    }

    public static final Creator<Poorlist> CREATOR = new Creator<Poorlist>() {
        @Override
        public Poorlist createFromParcel(Parcel in) {
            return new Poorlist(in);
        }

        @Override
        public Poorlist[] newArray(int size) {
            return new Poorlist[size];
        }
    };

    public int getAge() {
        return age;
    }

    public double getAverageIncome() {
        return averageIncome;
    }

    public String getBankCard() {
        return bankCard;
    }

    public String getCity() {
        return city;
    }

    public String getCompanyId() {
        return companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCounty() {
        return county;
    }

    public String getCradNumber() {
        return cradNumber;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Createddate getCreatedDate() {
        return createdDate;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getDepositBank() {
        return depositBank;
    }

    public String getEducation() {
        return education;
    }

    public String getEnableWoking() {
        return enableWoking;
    }

    public int getEnabledFlag() {
        return enabledFlag;
    }

    public String getFamilyNumber() {
        return familyNumber;
    }

    public String getGroup() {
        return group;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getHealth() {
        return health;
    }

    public String getHouseId() {
        return houseId;
    }

    public String getId() {
        return id;
    }

    public String getIsCooperative() {
        return isCooperative;
    }

    public String getIsEat() {
        return isEat;
    }

    public String getIsEmployeeInsurance() {
        return isEmployeeInsurance;
    }

    public String getIsEndowmentInsurance() {
        return isEndowmentInsurance;
    }

    public String getIsHe() {
        return isHe;
    }

    public String getIsLife() {
        return isLife;
    }

    public String getIsRuralMedicine() {
        return isRuralMedicine;
    }

    public String getIsTeach() {
        return isTeach;
    }

    public String getIsWear() {
        return isWear;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public Lastupdateddate getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public String getMainPoorCause() {
        return mainPoorCause;
    }

    public String getMissionAndPoorhouse() {
        return missionAndPoorhouse;
    }

    public String getName() {
        return name;
    }

    public String getNation() {
        return nation;
    }

    public String getNotPoorYear() {
        return notPoorYear;
    }

    public String getParentId() {
        return parentId;
    }

    public String getPersonId() {
        return personId;
    }

    public String getPhone() {
        return phone;
    }

    public String getPhoto() {
        return photo;
    }

    public String getPoorProperty() {
        return poorProperty;
    }

    public String getPoverty() {
        return poverty;
    }

    public String getProjectPoorYear() {
        return projectPoorYear;
    }

    public String getProvince() {
        return province;
    }

    public String getSex() {
        return sex;
    }

    public String getStudyInfo() {
        return studyInfo;
    }

    public String getTown() {
        return town;
    }

    public String getTownId() {
        return townId;
    }

    public String getUserTown() {
        return userTown;
    }

    public String getUserTownId() {
        return userTownId;
    }

    public String getVillage() {
        return village;
    }

    public String getVillageId() {
        return villageId;
    }

    public String getWithNelation() {
        return withNelation;
    }

    public String getWorkingInfo() {
        return workingInfo;
    }

    public String getWorkingTimeLimit() {
        return workingTimeLimit;
    }

    public String getYear() {
        return year;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAverageIncome(double averageIncome) {
        this.averageIncome = averageIncome;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setCradNumber(String cradNumber) {
        this.cradNumber = cradNumber;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setCreatedDate(Createddate createdDate) {
        this.createdDate = createdDate;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setDepositBank(String depositBank) {
        this.depositBank = depositBank;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setEnableWoking(String enableWoking) {
        this.enableWoking = enableWoking;
    }

    public void setEnabledFlag(int enabledFlag) {
        this.enabledFlag = enabledFlag;
    }

    public void setFamilyNumber(String familyNumber) {
        this.familyNumber = familyNumber;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIsCooperative(String isCooperative) {
        this.isCooperative = isCooperative;
    }

    public void setIsEat(String isEat) {
        this.isEat = isEat;
    }

    public void setIsEmployeeInsurance(String isEmployeeInsurance) {
        this.isEmployeeInsurance = isEmployeeInsurance;
    }

    public void setIsEndowmentInsurance(String isEndowmentInsurance) {
        this.isEndowmentInsurance = isEndowmentInsurance;
    }

    public void setIsHe(String isHe) {
        this.isHe = isHe;
    }

    public void setIsLife(String isLife) {
        this.isLife = isLife;
    }

    public void setIsRuralMedicine(String isRuralMedicine) {
        this.isRuralMedicine = isRuralMedicine;
    }

    public void setIsTeach(String isTeach) {
        this.isTeach = isTeach;
    }

    public void setIsWear(String isWear) {
        this.isWear = isWear;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public void setLastUpdatedDate(Lastupdateddate lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public void setMainPoorCause(String mainPoorCause) {
        this.mainPoorCause = mainPoorCause;
    }

    public void setMissionAndPoorhouse(String missionAndPoorhouse) {
        this.missionAndPoorhouse = missionAndPoorhouse;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public void setNotPoorYear(String notPoorYear) {
        this.notPoorYear = notPoorYear;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setPoorProperty(String poorProperty) {
        this.poorProperty = poorProperty;
    }

    public void setPoverty(String poverty) {
        this.poverty = poverty;
    }

    public void setProjectPoorYear(String projectPoorYear) {
        this.projectPoorYear = projectPoorYear;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setStudyInfo(String studyInfo) {
        this.studyInfo = studyInfo;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setTownId(String townId) {
        this.townId = townId;
    }

    public void setUserTown(String userTown) {
        this.userTown = userTown;
    }

    public void setUserTownId(String userTownId) {
        this.userTownId = userTownId;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public void setVillageId(String villageId) {
        this.villageId = villageId;
    }

    public void setWithNelation(String withNelation) {
        this.withNelation = withNelation;
    }

    public void setWorkingInfo(String workingInfo) {
        this.workingInfo = workingInfo;
    }

    public void setWorkingTimeLimit(String workingTimeLimit) {
        this.workingTimeLimit = workingTimeLimit;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Poorlist{" +
                "age=" + age +
                ", averageIncome=" + averageIncome +
                ", bankCard='" + bankCard + '\'' +
                ", city='" + city + '\'' +
                ", companyId='" + companyId + '\'' +
                ", companyName='" + companyName + '\'' +
                ", county='" + county + '\'' +
                ", cradNumber='" + cradNumber + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdDate=" + createdDate +
                ", departmentId='" + departmentId + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", depositBank='" + depositBank + '\'' +
                ", education='" + education + '\'' +
                ", enableWoking='" + enableWoking + '\'' +
                ", enabledFlag=" + enabledFlag +
                ", familyNumber='" + familyNumber + '\'' +
                ", group='" + group + '\'' +
                ", groupId='" + groupId + '\'' +
                ", health='" + health + '\'' +
                ", houseId='" + houseId + '\'' +
                ", id='" + id + '\'' +
                ", isCooperative='" + isCooperative + '\'' +
                ", isEat='" + isEat + '\'' +
                ", isEmployeeInsurance='" + isEmployeeInsurance + '\'' +
                ", isEndowmentInsurance='" + isEndowmentInsurance + '\'' +
                ", isHe='" + isHe + '\'' +
                ", isLife='" + isLife + '\'' +
                ", isRuralMedicine='" + isRuralMedicine + '\'' +
                ", isTeach='" + isTeach + '\'' +
                ", isWear='" + isWear + '\'' +
                ", lastUpdatedBy='" + lastUpdatedBy + '\'' +
                ", lastUpdatedDate=" + lastUpdatedDate +
                ", mainPoorCause='" + mainPoorCause + '\'' +
                ", missionAndPoorhouse='" + missionAndPoorhouse + '\'' +
                ", name='" + name + '\'' +
                ", nation='" + nation + '\'' +
                ", notPoorYear='" + notPoorYear + '\'' +
                ", parentId='" + parentId + '\'' +
                ", personId='" + personId + '\'' +
                ", phone='" + phone + '\'' +
                ", photo='" + photo + '\'' +
                ", poorProperty='" + poorProperty + '\'' +
                ", poverty='" + poverty + '\'' +
                ", projectPoorYear='" + projectPoorYear + '\'' +
                ", province='" + province + '\'' +
                ", sex='" + sex + '\'' +
                ", studyInfo='" + studyInfo + '\'' +
                ", town='" + town + '\'' +
                ", townId='" + townId + '\'' +
                ", userTown='" + userTown + '\'' +
                ", userTownId='" + userTownId + '\'' +
                ", village='" + village + '\'' +
                ", villageId='" + villageId + '\'' +
                ", withNelation='" + withNelation + '\'' +
                ", workingInfo='" + workingInfo + '\'' +
                ", workingTimeLimit='" + workingTimeLimit + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
//        parcel.writeParcelable(createdDate,i);
        parcel.writeInt(age);
        parcel.writeDouble(averageIncome);
        parcel.writeString(bankCard);
        parcel.writeString(city);
        parcel.writeString(companyId);
        parcel.writeString(companyName);
        parcel.writeString(county);
        parcel.writeString(cradNumber);
        parcel.writeString(createdBy);
        parcel.writeString(departmentId);
        parcel.writeString(departmentName);
        parcel.writeString(depositBank);
        parcel.writeString(education);
        parcel.writeString(enableWoking);
        parcel.writeInt(enabledFlag);
        parcel.writeString(familyNumber);
        parcel.writeString(group);
        parcel.writeString(groupId);
        parcel.writeString(health);
        parcel.writeString(houseId);
        parcel.writeString(id);
        parcel.writeString(isCooperative);
        parcel.writeString(isEat);
        parcel.writeString(isEmployeeInsurance);
        parcel.writeString(isEndowmentInsurance);
        parcel.writeString(isHe);
        parcel.writeString(isLife);
        parcel.writeString(isRuralMedicine);
        parcel.writeString(isTeach);
        parcel.writeString(isWear);
        parcel.writeString(lastUpdatedBy);
//        parcel.writeParcelable(lastUpdatedDate,i);
        parcel.writeString(mainPoorCause);
        parcel.writeString(missionAndPoorhouse);
        parcel.writeString(name);
        parcel.writeString(nation);
        parcel.writeString(notPoorYear);
        parcel.writeString(parentId);
        parcel.writeString(personId);
        parcel.writeString(phone);
        parcel.writeString(photo);
        parcel.writeString(poorProperty);
        parcel.writeString(poverty);
        parcel.writeString(projectPoorYear);
        parcel.writeString(province);
        parcel.writeString(sex);
        parcel.writeString(studyInfo);
        parcel.writeString(town);
        parcel.writeString(townId);
        parcel.writeString(userTown);
        parcel.writeString(userTownId);
        parcel.writeString(village);
        parcel.writeString(villageId);
        parcel.writeString(withNelation);
        parcel.writeString(workingInfo);
        parcel.writeString(workingTimeLimit);
        parcel.writeString(year);
    }
}