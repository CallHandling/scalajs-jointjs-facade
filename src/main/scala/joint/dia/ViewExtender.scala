package joint.dia

import scala.scalajs.js

@js.native
trait ViewExtender extends js.Object {
  def extend(prototype: js.UndefOr[ElementViewPrototype] = js.undefined,
             static: js.UndefOr[ElementViewStatic] = js.undefined): js.Dynamic = js.native
}


trait ViewExtenderOps {
  val extender: ViewExtender
}
