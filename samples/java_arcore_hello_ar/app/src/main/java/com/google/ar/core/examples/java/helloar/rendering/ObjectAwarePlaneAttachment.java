package com.google.ar.core.examples.java.helloar.rendering;

import com.google.ar.core.Anchor;
import com.google.ar.core.Plane;

public class ObjectAwarePlaneAttachment extends PlaneAttachment {
    private ObjectRenderer object;
    private float scaleFactor;

    public ObjectAwarePlaneAttachment(Plane plane, Anchor anchor, ObjectRenderer obj, float objectScale) {
        super(plane, anchor);
        this.mPlane = plane;
        this.mAnchor = anchor;
        object = obj;
        scaleFactor = objectScale;
        }

        public ObjectRenderer getObject() {
            return object;
        }

        public void setScaleFactor(float s) {
            scaleFactor = s;
        }

        public float getScaleFactor() {
            return scaleFactor;
        }
    }
}
