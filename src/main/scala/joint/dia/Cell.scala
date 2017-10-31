package joint.dia

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobal, JSName}
import scala.scalajs.js.|

@js.native
trait ViewFinder[+T <: CellView] extends js.Object {
  def findView(paper: Paper): T = js.native
}

@js.native
@JSGlobal("joint.dia.Cell")
class Cell(val attributes: CellAttributes) extends js.Object {

  type  R <: Cell

  def id: String = js.native

  def get(key: String): js.Any = js.native

  def toJSON(): js.Any = js.native

  def remove(options: js.UndefOr[DisconnectLinks] = js.undefined): Cell = js.native

  def toFront(options: js.UndefOr[Deep] = js.undefined): Cell = js.native

  def toBack(options: js.UndefOr[Deep] = js.undefined): Cell = js.native

  def getAncestors(): js.Array[Cell] = js.native

  def isEmbeddedIn(element: Element, options: js.UndefOr[Deep] = js.undefined): Boolean = js.native

  def prop(key: String): js.Any = js.native

  def prop(`object`: js.Any): R = js.native

  def prop(key: String, value: js.Any,
           options: js.UndefOr[js.Any] = js.undefined): R = js.native

  def removeProp(path: String,
                 options: js.UndefOr[js.Any] = js.undefined): R = js.native

  def attr(key: String): js.Any = js.native

  def attr(`object`: SVGAttributes): R = js.native

  def attr(key: String, value: js.Any): R = js.native

  @JSName("clone")
  def copy(): R = js.native

  @JSName("clone")
  def clone(opt: Deep): R | js.Array[R] = js.native

  def removeAttr(path: String | js.Array[String],
                 options: js.UndefOr[js.Any] = js.undefined): R = js.native

  def transition(path: String, value: js.UndefOr[js.Any] = js.undefined,
                 options: js.UndefOr[TransitionOptions] = js.undefined,
                 delim: js.UndefOr[String] = js.undefined): Int = js.native

  def getTransitions(): js.Array[String] = js.native

  def stopTransitions(path: String,
                      delim: js.UndefOr[String] = js.undefined): R = js.native

  def addTo(graph: Graph,
            options: js.UndefOr[js.Any] = js.undefined): R = js.native

  def isLink(): Boolean = js.native

  def embed(cell: Cell, options: js.UndefOr[js.Any] = js.undefined): R = js.native

  def getEmbeddedCells(options: js.UndefOr[ExploreOptions] = js.undefined): js.Array[R] = js.native

  def initialize(options: js.UndefOr[js.Any] = js.undefined): Unit = js.native

  def isElement(): Boolean = js.native

  def isEmbedded(): Boolean = js.native

  def processPorts(): Unit = js.native

  def startBatch(name: String, options: js.UndefOr[js.Any] = js.undefined): R = js.native

  def stopBatch(name: String, options: js.UndefOr[js.Any]): R = js.native

  def unembed(cell: Cell, options: js.UndefOr[js.Any] = js.undefined): R = js.native
}
