package com.ytrj.hardwaredata.controller;

import com.alibaba.fastjson.JSONObject;
import com.ytrj.hardwaredata.entity.YanganInfo;
import com.ytrj.hardwaredata.entity.base.Result;
import com.ytrj.hardwaredata.entity.result.CommonResultMsg;
import com.ytrj.hardwaredata.service.SmokeService;
import com.ytrj.hardwaredata.utils.JsonUtil;
import com.ytrj.hardwaredata.utils.OneNetUtil;
import com.ytrj.hardwaredata.utils.StringUtils;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* @description : 数据同步 接口控制类
* @author : Ivan
* @date : 2019/9/23
*/
@Controller
@RequestMapping(value = "/data_sync")
public class DataSyncController extends BaseController<DataSyncController>{

    @Autowired
    SmokeService smokeService;
    /**
     * 用户自定义token和OneNet第三方平台配置里的token一致
     */
    //private static String token ="4e8478480730a56b7487bd108e957283";

    /**
     * aeskey和OneNet第三方平台配置里的token一致
     */
    //private static String aeskey ="Vn82N0G93MYD17e9sOQ1sD2PQLPnpAdRh4MbSXCrkeU";

    //private static Logger logger = LoggerFactory.getLogger(DataSyncController.class);

    /**
     * 功能描述：第三方平台数据接收。<p>
     *           <ul>注:
     *               <li>1.OneNet平台为了保证数据不丢失，有重发机制，如果重复数据对业务有影响，数据接收端需要对重复数据进行排除重复处理。</li>
     *               <li>2.OneNet每一次post数据请求后，等待客户端的响应都设有时限，在规定时限内没有收到响应会认为发送失败。
     *                    接收程序接收到数据时，尽量先缓存起来，再做业务逻辑处理。</li>
     *           </ul>
     * @param body 数据消息
     * @return 任意字符串。OneNet平台接收到http 200的响应，才会认为数据推送成功，否则会重发。
     */
    /*
    @RequestMapping(value = "/receive",method = RequestMethod.POST)
    @ResponseBody
    public String receive(@RequestBody String body) throws NoSuchPaddingException, InvalidKeyException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException {
        logger.info("receive body: " + body);
        OneNetUtil.BodyObj obj = null;
        try {
            obj = OneNetUtil.resolveBody(body, false);
            logger.info("receive object: " + obj);
            if (obj != null) {
                boolean dataRight = OneNetUtil.checkSignature(obj, token);
                if (dataRight) {
                    //String msg = OneNetUtil.decryptMsg(obj1, aeskey);
                    logger.info("data signature: true ");
                    smokeService.TryToUpdateDate(obj.toString());
                } else {
                    logger.info("data signature: false ");
                }
            } else {
                logger.info("data signature: body is empty");
            }
            return "ok";
        } catch (JSONException e) {
            e.printStackTrace();
            return "error";
        }
    }
    */
    /**
     * 功能说明： URL&Token验证接口。如果验证成功返回msg的值，否则返回其他值。
     * @param msg 验证消息
     * @param nonce 随机串
     * @param signature 签名
     * @return msg值
     */
    /*
    @RequestMapping(value = "/receive", method = RequestMethod.GET)
    @ResponseBody
    public String check(@RequestParam(value = "msg") String msg,
            @RequestParam(value = "nonce") String nonce,
            @RequestParam(value = "signature") String signature) throws UnsupportedEncodingException {

        logger.info("url&token check: msg:{} nonce{} signature:{}",msg,nonce,signature);
        if (OneNetUtil.checkToken(msg,nonce,signature,token)){
            return msg;
        }else {
            return "error";
        }

    }*/
}
