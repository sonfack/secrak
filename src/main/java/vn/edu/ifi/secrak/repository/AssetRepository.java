package vn.edu.ifi.secrak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import vn.edu.ifi.secrak.entity.Asset;

@Repository
public interface AssetRepository extends JpaRepository<Asset, Long> {
    public Asset findByIdNumber(String idnumber);
}
