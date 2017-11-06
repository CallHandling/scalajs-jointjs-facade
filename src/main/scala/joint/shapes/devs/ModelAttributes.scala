package joint.shapes.devs

import joint.dia.PortOptions
import joint.shapes.{GenericAttributes, GenericAttributesSetters}
import org.querki.jsext.{JSOptionBuilder, JSOptionSetter, OptMap, noOpts}

import scala.scalajs.js

trait ModelAttributes extends GenericAttributes[ModelShapesAttributes] {
  val inPorts: js.UndefOr[js.Array[String]] = js.undefined
  val outPorts: js.UndefOr[js.Array[String]] = js.undefined
  val ports: js.UndefOr[PortOptions] = js.undefined
}

object ModelAttributes extends ModelAttributesBuilder(noOpts)

class ModelAttributesBuilder(val dict: OptMap)
  extends JSOptionBuilder[ModelAttributes, ModelAttributesBuilder](new ModelAttributesBuilder(_))
    with ModelAttributesSetters[ModelAttributes, ModelAttributesBuilder]

trait ModelAttributesSetters[T <: js.Object, B <: JSOptionBuilder[T, _]]
  extends JSOptionSetter[T, B]
    with GenericAttributesSetters[ModelShapesAttributes, T, B] {
  def inPorts(v: js.Array[String]): B = jsOpt("inPorts", v)

  def outPorts(v: js.Array[String]): B = jsOpt("outPorts", v)

  def ports(v: PortOptions): B = jsOpt("ports", v)
}
