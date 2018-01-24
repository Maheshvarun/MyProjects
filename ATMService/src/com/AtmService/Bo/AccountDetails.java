package com.AtmService.Bo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlType
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AccountDetails {

	private String accountName;
	private int accountNo;
	private String adderss;
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public int getAccountNo(int accountNo) {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getAdderss() {
		return adderss;
	}
	public void setAdderss(String adderss) {
		this.adderss = adderss;
	}
	@Override
	public String toString() {
		return "AccountDetails [accountName=" + accountName + ", accountNo=" + accountNo + ", adderss=" + adderss + "]";
	}
	
}
