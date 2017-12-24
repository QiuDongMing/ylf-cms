package com.qdm.service;


import com.qdm.common.pojo.EasyUIDataGridResult;
import com.qdm.common.utils.E3Result;
import com.qdm.pojo.TbItem;

public interface ItemService {

	TbItem getItemById(long itemId);
	EasyUIDataGridResult getItemList(int page, int rows);
	E3Result addItem(TbItem item, String desc);
}
