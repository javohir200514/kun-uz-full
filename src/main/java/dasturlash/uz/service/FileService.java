package dasturlash.uz.service;

import dasturlash.uz.dto.AttachDTO;
import org.springframework.web.multipart.MultipartFile;

public class FileService {


    public AttachDTO upload(MultipartFile file) {

        System.out.println(file.getOriginalFilename());
        System.out.println(file.getSize());

        return null;

    }


}
