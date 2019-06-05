package com.company.speedypizza.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@NamePattern("%s %s %s %s %s|totalPrice,date,customer,employer,dishCount")
@Table(name = "SPEEDYPIZZA_ORDER")
@Entity(name = "speedypizza_Order")
public class Order extends StandardEntity {
	private static final long serialVersionUID = -90713938513418840L;

	@DecimalMin(message = "less than zero", value = "0")
	@Column(name = "FINAL_PAY_PRICE")
	protected Double finalPayPrice;

	@DecimalMin("0")
	@Column(name = "TOTAL_PRICE", nullable = false)
	protected BigDecimal totalPrice;

	@Max(message = "more than 90%", value = 90)
	@Min(message = "less than 0%", value = 0)
	@Column(name = "DISCOUNT")
	protected Integer discount;

	@Min(message = "less than 0", value = 0)
	@Column(name = "DISH_COUNT")
	protected Integer dishCount;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "CUSTOMER_ID")
	protected Customer customer;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	@Column(name = "DATE_", nullable = false)
	protected Date date;

	@Min(message = "less than 0%", value = 0)
	@Column(name = "VAT")
	protected Integer vat;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EMPLOYER_ID")
	protected Employer employer;

	@OneToMany(mappedBy = "order")
	protected List<Dish> allDishes;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "order")
	protected Delivery delivery;

	public Delivery getDelivery() { return delivery; }

	public void setDelivery(Delivery delivery) { this.delivery = delivery; }

	public List<Dish> getAllDishes() { return allDishes; }

	public void setAllDishes(List<Dish> allDishes) { this.allDishes = allDishes; }

	public Employer getEmployer() { return employer; }

	public void setEmployer(Employer employer) { this.employer = employer; }

	public Date getDate() { return date; }

	public void setDate(Date date) { this.date = date; }

	public Customer getCustomer() { return customer; }

	public void setCustomer(Customer customer) { this.customer = customer; }

	public Integer getVat() { return vat; }

	public void setVat(Integer vat) { this.vat = vat; }

	public Double getFinalPayPrice() { return finalPayPrice; }

	public void setFinalPayPrice(Double finalPayPrice) { this.finalPayPrice = finalPayPrice; }

	public Integer getDiscount() { return discount; }

	public void setDiscount(Integer discount) { this.discount = discount; }

	public Integer getDishCount() { return dishCount; }

	public void setDishCount(Integer dishCount) { this.dishCount = dishCount; }

	public BigDecimal getTotalPrice() { return totalPrice; }

	public void setTotalPrice(BigDecimal totalPrice) { this.totalPrice = totalPrice; }
}