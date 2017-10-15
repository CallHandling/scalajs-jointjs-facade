package joint

import joint.dia.BBox
import org.scalajs.dom.Position

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

trait LayoutOptions extends js.Object {
  var nodeSep: js.UndefOr[Int] = js.undefined
  var edgeSep: js.UndefOr[Int] = js.undefined
  var rankSep: js.UndefOr[Int] = js.undefined
  var rankDir: js.UndefOr[String] = js.undefined //'TB' | 'BT' | 'LR' | 'RL';
  var marginX: js.UndefOr[Int] = js.undefined
  var marginY: js.UndefOr[Int] = js.undefined
  var resizeCluster: js.UndefOr[Boolean] = js.undefined
  var setPosition: js.UndefOr[js.Function2[dia.Element, BBox, Unit]] = js.undefined
  //(element: dia.Element, position: dia.BBox) => void;
  var setLinkVertices: js.UndefOr[js.Function2[dia.Link, js.Array[Position], Unit]] = js.undefined
}

@js.native
@JSGlobal("joint.layout.DirectedGraph")
object DirectedGraph extends js.Object {
  def layout(graph: dia.Graph | js.Array[dia.Cell], options: js.UndefOr[LayoutOptions] = js.undefined): BBox = js.native
}

