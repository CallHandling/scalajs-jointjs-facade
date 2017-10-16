package joint.shapes.devs

import _root_.org.querki.jsext.{JSOptionBuilder, _}
import joint.dia._
import joint.shapes.basic.Generic
import joint.shapes.{GenericAttributes, GenericAttributesSetters}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("joint.shapes.devs.Model")
class Model(override val attributes: ModelAttributes) extends Generic(attributes) {

  def changeInGroup(properties: js.Any, opt: js.UndefOr[js.Any] = js.undefined): Boolean = js.native

  def changeOutGroup(properties: js.Any, opt: js.UndefOr[js.Any] = js.undefined): Boolean = js.native

  def createPortItem(group: String, port: String): js.Any = js.native

  def createPortItems(group: String, ports: js.Array[String]): js.Array[js.Any] = js.native

  def addOutPort(port: String, opt: js.UndefOr[js.Any] = js.undefined): Model = js.native

  def removeOutPort(port: String, opt: js.UndefOr[js.Any] = js.undefined): Model = js.native

  def removeInPort(port: String, opt: js.UndefOr[js.Any] = js.undefined): Model = js.native

  val markup: String = js.native
}

object Model {
  def apply(attributes: ModelAttributes): Model = js.Dynamic.newInstance(js.Dynamic.global.joint.shapes.devs.Model)(attributes).asInstanceOf[Model]
}

trait ModelAttributes extends GenericAttributes[SVGAttributes] {
  val inPorts: js.UndefOr[js.Array[String]] = js.undefined
  val outPorts: js.UndefOr[js.Array[String]] = js.undefined
  val ports: js.UndefOr[PortOptions] = js.undefined
}

object ModelAttributes extends ModelAttributesBuilder(noOpts)


class ModelAttributesBuilder(val dict: OptMap) extends JSOptionBuilder[ModelAttributes, ModelAttributesBuilder](new ModelAttributesBuilder(_))
  with ModelAttributesSetters[ModelAttributes, ModelAttributesBuilder]

trait ModelAttributesSetters[T <: js.Object, B <: JSOptionBuilder[T, _]]
  extends JSOptionSetter[T, B]
    with GenericAttributesSetters[SVGAttributes, T, B] {
  def inPorts(v: js.Array[String]): B = jsOpt("inPorts", v)

  def outPorts(v: js.Array[String]): B = jsOpt("outPorts", v)

  def ports(v: PortOptions): B = jsOpt("ports", v)
}
