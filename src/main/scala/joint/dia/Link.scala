package joint.dia

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("joint.dia.Link")
class Link(attributes: LinkAttributes) extends Cell(attributes) {
  val port: String = js.native

  def markup: String = js.native

  def labelMarkup: String = js.native

  def toolMakup: String = js.native

  def vertexMarkup: String = js.native

  def arrowHeadMarkup: String = js.native

  //constructor(attributes?: LinkAttributes, options?: Object);

  def disconnect(): ElementView = js.native

  def label(index: js.UndefOr[Int] = js.undefined): js.Any = js.native

  def label(index: Int, value: Label): LinkView = js.native

  def reparent(options: js.UndefOr[js.Any] = js.undefined): Element = js.native

  //override def findView(paper: Paper): LinkView = js.native

  def getSourceElement(): Element = js.native

  def getTargetElement(): Element = js.native

  //def hasLoop(options?: { deep?: boolean }): boolean;

  //def applyToPoints(fn: Function, options?: any): this;

  def getRelationshipAncestor(): Element = js.native

  override def isLink(): Boolean = js.native

  def isRelationshipEmbeddedIn(element: Element): Boolean = js.native

  def scale(sx: Int, sy: Int, origin: Point,
            optionts: js.UndefOr[js.Any] = js.undefined): LinkView = js.native

  def translate(tx: Int, ty: Int,
                options: js.UndefOr[js.Any] = js.undefined): LinkView = js.native
}