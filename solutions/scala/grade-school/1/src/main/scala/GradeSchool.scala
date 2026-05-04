
class School {
  type DB = Map[Int, Seq[String]]

  private var database: DB = Map.empty

  def db: DB = database

  def add(name: String, g: Int): Unit = {
    val updatedNames = database.getOrElse(g, Seq.empty) :+ name
    database = database.updated(g, updatedNames)
  }

  def grade(g: Int): Seq[String] =
    database.getOrElse(g, Seq.empty)

  def sorted: DB = {
    import scala.collection.immutable.SortedMap
    SortedMap(database.toSeq.map { case (k, v) => k -> v.sorted }: _*)
  }
}
