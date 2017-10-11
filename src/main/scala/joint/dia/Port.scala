package joint.dia

import scala.scalajs.js

trait PortOptions extends js.Object {
  var groups: js.UndefOr[GroupOptions] = js.undefined
}

trait GroupOptions extends js.Object {
  var in: js.UndefOr[GenericAttributes] = js.undefined
  var out: js.UndefOr[GenericAttributes] = js.undefined
}
