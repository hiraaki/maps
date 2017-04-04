package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Plots"));
    }

    public static Result busca(){

        return ok();
    }
    public static Result novoPonto(){
        return ok();
    }

}
