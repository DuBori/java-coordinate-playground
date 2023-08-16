public enum Carnum {
    SONATA("Sonata"),
    K5("K5"),
    AVANTAE("Avante");

    private String desc;

    Carnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
