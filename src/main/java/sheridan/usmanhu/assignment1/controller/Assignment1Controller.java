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
    public ModelAndView input(@ModelAttribute rpsGame rpsGame){
        logger.trace("input() is called");
        logger.debug(""+rpsGame.getItem());
        return new ModelAndView("Input","rpsGame",rpsGame);
    }

    @GetMapping("/Process")
    public ModelAndView process(
            @Validated @ModelAttribute rpsGame rpsGame,
            BindingResult bindingResult){
        logger.trace("process() is called");
        logger.debug("item = " + rpsGame);
        if(bindingResult.hasErrors()){
            logger.trace("Error was called");
            logger.debug(""+rpsGame);
            return new ModelAndView("Input");
        }
        return new ModelAndView("Output", "rpsGame", rpsGame);
    }
}
