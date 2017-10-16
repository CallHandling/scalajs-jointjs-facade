package joint.dia


import joint.shapes.ShapeAttrs

import scala.scalajs.js

trait PortOptions extends js.Object {
  val groups: js.UndefOr[GroupOptions] = js.undefined
}

object PortOptions {
  def apply(groups: js.UndefOr[GroupOptions] = js.undefined): PortOptions = {
    val result = js.Dynamic.literal()
    groups.foreach(result.groups = _)
    result.asInstanceOf[PortOptions]
  }
}

trait GroupOptions extends js.Object {
  val in: js.UndefOr[PortAttributes] = js.undefined
  val out: js.UndefOr[PortAttributes] = js.undefined
}

object GroupOptions {
  def apply(in: js.UndefOr[PortAttributes] = js.undefined,
            out: js.UndefOr[PortAttributes] = js.undefined): GroupOptions = {
    val result = js.Dynamic.literal()
    in.foreach(result.in = _)
    out.foreach(result.out = _)
    result.asInstanceOf[GroupOptions]
  }
}

trait PortAttributes extends js.Object {
  val attrs: js.UndefOr[ShapeAttrs] = js.undefined
}

object PortAttributes {
  def apply(attrs: js.UndefOr[ShapeAttrs] = js.undefined): PortAttributes = {
    val result = js.Dynamic.literal()
    attrs.foreach(result.attrs = _)
    result.asInstanceOf[PortAttributes]
  }
}