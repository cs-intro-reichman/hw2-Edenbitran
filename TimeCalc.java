public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        int totalTime, newHour, newMinutes;
        //String time = args[0];
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        // System.out.println(hours + ":" + minutes);
        int addMinutes = Integer.parseInt(args[1]);
        //System.out.println("adding " + addMinutes + " minutes to the time");
        totalTime = (hours * 60) + minutes + addMinutes;
        int minutes2hours = totalTime / 60;


        if (totalTime < 1440) {
           // System.out.println("under 1 day " + totalTime);
            newHour = totalTime / 60;
            newMinutes = totalTime - (newHour * 60);
            if (newHour < 10 && newMinutes < 10) {
                System.out.println("0" + newHour + ":0" + newMinutes);
            } else if (newHour < 10 || newHour == 0) {
                System.out.println("0" + newHour + ":" + newMinutes);
            } else if (newMinutes < 10) {
                System.out.println(newHour + ":0" + newMinutes);
            } else {
                System.out.println(newHour + ":" + newMinutes);
            }
        }
        if (totalTime >= 1440) {
            totalTime = (totalTime % 1440);
            minutes2hours = totalTime / 60;
            newHour = minutes2hours % 24;
            newMinutes = totalTime - (newHour * 60);
            if (newHour < 10 && newMinutes < 10) {
                System.out.println("0" + newHour + ":0" + newMinutes);
            } else if (newHour < 10 || newHour == 0) {
                System.out.println("0" + newHour + ":" + newMinutes);
            } else if (newMinutes < 10) {
                System.out.println(newHour + ":0" + newMinutes);
            } else {
                System.out.println(newHour + ":" + newMinutes);
            }

        }

    }
}