package org.realwsy.common.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 短信详细信息
 * 接口模块-策略模块-短信网关模块需要做校验和封装
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SmsDetail {

    //  针对当前短信的唯一标识
    private Long sequenceId;

    //  客户ID
    private Long clientId;

    //  客户ip白名单
    private String ip;

    // 客户业务白名单
    private String uid;

    // 目标手机号
    private String mobile;

    //  短信签名
    private String sign;

    //  短信内容
    private String text;

    //  短信发送时间
    private LocalDateTime sendTime;

    //  当前短信费用
    private Long fee;

    //  收件人手机号运营商
    private Integer operatorId;

    //  收件人手机号归属地区号
    private Integer areaCode;

    //  收件人手机号归属地名称
    private String area;

    //  通道下发源号码
    private String srcNumber;

    //  通道id
    private Long channelId;

    //  短信的发送状态 0-等待中 1-成功 2-失败
    private Integer reportState;

}
