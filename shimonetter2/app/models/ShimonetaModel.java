package models;

import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.*;

import play.db.ebean.*;
import play.data.validation.*;

@Entity
public class ShimonetaModel extends Model{
	@Id
	public Long id;
	public Long uid;
	public String message;
	public Date postdate;	
}
