package joint.shapes.basic

import joint.dia
import joint.dia.TextAttrsSetters
import joint.shapes.{GenericAttributes, GenericAttributesBuilder}
import org.querki.jsext.{JSOptionBuilder, OptMap, noOpts}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("joint.shapes.basic.Rect")
class Rect(override val attributes: GenericAttributes[RectAttrs]) extends Generic(attributes)

trait RectAttrs extends dia.TextAttrs {
  val rect: js.UndefOr[ShapeAttrs] = js.undefined
}

object RectAttrs extends RectAttrsBuilder(noOpts)

class RectAttrsBuilder(val dict: OptMap)
  extends JSOptionBuilder[RectAttrs, RectAttrsBuilder](new RectAttrsBuilder(_))
    with TextAttrsSetters[RectAttrs, RectAttrsBuilder] {

  def rect(v: ShapeAttrs): RectAttrsBuilder = jsOpt("rect", v)
}

object GenericRectAttrs extends GenericAttributesBuilder[RectAttrs](noOpts)