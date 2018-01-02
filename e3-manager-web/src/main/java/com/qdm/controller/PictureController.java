package com.qdm.controller;

import java.util.HashMap;
import java.util.Map;

import com.qdm.common.utils.JsonUtils;
import com.qdm.common.utils.QiniuUtils;
import com.qiniu.storage.model.DefaultPutRet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


/**
 * 图片上传处理Controller
 * <p>Title: PictureController</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p> 
 * @version 1.0
 */
@Controller
public class PictureController {

	private final static Logger logger = LoggerFactory.getLogger(PictureController.class);

	@Value("${IMAGE_SERVER_URL}")
	private String IMAGE_SERVER_URL;

	@RequestMapping(value="/pic/upload", produces=MediaType.TEXT_PLAIN_VALUE+";charset=utf-8")
	@ResponseBody
	public String uploadFile(MultipartFile uploadFile) {

		try {
			DefaultPutRet upload = QiniuUtils.upload(uploadFile.getBytes(), uploadFile.getOriginalFilename());

			//封装到map中返回
			Map result = new HashMap<>();
			result.put("error", 0);
			result.put("url", IMAGE_SERVER_URL + upload.key);
			String res = JsonUtils.objectToJson(result);
			logger.debug("upload img success:{}", res);
			return res;
		} catch (Exception e) {
			logger.error("upload img error:{}",e.getMessage());
			Map result = new HashMap<>();
			result.put("error", 1);
			result.put("message", "图片上传失败");
			return JsonUtils.objectToJson(result);
		}
	}



}
