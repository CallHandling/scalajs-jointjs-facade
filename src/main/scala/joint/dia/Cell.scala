package joint.dia

import japgolly.scalajs.react.vdom.html_<^
import joint.Props

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
abstract trait Cell[OP <: Options, C <: Cell[OP, C]] extends js.Object {
  def attributes: OP

  def id: String = js.native

  @JSName("clone")
  def copy(): C = js.native

  def attr(attrs: String, value: js.UndefOr[String] = js.undefined): js.native = js.native
}

trait PrototypeProperties extends js.Object {
  val dialog: js.Function1[Props, html_<^.VdomElement]
}

class DialogModelHandler(handler: CellView => Unit) extends js.Object {
  def openDialog: js.UndefOr[js.Function1[CellView, Unit]] = js.defined((cellView) => handler(cellView))
}

trait StaticProperties extends js.Object {

}