package environment;

import java.util.Objects;

public class Place {
    private final String title;
    float length;
    float width;
    float height;

    public Place(String title, float x, float y, float z) {
        this.title = title;
        this.length = x;
        this.width = y;
        this.height = z;
    }

    public float GetSquare() {
        return length * width;
    }

    public float GetVolume() {
        return length * width * height;
    }

    public String GetTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Place{" +
                "title='" + title + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place place = (Place) o;
        return Float.compare(length, place.length) == 0 && Float.compare(width, place.width) == 0 &&
                Float.compare(height, place.height) == 0 && Objects.equals(title, place.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, length, width, height);
    }
}