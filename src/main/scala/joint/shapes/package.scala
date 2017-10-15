package joint

import joint.dia.{CSSSelector, CellAttributes, Point, Size}

import scala.scalajs.js
import scala.scalajs.js.|

package object shapes {

  trait GenericAttributes[+T] extends CellAttributes {
    var position: js.UndefOr[Point] = js.undefined
    var size: js.UndefOr[Size] = js.undefined
    var angel: js.UndefOr[Int] = js.undefined
    var id: js.UndefOr[String] = js.undefined
    val `type`: js.UndefOr[String] = js.undefined
    //var attrs: js.UndefOr[T] = js.undefined
  }

  trait ShapeAttrs extends CSSSelector {
    var fill: js.UndefOr[String] = js.undefined
    var stroke: js.UndefOr[String] = js.undefined
    var r: js.UndefOr[String | Int] = js.undefined
    var rx: js.UndefOr[String | Int] = js.undefined
    var ry: js.UndefOr[String | Int] = js.undefined
    var cx: js.UndefOr[String | Int] = js.undefined
    var cy: js.UndefOr[String | Int] = js.undefined
    var height: js.UndefOr[String | Int] = js.undefined
    var width: js.UndefOr[String | Int] = js.undefined
    var transform: js.UndefOr[String] = js.undefined
    var points: js.UndefOr[String] = js.undefined
    var `stroke-width`: js.UndefOr[String | Int] = js.undefined
    var `ref-x`: js.UndefOr[String | Int] = js.undefined
    var `ref-y`: js.UndefOr[String | Int] = js.undefined
    var ref: js.UndefOr[String] = js.undefined
  }

}
