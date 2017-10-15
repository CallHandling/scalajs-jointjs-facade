package joint.shapes.basic

import joint.dia
import joint.shapes.{GenericAttributes, ShapeAttrs}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("joint.shapes.basic.Rect")
class Rect(override val attributes: GenericAttributes[RectAttrs]) extends Generic(attributes)

trait RectAttrs extends dia.TextAttrs {
  var rect: js.UndefOr[ShapeAttrs] = js.undefined
}
