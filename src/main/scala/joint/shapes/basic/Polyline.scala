package joint.shapes.basic

import joint.dia
import joint.dia.TextAttrsSetters
import joint.shapes.GenericAttributes
import org.querki.jsext.{JSOptionBuilder, OptMap, noOpts}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("joint.shapes.basic.Polyline")
class Polyline(override val attributes: GenericAttributes[PolylineAttrs]) extends Generic(attributes)

trait PolylineAttrs extends dia.TextAttrs {
  val polyline: js.UndefOr[ShapeAttrs] = js.undefined
}

object PolylineAttrs extends PolylineAttrsBuilder(noOpts)

class PolylineAttrsBuilder(val dict: OptMap)
  extends JSOptionBuilder[PolylineAttrs, PolylineAttrsBuilder](new PolylineAttrsBuilder(_))
    with TextAttrsSetters[PolylineAttrs, PolylineAttrsBuilder] {

  def ellipse(v: ShapeAttrs): PolylineAttrsBuilder = jsOpt("ellipse", v)
}