package org.realwsy.api.filter.impl;

import lombok.extern.slf4j.Slf4j;
import org.realwsy.api.filter.CheckFilter;
import org.springframework.stereotype.Service;

@Service("mobile")
@Slf4j
public class MobileCheckFilter implements CheckFilter {
    /**
     * 校验手机号是否合法
     *
     * @param object
     */
    @Override
    public void check(Object object) {
        log.info("校验手机号中......");
    }
}
