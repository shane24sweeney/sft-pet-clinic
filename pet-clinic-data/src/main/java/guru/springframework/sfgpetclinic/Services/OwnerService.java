package guru.springframework.sfgpetclinic.Services;

import guru.springframework.sfgpetclinic.model.Owner;

public interface OwnerService{

    Owner findById(Long id);

    Owner save(Owner owner);
}
