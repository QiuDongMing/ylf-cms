package com.qdm.sso.service;

import com.qdm.common.utils.E3Result;
import com.qdm.pojo.TbUser;

/**
 * @author QiuDongMing 2017年12月29日 14:52
 * @version 1.0
 */
public interface RegisterService {

    E3Result checkData(String param, int type);
    E3Result register(TbUser user);

}
