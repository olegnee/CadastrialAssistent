final class SomePlace {
    private final int length;
    private final int width;
    private final int cost;
    private final boolean isHonest;

    @Override
    public String toString() {
        return "SomePlace{" +
                "length=" + length +
                ", width=" + width +
                ", cost=" + cost +
                ", isHonest=" + isHonest +
                '}';
    }

    public SomePlace(int length, int width, int cost, boolean isHonest) {
        this.length = length;
        this.width = width;
        this.cost = cost;
        this.isHonest = isHonest;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
