package joint.dia

import scala.scalajs.js

@js.native
trait Element extends Cell[Options, Element] {
  override def attributes: Options = js.native

  def translate(x: Int, y: Int): js.native = js.native

  def getAttribute(name: String): String = js.native
}

trait BoundProps extends js.Object {
  var outbound: js.UndefOr[Boolean] = js.undefined
  var inbound: js.UndefOr[Boolean] = js.undefined
}

trait Options extends js.Object {
  var position: js.UndefOr[Position] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
  var angel: js.UndefOr[Int] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  val `type`: js.UndefOr[String] = js.undefined
  var attrs: js.UndefOr[js.Dictionary[AttrStyle]] = js.undefined
}

trait Size extends js.Object {
  var width: js.UndefOr[Int] = js.undefined
  var height: js.UndefOr[Int] = js.undefined
}

trait Position extends js.Object {
  var x: js.UndefOr[Int] = js.undefined
  var y: js.UndefOr[Int] = js.undefined
}
