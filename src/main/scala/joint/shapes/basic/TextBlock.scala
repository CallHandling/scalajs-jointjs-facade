package joint.shapes.basic

import joint.dia
import joint.dia.TextAttrsSetters
import joint.shapes.GenericAttributes
import org.querki.jsext.{JSOptionBuilder, OptMap, noOpts}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal


@js.native
@JSGlobal("joint.shapes.basic.TextBlock")
class TextBlock(override val attributes: GenericAttributes[dia.TextAttrs]) extends Generic(attributes)

trait TextBlockAttrs extends dia.TextAttrs {
  val rect: js.UndefOr[ShapeAttrs] = js.undefined
}

object TextBlockAttrs extends TextBlockAttrsBuilder(noOpts)

class TextBlockAttrsBuilder(val dict: OptMap)
  extends JSOptionBuilder[TextBlockAttrs, TextBlockAttrsBuilder](new TextBlockAttrsBuilder(_))
    with TextAttrsSetters[TextBlockAttrs, TextBlockAttrsBuilder] {

  def rect(v: ShapeAttrs): TextBlockAttrsBuilder = jsOpt("rect", v)
}