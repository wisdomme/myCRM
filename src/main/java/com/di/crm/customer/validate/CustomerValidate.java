package com.di.crm.customer.validate;

import com.di.crm.domain.Customer;

public interface CustomerValidate {
	public CustomerComplianceInfo checkComplianceIssue(Customer customer);
	public CustomerFinancialInfo checkFinancialIssue(Customer customer);
	public Customer checkBlackList(Customer customer);
}
