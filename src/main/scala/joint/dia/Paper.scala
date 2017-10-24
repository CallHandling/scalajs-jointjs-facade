package joint.dia

import org.querki.jsext.{JSOptionBuilder, OptMap, noOpts}
import org.scalajs.dom
import org.scalajs.dom.Event
import org.scalajs.dom.raw.{HTMLElement, SVGDefsElement, SVGElement, SVGGElement}
import org.scalajs.jquery._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

trait PaperOptions extends js.Object {
  val el: js.UndefOr[String | JQuery | HTMLElement] = js.undefined
  val width: js.UndefOr[Int] = js.undefined
  val height: js.UndefOr[Int] = js.undefined
  val gridSize: js.UndefOr[Int] = js.undefined
  val drawGrid: js.UndefOr[Boolean] = js.undefined
  val model: js.UndefOr[Graph] = js.undefined
  val markAvailable: js.UndefOr[Boolean] = js.undefined
  val defaultLink: js.UndefOr[Link | js.Function2[CellView, SVGElement, Link]] = js.undefined
  val linkPinning: js.UndefOr[Boolean] = js.undefined
  val validateConnection: js.UndefOr[PaperOptions.VCFunction] = js.undefined
  val elementView: js.UndefOr[ElementView | js.Function1[Element, ElementView]] = js.undefined
  val validateMagnet: js.UndefOr[js.Function2[CellView, SVGElement, Boolean]] = js.undefined
  val origin: js.UndefOr[Point] = js.undefined
  val perpendicularLinks: js.UndefOr[Boolean] = js.undefined
  val linkView: js.UndefOr[js.Function1[Link, LinkView] | LinkView] = js.undefined
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
  val interactive: js.UndefOr[js.Function2[CellView, String, Boolean] | Boolean] = js.undefined
  /*interactive?:
    ((cellView: CellView, event: string) => boolean)
  | boolean
    | { vertexAdd?: boolean, vertexMove?: boolean, vertexRemove?: boolean, arrowheadMove?: boolean };*/
  val linkConnectionPoint: js.UndefOr[js.Function4[LinkView, ElementView, SVGElement, Point, Point]] = js.undefined
  val snapLinks: js.UndefOr[Boolean /*| { radius: number }*/ ] = js.undefined
  val async: js.UndefOr[Boolean /*| { batchZise: number }*/ ] = js.undefined
  val embeddingMode: js.UndefOr[Boolean] = js.undefined
  val validateEmbedding: js.UndefOr[js.Function2[ElementView, ElementView, Boolean]] = js.undefined
  val restrictTranslate: js.UndefOr[js.Function1[ElementView, BBox] | Boolean] = js.undefined
  val guard: js.UndefOr[js.Function2[Event, CellView, Boolean]] = js.undefined
  val multiLinks: js.UndefOr[Boolean] = js.undefined
  val cellViewNamespace: js.UndefOr[js.Object] = js.undefined
  val clickThreshold: js.UndefOr[Int] = js.undefined
  val highlighting: js.UndefOr[js.Any] = js.undefined
}

object PaperOptions extends PaperOptionsBuilder(noOpts) {
  type VCFunction = js.Function6[CellView, SVGElement, CellView, SVGElement, String, LinkView, Boolean]
}

class PaperOptionsBuilder(val dict: OptMap) extends JSOptionBuilder[PaperOptions, PaperOptionsBuilder](new PaperOptionsBuilder(_)) {
  def el(v: String | JQuery | HTMLElement): PaperOptionsBuilder = jsOpt("el", v)

  def width(v: Int): PaperOptionsBuilder = jsOpt("width", v)

  def height(v: Int): PaperOptionsBuilder = jsOpt("height", v)

  def drawGrid(v: Boolean): PaperOptionsBuilder = jsOpt("drawGrid", v)

  def gridSize(v: Int): PaperOptionsBuilder = jsOpt("gridSize", v)

  def model(v: Graph): PaperOptionsBuilder = jsOpt("model", v)

  def markAvailable(v: Boolean): PaperOptionsBuilder = jsOpt("markAvailable", v)

  def defaultLink(v: Link | js.Function2[CellView, SVGElement, Link]): PaperOptionsBuilder = jsOpt("defaultLink", v)

  def linkPinning(v: Boolean): PaperOptionsBuilder = jsOpt("linkPinning", v)

  def validateConnection(v: PaperOptions.VCFunction): PaperOptionsBuilder = jsOpt("validateConnection", v)

  def elementView(v: ElementView | js.Function1[Element, ElementView]): PaperOptionsBuilder = jsOpt("elementView", v)

  def validateMagnet(v: js.Function2[CellView, SVGElement, Boolean]): PaperOptionsBuilder = jsOpt("validateMagnet", v)

  def origin(v: Point): PaperOptionsBuilder = jsOpt("origin", v)

  def perpendicularLinks(v: Boolean): PaperOptionsBuilder = jsOpt("perpendicularLinks", v)

  def linkView(v: js.Function1[Link, LinkView] | LinkView) = jsOpt("linkView", v)

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
  def interactive(v: js.Function2[CellView, String, Boolean] | Boolean): PaperOptionsBuilder = jsOpt("interactive", v)

  /*interactive?:
    ((cellView: CellView, event: string) => boolean)
  | boolean
    | { vertexAdd?: boolean, vertexMove?: boolean, vertexRemove?: boolean, arrowheadMove?: boolean };*/
  def linkConnectionPoint(v: js.Function4[LinkView, ElementView, SVGElement, Point, Point]): PaperOptionsBuilder = jsOpt("linkConnectionPoint", v)

  def snapLinks(v: Boolean /*| { radius: number }*/): PaperOptionsBuilder = jsOpt("snapLinks", v)

  def async(v: Boolean /*| { batchZise: number }*/): PaperOptionsBuilder = jsOpt("async", v)

  def embeddingMode(v: Boolean) = jsOpt("embeddingMode", v): PaperOptionsBuilder

  def validateEmbedding(v: js.Function2[ElementView, ElementView, Boolean]): PaperOptionsBuilder = jsOpt("validateEmbedding", v)

  def restrictTranslate(v: js.Function1[ElementView, BBox] | Boolean): PaperOptionsBuilder = jsOpt("restrictTranslate", v)

  def guard(v: js.Function2[Event, CellView, Boolean]) = jsOpt("guard", v): PaperOptionsBuilder

  def multiLinks(v: Boolean) = jsOpt("multiLinks", v): PaperOptionsBuilder

  def cellViewNamespace(v: js.Object) = jsOpt("cellViewNamespace", v): PaperOptionsBuilder

  def clickThreshold(v: Int) = jsOpt("clickThreshold", v): PaperOptionsBuilder

  def highlighting(v: js.Any) = jsOpt("highlighting", v): PaperOptionsBuilder
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
