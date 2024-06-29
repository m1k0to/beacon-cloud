package org.realwsy.api.filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
//  根据Nacos配置更改动态加载
@RefreshScope
public class CheckFilterContext {

//      基于4.x中Spring提供的反省注解，基于Map只要拿到需要的对象即可

    @Autowired
    private Map<String, CheckFilter> map;

    //  基于Nacos获取到各个校验器及其执行顺序
    @Value("${filters:}")
    private String filters;

    /**
     * 根据指定顺序校验
     * @param object
     */
    public void check(Object object){
        String[] strings = filters.split(",");
        for (String string : strings) {
            CheckFilter filter = map.get(string);
            filter.check(object);
        }
    }
}
