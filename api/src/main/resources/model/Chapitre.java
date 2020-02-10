package com.example.api.model;
import java.util.Set;
import javax.persistence.*;


@Entity

@Table(name = "chapitre")
@EntityListeners(AuditingEntityListener.class)
public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private long id;
    
    @Column(name = "content", unique = true, nullable = false)
    private String content;

   
    public long getId() {
    	return this.id;
    }
    public void setId(long id) {
    	this.id = id;
    }

    public String getContent() {
    	return this.content;
    }
    public void setTitle(String content) {
    	this.content = content;
    }
 
    
   
    
    @OneToMany (mappedBy = "chapitre")
    private Set<Livre> livre;
  
}
