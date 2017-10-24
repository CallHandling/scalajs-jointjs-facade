package joint.shapes.basic

import joint.dia
import joint.dia.TextAttrsSetters
import joint.shapes.{GenericAttributes, GenericAttributesBuilder}
import org.querki.jsext.{JSOptionBuilder, OptMap, noOpts}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("joint.shapes.basic.Rhombus")
class Rhombus(override val attributes: GenericAttributes[RhombusAttrs]) extends Generic(attributes)

trait RhombusAttrs extends dia.TextAttrs {
  val path: js.UndefOr[ShapeAttrs] = js.undefined
}

object RhombusAttrs extends RhombusAttrsBuilder(noOpts)

class RhombusAttrsBuilder(val dict: OptMap)
  extends JSOptionBuilder[RhombusAttrs, RhombusAttrsBuilder](new RhombusAttrsBuilder(_))
    with TextAttrsSetters[RhombusAttrs, RhombusAttrsBuilder] {

  def path(v: ShapeAttrs): RhombusAttrsBuilder = jsOpt("path", v)
}

object GenericRhombusAttrs extends GenericAttributesBuilder[RhombusAttrs](noOpts)