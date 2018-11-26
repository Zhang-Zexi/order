package com.imooc.order.controller;

import com.imooc.order.dataobject.ProductInfo;
import com.imooc.order.dto.CartDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@Slf4j
public class ClientController {

//    @Autowired
//    private ProductClient productClient;
//
//    @GetMapping("/getProductMsg")
//    public String getProductMsg() {
//
//        String response = productClient.productMsg();
//
//        log.info("response={}", response);
//        return response;
//    }
//
//    @GetMapping("/getProductList")
//    public String getProductList() {
//        List<ProductInfo> productInfoList = productClient.listForOrder(Arrays.asList("164103465734242707"));
//        log.info("response={}", productInfoList);
//        return "ok";
//    }
//
//    @GetMapping("/productDecreaseStock")
//    public String productDecreaseStock() {
//        productClient.decreaseStock(Arrays.asList(new CartDTO("164103465734242707", 3)));
//        return "ok";
//    }


}
