package com.company.speedypizza.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@NamePattern("%s %s %s|arrivalTime,deliveryAdress,employer")
@Table(name = "SPEEDYPIZZA_DELIVERY")
@Entity(name = "speedypizza_Delivery")
public class Delivery extends StandardEntity {
	private static final long serialVersionUID = 8841499515265787878L;

	@NotNull
	@Column(name = "INSTRUCTIONS", nullable = false)
	protected String instructions;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ARRIVAL_TIME")
	protected Date arrivalTime;

	@Column(name = "DELIVERY_ADRESS")
	protected String deliveryAdress;

	@Column(name = "CITY")
	protected String city;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EMPLOYER_ID")
	protected Employer employer;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ORDER_ID")
	protected Order order;

	@Column(name = "IS_SUCCESSFUL")
	protected Boolean isSuccessful;

	public Boolean getIsSuccessful() { return isSuccessful; }

	public void setIsSuccessful(Boolean isSuccessful) { this.isSuccessful = isSuccessful; }

	public Order getOrder() { return order; }

	public void setOrder(Order order) { this.order = order; }

	public Employer getEmployer() { return employer; }

	public void setEmployer(Employer employer) { this.employer = employer; }

	public String getCity() { return city; }

	public void setCity(String city) { this.city = city; }

	public String getDeliveryAdress() { return deliveryAdress; }

	public void setDeliveryAdress(String deliveryAdress) { this.deliveryAdress = deliveryAdress; }

	public Date getArrivalTime() { return arrivalTime; }

	public void setArrivalTime(Date arrivalTime) { this.arrivalTime = arrivalTime; }

	public String getInstructions() { return instructions; }

	public void setInstructions(String instructions) { this.instructions = instructions; }
}