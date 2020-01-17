package com.example.social.resource;

import com.example.social.model.Album;
import com.example.social.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/albums")
public class AlbumResource {

    @Autowired
    private AlbumService albumService;

    @GetMapping
    public List<Album> getAlbums() {
        // todo
        return AlbumService.getAlbums();
    }

    @PostMapping
    public void saveAlbum(Album album) {
        albumService.save(album);
    }

    @PutMapping
    public void editAlbum(Album album) {
        albumService.edit(album);
    }

    @DeleteMapping
    public void deleteAlbum(String id) {
        albumService.delete(id);
    }
}
