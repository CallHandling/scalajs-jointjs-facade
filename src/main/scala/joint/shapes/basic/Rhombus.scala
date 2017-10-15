package joint.shapes.basic

import joint.dia
import joint.shapes.{GenericAttributes, ShapeAttrs}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("joint.shapes.basic.Rhombus")
class Rhombus(override val attributes: GenericAttributes[RhombusAttrs]) extends Generic(attributes)

trait RhombusAttrs extends dia.TextAttrs {
  var path: js.UndefOr[ShapeAttrs] = js.undefined
}