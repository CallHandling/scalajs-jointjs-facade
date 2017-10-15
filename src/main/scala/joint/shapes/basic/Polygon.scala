package joint.shapes.basic

import joint.dia
import joint.shapes.{GenericAttributes, ShapeAttrs}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("joint.shapes.basic.Polygon")
class Polygon(override val attributes: GenericAttributes[PolygonAttrs]) extends Generic(attributes)

trait PolygonAttrs extends dia.TextAttrs {
  var polygon: js.UndefOr[ShapeAttrs] = js.undefined
}