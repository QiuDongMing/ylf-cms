package com.qdm.order.pojo;

import com.qdm.pojo.TbOrder;
import com.qdm.pojo.TbOrderItem;
import com.qdm.pojo.TbOrderShipping;

import java.io.Serializable;
import java.util.List;



public class OrderInfo extends TbOrder implements Serializable {

	private List<TbOrderItem> orderItems;
	private TbOrderShipping orderShipping;
	public List<TbOrderItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<TbOrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	public TbOrderShipping getOrderShipping() {
		return orderShipping;
	}
	public void setOrderShipping(TbOrderShipping orderShipping) {
		this.orderShipping = orderShipping;
	}
	
}
