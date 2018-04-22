package helloworld;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello World!";
	}
	
	@RequestMapping("/ip")
	public String getIp() throws UnknownHostException {
		String ip = InetAddress.getLocalHost().getHostAddress();
		return "您访问的IP是："+ip;
	}

}
