package me.indiwide.indiwide;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Taras Maslov
 * 5/3/2018
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping//(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class RootC {
    
    @RequestMapping(method = RequestMethod.GET)
    public RootOvo root(){
        return new RootOvo();
    }
}
