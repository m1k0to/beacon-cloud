package org.realwsy.api.filter.impl;

import lombok.extern.slf4j.Slf4j;
import org.realwsy.api.filter.CheckFilter;
import org.springframework.stereotype.Service;

@Service("sign")
@Slf4j
public class SignCheckFilter implements CheckFilter {
    /**
     * 校验签名是否合法
     *
     * @param object
     */
    @Override
    public void check(Object object) {
        log.info("校验签名中......");
    }
}
