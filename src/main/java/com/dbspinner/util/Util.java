package com.dbspinner.util;

/**
 * <p>Util class.</p>
 *
 */
public final class Util {

    private static Util INSTANCE = null;

    /**
     * <p>getInstance.</p>
     *
     * @return a {@link com.dbspinner.util.Util} object
     */
    public static synchronized Util getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Util();
        }
        return INSTANCE;
    }

    private Util() {}

    /**
     * <p>start.</p>
     */
    public void start() {
        System.out.println("Framework setup");
    }

    /**
     * <p>main.</p>
     *
     * @param args a {@link java.lang.String} object
     */
    public static void main(String... args) {
        Util.getInstance().start();
    }
}
