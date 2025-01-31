package sast.freshcup;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("sast.freshcup.mapper")
@SpringBootApplication
public class SastFreshCupApplication {

    public static void main(String[] args) {
        SpringApplication.run(SastFreshCupApplication.class, args);
    }

}
