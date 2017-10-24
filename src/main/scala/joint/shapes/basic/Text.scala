package joint.shapes.basic

import joint.dia.TextAttrs
import joint.shapes.{GenericAttributes, GenericAttributesBuilder}
import org.querki.jsext.noOpts

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("joint.shapes.basic.Text")
class Text(override val attributes: GenericAttributes[TextAttrs]) extends Generic(attributes)

object GenericTextAttrs extends GenericAttributesBuilder[TextAttrs](noOpts)