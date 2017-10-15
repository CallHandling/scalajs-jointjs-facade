package joint.shapes.basic

import joint.dia
import joint.dia.Element
import joint.shapes.GenericAttributes

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("joint.shapes.basic.Generic")
class Generic(override val attributes: GenericAttributes[dia.SVGAttributes])
  extends Element(attributes)
