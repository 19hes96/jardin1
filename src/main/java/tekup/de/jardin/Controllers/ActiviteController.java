package tekup.de.jardin.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tekup.de.jardin.Entities.ActiviteEntity;
import tekup.de.jardin.Services.ActiviteService;

public class ActiviteController {
    /**
     * Product controller.
     */
    @Controller
    public class ProductController {

        private ActiviteService activiteService;

        @Autowired
        public void setActiviteService(ActiviteService activiteService) {
            this.activiteService = activiteService;
        }

        /**
         * List all products.
         *
         * @param model
         * @return
         */
        @RequestMapping(value = "/activites", method = RequestMethod.GET)
        public String list(Model model) {
            model.addAttribute("activite", activiteService.listAllActivites());
            System.out.println("Returning activites :");
            return "activites";
        }

        /**
         * View a specific product by its id.
         *
         * @param id_a
         * @param model
         * @return
         */
        @RequestMapping("activite/{id_a}")
        public String showActivite(@PathVariable int id_a, Model model) {
            model.addAttribute("activite", activiteService.getActiviteById(id_a));
            return "activiteShow";
        }

        // Afficher le formulaire de modification du Product
        @RequestMapping("activite/edit/{id_a}")
        public String edit(@PathVariable int id_a, Model model) {
            model.addAttribute("activite", activiteService.getActiviteById(id_a));
            return "activiteForm";
        }

        /**
         * New product.
         *
         * @param model
         * @return
         */
        @RequestMapping("activite/new")
        public String newActivite(Model model) {
            model.addAttribute("activite", new ActiviteEntity());
            return "activiteForm";
        }

        /**
         * Save product to database.
         *
         * @param activiteEntity
         * @return
         */
        @RequestMapping(value = "activite", method = RequestMethod.POST)
        public String saveActivite(ActiviteEntity activiteEntity) {
            activiteService.saveActivite(activiteEntity);
            return "redirect:/activite/" + activiteEntity.getId_a();
        }

        /**
         * Delete product by its id.
         *
         * @param id_a
         * @return
         */
        @RequestMapping("activite/delete/{id_a}")
        public String delete(@PathVariable int id_a) {
            activiteService.deleteActivite(id_a);
            return "redirect:/activites";
        }
    }
}

