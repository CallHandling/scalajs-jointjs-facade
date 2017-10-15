package joint.dia

import joint.shapes.ShapeAttrs

import scala.scalajs.js

trait PortOptions extends js.Object {
  var groups: js.UndefOr[GroupOptions] = js.undefined
}

trait GroupOptions extends js.Object {
  var in: js.UndefOr[PortAttributes] = js.undefined
  var out: js.UndefOr[PortAttributes] = js.undefined
}

trait PortAttributes extends js.Object{
  var attrs: js.UndefOr[ShapeAttrs] = js.undefined
}