package com.qdm.sso.service;

import com.qdm.common.utils.E3Result;

/**
 * @author QiuDongMing 2017年12月29日 14:53
 * @version 1.0
 */
public interface TokenService {
    E3Result getUserByToken(String token);
}
