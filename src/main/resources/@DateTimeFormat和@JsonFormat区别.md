## @JsonFormat和@DateTimeFormat

```java
package com.xiaobu.entity.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author 小布
 * @version 1.0.0
 * @className User.java
 * @createTime 2024年09月25日 21:11:00
 */
@Data
public class User {
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date birthDay;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date createTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endTime;
    private Integer age;
}

```

```java
package com.xiaobu.controller;

import com.xiaobu.entity.vo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author 小布
 * @className DemoController.java
 * @createTime 2022年04月01日 19:52:00
 */
@RestController
@RequestMapping("test")
@Slf4j
public class TestController {
    
    

    @PostMapping("test1")
    public User test1(@RequestBody User user) {
        log.info("【test1】::user = [{}]", user);
        return user;
    }

    @PostMapping("test2")
    public User test2(User user) {
        log.info("【test2】::user = [{}]", user);
        return user;
    }


}

```

### 测试验证

1、

```text
###
POST http://localhost:8080/test/test1
Content-Type: application/json

{
  "name": "张三",
  "birthDay": "2020-06-08",
  "createTime": "2020-06-08",
  "endTime": "2020-06-08"
}
```

[//]: # (结果)

```text
{
  "timestamp": "2024-09-25T13:59:48.174+0000",
  "status": 400,
  "error": "Bad Request",
  "message": "JSON parse error: Cannot deserialize value of type `java.util.Date` from String \"2020-06-08\": expected format \"yyyy-MM-dd HH:mm:ss\"; nested exception is com.fasterxml.jackson.databind.exc.InvalidFormatException: Cannot deserialize value of type `java.util.Date` from String \"2020-06-08\": expected format \"yyyy-MM-dd HH:mm:ss\"\n at [Source: (PushbackInputStream); line: 3, column: 15] (through reference chain: com.xiaobu.entity.vo.User[\"birthDay\"])",
  "trace": "org.springframework.http.converter.HttpMessageNotReadableException: JSON parse error: Cannot deserialize value of type `java.util.Date` from String \"2020-06-08\": expected format \"yyyy-MM-dd HH:mm:ss\"; nested exception is com.fasterxml.jackson.databind.exc.InvalidFormatException: Cannot deserialize value of type `java.util.Date` from String \"2020-06-08\": expected format \"yyyy-MM-dd HH:mm:ss\"\n at [Source: (PushbackInputStream); line: 3, column: 15] (through reference chain: com.xiaobu.entity.vo.User[\"birthDay\"])\n\tat org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter.readJavaType(AbstractJackson2HttpMessageConverter.java:245)\n\tat org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter.read(AbstractJackson2HttpMessageConverter.java:227)\n\tat org.springframework.web.servlet.mvc.method.annotation.AbstractMessageConverterMethodArgumentResolver.readWithMessageConverters(AbstractMessageConverterMethodArgumentResolver.java:204)\n\tat org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor.readWithMessageConverters(RequestResponseBodyMethodProcessor.java:157)\n\tat org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor.resolveArgument(RequestResponseBodyMethodProcessor.java:130)\n\tat org.springframework.web.method.support.HandlerMethodArgumentResolverComposite.resolveArgument(HandlerMethodArgumentResolverComposite.java:126)\n\tat org.springframework.web.method.support.InvocableHandlerMethod.getMethodArgumentValues(InvocableHandlerMethod.java:166)\n\tat org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:134)\n\tat org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:102)\n\tat org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:895)\n\tat org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:800)\n\tat org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87)\n\tat org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1038)\n\tat org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:942)\n\tat org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1005)\n\tat org.springframework.web.servlet.FrameworkServlet.doPost(FrameworkServlet.java:908)\n\tat javax.servlet.http.HttpServlet.service(HttpServlet.java:660)\n\tat org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:882)\n\tat javax.servlet.http.HttpServlet.service(HttpServlet.java:741)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:231)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\n\tat org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:53)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\n\tat org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:99)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:107)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\n\tat org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:92)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:107)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\n\tat org.springframework.web.filter.HiddenHttpMethodFilter.doFilterInternal(HiddenHttpMethodFilter.java:93)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:107)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\n\tat org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:200)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:107)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\n\tat org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:200)\n\tat org.apache.catalina.core.StandardContextValve.__invoke(StandardContextValve.java:96)\n\tat org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:41002)\n\tat org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:490)\n\tat org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:139)\n\tat org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:92)\n\tat org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:74)\n\tat org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:343)\n\tat org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:408)\n\tat org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:66)\n\tat org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:834)\n\tat org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1415)\n\tat org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49)\n\tat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)\n\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)\n\tat org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61)\n\tat java.lang.Thread.run(Thread.java:750)\nCaused by: com.fasterxml.jackson.databind.exc.InvalidFormatException: Cannot deserialize value of type `java.util.Date` from String \"2020-06-08\": expected format \"yyyy-MM-dd HH:mm:ss\"\n at [Source: (PushbackInputStream); line: 3, column: 15] (through reference chain: com.xiaobu.entity.vo.User[\"birthDay\"])\n\tat com.fasterxml.jackson.databind.exc.InvalidFormatException.from(InvalidFormatException.java:67)\n\tat com.fasterxml.jackson.databind.DeserializationContext.weirdStringException(DeserializationContext.java:1549)\n\tat com.fasterxml.jackson.databind.DeserializationContext.handleWeirdStringValue(DeserializationContext.java:911)\n\tat com.fasterxml.jackson.databind.deser.std.DateDeserializers$DateBasedDeserializer._parseDate(DateDeserializers.java:189)\n\tat com.fasterxml.jackson.databind.deser.std.DateDeserializers$DateDeserializer.deserialize(DateDeserializers.java:285)\n\tat com.fasterxml.jackson.databind.deser.std.DateDeserializers$DateDeserializer.deserialize(DateDeserializers.java:268)\n\tat com.fasterxml.jackson.databind.deser.impl.MethodProperty.deserializeAndSet(MethodProperty.java:127)\n\tat com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:369)\n\tat com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:159)\n\tat com.fasterxml.jackson.databind.ObjectMapper._readMapAndClose(ObjectMapper.java:4013)\n\tat com.fasterxml.jackson.databind.ObjectMapper.readValue(ObjectMapper.java:3084)\n\tat org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter.readJavaType(AbstractJackson2HttpMessageConverter.java:239)\n\t... 56 more\n",
  "path": "/test/test1"
}
```

[//]: # (可以看出@DateTimeFormat将字符串做格式校验)

2、

```text
###
POST http://localhost:8080/test/test1
Content-Type: application/json

{
  "name": "张三",
  "birthDay": "2020-06-08 14:31:41",
  "createTime": "2020-06-08 14:31:41",
  "endTime": "2020-06-08"
}
```
### 返回的结果

[//]: # (日志打印)

```text
User(name=张三, birthDay=Mon Jun 08 22:31:41 CST 2020, createTime=Mon Jun 08 00:00:00 CST 2020, endTime=Mon Jun 08 08:00:00 CST 2020, age=null)
```

```json
{
  "name": "张三",
  "birthDay": "2020-06-08 14:31:41",
  "createTime": "2020-06-08",
  "endTime": "2020-06-08T00:00:00.000+0000",
  "age": null
}
```

可以看出前端传入按照@DateTimeFormat做格式校验,序列化和反序列都是按照@JsonFormat来的

