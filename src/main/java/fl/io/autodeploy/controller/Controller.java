package fl.io.autodeploy.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/deploy")
public class Controller {

    @GetMapping("/get")
    public String get() {
        return "WELCOME to CI/CD auto deploy";

    }

    @GetMapping("/get-one")
    public String getOne(){
        return "after deploying to github";
    }

}
