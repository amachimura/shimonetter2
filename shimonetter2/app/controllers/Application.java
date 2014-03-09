package controllers;

import java.util.List;

import play.mvc.*;
import play.data.*;
import static play.data.Form.*;
import views.html.*;
import views.html.helper.*;
import models.*;

public class Application extends Controller {
  
    /**
     * Display the home page.
     */
	
	
    public static Result index() {
    	List<Shimoneta> netas = Shimoneta.find.all();
        return ok(index.render("データベースのサンプル",netas));
    }
    
    public static Result goIntoRoom(Long userId){
		return ok(chatroom.render(userId));
    	
    }
  
}
