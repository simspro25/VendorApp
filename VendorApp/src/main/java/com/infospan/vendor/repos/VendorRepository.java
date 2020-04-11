package com.infospan.vendor.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infospan.vendor.entities.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}
