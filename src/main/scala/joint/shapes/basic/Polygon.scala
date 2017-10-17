package joint.shapes.basic

import joint.dia
import joint.dia.TextAttrsSetters
import joint.shapes.GenericAttributes
import org.querki.jsext.{JSOptionBuilder, OptMap, noOpts}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("joint.shapes.basic.Polygon")
class Polygon(override val attributes: GenericAttributes[PolygonAttrs]) extends Generic(attributes)

trait PolygonAttrs extends dia.TextAttrs {
  val polygon: js.UndefOr[ShapeAttrs] = js.undefined
}

object PolygonAttrs extends PolygonAttrsBuilder(noOpts)

class PolygonAttrsBuilder(val dict: OptMap)
  extends JSOptionBuilder[PolygonAttrs, PolygonAttrsBuilder](new PolygonAttrsBuilder(_))
    with TextAttrsSetters[PolygonAttrs, PolygonAttrsBuilder] {

  def ellipse(v: ShapeAttrs): PolygonAttrsBuilder = jsOpt("ellipse", v)
}