package joint.shapes.org

import joint.dia
import joint.shapes.{GenericAttributes, ShapeAttrs}

import scala.scalajs.js

trait MemberAttrs extends js.Object{
  var rect: js.UndefOr[ShapeAttrs] = js.undefined
  var image: js.UndefOr[ShapeAttrs] = js.undefined
}

class Member(override val attributes: GenericAttributes[MemberAttrs]) extends dia.Element(attributes)

class Arrow(override val attributes: dia.LinkAttributes) extends dia.Link(attributes)

