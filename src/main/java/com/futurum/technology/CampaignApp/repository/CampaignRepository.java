package com.futurum.technology.CampaignApp.repository;

import com.futurum.technology.CampaignApp.entity.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignRepository extends JpaRepository<Campaign, Long> {
}
