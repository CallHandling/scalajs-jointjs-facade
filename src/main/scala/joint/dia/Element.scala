package joint.dia

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("joint.dia.ElementView")
class Element(attributes: CellAttributes) extends Cell(attributes) {
  def translate(x: Int, y: Int): js.native = js.native

  def getAttribute(name: String): String = js.native

  def translate(tx: Int, ty: js.UndefOr[Int] = js.undefined,
                options: js.UndefOr[TranslateOptions] = js.undefined): Element = js.native

  //def position(options?: { parentRelative: boolean }): Point;
  //def position(x: number, y: number, options?: { parentRelative?: boolean }): this;

  /*def resize(width: number, height: number, options?: {
    direction?:
      'left'
    | 'right'
    | 'top'
    | 'bottom'
    | 'top-right'
    | 'top-left'
    | 'bottom-left'
    | 'bottom-right'
  }): this;*/

  def rotate(deg: Double, absolute: js.UndefOr[Boolean] = js.undefined,
             origin: js.UndefOr[Point] = js.undefined): Element = js.native

  def embed(cell: Cell): Element = js.native

  def unembed(cell: Cell): Element = js.native

  //def getEmbeddedCells(options: js.UndefOr[ExploreOptions]): js.Array[Cell] = js.native

  //def fitEmbeds(options?: { deep?: boolean, padding?: Padding }): this;

  def getBBox(options: js.UndefOr[js.Any]): BBox = js.native

  //override def findView(paper: Paper): ElementView = js.native

  override def isElement(): Boolean = js.native

  def scale(scaleX: Int, scaleY: Int, origin: js.UndefOr[Point] = js.undefined,
            options: js.UndefOr[js.Any] = js.undefined): Element = js.native

  def addPort(port: js.Any, opt: js.UndefOr[js.Any] = js.undefined): Element = js.native

  def addPorts(ports: js.Array[js.Any], opt: js.UndefOr[js.Any] = js.undefined): Element = js.native

  def removePort(port: js.Any, opt: js.UndefOr[js.Any]): Element = js.native

  def hasPorts(): Boolean = js.native

  def hasPort(id: String): Boolean = js.native

  def getPorts(): js.Array[js.Any] = js.native

  def getPort(id: String): js.Any = js.native

  def getPortIndex(port: js.Any): Int = js.native

  def portProp(portId: String, path: js.Any, value: js.UndefOr[js.Any],
               opt: js.UndefOr[js.Any] = js.undefined): joint.dia.Element = js.native
}

trait BoundProps extends js.Object {
  var outbound: js.UndefOr[Boolean] = js.undefined
  var inbound: js.UndefOr[Boolean] = js.undefined
}



