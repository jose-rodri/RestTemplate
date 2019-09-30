package jose.rodriguez.everis.peru.app.models.service.implemet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import jose.rodriguez.everis.peru.app.models.Course;
import jose.rodriguez.everis.peru.app.models.Student;
import jose.rodriguez.everis.peru.app.models.service.CourseService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import static org.springframework.http.MediaType.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
@Service
public class CourseServiceImplement implements CourseService {

  
  @Autowired
  private WebClient client;
  
  
  
      
  @Override
  public Flux<Course> findAll() {
      return client.get().accept(APPLICATION_JSON_UTF8)
              .exchange()
              .flatMapMany(response -> response.bodyToFlux(Course.class));
  }
  

 
/*
  @Override
  public Flux<Student> findAllStudent() {
    return client.get().accept(APPLICATION_JSON_UTF8)
        .exchange()
        .flatMapMany(response -> response.bodyToFlux(Student.class));
  }

*/
  
  @Override
  public Mono<Course> findById(String id) {
    Map<String, Object> params = new HashMap<String, Object>();
    params.put("id", id);
    return client.get().uri("/{id}", params)
            .accept(APPLICATION_JSON_UTF8)
            .retrieve()
            .bodyToMono(Course.class);
  }

  @Override
  public Mono<Course> save(Course course) {
    return client.post()
        .accept(APPLICATION_JSON_UTF8)
        .contentType(APPLICATION_JSON_UTF8)
         .syncBody(course)
        .retrieve()
        .bodyToMono(Course.class);
  }

  @Override
  public Mono<Course> update(Course course, String id) {
    return client.put()
        .uri("/{id}", Collections.singletonMap("id", id))
        .accept(APPLICATION_JSON_UTF8)
        .contentType(APPLICATION_JSON_UTF8)
        .syncBody(course)
        .retrieve()
        .bodyToMono(Course.class);
  }

  @Override
  public Mono<Void> delete(String id) {
    return client.delete().uri("/{id}", Collections.singletonMap("id", id))
        .retrieve()
        .bodyToMono(Void.class);
  }







}
