package com.company.speedypizza.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.util.List;

@NamePattern("%s %s %s|name,amount,metricSystemUnit")
@Table(name = "SPEEDYPIZZA_PRODUCTS")
@Entity(name = "speedypizza_Products")
public class Products extends StandardEntity {
	private static final long serialVersionUID = 4000510073003972298L;

	@NotNull
	@Column(name = "NAME", nullable = false)
	protected String name;

	@DecimalMin(message = "less than zero", value = "0")
	@Column(name = "AMOUNT")
	protected Double amount;

	@Column(name = "METRIC_SYSTEM_UNIT")
	protected String metricSystemUnit;
	@JoinTable(name = "SPEEDYPIZZA_DISH_PRODUCTS_LINK",
			joinColumns = @JoinColumn(name = "PRODUCTS_ID"),
			inverseJoinColumns = @JoinColumn(name = "DISH_ID"))
	@ManyToMany
	protected List<Dish> dishes;

	public List<Dish> getDishes() { return dishes; }

	public void setDishes(List<Dish> dishes) { this.dishes = dishes; }

	public String getMetricSystemUnit() { return metricSystemUnit; }

	public void setMetricSystemUnit(String metricSystemUnit) { this.metricSystemUnit = metricSystemUnit; }

	public Double getAmount() { return amount; }

	public void setAmount(Double amount) { this.amount = amount; }

	public String getName() { return name; }

	public void setName(String name) { this.name = name; }
}