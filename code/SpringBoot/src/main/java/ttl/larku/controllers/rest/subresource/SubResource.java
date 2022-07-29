/*
Copyright 2019-2022 Anil Pal
All rights reserved by The Third Lane, LLC.
*/

package ttl.larku.controllers.rest.subresource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("subResource")
@RequestMapping("/")
public class SubResource {

    @GetMapping("/sub")
    public String test2() {
        return "this is a sub resource";
    }
}
