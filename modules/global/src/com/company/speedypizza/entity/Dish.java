package com.company.speedypizza.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@NamePattern("%s %s %s %s|name,price,type,product")
@Table(name = "SPEEDYPIZZA_DISH")
@Entity(name = "speedypizza_Dish")
public class Dish extends StandardEntity {
	private static final long serialVersionUID = 9219611570931866034L;

	@Column(name = "NAME")
	protected String name;

	@DecimalMin(message = "less than 0.01", value = "0.01")
	@Column(name = "PRICE", nullable = false)
	protected BigDecimal price;

	@NotNull
	@Column(name = "TYPE_", nullable = false)
	protected Integer type;

	@JoinTable(name = "SPEEDYPIZZA_DISH_PRODUCTS_LINK",
			joinColumns = @JoinColumn(name = "DISH_ID"),
			inverseJoinColumns = @JoinColumn(name = "PRODUCTS_ID"))
	@ManyToMany
	protected List<Products> product;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ORDER_ID")
	protected Order order;

	public Order getOrder() { return order; }

	public void setOrder(Order order) { this.order = order; }

	public List<Products> getProduct() { return product; }

	public void setProduct(List<Products> product) { this.product = product; }

	public DishType getType() { return type == null ? null : DishType.fromId(type); }

	public void setType(DishType type) { this.type = type == null ? null : type.getId(); }

	public BigDecimal getPrice() { return price; }

	public void setPrice(BigDecimal price) { this.price = price; }

	public String getName() { return name; }

	public void setName(String name) { this.name = name; }
}