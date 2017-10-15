package joint.shapes.erd

import joint.dia
import joint.shapes.{GenericAttributes, ShapeAttrs}

import scala.scalajs.js

class ISA(override val attributes: GenericAttributes[AttributeAttrs]) extends dia.Element(attributes)

trait ISAAttrs extends dia.Element {
  var polygon: js.UndefOr[ShapeAttrs] = js.undefined
}