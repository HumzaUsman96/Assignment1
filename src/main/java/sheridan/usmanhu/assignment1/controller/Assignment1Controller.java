package sheridan.usmanhu.assignment1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import sheridan.usmanhu.assignment1.domain.rpsGame;

@Controller
public class Assignment1Controller {

    private final Logger logger = LoggerFactory.getLogger(Assignment1Controller.class);

    @GetMapping(value={"/", "/Input"})
    public ModelAndView input(@ModelAttribute rpsGame rps){
        logger.trace("input() is called");
        logger.debug(""+rps.getItem());
        return new ModelAndView("Input");
    }

    @GetMapping("/Process")
    public ModelAndView process(
            @Validated @ModelAttribute rpsGame rps,
            BindingResult bindingResult){
        logger.trace("process() is called");
        logger.debug("item = " + rps);
        if(bindingResult.hasErrors()){
            return new ModelAndView("Input");
        }
        return new ModelAndView("Output", "rps", rps);
    }
}
