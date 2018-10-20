package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void causes() {
        render();
    }

    public static void home(){
        render();
    }

    public static void remedies() { render(); }

    public static void symptoms() { render(); }
}