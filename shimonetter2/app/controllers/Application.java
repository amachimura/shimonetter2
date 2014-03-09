package controllers;

import play.mvc.*;

import play.data.*;
import static play.data.Form.*;
import views.html.*;

import models.*;

public class Application extends Controller {
  
    /**
     * Display the home page.
     */
	
	
    public static Result index() {
        return ok(index.render("データベースのサンプル"));
    }
  
  
}
