package entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Todo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String task;
	private LocalDate dueDate;
	private boolean isCompleted;
	private LocalDate completedDate;
	private LocalDate createDate;
	
	//This method is called when the object is created
	@PrePersist
	private void init() {
		setCreateDate(LocalDate.now());
	}
	
}
