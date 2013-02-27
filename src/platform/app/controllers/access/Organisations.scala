package controllers

import play.api.mvc.{Action, Controller}
import play.api.libs.json._
import collection.JavaConversions._
import com.google.inject.Inject
import org.neo4j.graphdb.GraphDatabaseService
import lib.JsonWriters._
import concurrent.ExecutionContext.Implicits.global

class Organisations @Inject()(db: GraphDatabaseService )extends Controller {

  def index = Action {
    val results = db.index.forNodes("entities").get("type", "iati-organisation")
    Ok(Json.toJson(results.iterator.toSeq))
  }

  def view(id: String) = TODO
}
