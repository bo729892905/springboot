package com.test.resource;

import com.test.model.User;
import com.test.service.UserService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by ren.xiaobo on 2016/8/16.
 */
@Component
@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Api(value = "user", description = "用户接口", produces = MediaType.APPLICATION_JSON)
public class UserResource {
    private final static Logger logger = LoggerFactory.getLogger(UserResource.class);

    @Autowired
    private UserService userService;

    @POST
    @Path("/save")
    @ApiOperation(value = "保存用户", httpMethod = "GET", notes = "保存用户")
    public String hello(@ApiParam(value = "用户信息" ,required = true) @RequestBody User user) {
        logger.info("保存用户....");
        userService.insert(user);
        return "保存成功！";
    }

    @GET
    @Path("/{id}")
    @ApiOperation(value = "根据id获取用户", httpMethod = "GET", notes = "根据id获取用户")
    public @ResponseBody User user(@ApiParam(value = "用户id" ,required = true) @PathParam("id") long id) {
        return userService.getById(id);
    }
}

