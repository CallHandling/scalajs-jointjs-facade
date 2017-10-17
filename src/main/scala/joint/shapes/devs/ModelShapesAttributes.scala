package joint.shapes.devs

import joint.dia.{TextAttrs, TextOptions}
import joint.shapes.basic.{ShapeAttrs, _}
import joint.shapes.logic.{Image, ImageAttrs}
import org.querki.jsext.{JSOptionBuilder, OptMap, noOpts}

trait ModelShapesAttributes extends CircleAttrs with EllipseAttrs with ImageAttrs
  with PathAttrs with PolylineAttrs with PolygonAttrs with RectAttrs with TextAttrs

object ModelShapesAttributes extends ModelShapesAttributesBuilder(noOpts)

class ModelShapesAttributesBuilder(val dict: OptMap)
  extends JSOptionBuilder[ModelShapesAttributes, ModelShapesAttributesBuilder](new ModelShapesAttributesBuilder(_)) {
  def circle(v: ShapeAttrs): ModelShapesAttributesBuilder = jsOpt("circle", v)

  def ellipse(v: ShapeAttrs): ModelShapesAttributesBuilder = jsOpt("ellipse", v)

  def image(v: Image): ModelShapesAttributesBuilder = jsOpt("image", v)

  def path(v: ShapeAttrs): ModelShapesAttributesBuilder = jsOpt("path", v)

  def polyline(v: ShapeAttrs): ModelShapesAttributesBuilder = jsOpt("polyline", v)

  def polygon(v: ShapeAttrs): ModelShapesAttributesBuilder = jsOpt("polygon", v)

  def rect(v: ShapeAttrs): ModelShapesAttributesBuilder = jsOpt("rect", v)

  def text(v: TextOptions): ModelShapesAttributesBuilder = jsOpt("text", v)

  def set(key: String, v: ShapeAttrs): ModelShapesAttributesBuilder = jsOpt(key, v)
}