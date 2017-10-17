package joint.dia

import joint.shapes.basic.ShapeAttrs
import org.querki.jsext.{JSOptionBuilder, JSOptionSetter, OptMap, noOpts}
import org.scalajs.dom.raw.SVGElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

@js.native
@JSGlobal("joint.dia.LinkView")
class LinkView extends CellViewGeneric[Link, LinkView] {
  def getConnectionLength(): Int = js.native

  def sendToken(token: SVGElement, duration: Int,
                callback: js.UndefOr[js.Function0[Unit]] = js.undefined): Unit = js.native

  def addVertex(vertex: Point): Int = js.native

  def getPointAtLength(length: Int): Point = js.native // Marked as public api in source but not in the documents
  //def createWatcher(endType: { id: string }): Function;

  def findRoute(oldVertices: js.Array[Point]): js.Array[Point] = js.native

  /*def  getConnectionPoint(end: 'source' | 'target', selectorOrPoint: Element | Point,
  referenceSelectorOrPoint:   Element  | Point): Point;*/

  def getPathData(vertices: js.Array[Point]): js.Any = js.native

  def removeVertex(idx: Int): ElementView = js.native

  def render(): ElementView = js.native

  def renderArrowheadMarkers(): ElementView = js.native

  def renderLabels(): ElementView = js.native

  def renderTools(): ElementView = js.native

  def renderVertexMarkers(): ElementView = js.native


  def startListening(): Unit = js.native

  def update(model: js.Any, attributes: js.Any,
             options: js.UndefOr[js.Any] = js.undefined): ElementView = js.native

  def updateArrowheadMarkers(): ElementView = js.native

  def updateAttributes(): Unit = js.native

  def updateConnection(options: js.UndefOr[js.Any] = js.undefined): Unit = js.native

  def updateLabelPositions(): LinkView = js.native

  def updateToolsPosition(): LinkView = js.native
}

trait LinkAttributes extends CellAttributes {
  val source: js.UndefOr[Point | LinkConnector] = js.undefined
  val target: js.UndefOr[Point | LinkConnector] = js.undefined
  val labels: js.UndefOr[js.Array[Label]] = js.undefined
  val vertices: js.UndefOr[js.Array[Point]] = js.undefined
  val smooth: js.UndefOr[Boolean] = js.undefined
  val attrs: js.UndefOr[js.Dictionary[ShapeAttrs]] = js.undefined
  val z: js.UndefOr[Int] = js.undefined
}

object LinkAttributes extends LinkAttributesBuilder(noOpts)

class LinkAttributesBuilder(val dict: OptMap)
  extends JSOptionBuilder[LinkAttributes, LinkAttributesBuilder](new LinkAttributesBuilder(_))
    with LinkAttributesSetters[LinkAttributes, LinkAttributesBuilder]

trait LinkAttributesSetters[T <: js.Object, B <: JSOptionBuilder[T, _]] extends JSOptionSetter[T, B] {
  def source(v: Point | LinkConnector): B = jsOpt("source", v)

  def target(v: Point | LinkConnector): B = jsOpt("target", v)

  def labels(v: js.Array[Label]): B = jsOpt("labels", v)

  def vertices(v: js.Array[Point]): B = jsOpt("vertices", v)

  def smooth(v: Boolean): B = jsOpt("smooth", v)

  def attrs(v: js.Dictionary[ShapeAttrs]): B = jsOpt("attrs", v)

  def z(v: Int): B = jsOpt("z", v)
}