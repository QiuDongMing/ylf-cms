package com.qdm.content.service;

import com.qdm.common.pojo.EasyUITreeNode;
import com.qdm.common.utils.E3Result;

import java.util.List;


public interface ContentCategoryService {

	List<EasyUITreeNode> getContentCatList(long parentId);
	E3Result addContentCategory(long parentId, String name);
}
