package jose.rodriguez.everis.peru.app.models;

import java.util.Date;
import org.springframework.data.annotation.Id;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Course {
  

  @Id
  private String id;
  private String courseName;
  private String name;
  @JsonFormat(pattern = "yyyy-MM-dd", shape = Shape.STRING)
  private Date startDate;
  @JsonFormat(pattern = "yyyy-MM-dd", shape = Shape.STRING)
  private Date endDate;

  private Modality modality;

  //private Student student;


}
