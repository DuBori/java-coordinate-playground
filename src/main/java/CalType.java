public enum CalType {
    LINE(5), 사각형(9), 삼각형(7), ERROR(0);

    private int count;

    CalType(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
