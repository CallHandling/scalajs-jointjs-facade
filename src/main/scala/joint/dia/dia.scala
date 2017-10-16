package joint.dia

import scala.scalajs.js
import scala.scalajs.js.|

trait Size extends js.Object {
  var width: js.UndefOr[Int] = js.undefined
  var height: js.UndefOr[Int] = js.undefined
}

trait Point extends js.Object {
  var x: js.UndefOr[Int] = js.undefined
  var y: js.UndefOr[Int] = js.undefined
}

trait LinkConnector extends js.Object {
  val id: js.UndefOr[String] = js.undefined
  var selector: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[String] = js.undefined
}

trait BBox extends Size with Point

trait TranslateOptions extends js.Object {
  var restrictedArea: js.UndefOr[BBox] = js.undefined
  var transition: js.UndefOr[TransitionOptions] = js.undefined
}

trait TransitionOptions extends js.Object {
  var delay: js.UndefOr[Int] = js.undefined
  var duration: js.UndefOr[Int] = js.undefined
  var timingFunction: js.UndefOr[js.Function1[Int, Int]] = js.undefined
  var valueFunction: js.UndefOr[js.Function2[js.Any, js.Any, js.Function1[Int, js.Any]]] = js.undefined
}

trait DfsBfsOptions extends js.Object {
  var inbound: js.UndefOr[Boolean] = js.undefined
  var outbound: js.UndefOr[Boolean] = js.undefined
  var deep: js.UndefOr[Boolean] = js.undefined
}

trait GraphOptions extends DfsBfsOptions

trait ExploreOptions extends js.Object {
  var breadthFirst: js.UndefOr[Boolean] = js.undefined
  var deep: js.UndefOr[Boolean] = js.undefined
}

trait Padding extends js.Object {
  var top: js.UndefOr[Int] = js.undefined
  var right: js.UndefOr[Int] = js.undefined
  var bottom: js.UndefOr[Int] = js.undefined
  var left: js.UndefOr[Int] = js.undefined
}

trait CSSSelector extends js.Object {
  val key: js.UndefOr[Int | String | js.Object] = js.undefined
}

trait SVGAttributes extends js.Object {
  var selector: js.UndefOr[String | CSSSelector] = js.undefined
}

trait CellAttributes extends js.Object {
  val key: js.UndefOr[String | js.Object] = js.undefined
}

trait TextOptions extends js.Object {
  val key: js.UndefOr[String | Int] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

trait TextAttrs extends SVGAttributes {
  var text: js.UndefOr[TextOptions] = js.undefined
}

trait Label extends js.Object {
  var position: js.UndefOr[Int] = js.undefined
  var attrs: js.UndefOr[TextAttrs] = js.undefined
}

trait ScaleContentOptions extends js.Object {
  var padding: js.UndefOr[Int] = js.undefined
  var preserveAspectRatio: js.UndefOr[Boolean] = js.undefined
  var minScale: js.UndefOr[Int] = js.undefined
  var minScaleX: js.UndefOr[Int] = js.undefined
  var minScaleY: js.UndefOr[Int] = js.undefined
  var maxScale: js.UndefOr[Int] = js.undefined
  var maxScaleX: js.UndefOr[Int] = js.undefined
  var maxScaleY: js.UndefOr[Int] = js.undefined
  var scaleGrid: js.UndefOr[Int] = js.undefined
  var fittingBBox: js.UndefOr[Int] = js.undefined
}

trait FitToContentOptions extends js.Object {
  var gridWidth: js.UndefOr[Int] = js.undefined
  var gridHeight: js.UndefOr[Int] = js.undefined
  var padding: js.UndefOr[Padding] = js.undefined
  var allowNewOrigin: js.UndefOr[String] = js.undefined // 'negative' | 'positive' | 'any';
  var minWidth: js.UndefOr[Int] = js.undefined
  var minHeight: js.UndefOr[Int] = js.undefined
  var maxWidth: js.UndefOr[Int] = js.undefined
  var maxHeight: js.UndefOr[Int] = js.undefined
}

trait Deep extends js.Object {
  var deep: js.UndefOr[Boolean] = js.undefined
}

trait DisconnectLinks extends js.Object {
  var disconnectLinks: js.UndefOr[Boolean] = js.undefined
}