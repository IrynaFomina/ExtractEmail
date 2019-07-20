package org.hillel.controllers;

import org.hillel.components.ExtractEmail;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("email")
public class ExtractEmailControlller {

    public ExtractEmailControlller() {
    }

    //http://localhost:8080/extractEmail-1.0-SNAPSHOT/emai/parse?
    @RequestMapping(value = "parse", method = RequestMethod.GET)
    @ResponseBody ()
    public List<String> matchString(String s) {
        return ExtractEmail.matchString(s);
    }
}
