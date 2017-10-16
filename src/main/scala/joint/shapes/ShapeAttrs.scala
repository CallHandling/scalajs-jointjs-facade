package joint.shapes

import joint.dia.CSSSelector
import _root_.org.querki.jsext.JSOptionSetter
import _root_.org.querki.jsext.JSOptionBuilder
import _root_.org.querki.jsext._

import scala.scalajs.js
import scala.scalajs.js.|

trait ShapeAttrs extends CSSSelector {
  val cursor: js.UndefOr[String] = js.undefined
  val `ref-dx`: js.UndefOr[Int | Double] = js.undefined
  val `ref-dy`: js.UndefOr[Int | Double] = js.undefined
  val d: js.UndefOr[String] = js.undefined
  val text: js.UndefOr[String] = js.undefined
  val fill: js.UndefOr[String] = js.undefined
  val magnet: js.UndefOr[String] = js.undefined
  val stroke: js.UndefOr[String] = js.undefined
  val r: js.UndefOr[String | Int] = js.undefined
  val rx: js.UndefOr[String | Int] = js.undefined
  val ry: js.UndefOr[String | Int] = js.undefined
  val cx: js.UndefOr[String | Int] = js.undefined
  val cy: js.UndefOr[String | Int] = js.undefined
  val height: js.UndefOr[String | Int] = js.undefined
  val width: js.UndefOr[String | Int] = js.undefined
  val transform: js.UndefOr[String] = js.undefined
  val points: js.UndefOr[String] = js.undefined
  val `stroke-width`: js.UndefOr[String | Int] = js.undefined
  val `ref-x`: js.UndefOr[String | Int] = js.undefined
  val `ref-y`: js.UndefOr[String | Int] = js.undefined
  val ref: js.UndefOr[String] = js.undefined
}

object ShapeAttrs extends ShapeAttrsBuilder(noOpts)

class ShapeAttrsBuilder(val dict: OptMap)
  extends JSOptionBuilder[ShapeAttrs, ShapeAttrsBuilder](new ShapeAttrsBuilder(_))
    with ShapeAttrsSetters[ShapeAttrs, ShapeAttrsBuilder]

trait ShapeAttrsSetters[T <: js.Object, B <: JSOptionBuilder[T, _]]
  extends JSOptionSetter[T, B] {

  def cursor(v: String): B = jsOpt("cursor", v)

  def `ref-dx`(v: Int | Double): B = jsOpt("ref-dx", v)

  def `ref-dy`(v: Int | Double): B = jsOpt("ref-dy", v)

  def d(v: String): B = jsOpt("d", v)

  def text(v: String): B = jsOpt("text", v)

  def set(key: String, v: ShapeAttrs): B = jsOpt(key, v)

  def fill(v: String): B = jsOpt("fill", v)

  def stroke(v: String): B = jsOpt("stroke", v)

  def r(v: String | Int): B = jsOpt("r", v)

  def rx(v: String | Int): B = jsOpt("rx", v)

  def ry(v: String | Int): B = jsOpt("ry", v)

  def cx(v: String | Int): B = jsOpt("cx", v)

  def cy(v: String | Int): B = jsOpt("cy", v)

  def height(v: String | Int): B = jsOpt("height", v)

  def width(v: String | Int): B = jsOpt("width", v)

  def transform(v: String): B = jsOpt("transform", v)

  def points(v: String): B = jsOpt("points", v)

  def `stroke-width`(v: String | Int): B = jsOpt("stroke-width", v)

  def `ref-x`(v: String | Int): B = jsOpt("ref-x", v)

  def `ref-y`(v: String | Int): B = jsOpt("ref-y", v)

  def ref(v: String): B = jsOpt("ref", v)

  def magnet(v: String): B = jsOpt("magnet", v)
}