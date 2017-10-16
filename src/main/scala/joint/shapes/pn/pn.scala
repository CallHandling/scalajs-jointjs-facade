package joint.shapes.pn

import joint.dia.SVGAttributes
import joint.dia
import joint.shapes.GenericAttributes
import joint.shapes.basic

class Place(override val attributes: GenericAttributes[SVGAttributes]) extends basic.Generic(attributes)

class PlaceView extends dia.ElementView

class Transition(override val attributes: GenericAttributes[basic.RectAttrs]) extends basic.Generic(attributes)

class Link(override val attributes: dia.LinkAttributes) extends dia.Link(attributes)

