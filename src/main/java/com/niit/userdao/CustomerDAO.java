package com.niit.userdao;

import com.niit.model.Customer;
import com.niit.model.ShippingAddress;

public interface CustomerDAO {
void registerCustomer(Customer customer);
boolean isEmailUnique(String email);
ShippingAddress getShippingAddress(int id);
}
