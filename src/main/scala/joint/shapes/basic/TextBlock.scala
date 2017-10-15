package joint.shapes.basic

import joint.dia
import joint.shapes.{GenericAttributes, ShapeAttrs}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal


@js.native
@JSGlobal("joint.shapes.basic.TextBlock")
class TextBlock(override val attributes: GenericAttributes[dia.TextAttrs]) extends Generic(attributes)

trait TextBlockAttrs extends dia.TextAttrs {
  var rect: js.UndefOr[ShapeAttrs] = js.undefined
}
