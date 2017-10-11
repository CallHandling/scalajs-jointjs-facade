package joint.dia

import joint.V

import scala.scalajs.js

@js.native
trait CellView extends js.Object {
  val id: String = js.native
  def model: Cell = js.native
  val vel: V = js.native

  def get(`type`: String): String = js.native
}
