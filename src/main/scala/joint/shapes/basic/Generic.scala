package joint.shapes.basic

import joint.dia.{Cell, GenericAttributes}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("joint.shapes.basic.Generic")
abstract class Generic(override val attributes: GenericAttributes) extends Cell(attributes)
