package com.gulshan.ecom.repository;

import com.gulshan.ecom.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image, Long> {
    List<Image> findByProductId(long id);
}
