package com.roque.sboot.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class DefaultRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:C:\\exemploCamel\\source").to("file:C:\\exemploCamel\\destiny");
		System.out.println("Copiado com sucesso");
		
	}

}
