package com.test1;

public class BusinessLineOfCreditApproval {
	private long authorizerId;
	private String lineOfCreditCode;
	private String linOfCreditGauranteeCodeName;
	private String lineOfCreditSanctionApprovalMail;
	private String sanctionVerifier;
	private String lineOfCreditProcessCompletionTeam;
	private String emailGroup;
	private long refDataId;
	private Integer sequence;
	private String modularData;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public BusinessLineOfCreditApproval() {

	}

	public BusinessLineOfCreditApproval(long authorizerId, String lineOfCreditCode, String linOfCreditGauranteeCodeName,
			String lineOfCreditSanctionApprovalMail, String sanctionVerifier, String lineOfCreditProcessCompletionTeam,
			String emailGroup, long refDataId, Integer sequence, String modularData, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.authorizerId = authorizerId;
		this.lineOfCreditCode = lineOfCreditCode;
		this.linOfCreditGauranteeCodeName = linOfCreditGauranteeCodeName;
		this.lineOfCreditSanctionApprovalMail = lineOfCreditSanctionApprovalMail;
		this.sanctionVerifier = sanctionVerifier;
		this.lineOfCreditProcessCompletionTeam = lineOfCreditProcessCompletionTeam;
		this.emailGroup = emailGroup;
		this.refDataId = refDataId;
		this.sequence = sequence;
		this.modularData = modularData;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getAuthorizerId() {
		return authorizerId;
	}

	public void setAuthorizerId(long authorizerId) {
		this.authorizerId = authorizerId;
	}

	public String getLineOfCreditCode() {
		return lineOfCreditCode;
	}

	public void setLineOfCreditCode(String lineOfCreditCode) {
		this.lineOfCreditCode = lineOfCreditCode;
	}

	public String getLinOfCreditGauranteeCodeName() {
		return linOfCreditGauranteeCodeName;
	}

	public void setLinOfCreditGauranteeCodeName(String linOfCreditGauranteeCodeName) {
		this.linOfCreditGauranteeCodeName = linOfCreditGauranteeCodeName;
	}

	public String getLineOfCreditSanctionApprovalMail() {
		return lineOfCreditSanctionApprovalMail;
	}

	public void setLineOfCreditSanctionApprovalMail(String lineOfCreditSanctionApprovalMail) {
		this.lineOfCreditSanctionApprovalMail = lineOfCreditSanctionApprovalMail;
	}

	public String getSanctionVerifier() {
		return sanctionVerifier;
	}

	public void setSanctionVerifier(String sanctionVerifier) {
		this.sanctionVerifier = sanctionVerifier;
	}

	public String getLineOfCreditProcessCompletionTeam() {
		return lineOfCreditProcessCompletionTeam;
	}

	public void setLineOfCreditProcessCompletionTeam(String lineOfCreditProcessCompletionTeam) {
		this.lineOfCreditProcessCompletionTeam = lineOfCreditProcessCompletionTeam;
	}

	public String getEmailGroup() {
		return emailGroup;
	}

	public void setEmailGroup(String emailGroup) {
		this.emailGroup = emailGroup;
	}

	public long getRefDataId() {
		return refDataId;
	}

	public void setRefDataId(long refDataId) {
		this.refDataId = refDataId;
	}

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public String getModularData() {
		return modularData;
	}

	public void setModularData(String modularData) {
		this.modularData = modularData;
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
