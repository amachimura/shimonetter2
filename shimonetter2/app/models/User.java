package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.*;

import com.avaje.ebean.annotation.*;

import play.db.ebean.*;
import play.data.validation.*;
import play.data.validation.Constraints.*;

@Entity
public class User extends Model {

	@Id
	public Long userId;
	@Required
	public String userName;
	public String sex;
	@Required
	public Date birthday;
	@OneToMany(cascade=CascadeType.ALL, mappedBy="user")
	public List<Shimoneta> messages= new ArrayList<Shimoneta>();
}
