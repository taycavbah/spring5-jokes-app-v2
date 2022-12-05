package cavett.springframework.spring5jokesappv2.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cavett.springframework.spring5jokesappv2.services.JokesService;

@Controller
public class JokesController {

    // can't be changed by something else in the class
    private final JokesService jokesService;

    // initialize the jokeService
    // coding to interface for dependency injection
    public JokesController(JokesService jokesService){
        this.jokesService = jokesService;
    }
    // going in for the root
    @RequestMapping({"/", " "})
    public String showJoke(Model model){

        model.addAttribute("joke", jokesService.getJoke());

        // this tells thymeleaf to look at index for template under index
        return "index"; 
    }
    
}
