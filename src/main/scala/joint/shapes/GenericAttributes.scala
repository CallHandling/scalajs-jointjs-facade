package joint.shapes

import _root_.org.querki.jsext.{JSOptionBuilder, JSOptionSetter}
import joint.dia.{CellAttributes, Point, Size}

import scala.scalajs.js

trait GenericAttributes[+T <: js.Object] extends CellAttributes {
  val position: js.UndefOr[Point] = js.undefined
  val size: js.UndefOr[Size] = js.undefined
  val angel: js.UndefOr[Int] = js.undefined
  val id: js.UndefOr[String] = js.undefined
  val `type`: js.UndefOr[String] = js.undefined
  val attrs: js.UndefOr[T] = js.undefined
}

trait GenericAttributesSetters[T1 <: js.Object, T <: js.Object, B <: JSOptionBuilder[T, _]] extends JSOptionSetter[T, B] {
  def position(v: Point): B = jsOpt("position", v)

  def size(v: Size): B = jsOpt("size", v)

  def angel(v: Int): B = jsOpt("angel", v)

  def `type`(v: String): B = jsOpt("type", v)

  def attrs(v: T1): B = jsOpt("attrs", v)
}