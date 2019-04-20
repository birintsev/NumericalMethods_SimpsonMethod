package ua.edu.sumdu.in71.methods.maximization;

import javafx.geometry.Point2D;

public class Interval {
    private Point2D left;
    private Point2D right;

    public Interval(Point2D left, Point2D right) {
        this.left = left;
        this.right = right;
    }

    public Interval() {
    }

    public Point2D getLeft() {
        return left;
    }

    public Interval setLeft(Point2D left) {
        this.left = left;
        return this;
    }

    public Point2D getRight() {
        return right;
    }

    public Interval setRight(Point2D right) {
        this.right = right;
        return this;
    }
}
