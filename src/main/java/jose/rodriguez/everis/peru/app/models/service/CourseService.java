package jose.rodriguez.everis.peru.app.models.service;


import jose.rodriguez.everis.peru.app.models.Course;
import jose.rodriguez.everis.peru.app.models.Student;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CourseService {
  
  public Flux<Course> findAll();
  public Mono<Course> findById(String id);
  public Mono<Course> save(Course course);
  public Mono<Course> update(Course course , String id);
  public Mono<Void> delete(String id);
  
  //public Flux<Student> findAllStudent();

}
