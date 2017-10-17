package joint.shapes.erd

import joint.dia
import joint.dia.TextAttrs
import joint.shapes.GenericAttributes
import joint.shapes.basic.ShapeAttrs

import scala.scalajs.js

class Attribute(override val attributes: GenericAttributes[AttributeAttrs]) extends dia.Element(attributes)

trait AttributeAttrs extends TextAttrs {
  var ellipse: js.UndefOr[ShapeAttrs] = js.undefined
}