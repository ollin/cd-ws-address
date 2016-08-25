package net.nautsch.address;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class Addresses {

    @RequestMapping(method= RequestMethod.GET)
    public @ResponseBody String[] all() {
        return new String[]{"Hello Address!"};
    }
}
