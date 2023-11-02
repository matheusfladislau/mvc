package br.edu.fatecrl.mvcmatheus.controllers;

import br.edu.fatecrl.mvcmatheus.models.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/album")
public class DadosController {
    private static final List<Album> listaAlbum = new ArrayList<Album>();

    public DadosController(){
        listaAlbum.add(new Album("The Dark Side of The Moon", "Pink Floyd", 1973, 42));
        listaAlbum.add(new Album("Wish You Were Here", "Pink Floyd", 1975, 44));
        listaAlbum.add(new Album("The Wall", "Pink Floyd", 1979, 81));
        listaAlbum.add(new Album("Sgt Pepper's Lonely Hearts Club Band", "The Beatles", 1967, 39));
    }

    @GetMapping
    public List<Album> getAlbuns(Model model){
        return listaAlbum;
    }
}
