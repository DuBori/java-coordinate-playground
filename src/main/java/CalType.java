public enum CalType {
    LINE(2), 사각형(4), 삼각형(3), ERROR(0);

    private int count;

    CalType(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
