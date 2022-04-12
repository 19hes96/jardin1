package tekup.de.jardin.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tekup.de.jardin.Entities.ActiviteEntity;
import tekup.de.jardin.Entities.EnfantEntity;
import tekup.de.jardin.Services.EnfantService;

public class EnfantController {
    /**
     * Product controller.
     */
    @Controller
    public class ProductController {

        private EnfantService enfantService;

        @Autowired
        public void setEnfantService(EnfantService enfantService) {
            this.enfantService = enfantService;
        }

        /**
         * List all products.
         *
         * @param model
         * @return
         */
        @RequestMapping(value = "/enfants", method = RequestMethod.GET)
        public String list(Model model) {
            model.addAttribute("enfant", enfantService.listAllEnfants());
            System.out.println("Returning enfants:");
            return "enfants";
        }

        /**
         * View a specific product by its id.
         *
         * @param id_e
         * @param model
         * @return
         */
        @RequestMapping("activitie/{id_e}")
        public String showEnfant (@PathVariable int id_e, Model model) {
            model.addAttribute("enfant", enfantService.getEnfantById(id_e));
            return "enfantShow";
        }

        // Afficher le formulaire de modification du Product
        @RequestMapping("enfant/edit/{id_e}")
        public String edit(@PathVariable int id_e, Model model) {
            model.addAttribute("enfant", enfantService.getEnfantById(id_e));
            return "enfantForm";
        }

        /**
         * New product.
         *
         * @param model
         * @return
         */
        @RequestMapping("enfant/new")
        public String newEnfant(Model model) {
            model.addAttribute("enfant", new EnfantEntity());
            return "enfantForm";
        }

        /**
         * Save product to database.
         *
         * @param enfantEntity
         * @return
         */
        @RequestMapping(value = "enfant", method = RequestMethod.POST)
        public String saveEnfant(EnfantEntity enfantEntity) {
            enfantService.saveEnfant(enfantEntity);
            return "redirect:/enfant/" + enfantEntity.getId_e();
        }

        /**
         * Delete product by its id.
         *
         * @param id_e
         * @return
         */
        @RequestMapping("enfant/delete/{id_e}")
        public String delete(@PathVariable int id_e) {
            enfantService.deleteEnfant(id_e);
            return "redirect:/enfants";
        }
    }
}

