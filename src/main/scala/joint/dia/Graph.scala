package joint.dia

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("joint.dia.Graph")
class Graph extends js.Object {
  def addCell(cell: Cell): Graph = js.native

  def getConnectedLinks(cell: Cell, boundProps: js.UndefOr[BoundProps] = js.undefined): js.Array[Link] = js.native

  def toJSON(): js.Object = js.native

  def fromJSON(json: Dynamic): Graph = js.native

  def on(event: String, fun: js.Function1[CellView, Unit]): js.Any = js.native
}
