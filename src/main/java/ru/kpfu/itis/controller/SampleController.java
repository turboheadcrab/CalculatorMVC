package ru.kpfu.itis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Apraxin Vladimir on 25.3.17.
 */

@Controller
public class SampleController {

    @RequestMapping("calc")
    ModelMap say(@RequestParam(required = false) Integer a,
                 @RequestParam(required = false) Integer b) {

        ModelMap modelMap = new ModelMap();
        if (a != null && b != null) {
            modelMap.addAttribute("a", a);
            modelMap.addAttribute("b", b);
            modelMap.addAttribute("result", a + b);
        } else {
            modelMap.addAttribute("result", "");
        }

        return modelMap;
    }
}
