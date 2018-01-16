package joint.dia

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

@js.native
@JSGlobal("joint.dia.Graph")
class Graph(attributes: js.UndefOr[js.Any] = js.undefined, options: js.UndefOr[js.Any] = js.undefined) extends js.Object {
  def addCell(cell: Cell): Graph = js.native

  def fromJSON(json: Dynamic): Graph = js.native

  def on(event: String, fun: js.Function1[Cell | GraphCells, Unit]): js.Any = js.native

  def addCell(cell: Cell | js.Array[Cell]): Graph = js.native

  def addCells(cells: js.Array[Cell]): Graph = js.native

  def resetCells(cells: js.Array[Cell], options: js.UndefOr[js.Any]): Graph = js.native

  def getCell(id: String): Cell = js.native

  def getElements(): js.Array[Element] = js.native

  def getLinks(): js.Array[Link] = js.native

  def getCells(): js.Array[Cell] = js.native

  def getFirstCell(): Cell = js.native

  def getLastCell(): Cell = js.native

  def getConnectedLinks(element: Cell,
                        options: js.UndefOr[GraphOptions] = js.undefined): js.Array[Link] = js.native

  def disconnectLinks(cell: Cell, options: js.UndefOr[js.Any]): Unit = js.native

  def removeLinks(cell: Cell, options: js.UndefOr[js.Any]): Unit = js.native

  def translate(tx: Int, ty: js.UndefOr[Int] = js.undefined,
                options: js.UndefOr[TranslateOptions] = js.undefined): Unit = js.native

  //def cloneCells(cells: js.Array[Cell]): { [id: string]: Cell };

  //def getSubgraph(cells: Cell[], options?: { deep?: boolean }): Cell[];

  //def  cloneSubgraph(cells: Cell[], options?: { deep?: boolean }): { [id: string]: Cell };

  def dfs(element: Element, iteratee: js.Function2[Element, Int, Boolean],
          options: js.UndefOr[DfsBfsOptions] = js.undefined,
          visited: js.UndefOr[js.Object] = js.undefined,
          distance: js.UndefOr[Int] = js.undefined): Unit = js.native

  def bfs(element: Element, iteratee: js.Function2[Element, Int, Boolean],
          options: js.UndefOr[DfsBfsOptions] = js.undefined): Unit = js.native

  //def search(element: Element, iteratee: js.Function2[Element, Int,Boolean], options?: { breadthFirst?: boolean }): void;

  def getSuccessors(element: Element,
                    options: js.UndefOr[ExploreOptions] = js.undefined): js.Array[Element] = js.native

  def getPredecessors(element: Element,
                      options: js.UndefOr[ExploreOptions] = js.undefined): js.Array[Element] = js.native

  def isSuccessor(elementA: Element, elementB: Element): Boolean = js.native

  def isPredecessor(elementA: Element, elementB: Element): Boolean = js.native

  def isSource(element: Element): Boolean = js.native

  def isSink(element: Element): Boolean = js.native

  def getSources(): js.Array[Element] = js.native

  def getSinks(): js.Array[Element] = js.native

  def getNeighbors(element: Element,
                   options: js.UndefOr[DfsBfsOptions] = js.undefined): js.Array[Element] = js.native

  //def isNeighbor(elementA: Element, elementB: Element, options?: { inbound?: boolean, outbound?: boolean; }): boolean;

  def getCommonAncestor(cells: js.Array[Cell]*): Element = js.native

  def toJSON(): js.Any = js.native

  def fromJSON(json: js.Any, options: js.UndefOr[js.Any] = js.undefined): Graph = js.native

  def clear(options: js.UndefOr[js.Any] = js.undefined): Graph = js.native

  def findModelsFromPoint(rect: BBox): js.Array[Element] = js.native

  /*def findModelsUnderElement(element: Element, options?: {
    searchBy?:
      'bbox'
    | 'center'
    | 'origin'
    | 'corner'
    | 'topRight'
    | 'bottomLeft'
  }): js.Array[Element]*/

  def getBBox(elements: js.Array[Element],
              options: js.UndefOr[js.Any] = js.undefined): BBox = js.native

  def toGraphLib(): js.Any = js.native

  def findModelsInArea(rect: BBox,
                       options: js.UndefOr[js.Any]): BBox | Boolean = js.native

  def getCellsBBox(cells: js.Array[Cell],
                   options: js.UndefOr[js.Any] = js.undefined): BBox = js.native

  def getInboundEdges(node: String): js.Object = js.native

  def getOutboundEdges(node: String): js.Object = js.native

  def hasActiveBatch(name: js.UndefOr[String] = js.undefined): Int | Boolean = js.native

  def maxZIndex(): Int = js.native

  def removeCells(cells: js.Array[Cell],
                  options: js.UndefOr[js.Any] = js.undefined): Graph = js.native

  def resize(width: Int, height: Int, options: js.UndefOr[Int] = js.undefined): Graph = js.native

  def resizeCells(width: Int, height: Int,
                  cells: js.Array[Cell], options: js.UndefOr[Int] = js.undefined): Graph = js.native

  def set(key: js.Object | String, value: js.Any,
          options: js.UndefOr[js.Any] = js.undefined): Graph = js.native

  def startBatch(name: String,
                 data: js.UndefOr[js.Object] = js.undefined): js.Any = js.native

  def stopBatch(name: String, data: js.Object): js.Any = js.native
}
