package com.qdm.service;

import com.qdm.common.pojo.EasyUITreeNode;

import java.util.List;


public interface ItemCatService {

	List<EasyUITreeNode> getItemCatlist(long parentId);
}
