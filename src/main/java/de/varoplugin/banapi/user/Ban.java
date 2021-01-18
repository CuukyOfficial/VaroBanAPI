package de.varoplugin.banapi.user;

import com.google.gson.annotations.SerializedName;

public class Ban {
	
	public static final int DURATION_UNBAN = 0;
	public static final int DURATION_PERMANENT = -1;
	
	@SerializedName("banID")
	private long id;
	
	@SerializedName("timestamp")
	private long timestamp;
	
	@SerializedName("duration")
	private long duration;
	
	@SerializedName("operator")
	private String operator;
	
	@SerializedName("operatorName")
	private String operatorName;
	
	@SerializedName("reason")
	private String reason;
	
	@SerializedName("notes")
	private String notes;
	
	@SerializedName("proofes")
	private String[] proofes;
	
	public Ban() {}
	
	public Ban(long duration, String operator, String operatorName, String reason) {
		this.duration = duration;
		this.operator = operator;
		this.operatorName = operatorName;
		this.reason = reason;
	}

	public long getId() {
		return id;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public long getDuration() {
		return duration;
	}

	public String getOperator() {
		return operator;
	}
	
	public String getOperatorName() {
		return operatorName;
	}

	public String getReason() {
		return reason;
	}

	public String[] getProofes() {
		return proofes;
	}

	public String getNotes() {
		return notes;
	}
}
