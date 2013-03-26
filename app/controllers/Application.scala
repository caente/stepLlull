package controllers

import play.api._
import play.api.mvc._
import views.html.map

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.map())
  }
  
}