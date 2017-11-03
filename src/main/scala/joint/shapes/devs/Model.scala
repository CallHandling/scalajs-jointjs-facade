package joint.shapes.devs

import joint.shapes.basic._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("joint.shapes.devs.Model")
class Model(override val attributes: ModelAttributes) extends Generic(attributes) {
  override type R <: Model

  def changeInGroup(properties: js.Any, opt: js.UndefOr[js.Any] = js.undefined): Boolean = js.native

  def changeOutGroup(properties: js.Any, opt: js.UndefOr[js.Any] = js.undefined): Boolean = js.native

  def createPortItem(group: String, port: String): js.Any = js.native

  def createPortItems(group: String, ports: js.Array[String]): js.Array[js.Any] = js.native

  def addOutPort(port: String, opt: js.UndefOr[js.Any] = js.undefined): Model = js.native

  def removeOutPort(port: String, opt: js.UndefOr[js.Any] = js.undefined): Model = js.native

  def removeInPort(port: String, opt: js.UndefOr[js.Any] = js.undefined): Model = js.native

  def updatePortItems(model: Model, changed: js.Any, opt: js.Any): Model = js.native

  val markup: String = js.native
}

object Model {
  def apply(attributes: ModelAttributes): Model = js.Dynamic.newInstance(js.Dynamic.global.joint.shapes.devs.Model)(attributes).asInstanceOf[Model]
}
