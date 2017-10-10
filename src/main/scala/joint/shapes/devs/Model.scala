package joint.shapes.devs

import japgolly.scalajs.react.vdom.html_<^.VdomElement
import joint.Props
import joint.dia._
import joint.shapes.basic.Generic

import scala.scalajs.js

@js.native
trait Model extends Generic[ModelOptions, Model] {

  def translate(x: Int, y: Int): js.native = js.native

  override def attributes: ModelOptions = js.native

  def get(name: String): Link = js.native

  def toJSON(): Model = js.native

  def addInPort(port: String, opt: js.UndefOr[js.Any] = js.undefined): Model = js.native

  def addOutPort(port: String, opt: js.UndefOr[js.Any] = js.undefined): Model = js.native

  def removeOutPort(port: String, opt: js.UndefOr[js.Any] = js.undefined): Model = js.native

  def removeInPort(port: String, opt: js.UndefOr[js.Any] = js.undefined): Model = js.native

  def dialog(props: Props): VdomElement = js.native

  val markup: String = js.native
}


object Model extends ExtenderOps {
  override val extender: Extender = js.Dynamic.global.joint.shapes.devs.Model.asInstanceOf[Extender]

  def apply(props: ModelOptions): Model = js.Dynamic.newInstance(js.Dynamic.global.joint.shapes.devs.Model)(props).asInstanceOf[Model]
}


trait ModelOptions extends Options {
  var markup: js.UndefOr[String] = js.undefined
  var portMarkup: js.UndefOr[String] = js.undefined
  var portLabelMarkup: js.UndefOr[String] = js.undefined
  var outPorts: js.UndefOr[js.Array[String]] = js.undefined
  var inPorts: js.UndefOr[js.Array[String]] = js.undefined
  var ports: js.UndefOr[PortOptions] = js.undefined
  var openDialog: js.UndefOr[js.Function1[CellView, Unit]] = js.undefined
  var nodeMetadata: js.UndefOr[NodeMetadata] = js.undefined
}

class NodeMetadata(val byteString: String) extends js.Object

