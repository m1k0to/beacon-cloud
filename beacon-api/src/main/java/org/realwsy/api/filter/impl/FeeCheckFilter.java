package org.realwsy.api.filter.impl;

import lombok.extern.slf4j.Slf4j;
import org.realwsy.api.filter.CheckFilter;
import org.springframework.stereotype.Service;

@Service("fee")
@Slf4j
public class FeeCheckFilter implements CheckFilter {
    /**
     * 校验余额是否合法
     *
     * @param object
     */
    @Override
    public void check(Object object) {
        log.info("校验余额中......");
    }
}
