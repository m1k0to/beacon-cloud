package org.realwsy.api.form;

import lombok.Data;
import org.hibernate.validator.constraints.Range;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class SingleSendForm {

    //  APIKey，用于身份校验
    @NotBlank(message = "APIKey不允许为空!")
    private String apikey;

    //  收件人手机号码
    @NotBlank(message = "手机号不允许为空！")
    private String mobile;

    @NotBlank(message = "短信内容不允许为空！")
    //  短信内容
    private String text;

    //  业务系统uid
    private String uid;

    @Range(min = 0, max = 2, message = "短信类型不在范围内！")
    @NotNull(message = "短信类型不允许为空！")
    //  短信类别 0-验证码 1-通知类 2-营销类
    private Integer state;
}
