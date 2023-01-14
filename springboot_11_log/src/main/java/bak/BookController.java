package bak;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author malichun
 * @create 2022/12/13 0013 20:13
 */
@RestController
//@RequestMapping("/books")
public class BookController extends BaseClass{
    // 创建记录日志的对象
    //private static final Logger log = LoggerFactory.getLogger(BookController.class);

    @GetMapping
    public String getById(){
        System.out.println("springboot is running...");

        log.trace("trace...");
        log.debug("debug..."); // 调试用
        log.info("info...");
        log.warn("warn...");
        log.error("error....");

        return "springboot is running....";
    }



}
