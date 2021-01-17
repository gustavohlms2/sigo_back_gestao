package br.com.springgestao.pucsigo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "br.com.springgestao.pucsigo")
@EntityScan(basePackages = "br.com.springgestao.pucsigo.model")
public class PucSigoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PucSigoApplication.class, args);
	}

}
