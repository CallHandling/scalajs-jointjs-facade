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
  def id: String = js.native

  def get(key: String): js.Any = js.native

  def toJSON(): js.Any = js.native

  //def remove(options?: { disconnectLinks?: boolean }): this;

  //def toFront(options?: { deep?: boolean }): this;

  //def toBack(options?: { deep?: boolean }): this;

  def getAncestors(): js.Array[Cell] = js.native

  //def isEmbeddedIn(element: Element, options?: { deep: boolean }): boolean;

  def prop(key: String): js.Any = js.native

  def prop(`object`: js.Any): Cell = js.native

  def prop(key: String, value: js.Any,
           options: js.UndefOr[js.Any] = js.undefined): Cell = js.native

  def removeProp(path: String,
                 options: js.UndefOr[js.Any] = js.undefined): Cell = js.native

  def attr(key: String): js.Any = js.native

  //def attr(`object`: SVGAttributes): this;
  def attr(key: String, value: js.Any): Cell = js.native

  @JSName("clone")
  def copy(): Cell = js.native

  //def clone(opt: { deep?: boolean }): Cell | Cell[];

  def removeAttr(path: String | js.Array[String],
                 options: js.UndefOr[js.Any] = js.undefined): Cell = js.native

  def transition(path: String, value: js.UndefOr[js.Any] = js.undefined,
                 options: js.UndefOr[TransitionOptions] = js.undefined,
                 delim: js.UndefOr[String] = js.undefined): Int = js.native

  def getTransitions(): js.Array[String] = js.native

  def stopTransitions(path: String,
                      delim: js.UndefOr[String] = js.undefined): Cell = js.native

  def addTo(graph: Graph,
            options: js.UndefOr[js.Any] = js.undefined): Cell = js.native

  def isLink(): Boolean = js.native

  def embed(cell: Cell, options: js.UndefOr[js.Any] = js.undefined): Cell = js.native

  def getEmbeddedCells(options: js.UndefOr[js.Any] = js.undefined): js.Array[Cell] = js.native

  def initialize(options: js.UndefOr[js.Any] = js.undefined): Unit = js.native

  def isElement(): Boolean = js.native

  def isEmbedded(): Boolean = js.native

  def processPorts(): Unit = js.native

  def startBatch(name: String, options: js.UndefOr[js.Any] = js.undefined): Cell = js.native

  def stopBatch(name: String, options: js.UndefOr[js.Any]): Cell = js.native

  def unembed(cell: Cell, options: js.UndefOr[js.Any] = js.undefined): Cell = js.native
}
