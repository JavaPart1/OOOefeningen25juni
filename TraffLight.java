package be.vdab.OOOef25juni;

public enum TraffLight {
    RED ("Please stop"), Green ("Please go"),
    Orange ("Please caution");

    private String descript;

    private TraffLight(String descript) {
        this.descript = descript;
    }

    public String getDescript() {
        return descript;
    }
}
