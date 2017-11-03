package joint.dia

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("joint.dia.ElementView")
class Element(override val attributes: CellAttributes) extends Cell(attributes) {
  override type R <: Element

  def translate(x: Int, y: Int): js.native = js.native

  def getAttribute(name: String): String = js.native

  def translate(tx: Int, ty: js.UndefOr[Int] = js.undefined,
                options: js.UndefOr[TranslateOptions] = js.undefined): R = js.native

  def position(options: js.UndefOr[ParentRelative]): Point = js.native

  def position(x: Int, y: Int, options: js.UndefOr[ParentRelative] = js.undefined): R = js.native

  def resize(width: Int, height: Int, options: js.UndefOr[Direction] = js.undefined): R = js.native

  def rotate(deg: Double, absolute: js.UndefOr[Boolean] = js.undefined,
             origin: js.UndefOr[Point] = js.undefined): R = js.native

  def embed(cell: Cell): R = js.native

  def unembed(cell: Cell): R = js.native

  //def fitEmbeds(options?: { deep?: boolean, padding?: Padding }): this;

  def getBBox(options: js.UndefOr[js.Any]): BBox = js.native

  //override def findView(paper: Paper): ElementView = js.native

  override def isElement(): Boolean = js.native

  def scale(scaleX: Int, scaleY: Int, origin: js.UndefOr[Point] = js.undefined,
            options: js.UndefOr[js.Any] = js.undefined): R = js.native

  def addPort(port: js.Any, opt: js.UndefOr[js.Any] = js.undefined): R = js.native

  def addPorts(ports: js.Array[js.Any], opt: js.UndefOr[js.Any] = js.undefined): R = js.native

  def removePort(port: js.Any, opt: js.UndefOr[js.Any]): R = js.native

  def hasPorts(): Boolean = js.native

  def hasPort(id: String): Boolean = js.native

  def getPorts(): js.Array[PortItem] = js.native

  def getPort(id: String): js.Any = js.native

  def getPortIndex(port: js.Any): Int = js.native

  def portProp(portId: String, path: js.Any, value: js.UndefOr[js.Any],
               opt: js.UndefOr[js.Any] = js.undefined): R = js.native
}

trait BoundProps extends js.Object {
  var outbound: js.UndefOr[Boolean] = js.undefined
  var inbound: js.UndefOr[Boolean] = js.undefined
}


trait Direction extends js.Object {
  var direction: js.UndefOr[String] = js.undefined //'left'|'right'|'top'|'bottom'|'top-right'|'top-left'|'bottom-left'|'bottom-right'
}

trait ParentRelative extends js.Object {
  var parentRelative: js.UndefOr[Boolean] = js.undefined
}
