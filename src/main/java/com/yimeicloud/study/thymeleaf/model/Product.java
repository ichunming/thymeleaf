package com.yimeicloud.study.thymeleaf.model;

import java.util.Date;

public class Product {
	private String name;
    private Integer price;
    private Date publishDate;
    private String type;
    
    public Product(final String name, final Integer price, final Date publishDate, final String type) {
        this.name = name;
        this.price = price;
        this.publishDate = publishDate;
        this.type = type;
    }

    public Date getPublishDate() {
        return this.publishDate;
    }

    public void setPublishDate(final Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return this.price;
    }

    public void setPrice(final Integer price) {
        this.price = price;
    }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
