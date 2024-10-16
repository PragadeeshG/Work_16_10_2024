package com.test1;

public class BusinessLineOfCreditCategory {
	private String lineOfCreditCode;
	private String lineOfCreditName;
	private String lineOfCreditDescription;
	private String lineOfCreditDefinition;
	private long authorizerId;
	private String owner;
	private String psIds;
	private long serviceNameId;
	private String creationDate;
	private String modifiedDate;

	public BusinessLineOfCreditCategory() {
	}

	public BusinessLineOfCreditCategory(String lineOfCreditCode, String lineOfCreditName,
			String lineOfCreditDescription, String lineOfCreditDefinition, long authorizerId, String owner,
			String psIds, long serviceNameId, String creationDate, String modifiedDate) {
		super();
		this.lineOfCreditCode = lineOfCreditCode;
		this.lineOfCreditName = lineOfCreditName;
		this.lineOfCreditDescription = lineOfCreditDescription;
		this.lineOfCreditDefinition = lineOfCreditDefinition;
		this.authorizerId = authorizerId;
		this.owner = owner;
		this.psIds = psIds;
		this.serviceNameId = serviceNameId;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
	}

	public String getLineOfCreditCode() {
		return lineOfCreditCode;
	}

	public void setLineOfCreditCode(String lineOfCreditCode) {
		this.lineOfCreditCode = lineOfCreditCode;
	}

	public String getLineOfCreditName() {
		return lineOfCreditName;
	}

	public void setLineOfCreditName(String lineOfCreditName) {
		this.lineOfCreditName = lineOfCreditName;
	}

	public String getLineOfCreditDescription() {
		return lineOfCreditDescription;
	}

	public void setLineOfCreditDescription(String lineOfCreditDescription) {
		this.lineOfCreditDescription = lineOfCreditDescription;
	}

	public String getLineOfCreditDefinition() {
		return lineOfCreditDefinition;
	}

	public void setLineOfCreditDefinition(String lineOfCreditDefinition) {
		this.lineOfCreditDefinition = lineOfCreditDefinition;
	}

	public long getAuthorizerId() {
		return authorizerId;
	}

	public void setAuthorizerId(long authorizerId) {
		this.authorizerId = authorizerId;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPsIds() {
		return psIds;
	}

	public void setPsIds(String psIds) {
		this.psIds = psIds;
	}

	public long getServiceNameId() {
		return serviceNameId;
	}

	public void setServiceNameId(long serviceNameId) {
		this.serviceNameId = serviceNameId;
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

}