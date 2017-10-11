package joint.dia

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobal, JSName}

@js.native
@JSGlobal("joint.dia.Cell")
abstract class Cell(val attributes: CellAttributes) extends js.Object {

  def id: String = js.native

  def get(key: String): js.Any = js.native

  @JSName("clone")
  def copy[C](): C = js.native

  def attr(attrs: String, value: js.UndefOr[String] = js.undefined): js.native = js.native
}

trait CellAttributes extends js.Object