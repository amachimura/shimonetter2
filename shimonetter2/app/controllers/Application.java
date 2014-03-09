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
    	Form<User> loginForm = new Form<User>(User.class);
        return ok(index.render("データベースのサンプル",loginForm));
    }
    
	public static Result showSignup(){
		Form<User> signupForm = new Form<User>(User.class);
		return ok(signup.render("サインアップしようぜ", signupForm));
	}

    
    public static Result goIntoRoom(){
    	Form<Shimoneta> tweetForm = new Form<Shimoneta>(Shimoneta.class);
		return ok(chatroom.render("Gay1", tweetForm));
    	
    }
  
}
