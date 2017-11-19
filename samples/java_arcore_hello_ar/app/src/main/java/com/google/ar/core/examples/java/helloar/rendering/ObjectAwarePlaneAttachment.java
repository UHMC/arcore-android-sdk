package com.google.ar.core.examples.java.helloar.rendering;

import com.google.ar.core.Anchor;
import com.google.ar.core.Plane;

public class ObjectAwarePlaneAttachment extends PlaneAttachment {
    private ObjectRenderer object;
    private float scaleFactor;

    public ObjectAwarePlaneAttachment(Plane plane, Anchor anchor, ObjectRenderer object, float scaleFactor) {
        super(plane, anchor);
        this.mPlane = plane;
        this.mAnchor = anchor;
        this.object = object;
        this.scaleFactor = scaleFactor;
    }

    public ObjectRenderer getObject() {
        return object;
    }

    public void setScaleFactor(float scaleFactor) {
        this.scaleFactor = scaleFactor;
    }

    public float getScaleFactor() {
        return scaleFactor;
    }
}