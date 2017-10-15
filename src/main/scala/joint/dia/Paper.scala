package joint.dia

import org.scalajs.dom
import org.scalajs.dom.Event
import org.scalajs.dom.raw.{HTMLElement, SVGDefsElement, SVGElement, SVGGElement}
import org.scalajs.jquery._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

trait PaperOptions extends js.Object {
  type VCFunction = js.Function6[CellView, SVGElement, CellView, SVGElement, String, LinkView, Boolean]
  var el: js.UndefOr[String | JQuery | HTMLElement] = js.undefined
  var width: js.UndefOr[Int] = js.undefined
  var height: js.UndefOr[Int] = js.undefined
  var gridSize: js.UndefOr[Int] = js.undefined
  var model: js.UndefOr[Graph] = js.undefined
  var markAvailable: js.UndefOr[Boolean] = js.undefined
  var defaultLink: js.UndefOr[Link | js.Function2[CellView, SVGElement, Link]] = js.undefined
  var linkPinning: js.UndefOr[Boolean] = js.undefined
  var validateConnection: js.UndefOr[VCFunction] = js.undefined
  var elementView: js.UndefOr[ElementView | js.Function1[Element, ElementView]] = js.undefined
  var validateMagnet: js.UndefOr[js.Function2[CellView, SVGElement, Boolean]] = js.undefined
  var origin: js.UndefOr[Point] = js.undefined
  var perpendicularLinks: js.UndefOr[Boolean] = js.undefined
  var linkView: js.UndefOr[js.Function1[Link, LinkView] | LinkView] = js.undefined
  /*defaultRouter ?:
    ((vertices: Point[], args: Object, linkView: LinkView) => Point[])
  | {
    name: string
    , args ?: ManhattanRouterArgs
  };
  defaultConnector ?:
    ((sourcePoint: Point, targetPoint: Point, vertices: Point[], args: Object, linkView: LinkView) => string)
  | {
    name: string
    , args ?: {
      radius ?: number
    }
  };*/
  var interactive: js.UndefOr[js.Function2[CellView, String, Boolean] | Boolean] = js.undefined
  /*interactive?:
    ((cellView: CellView, event: string) => boolean)
  | boolean
    | { vertexAdd?: boolean, vertexMove?: boolean, vertexRemove?: boolean, arrowheadMove?: boolean };*/
  var linkConnectionPoint: js.UndefOr[js.Function4[LinkView, ElementView, SVGElement, Point, Point]] = js.undefined
  var snapLinks: js.UndefOr[Boolean /*| { radius: number }*/ ] = js.undefined
  var async: js.UndefOr[Boolean /*| { batchZise: number }*/ ] = js.undefined
  var embeddingMode: js.UndefOr[Boolean] = js.undefined
  var validateEmbedding: js.UndefOr[js.Function2[ElementView, ElementView, Boolean]] = js.undefined
  var restrictTranslate: js.UndefOr[js.Function1[ElementView, BBox] | Boolean] = js.undefined
  var guard: js.UndefOr[js.Function2[Event, CellView, Boolean]] = js.undefined
  var multiLinks: js.UndefOr[Boolean] = js.undefined
  var cellViewNamespace: js.UndefOr[js.Object] = js.undefined
  var clickThreshold: js.UndefOr[Int] = js.undefined
  var highlighting: js.UndefOr[js.Any] = js.undefined
}


@js.native
@JSGlobal("joint.dia.Paper")
class Paper(props: PaperOptions) extends js.Object {
  def options: PaperOptions = js.native

  def svg: SVGElement = js.native

  def viewport: SVGGElement = js.native

  def defs: SVGDefsElement = js.native

  def setDimensions(width: Int, height: Int): Unit = js.native

  def setOrigin(x: Int, y: Int): Unit = js.native

  def scale(sx: Int, sy: js.UndefOr[Int], ox: js.UndefOr[Int], oy: js.UndefOr[Int]): Paper = js.native

  def findView(element: js.Any): CellView = js.native

  def findViewByModel(model: Cell | String): CellView = js.native

  def findViewsFromPoint(point: Point): js.Array[ElementView] = js.native

  //def findViewsInArea(rect: BBox, options?: { strict?: boolean }): CellView[];

  def fitToContent(options: FitToContentOptions): Unit = js.native

  def scaleContentToFit(options: js.UndefOr[ScaleContentOptions] = js.undefined): Unit = js.native

  def getContentBBox(): BBox = js.native

  def clientToLocalPoint(p: Point): Point = js.native

  def rotate(deg: Int,
             ox: js.UndefOr[Int] = js.undefined,
             oy: js.UndefOr[Int] = js.undefined): Paper = js.native // @todo not released yet though it's in the source code already

  def afterRenderViews(): Unit = js.native

  def asyncRenderViews(cells: js.Array[Cell], options: js.UndefOr[js.Any] = js.undefined): Unit = js.native

  def beforeRenderViews(cells: js.Array[Cell]): js.Array[Cell] = js.native


  def clearGrid(): Paper = js.native

  def contextmenu(evt: Event): Unit = js.native

  def createViewForModel(cell: Cell): CellView = js.native

  def drawGrid(options: js.UndefOr[String] = js.undefined): Paper = js.native

  def fitToContent(gridWidth: js.UndefOr[Int] = js.undefined,
                   gridHeight: js.UndefOr[Int] = js.undefined,
                   padding: js.UndefOr[Int] = js.undefined,
                   options: js.UndefOr[js.Any] = js.undefined): Unit = js.native

  def getArea(): BBox = js.native

  def getDefaultLink(cellView: CellView, magnet: HTMLElement): Link = js.native

  def getModelById(id: String): Cell = js.native

  def getRestrictedArea(): BBox = js.native

  def guard(evt: Event, view: CellView): Boolean = js.native

  def linkAllowed(linkViewOrModel: LinkView | Link): Boolean = js.native

  def remove(): Paper = js.native

  def removeView(cell: Cell): CellView = js.native

  def removeViews(): Unit = js.native

  def renderView(cell: Cell): CellView = js.native

  def resetViews(cellsCollection: js.Array[Cell], options: js.Any): Unit = js.native

  def resolveHighlighter(options: js.UndefOr[js.Any] = js.undefined): Boolean | js.Object = js.native

  def setGridSize(gridSize: Int): Paper = js.native

  def setInteractivity(value: js.Any): Unit = js.native

  def snapToGrid(p: Point): Point = js.native

  def sortViews(): Unit = js.native

  def on(evenName: String, fun: js.Function4[CellView, dom.Event, Int, Int, _]): js.Any = js.native
}
