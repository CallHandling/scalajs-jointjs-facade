package joint.dia

import joint.{V, dia}
import org.scalajs.dom.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.jquery.JQuery

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

@js.native
@JSGlobal("joint.dia.CellViewGeneric")
class CellViewGeneric[T <: Cell, C <: CellViewGeneric[T, _]] extends js.Object {
  def id: String = js.native

  def model: T = js.native

  def vel: V = js.native

  def get(`type`: String): String = js.native

  ///def getBBox(options?: { useModelGeometry?: boolean }): BBox;

  def highlight(el: js.UndefOr[js.Any] = js.undefined,
                options: js.UndefOr[js.Any] = js.undefined): C = js.native

  def unhighlight(el: js.UndefOr[js.Any] = js.undefined,
                  options: js.UndefOr[js.Any] = js.undefined): C = js.native

  def applyFilter(selector: String | HTMLElement, filter: js.Object): Unit = js.native

  //def applyGradient(selector: String | HTMLElement, attr: 'fill' | 'stroke', gradient: GradientOptions): void;

  def can(feature: String): Boolean = js.native

  def findBySelector(selector: String): JQuery = js.native

  def findMagnet(el: js.Any): HTMLElement = js.native

  def getSelector(el: HTMLElement, prevSelector: String): String = js.native

  def getStrokeBBox(el: js.Any): dia.BBox = js.native // string|HTMLElement|Vectorizer
  def mouseout(evt: Event): Unit = js.native

  def mouseover(evt: Event): Unit = js.native

  def mousewheel(evt: Event, x: Int, y: Int, delta: Int): Unit = js.native

  def notify(eventName: String): Unit = js.native

  //def onChangeAttrs(cell: Cell, attrs: Backbone.ViewOptions<T>, options?: any): this;

  def onSetTheme(oldTheme: String, newTheme: String): Unit = js.native

  def pointerclick(evt: Event, x: Int, y: Int): Unit = js.native

  def pointerdblclick(evt: Event, x: Int, y: Int): Unit = js.native

  def pointerdown(evt: Event, x: Int, y: Int): Unit = js.native

  def pointermove(evt: Event, x: Int, y: Int): Unit = js.native

  def pointerup(evt: Event, x: Int, y: Int): Unit = js.native

  def remove(): C = js.native

  def setInteractivity(value: js.Any): Unit = js.native

  def setTheme(theme: String, options: js.UndefOr[js.Any] = js.undefined): C = js.native
}

@js.native
@JSGlobal("joint.dia.CellView")
class CellView extends CellViewGeneric[Cell, CellView]
