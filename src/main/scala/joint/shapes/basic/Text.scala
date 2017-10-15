package joint.shapes.basic

import joint.dia
import joint.shapes.GenericAttributes

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("joint.shapes.basic.Text")
class Text(override val attributes: GenericAttributes[dia.TextAttrs]) extends Generic(attributes)
