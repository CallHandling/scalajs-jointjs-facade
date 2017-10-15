package joint.dia

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

  //def startArrowheadMove(end: 'source' | 'target', options?: any): Unit

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
  var source: js.UndefOr[Point | LinkConnector] = js.undefined //| { id: string, selector?: string, port?: string };
  var target: js.UndefOr[Point | LinkConnector] = js.undefined //| { id: string, selector?: string, port?: string };
  var labels: js.UndefOr[js.Array[Label]] = js.undefined
  var vertices: js.UndefOr[js.Array[Point]] = js.undefined
  var smooth: js.UndefOr[Boolean] = js.undefined
  var attrs: js.UndefOr[TextAttrs] = js.undefined
  var z: js.UndefOr[Int] = js.undefined
}