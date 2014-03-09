package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import play.data.*;
import static play.data.Form.*;
import models.User;
import play.mvc.*;
import views.html.*;
import views.html.helper.*;

public class SignupController extends Controller {
	public static Result execSignup(){
		Form<User> form = form(User.class).bindFromRequest();
		if(!form.hasErrors()){
			User userData = form.get();
			userData.save();
			return redirect("/index");
		}else{
			return badRequest(signup.render("ERROR", form));
		}
	}
}



