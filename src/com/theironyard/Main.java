package com.theironyard;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

        EventLog eventLog = new EventLog();
        String wantToAddMore = "";

        do {
            Scanner scanner = new Scanner( System.in );

            System.out.println("*******************EventLog JUnit******************");
            System.out.println( "Enter the event name" );
            String inputName = scanner.nextLine();

            System.out.println("Select one action from the list(Enter 1 or 2 or 3 or 4)");
            System.out.println("---------------------------------------------------------");
            System.out.println("1.Face2Face\n 2.PhoneCall\n 3.TextMessaging\n 4.Unknown");

            String inputAction = scanner.nextLine();

            if(inputAction.equals( "1" )) inputAction = "Face2Face";
            else if(inputAction.equals( "2" )) inputAction = "PhoneCall";
            else if(inputAction.equals( "3" )) inputAction = "TextMessaging";
            else if(inputAction.equals( "4" )) inputAction = "Unknown";

            Event event = new Event( inputName, inputAction );

            eventLog.addEvent( event );

            System.out.println( "Do you want to add more events - y or n ?" );

            wantToAddMore = scanner.nextLine();
            wantToAddMore = wantToAddMore.toUpperCase();

        } while (wantToAddMore.equals( "Y" ));

        System.out.println( "Number of events added by user: " + eventLog.getNumEvents() );

    }

}
