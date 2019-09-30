package jose.rodriguez.everis.peru.app.controllers;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8;
import java.net.URI;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import jose.rodriguez.everis.peru.app.models.Course;
import jose.rodriguez.everis.peru.app.models.Student;
import jose.rodriguez.everis.peru.app.models.service.CourseService;

import reactor.core.publisher.Mono;

@Component
public class CourseController {
  
  @Autowired
  private CourseService service;
  
   public Mono<ServerResponse> listar(ServerRequest request){
    return ServerResponse.ok().contentType(APPLICATION_JSON_UTF8)
            .body(service.findAll(), Course.class);
  }

   /*
   public Mono<ServerResponse> listarStudent(ServerRequest request){
     return ServerResponse.ok().contentType(APPLICATION_JSON_UTF8)
             .body(service.findAllStudent(), Student.class);
   }

   */
  
}