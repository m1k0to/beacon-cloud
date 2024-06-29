package org.realwsy.api.controller;


import lombok.extern.slf4j.Slf4j;
import org.realwsy.api.enums.ErrorDetails;
import org.realwsy.api.form.SingleSendForm;
import org.realwsy.api.util.R;
import org.realwsy.api.vo.ResultVO;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sms")
@Slf4j
public class SmsController {

    @PostMapping(value = "/single_send", produces = "application/json;charset=utf-8")
    public ResultVO singleSend(@RequestBody @Validated SingleSendForm singleSendForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            String errorMsg = bindingResult.getAllErrors().get(0).getDefaultMessage();
            log.info("接口模块：单条短信Controller参数不合法，信息：{}", errorMsg);
            return R.error(ErrorDetails.PARAMETER_ERROR.getCode(), errorMsg);
        }

        return R.ok();
    }
}
