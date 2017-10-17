package joint.shapes.basic

import joint.dia
import joint.dia.TextAttrsSetters
import joint.shapes.GenericAttributes
import org.querki.jsext.{JSOptionBuilder, OptMap, noOpts}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("joint.shapes.basic.Ellipse")
class Ellipse(override val attributes: GenericAttributes[EllipseAttrs]) extends Generic(attributes)

trait EllipseAttrs extends dia.TextAttrs {
  val ellipse: js.UndefOr[ShapeAttrs] = js.undefined
}

object EllipseAttrs extends EllipseAttrsBuilder(noOpts)

class EllipseAttrsBuilder(val dict: OptMap)
  extends JSOptionBuilder[EllipseAttrs, EllipseAttrsBuilder](new EllipseAttrsBuilder(_))
    with TextAttrsSetters[EllipseAttrs, EllipseAttrsBuilder] {

  def ellipse(v: ShapeAttrs): EllipseAttrsBuilder = jsOpt("ellipse", v)
}