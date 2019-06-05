package com.company.speedypizza.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

@NamePattern("%s |user,phone")
@Table(name = "SPEEDYPIZZA_CUSTOMER")
@Entity(name = "speedypizza_Customer")
public class Customer extends StandardEntity {
	private static final long serialVersionUID = -4239334025488336731L;

	@NotNull
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "USER_ID")
	protected User user;

	@Column(name = "CITY")
	protected String city;

	@NotNull(message = "Phone null")
	@Pattern(message = "only 10 consecutive digits", regexp = "^\\d{10}")
	@Column(name = "PHONE", length = 10)
	protected String phone;

	@Column(name = "ADRESS")
	protected String adress;

	@Min(message = "less than zero orders", value = 0)
	@Column(name = "ORDERS_COUNT")
	protected Integer ordersCount;

	@OneToMany(mappedBy = "customer")
	protected List<Order> allOrders;

	public User getUser() { return user; }

	public void setUser(User user) { this.user = user; }

	public List<Order> getAllOrders() { return allOrders; }

	public void setAllOrders(List<Order> allOrders) { this.allOrders = allOrders; }

	public Integer getOrdersCount() { return ordersCount; }

	public void setOrdersCount(Integer ordersCount) { this.ordersCount = ordersCount; }

	public String getAdress() { return adress; }

	public void setAdress(String adress) { this.adress = adress; }

	public String getPhone() { return phone; }

	public void setPhone(String phone) { this.phone = phone; }

	public String getCity() { return city; }

	public void setCity(String city) { this.city = city; }

}