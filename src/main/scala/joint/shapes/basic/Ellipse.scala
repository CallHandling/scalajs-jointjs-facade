package joint.shapes.basic

import joint.dia
import joint.shapes.{GenericAttributes, ShapeAttrs}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("joint.shapes.basic.Ellipse")
class Ellipse(override val attributes: GenericAttributes[EllipseAttrs]) extends Generic(attributes)

trait EllipseAttrs extends dia.TextAttrs {
  var ellipse: js.UndefOr[ShapeAttrs] = js.undefined
}