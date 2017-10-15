package joint.shapes.basic

import joint.dia
import joint.shapes.{GenericAttributes, ShapeAttrs}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("joint.shapes.basic.Path")
class Path(override val attributes: GenericAttributes[PathAttrs]) extends Generic(attributes)

trait PathAttrs extends dia.TextAttrs {
  var path: js.UndefOr[ShapeAttrs] = js.undefined
}