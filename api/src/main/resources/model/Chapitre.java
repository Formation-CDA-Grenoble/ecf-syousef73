package com.example.api.model;
import java.util.Set;
import javax.persistence.*;


@Entity

@Table(name = "livre")
@EntityListeners(AuditingEntityListener.class)
public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private long id;
    
    @Column(name = "Title", unique = true, nullable = false)
    private String Title;

    @Column(name = "summery", nullable = false)
    private String summery;

    @Column(name = "published", nullable = false)
    private Date published;

    public long getId() {
    	return this.id;
    }
    public void setId(long id) {
    	this.id = id;
    }

    public String getTitle() {
    	return this.Title;
    }
    public void setTitle(String Title) {
    	this.Title = Title;
    }
 
    public String getsummery() {
    	return this.summery;
    }
    public void setsummery(String summery) {
    	this.summery = summery;
    }
    
    public Date getpublished() {
    	return this.published;
    }
    public void setpublished(Date published) {
    	this.published = published;
    }
   
    
    @OneToMany(mappedBy = "user")
    @JsonIgnoreProperties("user")
    private Set<Article> article;
  
}
