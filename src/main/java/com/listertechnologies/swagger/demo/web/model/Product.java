package com.listertechnologies.swagger.demo.web.model;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;

public class Product {
	@ApiModelProperty(name = "id", required = true, value = "ID", example = "1")
	private Integer id;
	@ApiModelProperty(name = "version", value = "Product Version", example = "1")
	private Integer version;
	@ApiModelProperty(name = "productId", required = true, value = "Product ID", example = "101")
	private String productId;
	@ApiModelProperty(name = "description", value = "Product Description", example = "This is a great product")
	private String description;
	@ApiModelProperty(name = "imageUrl", value = "Product Image Url", example = "/path/image1.jpg")
	private String imageUrl;
	@ApiModelProperty(name = "price", value = "Product price", example = "100")
	private BigDecimal price;

	public Product() {

	}

	public Product(Integer id, Integer version, String productId, String description, String imageUrl,
			BigDecimal price) {
		this.id = id;
		this.version = version;
		this.productId = productId;
		this.description = description;
		this.imageUrl = imageUrl;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((imageUrl == null) ? 0 : imageUrl.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (imageUrl == null) {
			if (other.imageUrl != null)
				return false;
		} else if (!imageUrl.equals(other.imageUrl))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", version=" + version + ", productId=" + productId + ", description="
				+ description + ", imageUrl=" + imageUrl + ", price=" + price + "]";
	}

}
