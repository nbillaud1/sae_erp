package fr.iut_unilim.erp_back.loaders;

import fr.iut_unilim.erp_back.entity.AvailableMenu;
import fr.iut_unilim.erp_back.repository.AutomaticMailRepository;
import fr.iut_unilim.erp_back.repository.AvailableMenuRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AutomaticMailLoader implements CommandLineRunner {
    private final AutomaticMailRepository automaticMailRepository;

    public AutomaticMailLoader(AutomaticMailRepository automaticMailRepository) {
        this.automaticMailRepository = automaticMailRepository;
    }

    @Override
    public void run(String... args) {
        if (automaticMailRepository.count() != 0) return;

        automaticMailRepository.save(new fr.iut_unilim.erp_back.entity.AutomaticMailConfig());
    }
}
