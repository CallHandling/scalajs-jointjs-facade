package joint.shapes.logic

import joint.dia
import joint.dia.{SVGAttributes, TextAttrs}
import joint.shapes.basic.{ShapeAttrs, ShapeAttrsSetters}
import joint.shapes.{GenericAttributes, basic}
import org.querki.jsext.{JSOptionBuilder, JSOptionSetter, OptMap, noOpts}

import scala.scalajs.js


trait LogicAttrs extends ShapeAttrs {
  val `class`: js.UndefOr[String] = js.undefined
  val port: js.UndefOr[String] = js.undefined
}

object LogicAttrs extends LogicAttrsBuilder(noOpts)

class LogicAttrsBuilder(val dict: OptMap) extends JSOptionBuilder[LogicAttrs, LogicAttrsBuilder](new LogicAttrsBuilder(_))
  with LogicAttrsSetters[LogicAttrs, LogicAttrsBuilder]
  with ShapeAttrsSetters[LogicAttrs, LogicAttrsBuilder]

trait LogicAttrsSetters[T <: js.Object, B <: JSOptionBuilder[T, _]] extends JSOptionSetter[T, B] {
  def `class`(k: String) = jsOpt("class", k)

  def port(k: String) = jsOpt("port", k)
}

trait IOAttrs extends TextAttrs {
  var circle: js.UndefOr[LogicAttrs] = js.undefined
}

trait Image extends LogicAttrs {
  var `xlink:href`: js.UndefOr[String] = js.undefined
}

trait ImageAttrs extends SVGAttributes {
  var image: js.UndefOr[Image] = js.undefined
}

trait WireArgs extends dia.LinkAttributes {
  var router: js.UndefOr[js.Object] = js.undefined
  var connector: js.UndefOr[js.Object] = js.undefined
}

class Gate(override val attributes: GenericAttributes[IOAttrs]) extends basic.Generic(attributes)

class IO(override val attributes: GenericAttributes[IOAttrs]) extends Gate(attributes)

class Input(override val attributes: GenericAttributes[IOAttrs]) extends IO(attributes)

class Output(override val attributes: GenericAttributes[IOAttrs]) extends IO(attributes)

class Gate11(override val attributes: GenericAttributes[IOAttrs]) extends Gate(attributes)

class Gate21(override val attributes: GenericAttributes[IOAttrs]) extends Gate(attributes)

/*class Repeater(override val attributes: GenericAttributes[ImageAttrs]) extends Gate11(attributes)

class Note(override val attributes: GenericAttributes[ImageAttrs]) extends Gate11(attributes)

class Or(override val attributes: GenericAttributes[ImageAttrs]) extends Gate21(attributes)

class And(override val attributes: GenericAttributes[ImageAttrs]) extends Gate21(attributes)

class Nor(override val attributes: GenericAttributes[ImageAttrs]) extends Gate21(attributes)

class Nand(override val attributes: GenericAttributes[ImageAttrs]) extends Gate21(attributes)

class Xor(override val attributes: GenericAttributes[ImageAttrs]) extends Gate21(attributes)

class Xnor(override val attributes: GenericAttributes[ImageAttrs]) extends Gate21(attributes)*/

class Wire(override val attributes: WireArgs) extends dia.Link(attributes)

