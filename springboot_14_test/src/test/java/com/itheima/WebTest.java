package com.itheima;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.ContentResultMatchers;
import org.springframework.test.web.servlet.result.HeaderResultMatchers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.result.StatusResultMatchers;

import java.net.URI;

/**
 * @author malichun
 * @create 2023/01/06 0006 23:44
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
// 开启虚拟MVC调用
@AutoConfigureMockMvc
public class WebTest {


    @Test
    void testRandomPort(){

    }

    // 虚拟调用
    @Test
    void testWeb(@Autowired MockMvc mvc) throws Exception {
        // http://localhost:8080/books
        // 创建了虚拟的请求, 当前访问/books
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        // 执行了对应的请求
        ResultActions perform = mvc.perform(builder);

    }


    // 虚拟调用
    @Test
    void testStatus(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        ResultActions actions = mvc.perform(builder);

        // 设定预期值, 与真实值进行比较, 成功测试通过, 失败测试失败
        // 定义本地调用的预期值
        StatusResultMatchers status = MockMvcResultMatchers.status();
        // 预计本地调用时成功的, 状态200
        ResultMatcher ok = status.isOk();
        // 添加与机制到本地调用过程中进行匹配
        actions.andExpect(ok);

    }

    // 虚拟调用
    @Test
    void testBody(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        ResultActions actions = mvc.perform(builder);

        // 设定预期值, 与真实值进行比较, 成功测试通过, 失败测试失败
        // 定义本地调用的预期值
        ContentResultMatchers content = MockMvcResultMatchers.content();

        ResultMatcher result = content.string("springboot");
        // 添加与机制到本地调用过程中进行匹配
        actions.andExpect(result);
    }

    @Test
    void testJSON(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        ResultActions actions = mvc.perform(builder);

        // 设定预期值, 与真实值进行比较, 成功测试通过, 失败测试失败
        // 定义本地调用的预期值
        ContentResultMatchers content = MockMvcResultMatchers.content();

        ResultMatcher result = content.json("{\"id\":1,\"name\":\"springboot\",\"type\":\"springboot\",\"description\":\"springboot\"}");
        // 添加与机制到本地调用过程中进行匹配
        actions.andExpect(result);

    }

    @Test
    void testContentType(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        ResultActions actions = mvc.perform(builder);

        // 设定预期值, 与真实值进行比较, 成功测试通过, 失败测试失败
        // 定义本地调用的预期值
        HeaderResultMatchers header = MockMvcResultMatchers.header();

        ResultMatcher contentType = header.string("Content-Type", "application/json");
        // 添加与机制到本地调用过程中进行匹配
        actions.andExpect(contentType);

    }


    @Test
    void testGetById(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        ResultActions actions = mvc.perform(builder);

        HeaderResultMatchers header = MockMvcResultMatchers.header();
        ResultMatcher contentType = header.string("Content-Type", "application/json");
        actions.andExpect(contentType);


        StatusResultMatchers status = MockMvcResultMatchers.status();
        ResultMatcher ok = status.isOk();
        actions.andExpect(ok);

        ContentResultMatchers content = MockMvcResultMatchers.content();
        ResultMatcher result = content.json("{\"id\":1,\"name\":\"springboot\",\"type\":\"springboot\",\"description\":\"springboot\"}");
        actions.andExpect(result);
    }

}
