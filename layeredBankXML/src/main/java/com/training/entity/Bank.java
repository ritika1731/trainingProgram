package com.training.entity;

public class Bank extends Account{

	private String bankName;
	private String branchName;
	

	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}
	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(final String bankName) {
		this.bankName = bankName;
	}
	/**
	 * @return the branchName
	 */
	public String getBranchName() {
		return branchName;
	}
	/**
	 * @param branchName the branchName to set
	 */
	public void setBranchName(final String branchName) {
		this.branchName = branchName;
	}
	
	

	
}
