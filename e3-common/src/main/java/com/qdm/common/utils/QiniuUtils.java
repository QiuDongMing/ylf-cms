package com.qdm.common.utils;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @author QiuDongMing 2017年12月22日 17:43
 * @version 1.0
 */
public class QiniuUtils {



    private final static String ACCESS_KEY = "hCMV_LXiI4eTQLVkeyA4Z5qpzVd58LisLvVtH8M7";
    private final static String SECRET_KEY = "k4lZ69XEMthpQ1oLL19_ZZ4KWUp__HpR0cXsXBFi";
    /**
     * 域名
     */
    private final static String bucket = "qdmimg";

    /**
     * 密匙配置
     */
    private final static Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);


    /**
     * 构造一个带指定Zone对象的配置类
     */
    private final static Configuration cfg = new Configuration(Zone.zone0());

    /**
     * 创建上传对象
     */
    private final static UploadManager uploadManager = new UploadManager(cfg);


    /**
     * 文件上传
     * @param uploadBytes
     * @return
     */
    public static DefaultPutRet upload(byte[] uploadBytes, String fileName) throws QiniuException {
        Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
        String upToken = auth.uploadToken(bucket);
        //默认不指定key的情况下，以文件内容的hash值作为文件名
        String key = generateFilePath() + fileName;
        Response response = uploadManager.put(uploadBytes, key, upToken);
        //解析上传成功的结果
        DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
        return putRet;
    }


    /**
     * 生成前缀
     * @return
     */
    private static String generateFilePath() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/HHmmssSSS/");
        return sdf.format(new Date());
    }


    public static void main(String[] args) {

//        File f = new File("F://img/7.png");
//        System.out.println("f.getAbsolutePath() = " + f.exists());
//
//        byte[] bytes = null;
//        InputStream is = null;
//        ByteArrayOutputStream swapStream = new ByteArrayOutputStream();
//        try {
//            byte[] buff = new byte[100]; //buff用于存放循环读取的临时数据
//            is = new FileInputStream(f);
//            int rc;
//            while ((rc = is.read(buff))>0) {
//                swapStream.write(buff, 0 ,rc);
//            }
//            bytes = swapStream.toByteArray();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        DefaultPutRet res = upload(bytes,f.getName());
//        System.out.println("res = " + res);
//        System.out.println("res = " + JsonUtils.objectToJson(res));
    }





}
