package spring.micro.services.beerservice.services;

import spring.micro.services.beerservice.web.model.BeerDto;

import java.util.UUID;

/*
 * Created by Nibir Hossain on 21.08.20
 */
public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);
}
