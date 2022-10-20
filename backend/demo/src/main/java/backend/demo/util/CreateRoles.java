package backend.demo.util;

import backend.demo.security.entity.Rol;
import backend.demo.security.enums.RolNombre;
import backend.demo.security.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CreateRoles implements CommandLineRunner {
    @Autowired
    RolService rolService;

    @Override
    public void run(String... args) throws Exception {
        /*Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
        Rol rolUser = new Rol(RolNombre.ROLE_USER);
        Rol rolCoordinador = new Rol(RolNombre.ROLE_COORDINADOR);
        Rol rolGerente = new Rol(RolNombre.ROLE_GERENTE);
        rolService.save(rolAdmin);
        rolService.save(rolUser);
        rolService.save(rolCoordinador);
        rolService.save(rolGerente);*/

    }
}
