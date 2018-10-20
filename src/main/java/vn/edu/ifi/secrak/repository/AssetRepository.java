package vn.edu.ifi.secrak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.edu.ifi.secrak.entity.Asset;

public interface AssetRepository extends JpaRepository<Asset, Long> {

}
