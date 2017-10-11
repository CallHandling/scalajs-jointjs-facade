package joint.dia

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|


trait LinkAttributes extends CellAttributes {
  var attrs: js.UndefOr[js.Dictionary[Attrs]] = js.undefined
  var source: js.UndefOr[Point | LinkConnector] = js.undefined
  var target: js.UndefOr[Point | LinkConnector] = js.undefined
}

@js.native
@JSGlobal("joint.dia.Link")
class Link(attributes: LinkAttributes) extends Cell(attributes) {
  val port: String = js.native
}