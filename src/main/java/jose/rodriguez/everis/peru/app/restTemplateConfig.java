package jose.rodriguez.everis.peru.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class restTemplateConfig {
  
  
  @Value("${config.base.endpoint}")
    private String url;
    
    @Bean
    public WebClient registrarWebClient() {
        return WebClient.create("http://localhost:8081/api/everis/courses");
           
        
    }
    
    /*
  
    @Bean
    public WebClient registrarWebClientStudent() {
        return WebClient.create("http://localhost:8084/api/everis/student");
           
        
    }
  */

}
