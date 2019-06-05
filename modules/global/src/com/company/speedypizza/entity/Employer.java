package com.company.speedypizza.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@NamePattern("%s %s %s|user,allDeliveries,allOrders")
@Table(name = "SPEEDYPIZZA_EMPLOYER")
@Entity(name = "speedypizza_Employer")
public class Employer extends StandardEntity {
	private static final long serialVersionUID = -8560158992843218828L;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_ID")
	protected User user;

	@OneToMany(mappedBy = "employer")
	protected Set<Delivery> allDeliveries;

	@OneToMany(mappedBy = "employer")
	protected List<Order> allOrders;

	public List<Order> getAllOrders() { return allOrders; }

	public void setAllOrders(List<Order> allOrders) { this.allOrders = allOrders; }

	public Set<Delivery> getAllDeliveries() { return allDeliveries; }

	public void setAllDeliveries(Set<Delivery> allDeliveries) { this.allDeliveries = allDeliveries; }

	public User getUser() { return user; }

	public void setUser(User user) { this.user = user; }
}