package y2021.q4;

import java.awt.*;
import java.awt.geom.*;
import java.io.Serializable;

public class Rectangle extends Rectangle2D implements Shape, Serializable {
    protected Rectangle() {
        super();
    }


    @Override
    public void setRect(Rectangle2D r) {
        super.setRect(r);
    }

    @Override
    public boolean intersectsLine(double x1, double y1, double x2, double y2) {
        return super.intersectsLine(x1, y1, x2, y2);
    }

    @Override
    public boolean intersectsLine(Line2D l) {
        return super.intersectsLine(l);
    }

    @Override
    public int outcode(Point2D p) {
        return super.outcode(p);
    }

    @Override
    public void setFrame(double x, double y, double w, double h) {
        super.setFrame(x, y, w, h);
    }

    @Override
    public Rectangle2D getBounds2D() {
        return super.getBounds2D();
    }

    @Override
    public boolean contains(double x, double y) {
        return super.contains(x, y);
    }

    @Override
    public boolean intersects(double x, double y, double w, double h) {
        return super.intersects(x, y, w, h);
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        return super.contains(x, y, w, h);
    }

    @Override
    public void add(double newx, double newy) {
        super.add(newx, newy);
    }

    @Override
    public void add(Point2D pt) {
        super.add(pt);
    }

    @Override
    public void add(Rectangle2D r) {
        super.add(r);
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        return super.getPathIterator(at);
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return super.getPathIterator(at, flatness);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public void setRect(double v, double v1, double v2, double v3) {

    }

    @Override
    public int outcode(double v, double v1) {
        return 0;
    }

    @Override
    public Rectangle2D createIntersection(Rectangle2D rectangle2D) {
        return null;
    }

    @Override
    public Rectangle2D createUnion(Rectangle2D rectangle2D) {
        return null;
    }

    @Override
    public double getMinX() {
        return super.getMinX();
    }

    @Override
    public double getMinY() {
        return super.getMinY();
    }

    @Override
    public double getMaxX() {
        return super.getMaxX();
    }

    @Override
    public double getMaxY() {
        return super.getMaxY();
    }

    @Override
    public double getCenterX() {
        return super.getCenterX();
    }

    @Override
    public double getCenterY() {
        return super.getCenterY();
    }

    @Override
    public Rectangle2D getFrame() {
        return super.getFrame();
    }

    @Override
    public void setFrame(Point2D loc, Dimension2D size) {
        super.setFrame(loc, size);
    }

    @Override
    public void setFrame(Rectangle2D r) {
        super.setFrame(r);
    }

    @Override
    public void setFrameFromDiagonal(double x1, double y1, double x2, double y2) {
        super.setFrameFromDiagonal(x1, y1, x2, y2);
    }

    @Override
    public void setFrameFromDiagonal(Point2D p1, Point2D p2) {
        super.setFrameFromDiagonal(p1, p2);
    }

    @Override
    public void setFrameFromCenter(double centerX, double centerY, double cornerX, double cornerY) {
        super.setFrameFromCenter(centerX, centerY, cornerX, cornerY);
    }

    @Override
    public void setFrameFromCenter(Point2D center, Point2D corner) {
        super.setFrameFromCenter(center, corner);
    }

    @Override
    public boolean contains(Point2D p) {
        return super.contains(p);
    }

    @Override
    public boolean intersects(Rectangle2D r) {
        return super.intersects(r);
    }

    @Override
    public boolean contains(Rectangle2D r) {
        return super.contains(r);
    }

    @Override
    public java.awt.Rectangle getBounds() {
        return super.getBounds();
    }

    @Override
    public Object clone() {
        return super.clone();
    }

    @Override
    public double getX() {
        return 0;
    }

    @Override
    public double getY() {
        return 0;
    }

    @Override
    public double getWidth() {
        return 0;
    }

    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
