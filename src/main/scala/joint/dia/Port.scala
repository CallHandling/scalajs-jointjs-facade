package joint.dia


import joint.shapes.basic.ShapeAttrs

import scala.scalajs.js

trait PortOptions extends js.Object {
  val groups: js.UndefOr[GroupOptions] = js.undefined
  val items: js.UndefOr[js.Array[PortItem]] = js.undefined
}

object PortOptions {
  def apply(groups: js.UndefOr[GroupOptions] = js.undefined): PortOptions = {
    val result = js.Dynamic.literal()
    groups.foreach(result.groups = _)
    result.asInstanceOf[PortOptions]
  }
}

trait PortItem extends js.Object {
  val group: String
  val attrs: ShapeAttrs
  val id: String
}

object PortItem {
  def apply(group0: String, id0: js.UndefOr[String], attrs0: ShapeAttrs): PortItem = new PortItem {
    override val attrs: ShapeAttrs = attrs0
    override val id: String = id0.getOrElse(joint.jointJs.util.uuid())
    override val group: String = group0
  }

  def createOutPort(id0: js.UndefOr[String], attrs0: ShapeAttrs): PortItem = new PortItem {
    override val attrs: ShapeAttrs = attrs0
    override val id: String = id0.getOrElse(joint.jointJs.util.uuid())
    override val group: String = "out"
  }

  def createOutPort(id0: js.UndefOr[String], name: String): PortItem = new PortItem {
    override val attrs: ShapeAttrs = ShapeAttrs.text(ShapeAttrs.text(name))._result
    override val id: String = id0.getOrElse(joint.jointJs.util.uuid())
    override val group: String = "out"
  }

  def createInPort(id0: js.UndefOr[String], attrs0: ShapeAttrs): PortItem = new PortItem {
    override val attrs: ShapeAttrs = attrs0
    override val id: String = id0.getOrElse(joint.jointJs.util.uuid())
    override val group: String = "in"
  }

  def createInPort(id0: js.UndefOr[String], name: String): PortItem = new PortItem {
    override val attrs: ShapeAttrs = ShapeAttrs.text(ShapeAttrs.text(name))._result
    override val id: String = id0.getOrElse(joint.jointJs.util.uuid())
    override val group: String = "in"
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