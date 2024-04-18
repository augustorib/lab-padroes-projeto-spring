package one.digitalinnovation.gof.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import one.digitalinnovation.gof.model.Pokemon;
@FeignClient(name ="pokeapi", url ="https://pokeapi.co/api/v2/pokemon")
public interface PokemonService {

    @GetMapping("/{name}")
    Pokemon getPokemonAPI(@PathVariable("name") String name);
}
