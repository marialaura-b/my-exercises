package io.codeforall.bootcamp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alarm {

    Timer timer; //funcionalidade de agendar tarefas

    public static void main(String[] args) {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)) // para passar info através do terminal

        int interval = ;
         String rings = null;

        System.out.println("Number of times to ring?");

        try {
            rings = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Alarm alarm = new Alarm();
        alarm.start(interval, rings);
    }

    private void start(String interval, String rings) {

        timer = new Timer();
        timer.scheduleAtFixedRate(new Ring(rings), interval*1000, interval*1000);

    }

    private class Ring extends TimerTask{

        private int numRings;

        public Ring(int numRings) {
            this.numRings = numRings;
        }
        @Override
        public void run() {

            System.out.println("Alarm is ringing...");

            numRings--;
        }

    }
}
