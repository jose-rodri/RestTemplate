package jose.rodriguez.everis.peru.app.models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Student {
  
  
  
  private String id;

  private String name;

  private String lastName;
 
  private String gender;
  @JsonFormat(pattern = "yyyy-MM-dd", shape = Shape.STRING)
  private Date date;
 
  
  private String typeDocument;
  
  private int document;
  
  private int note;

  


}
