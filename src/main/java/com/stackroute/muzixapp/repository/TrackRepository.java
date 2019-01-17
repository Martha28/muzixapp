package com.stackroute.muzixapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.muzixapp.domain.Track;

@Repository
public interface TrackRepository extends JpaRepository<Track,Integer> {

}
