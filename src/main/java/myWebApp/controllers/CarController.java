package myWebApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import myWebApp.dao.CarDAO;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarDAO carDAO;

    public CarController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping()
    public String getCars(@RequestParam(name = "count", required = false) Integer count, Model model) {
        if ( count != null && count <= 5 && count >= 0) {
            model.addAttribute("car", carDAO.getCountCars(count));
            return "auto/cars";
        }

        model.addAttribute("car", carDAO.index());
        return "auto/cars";
    }

}
