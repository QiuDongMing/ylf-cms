package com.qdm.search.mapper;

import java.util.List;

import com.qdm.common.pojo.SearchItem;

public interface ItemMapper {
	List<SearchItem> getItemList();
	SearchItem getItemById(long itemId);
}
