//package ccs.enrising.auditlog.boot;
//
//import io.swagger.annotations.ApiOperation;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//import org.springframework.util.StringUtils;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.context.WebApplicationContext;
//import org.springframework.web.method.HandlerMethod;
//import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
//import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
//
//import java.lang.reflect.Method;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
///**
// * @author : dongtianyi
// * @date : 2021/4/1 12:42
// **/
//@Slf4j
//@Component
//public class RequestMappingNameInitializer implements CommandLineRunner {
//
//    private final WebApplicationContext applicationContext;
//    private final Map<String, String> mappingData = new HashMap<>();
//
//    @Override
//    public void run(String... args) throws Exception {
//        RequestMappingHandlerMapping handlerMapping = applicationContext.getBean("requestMappingHandlerMapping", RequestMappingHandlerMapping.class);
//        Set<Map.Entry<RequestMappingInfo, HandlerMethod>> entries = handlerMapping.getHandlerMethods().entrySet();
//        for (Map.Entry<RequestMappingInfo, HandlerMethod> info : entries){
//            Set<String> pathSet = info.getKey().getPatternsCondition().getPatterns();
//            Method method = info.getValue().getMethod();
//            GetMapping getMapping = method.getAnnotation(GetMapping.class);
//            PostMapping postMapping = method.getAnnotation(PostMapping.class);
//            PutMapping putMapping = method.getAnnotation(PutMapping.class);
//            DeleteMapping deleteMapping = method.getAnnotation(DeleteMapping.class);
//            RequestMapping requestMapping = method.getAnnotation(RequestMapping.class);
//            String name = null;
//            String annoName = null;
//            if(getMapping != null){
//                name = getMapping.name();
//                annoName = RequestMapping.class.getSimpleName();
//            }else if(postMapping != null){
//                name = postMapping.name();
//                annoName = PostMapping.class.getSimpleName();
//            }else if(putMapping != null){
//                name = putMapping.name();
//                annoName = PutMapping.class.getSimpleName();
//            }else if(deleteMapping != null){
//                name = deleteMapping.name();
//                annoName = DeleteMapping.class.getSimpleName();
//            }else if(requestMapping != null){
//                name = requestMapping.name();
//                annoName = RequestMapping.class.getSimpleName();
//            }
//            if(StringUtils.isEmpty(name)){
//                ApiOperation annotation = method.getAnnotation(ApiOperation.class);
//                if(annotation != null){
//                    name = annotation.value();
//                    annoName = ApiOperation.class.getSimpleName();
//                }
//            }
//            //HEAD OPTION ==
//            if (StringUtils.isEmpty(name)) {
//                String className = method.getDeclaringClass().getName();
//                if(!className.startsWith("org.springframework")){
//                    log.info("路径{}的{}注解的name属性值为空,位置[{}#{}]", pathSet, annoName, method.getDeclaringClass().getName(), method.getName());
//                }
//                continue;
//            }
//            for (String path : pathSet) {
//                //把pathVariable替换成*,如果有
//                path = path.replaceAll("\\{[^}]*\\}", "*");
//                log.debug("接口路径 [{}]==>功能 [{}]", path, name);
//                mappingData.put(path, name);
//            }
//
//        }
//    }
//
//    public String getFunctionName(String path){
//        return mappingData.get(path);
//    }
//
//    public RequestMappingNameInitializer(WebApplicationContext applicationContext) {
//        this.applicationContext = applicationContext;
//    }
//}
