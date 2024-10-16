package com.test1;

public class BusinessLineOfCreditSubCategory {
	private String lineOfCreditGauranteeSubCatCode;
	private String lineOfCreditGauranteeName;
	private String lineOfCreditGauranteeDescription;
	private String lineOfCreditGauranteeDefinition;
	private String lineOfCreditGauranteeCodeRefernceName;
	private long errorCode;
	private String errorSeverity;
	private String ncType;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public BusinessLineOfCreditSubCategory() {

	}

	public BusinessLineOfCreditSubCategory(String lineOfCreditGauranteeSubCatCode, String lineOfCreditGauranteeName,
			String lineOfCreditGauranteeDescription, String lineOfCreditGauranteeDefinition,
			String lineOfCreditGauranteeCodeRefernceName, long errorCode, String errorSeverity, String ncType,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.lineOfCreditGauranteeSubCatCode = lineOfCreditGauranteeSubCatCode;
		this.lineOfCreditGauranteeName = lineOfCreditGauranteeName;
		this.lineOfCreditGauranteeDescription = lineOfCreditGauranteeDescription;
		this.lineOfCreditGauranteeDefinition = lineOfCreditGauranteeDefinition;
		this.lineOfCreditGauranteeCodeRefernceName = lineOfCreditGauranteeCodeRefernceName;
		this.errorCode = errorCode;
		this.errorSeverity = errorSeverity;
		this.ncType = ncType;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getLineOfCreditGauranteeSubCatCode() {
		return lineOfCreditGauranteeSubCatCode;
	}

	public void setLineOfCreditGauranteeSubCatCode(String lineOfCreditGauranteeSubCatCode) {
		this.lineOfCreditGauranteeSubCatCode = lineOfCreditGauranteeSubCatCode;
	}

	public String getLineOfCreditGauranteeName() {
		return lineOfCreditGauranteeName;
	}

	public void setLineOfCreditGauranteeName(String lineOfCreditGauranteeName) {
		this.lineOfCreditGauranteeName = lineOfCreditGauranteeName;
	}

	public String getLineOfCreditGauranteeDescription() {
		return lineOfCreditGauranteeDescription;
	}

	public void setLineOfCreditGauranteeDescription(String lineOfCreditGauranteeDescription) {
		this.lineOfCreditGauranteeDescription = lineOfCreditGauranteeDescription;
	}

	public String getLineOfCreditGauranteeDefinition() {
		return lineOfCreditGauranteeDefinition;
	}

	public void setLineOfCreditGauranteeDefinition(String lineOfCreditGauranteeDefinition) {
		this.lineOfCreditGauranteeDefinition = lineOfCreditGauranteeDefinition;
	}

	public String getLineOfCreditGauranteeCodeRefernceName() {
		return lineOfCreditGauranteeCodeRefernceName;
	}

	public void setLineOfCreditGauranteeCodeRefernceName(String lineOfCreditGauranteeCodeRefernceName) {
		this.lineOfCreditGauranteeCodeRefernceName = lineOfCreditGauranteeCodeRefernceName;
	}

	public long getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(long errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorSeverity() {
		return errorSeverity;
	}

	public void setErrorSeverity(String errorSeverity) {
		this.errorSeverity = errorSeverity;
	}

	public String getNcType() {
		return ncType;
	}

	public void setNcType(String ncType) {
		this.ncType = ncType;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
