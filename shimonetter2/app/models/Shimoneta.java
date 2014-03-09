package models;

import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.*;

import play.db.ebean.*;
import play.data.validation.*;

import com.avaje.ebean.annotation.*;

@Entity
public class Shimoneta extends Model{
	@Id
	public Long id;
	@ManyToOne
	@JoinColumn(name="userId")
	public User user;
	public String message;
	@CreatedTimestamp
	public Date postdate;

	public static Finder<Long, Shimoneta> find =
			new Finder<Long, Shimoneta>(Long.class, Shimoneta.class);



	@Override
	public String toString(){
		return("[id:"+id+", user:"+user.userName+"message:"+message+"postDate"+postdate+"]");
	}
}
