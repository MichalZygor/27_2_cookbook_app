package pl.javastart.cookapp.photo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoService {
    private List<Photo> photos;
    private PhotoRepository photoRepository;

    public PhotoService(PhotoRepository photoRepository) {
        this.photoRepository = photoRepository;
    }

    public List<Photo> findAll() {
        return photoRepository.findAll();
    }
}
