package com.gulshan.ecom.service.image;

import com.gulshan.ecom.dto.ImageDto;
import com.gulshan.ecom.entity.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ImageServiceInterface {
    Image getImageById(Long id);

    void deleteImageById(Long id);

    List<ImageDto> saveImages(List<MultipartFile> files, Long productId);

    void updateImage(MultipartFile file, Long imageId);
}
