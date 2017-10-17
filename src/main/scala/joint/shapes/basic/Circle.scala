package joint.shapes.basic

import joint.dia
import joint.dia.TextAttrsSetters
import joint.shapes.GenericAttributes
import org.querki.jsext.{JSOptionBuilder, OptMap, noOpts}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("joint.shapes.basic.Circle")
class Circle(override val attributes: GenericAttributes[CircleAttrs]) extends Generic(attributes)

trait CircleAttrs extends dia.TextAttrs {
  val circle: js.UndefOr[ShapeAttrs] = js.undefined
}

object CircleAttrs extends CircleAttrsBuilder(noOpts)

class CircleAttrsBuilder(val dict: OptMap)
  extends JSOptionBuilder[CircleAttrs, CircleAttrsBuilder](new CircleAttrsBuilder(_))
    with TextAttrsSetters[CircleAttrs, CircleAttrsBuilder] {

  def circle(v: ShapeAttrs): CircleAttrsBuilder = jsOpt("circle", v)
}