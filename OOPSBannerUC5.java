public class OOPSBannerUC5 {
    public static void main(String[] args) {

        String[] banner = new String[] {
            "  *****     *****     ******    *****  ",
            " *     *   *     *    *     *  *     * ",
            "*       * *       *   *     *  *       ",
            "*       * *       *   ******    *****  ",
            "*       * *       *   *              * ",
            " *     *   *     *    *        *     * ",
            "  *****     *****     *         *****  "
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}