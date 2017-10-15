package joint

import joint.dia._
import org.scalajs.dom.raw.SVGElement
import org.scalajs.jquery.JQuery

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait util extends js.Object {
  def template(html: String): js.Function0[String] = js.native

  /*namespace format {
    export function number(specifier: string, value: number): string;
  }*/

  def uuid(): String = js.native

  def guid(obj: js.UndefOr[js.Object] = js.undefined): String = js.native

  def nextFrame(callback: js.Function0[Unit], context: js.UndefOr[js.Object] = js.undefined): Int = js.native

  def cancelFrame(requestId: Int): Unit = js.native

  def flattenObject(`object`: js.Object, delim: String, stop: js.Function1[js.Any, Boolean]): js.Any = js.native

  def getByPath(`object`: js.Object, path: String, delim: String): js.Any = js.native

  def setByPath(`object`: js.Object, path: String, value: Object, delim: String): js.Any = js.native

  def unsetByPath(`object`: Object, path: String, delim: String): js.Any = js.native

  def breakText(text: String, size: Size, attrs: js.UndefOr[SVGAttributes] = js.undefined /*,
                options?: { svgDocument?: SVGElement }*/): String = js.native

  //def normalizeSides(box: Int | { x?: number, y?: number, height?: number, width?: number }): dia.BBox;

  def getElementBBox(el: Element): BBox = js.native

  def setAttributesBySelector(el: Element, attrs: SVGAttributes): Unit = js.native


  def sortElements(elements:
                   js.Array[Element] | String | JQuery,
                   comparator: js.Function2[Element, Element, Int]): js.Array[Element] = js.native

  def shapePerimeterConnectionPoint(linkView: dia.LinkView,
                                    view: dia.ElementView,
                                    magnet: SVGElement,
                                    ref: Point): Point = js.native

  def imageToDataUri(url: String, callback: js.Function2[Error, String, Unit]): Unit = js.native
}
