package com.qdm.content.service;

import com.qdm.common.utils.E3Result;
import com.qdm.pojo.TbContent;

import java.util.List;


public interface ContentService {

	E3Result addContent(TbContent content);
	List<TbContent> getContentListByCid(long cid);
}
