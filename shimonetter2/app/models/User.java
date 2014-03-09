package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.*;

import play.db.ebean.*;
import play.data.validation.*;

@Entity
public class User extends Model {

	@Id
	public Long userId;
	public String userName;
	public Date birthday;
	@OneToMany(cascade=CascadeType.ALL, mappedBy="userId")
	public List<Shimoneta> messages= new ArrayList<Shimoneta>();
}
