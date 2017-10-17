package joint.shapes.basic

import joint.dia
import joint.dia.TextAttrsSetters
import joint.shapes.GenericAttributes
import org.querki.jsext.{JSOptionBuilder, OptMap, noOpts}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("joint.shapes.basic.Path")
class Path(override val attributes: GenericAttributes[PathAttrs]) extends Generic(attributes)

trait PathAttrs extends dia.TextAttrs {
  val path: js.UndefOr[ShapeAttrs] = js.undefined
}

object PathAttrs extends PathAttrsBuilder(noOpts)

class PathAttrsBuilder(val dict: OptMap)
  extends JSOptionBuilder[PathAttrs, PathAttrsBuilder](new PathAttrsBuilder(_))
    with TextAttrsSetters[PathAttrs, PathAttrsBuilder] {

  def ellipse(v: ShapeAttrs): PathAttrsBuilder = jsOpt("ellipse", v)
}