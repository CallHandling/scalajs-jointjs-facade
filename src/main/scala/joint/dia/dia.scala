package joint.dia

import org.querki.jsext.{JSOptionBuilder, JSOptionSetter, OptMap, noOpts}

import scala.scalajs.js
import scala.scalajs.js.|

trait Size extends js.Object {
  val width: js.UndefOr[Int] = js.undefined
  val height: js.UndefOr[Int] = js.undefined
}

object Size {
  def apply(width: js.UndefOr[Int] = js.undefined,
            height: js.UndefOr[Int]): Size = {
    val result = js.Dynamic.literal()
    width.foreach(result.width = _)
    height.foreach(result.height = _)
    result.asInstanceOf[Size]
  }
}

trait Point extends js.Object {
  val x: js.UndefOr[Int] = js.undefined
  val y: js.UndefOr[Int] = js.undefined
}

object Point {
  def apply(x: js.UndefOr[Int] = js.undefined,
            y: js.UndefOr[Int] = js.undefined): Point = {
    val result = js.Dynamic.literal()
    x.foreach(result.x = _)
    y.foreach(result.y = _)
    result.asInstanceOf[Point]
  }
}

trait LinkConnector extends js.Object {
  val id: js.UndefOr[String] = js.undefined
  val selector: js.UndefOr[String] = js.undefined
  val port: js.UndefOr[String] = js.undefined
}

object LinkConnector {
  def apply(selector: js.UndefOr[String],
            port: js.UndefOr[String] = js.undefined): LinkConnector = {
    val result = js.Dynamic.literal()
    selector.foreach(result.selector = _)
    port.foreach(result.port = _)
    result.asInstanceOf[LinkConnector]
  }
}

trait BBox extends Size with Point

trait TranslateOptions extends js.Object {
  val restrictedArea: js.UndefOr[BBox] = js.undefined
  val transition: js.UndefOr[TransitionOptions] = js.undefined
}

object TranslateOptions {
  def apply(restrictedArea: js.UndefOr[BBox] = js.undefined,
            transition: js.UndefOr[TransitionOptions] = js.undefined): TranslateOptions = {
    val result = js.Dynamic.literal()
    restrictedArea.foreach(result.selector = _)
    transition.foreach(result.transition = _)
    result.asInstanceOf[TranslateOptions]
  }
}

trait TransitionOptions extends js.Object {
  val delay: js.UndefOr[Int] = js.undefined
  val duration: js.UndefOr[Int] = js.undefined
  val timingFunction: js.UndefOr[js.Function1[Int, Int]] = js.undefined
  val valueFunction: js.UndefOr[js.Function2[js.Any, js.Any, js.Function1[Int, js.Any]]] = js.undefined
}

object TransitionOptions {
  def apply(delay: js.UndefOr[Int] = js.undefined,
            duration: js.UndefOr[Int] = js.undefined,
            timingFunction: js.UndefOr[js.Function1[Int, Int]] = js.undefined,
            valueFunction: js.UndefOr[js.Function2[js.Any, js.Any, js.Function1[Int, js.Any]]] = js.undefined): TransitionOptions = {
    val result = js.Dynamic.literal()
    delay.foreach(result.delay = _)
    duration.foreach(result.duration = _)
    timingFunction.foreach(result.timingFunction = _)
    valueFunction.foreach(result.valueFunction = _)
    result.asInstanceOf[TransitionOptions]
  }
}

trait DfsBfsOptions extends js.Object {
  val inbound: js.UndefOr[Boolean] = js.undefined
  val outbound: js.UndefOr[Boolean] = js.undefined
  val deep: js.UndefOr[Boolean] = js.undefined
}

object DfsBfsOptions {
  def apply(inbound: js.UndefOr[Boolean] = js.undefined,
            outbound: js.UndefOr[Boolean] = js.undefined,
            deep: js.UndefOr[Boolean] = js.undefined): DfsBfsOptions = {
    val result = js.Dynamic.literal()
    inbound.foreach(result.inbound = _)
    outbound.foreach(result.outbound = _)
    deep.foreach(result.deep = _)
    result.asInstanceOf[DfsBfsOptions]
  }
}

trait GraphOptions extends DfsBfsOptions

trait ExploreOptions extends js.Object {
  val breadthFirst: js.UndefOr[Boolean] = js.undefined
  val deep: js.UndefOr[Boolean] = js.undefined
}

object ExploreOptions {
  def apply(breadthFirst: js.UndefOr[Boolean] = js.undefined,
            deep: js.UndefOr[Boolean] = js.undefined): ExploreOptions = {
    val result = js.Dynamic.literal()
    breadthFirst.foreach(result.breadthFirst = _)
    deep.foreach(result.deep = _)
    result.asInstanceOf[ExploreOptions]
  }
}

trait Padding extends js.Object {
  val top: js.UndefOr[Int] = js.undefined
  val right: js.UndefOr[Int] = js.undefined
  val bottom: js.UndefOr[Int] = js.undefined
  val left: js.UndefOr[Int] = js.undefined
}

object Padding {
  def apply(top: js.UndefOr[Int] = js.undefined,
            right: js.UndefOr[Int] = js.undefined,
            bottom: js.UndefOr[Int] = js.undefined,
            left: js.UndefOr[Int] = js.undefined): Padding = {
    val result = js.Dynamic.literal()
    top.foreach(result.top = _)
    right.foreach(result.right = _)
    bottom.foreach(result.bottom = _)
    left.foreach(result.left = _)
    result.asInstanceOf[Padding]
  }
}

trait CSSSelector extends js.Object {
  val key: js.UndefOr[Int | String | js.Object] = js.undefined
}

trait SVGAttributes extends js.Object {
  val selector: js.UndefOr[String | CSSSelector] = js.undefined
}

object SVGAttributes extends SVGAttributesBuilder(noOpts)

class SVGAttributesBuilder(val dict: OptMap)
  extends JSOptionBuilder[SVGAttributes, SVGAttributesBuilder](new SVGAttributesBuilder(_))
    with SVGAttributesSetters[SVGAttributes, SVGAttributesBuilder]

trait SVGAttributesSetters[T <: js.Object, B <: JSOptionBuilder[T, _]] extends JSOptionSetter[T, B] {
  def set(key: String, v: T): B = jsOpt(key, v)
}

trait CellAttributes extends js.Object {
  val key: js.UndefOr[String | js.Object] = js.undefined
}

trait TextOptions extends js.Object {
  val key: js.UndefOr[String | Int] = js.undefined
  val text: js.UndefOr[String] = js.undefined
}

object TextOptions {
  def apply(text: js.UndefOr[String] = js.undefined): TextOptions = {
    val result = js.Dynamic.literal()
    text.foreach(result.text = _)
    result.asInstanceOf[TextOptions]
  }
}

trait TextAttrs extends SVGAttributes {
  val text: js.UndefOr[TextOptions] = js.undefined
}

object TextAttrs {
  def apply(text: js.UndefOr[TextOptions] = js.undefined,
            selector: js.UndefOr[String | CSSSelector] = js.undefined): TextAttrs = {
    val result = js.Dynamic.literal()
    text.foreach(result.text = _)
    selector.map(_.asInstanceOf[js.Any]).foreach(result.selector = _)
    result.asInstanceOf[TextAttrs]
  }
}

trait Label extends js.Object {
  val position: js.UndefOr[Int] = js.undefined
  val attrs: js.UndefOr[TextAttrs] = js.undefined
}

object Label {
  def apply(position: js.UndefOr[Int] = js.undefined,
            attrs: js.UndefOr[TextAttrs] = js.undefined): Label = {
    val result = js.Dynamic.literal()
    position.foreach(result.position = _)
    attrs.foreach(result.attrs = _)
    result.asInstanceOf[Label]
  }

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
  val deep: js.UndefOr[Boolean] = js.undefined
}

object Deep {
  def apply(deep: js.UndefOr[Boolean] = js.undefined): Deep = {
    val result = js.Dynamic.literal()
    deep.foreach(result.deep = _)
    result.asInstanceOf[Deep]
  }
}

trait DisconnectLinks extends js.Object {
  val disconnectLinks: js.UndefOr[Boolean] = js.undefined
}

object DisconnectLinks {
  def apply(disconnectLinks: js.UndefOr[Boolean] = js.undefined): DisconnectLinks = {
    val result = js.Dynamic.literal()
    disconnectLinks.foreach(result.disconnectLinks = _)
    result.asInstanceOf[DisconnectLinks]
  }
}