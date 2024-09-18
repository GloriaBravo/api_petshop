package com.petShop.domain.repository;

import com.petShop.domain.PetDomain;
import java.util.List;

public interface PetDomainRepository {
    List<PetDomain> getAll();
    PetDomain save(PetDomain petDomain);
    void delete (int idPet);
    boolean existsPet(int idPet);
    long countAll();
}
