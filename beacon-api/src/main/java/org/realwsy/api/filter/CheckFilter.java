package org.realwsy.api.filter;

public interface CheckFilter {

    /**
     * 各种方式的校验，以策略模式+责任链的方式
     * @param object
     */
    void check(Object object);
}
