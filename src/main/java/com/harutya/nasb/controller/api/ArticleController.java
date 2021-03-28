package com.harutya.nasb.controller.api;

import com.harutya.nasb.service.ArticleService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/article")
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @GetMapping
    @ApiOperation(value = "get all articles",httpMethod = "GET")
    public void article(){

    }

}
