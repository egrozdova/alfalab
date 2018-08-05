public class Solution3 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static void main (String[] args) {
        int lftBound, rgtBound, lftRand, rgtRand, rand;
        String posMessage, negMessage;
        lftBound = 25;
        rgtBound = 100;
        lftRand = 5;
        rgtRand = 155;
        rand = lftRand + (int)Math.round((Math.random() * rgtRand));
        posMessage = String.format("Число "+ANSI_BLUE+"%d"+ANSI_RESET+" содержится в интервале ("+ANSI_BLUE+"%d"+ANSI_RESET+","+ANSI_BLUE+"%d"+ANSI_RESET+")", rand, lftBound, rgtBound);
        negMessage = String.format("Число "+ANSI_BLUE+"%d"+ANSI_RESET+" не содержится в интервале ("+ANSI_BLUE+"%d"+ANSI_RESET+","+ANSI_BLUE+"%d"+ANSI_RESET+")", rand, lftBound, rgtBound);
        /*
        Тут можно было бы поржать и сваять конструкцию

        switch (rand) {
            case 26:  System.out.println(posMessage);
                break;
            case 27:  System.out.println(posMessage);
                break;
            case 28:  System.out.println(posMessage);
                break;
            ...
            case 99:  System.out.println(posMessage);
                break;
            default: System.out.println(negMessage);
                break;
        }
         */
        //используем строгое неравенство, т.к. по условию граничные значения не входят в интервал
        if (rand > lftBound & rand < rgtBound) System.out.println(posMessage);
        else System.out.println(negMessage);

    }
}
