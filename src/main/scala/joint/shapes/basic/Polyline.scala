package joint.shapes.basic

import joint.dia
import joint.shapes.{GenericAttributes, ShapeAttrs}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("joint.shapes.basic.Polyline")
class Polyline(override val attributes: GenericAttributes[PolylineAttrs]) extends Generic(attributes)
trait PolylineAttrs extends dia.TextAttrs {
  var polyline: js.UndefOr[ShapeAttrs]
}