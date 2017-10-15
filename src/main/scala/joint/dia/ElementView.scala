package joint.dia

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

@js.native
@JSGlobal("joint.dia.ElementView")
class ElementView extends CellViewGeneric[Element, ElementView] {
  def scale(sx: Int, sy: Int): Unit = js.native

  def finalizeEmbedding(options: js.UndefOr[js.Any] = js.undefined): Unit = js.native

  def getBBox(options: js.UndefOr[js.Any] = js.undefined): BBox = js.native

  def positionRelative(vel: js.Any, bbox: BBox, attributes: ElementViewAttributes,
                       nodesBySelector: js.UndefOr[js.Object] = js.undefined): Unit = js.native

  def prepareEmbedding(options: js.UndefOr[js.Any] = js.undefined): Unit = js.native

  def processEmbedding(options: js.UndefOr[js.Any] = js.undefined): Unit = js.native

  def render(): ElementView = js.native

  def renderMarkup(): Unit = js.native

  def resize(): Unit = js.native

  def rotate(): Unit = js.native

  /*def translate(model: Backbone.Model, changes: js.UndefOr[js.Any] = js.undefined,
                options: js.UndefOr[js.Any] = js.undefined): Unit*/

  //def update(cell: Cell, renderingOnlyAttrs: js.UndefOr[js.Object] = js.undefined): Unit
}

trait ElementViewAttributes {
  var style: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var html: js.UndefOr[String] = js.undefined
  var `ref-x`: js.UndefOr[String | Int] = js.undefined
  var `ref-y`: js.UndefOr[String | Int] = js.undefined
  var `ref-dx`: js.UndefOr[Int] = js.undefined
  var `ref-dy`: js.UndefOr[Int] = js.undefined
  var `ref-width`: js.UndefOr[String | Int] = js.undefined
  var `ref-height`: js.UndefOr[String | Int] = js.undefined
  var ref: js.UndefOr[String] = js.undefined
  var `x-alignment`: js.UndefOr[String | Int] = js.undefined //'middle' | 'right' | number;
  var `y-alignment`: js.UndefOr[String | Int] = js.undefined //'middle' | 'bottom' | number;
  var port: js.UndefOr[String] = js.undefined
}