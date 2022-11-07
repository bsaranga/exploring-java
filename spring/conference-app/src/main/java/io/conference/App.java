package io.conference;

import io.conference.service.SpeakerService;
import io.conference.service.SpeakerServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
        SpeakerService speakerService = new SpeakerServiceImpl();
        System.out.println(speakerService.findAll().get(0).getFirstName());
    }
}
