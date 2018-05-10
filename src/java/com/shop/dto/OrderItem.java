package com.shop.dto;

import com.shop.dto.Product;

public class OrderItem {
	
	private Integer count;

    private Double subtotal;

    private Integer pid;
    
    private Integer oid;
//  关联商品
    private Product product;
    
    private Integer oiid;
    
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Integer getOiid() {
		return oiid;
	}
	public void setOiid(Integer oiid) {
		this.oiid = oiid;
	}
    
    
}