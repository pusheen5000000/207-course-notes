/** Represents a rectangle with a width and height. */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Constructs a rectangle with the given width and height.
   *
   * @param width the width of the rectangle
   * @param height the height of the rectangle
   */
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  /**
   * Returns the area of this rectangle.
   *
   * @return width times height
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales the rectangle by the given factor.
   *
   * @param factor the multiplier applied to width and height
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Returns whether this rectangle has a strictly larger area than another.
   *
   * @param other the rectangle to compare against
   * @return true if this rectangle's area is greater than {@code other}'s area
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}