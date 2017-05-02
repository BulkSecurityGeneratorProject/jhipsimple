package com.foe.repository;

import com.foe.domain.Mission;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Mission entity.
 */
@SuppressWarnings("unused")
public interface MissionRepository extends JpaRepository<Mission,Long> {

}
