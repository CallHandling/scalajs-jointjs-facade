package joint.shapes.uml

import joint.dia
import joint.dia.SVGAttributes
import joint.shapes.basic.ShapeAttrs
import joint.shapes.{GenericAttributes, basic}

import scala.scalajs.js


trait ClassAttributes extends GenericAttributes[basic.RectAttrs] {
  var name: js.UndefOr[js.Array[String]] = js.undefined
  var attributes: js.UndefOr[js.Array[String]] = js.undefined
  var methods: js.UndefOr[js.Array[String]] = js.undefined
}

class Class(override val attributes: ClassAttributes) extends basic.Generic(attributes)

class ClassView extends dia.ElementView {
}

class Abstract(override val attributes: ClassAttributes) extends Class(attributes)

class AbstractView(val attributes: ClassAttributes) extends ClassView

class Interface(override val attributes: ClassAttributes) extends Class(attributes)

class InterfaceView(val attributes: ClassAttributes) extends ClassView

class Generalization(override val attributes: dia.LinkAttributes) extends dia.Link(attributes)

class Implementation(override val attributes: dia.LinkAttributes) extends dia.Link(attributes)

class Aggregation(override val attributes: dia.LinkAttributes) extends dia.Link(attributes)

class Composition(override val attributes: dia.LinkAttributes) extends dia.Link(attributes)

class Association(override val attributes: dia.LinkAttributes) extends dia.Link(attributes)

trait StateAttributes extends GenericAttributes[ShapeAttrs] {
  var events: js.UndefOr[js.Array[String]] = js.undefined
}

class State(override val attributes: GenericAttributes[basic.CircleAttrs]) extends basic.Generic(attributes)

class StartState(override val attributes: GenericAttributes[basic.CircleAttrs]) extends basic.Circle(attributes)

class EndState(override val attributes: GenericAttributes[SVGAttributes]) extends basic.Generic(attributes)

