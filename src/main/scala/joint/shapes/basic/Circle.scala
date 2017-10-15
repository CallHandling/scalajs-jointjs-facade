package joint.shapes.basic

import joint.dia
import joint.shapes.{GenericAttributes, ShapeAttrs}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("joint.shapes.basic.Circle")
class Circle(override val attributes: GenericAttributes[CircleAttrs]) extends Generic(attributes)

trait CircleAttrs extends dia.TextAttrs {
  var circle: js.UndefOr[ShapeAttrs] = js.undefined
}