package jose.rodriguez.everis.peru.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import org.springframework.web.reactive.function.server.RouterFunction;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import org.springframework.web.reactive.function.server.ServerResponse;
import jose.rodriguez.everis.peru.app.controllers.CourseController;



@Configuration
public class RouterConfig {
	
	@Bean
	public RouterFunction<ServerResponse> rutas(CourseController handler){
		return route(GET("/api/course"), handler::listar);
		  
	}

}
