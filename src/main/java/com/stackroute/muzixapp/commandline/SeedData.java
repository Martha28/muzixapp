package com.stackroute.muzixapp.commandline;

import com.stackroute.muzixapp.domain.Track;
import com.stackroute.muzixapp.service.TrackServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SeedData implements CommandLineRunner {

   private TrackServices trackServices;

    @Autowired
    public SeedData(TrackServices trackServices){
        this.trackServices=trackServices;
    }


    @Override
    public void run(String... args) throws Exception {

        Track track=Track.builder().name("Durga").comment("Martha").build();
        trackServices.saveTrack(track);
        Track track1=Track.builder().name("Durga1").comment("Martha1").build();
        trackServices.saveTrack(track1);

    }

}
