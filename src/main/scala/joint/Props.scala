package joint

import japgolly.scalajs.react.CallbackTo
import joint.dia.CellView

import scala.scalajs.js

case class Props(isOpen: Boolean,
                 cellView: js.UndefOr[CellView],
                 close: CallbackTo[Unit])
