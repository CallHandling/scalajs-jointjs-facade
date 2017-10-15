package joint.shapes.basic

import joint.dia.TextAttrs
import joint.shapes.GenericAttributes

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("joint.shapes.basic.Image")
class Image(override val attributes: GenericAttributes[TextAttrs]) extends Generic(attributes)