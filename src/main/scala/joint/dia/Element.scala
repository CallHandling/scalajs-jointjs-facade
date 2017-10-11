package joint.dia

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("joint.dia.ElementView")
class Element(attributes: CellAttributes) extends Cell(attributes) {
  def translate(x: Int, y: Int): js.native = js.native

  def getAttribute(name: String): String = js.native
}

trait BoundProps extends js.Object {
  var outbound: js.UndefOr[Boolean] = js.undefined
  var inbound: js.UndefOr[Boolean] = js.undefined
}

trait GenericAttributes extends CellAttributes {
  var position: js.UndefOr[Point] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
  var angel: js.UndefOr[Int] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  val `type`: js.UndefOr[String] = js.undefined
  var attrs: js.UndefOr[js.Dictionary[AttrStyle]] = js.undefined
}

trait Size extends js.Object {
  var width: js.UndefOr[Int] = js.undefined
  var height: js.UndefOr[Int] = js.undefined
}

trait Point extends js.Object {
  var x: js.UndefOr[Int] = js.undefined
  var y: js.UndefOr[Int] = js.undefined
}

trait LinkConnector extends js.Object {
  val id: js.UndefOr[String] = js.undefined
  var selector: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[String] = js.undefined
}