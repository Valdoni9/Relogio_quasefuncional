public class AppRelogio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Relogio  r1 = new Relogio();
        r1.setHour(13);
        r1.setMinute(30);
        r1.setSecond(2);
        r1.setHorario(0, 13, 30, 30.3f);

        System.out.println("Relogio Horario");
        System.out.println("-----------------------");
        System.out.println("Horario: " + r1.getHour() + "H" + r1.getMinute()+ "m" +r1.getSecond()+"s");
    }
    
}
