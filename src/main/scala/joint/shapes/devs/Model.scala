package joint.shapes.devs

import joint.dia._
import joint.shapes.basic.Generic

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("joint.shapes.devs.Model")
class Model(override val attributes: ModelAttributes) extends Generic(attributes) {

  def translate(x: Int, y: Int): js.native = js.native

  def toJSON(): Model = js.native

  def addInPort(port: String, opt: js.UndefOr[js.Any] = js.undefined): Model = js.native

  def addOutPort(port: String, opt: js.UndefOr[js.Any] = js.undefined): Model = js.native

  def removeOutPort(port: String, opt: js.UndefOr[js.Any] = js.undefined): Model = js.native

  def removeInPort(port: String, opt: js.UndefOr[js.Any] = js.undefined): Model = js.native

  val markup: String = js.native
}

object Model {
  def apply(attributes: ModelAttributes): Model = js.Dynamic.newInstance(js.Dynamic.global.joint.shapes.devs.Model)(attributes).asInstanceOf[Model]
}


trait ModelAttributes extends GenericAttributes {
  var markup: js.UndefOr[String] = js.undefined
  var portMarkup: js.UndefOr[String] = js.undefined
  var portLabelMarkup: js.UndefOr[String] = js.undefined
  var outPorts: js.UndefOr[js.Array[String]] = js.undefined
  var inPorts: js.UndefOr[js.Array[String]] = js.undefined
  var ports: js.UndefOr[PortOptions] = js.undefined
}


