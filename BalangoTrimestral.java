public class BalangoTrimestral {
    public static void main(String[] args) {
        int GastoJaneiro=15000;
        int GastosFevereiro=23000;
        int GastoMarco=17000;

        int GastosBimestre = GastoJaneiro + GastoMarco + GastosFevereiro;
        int MediaMensal = GastosBimestre / 3;

        System.out.println(GastosBimestre);
        System.out.println(MediaMensal);
    }
}
