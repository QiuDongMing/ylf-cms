package com.qdm.order.service;

import com.qdm.common.utils.E3Result;
import com.qdm.order.pojo.OrderInfo;

public interface OrderService {

	E3Result createOrder(OrderInfo orderInfo);
}
