package net.de1mos.alfabattle.checkproject.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

data class EchoResponse(val result: String)

@RestController
@RequestMapping("/echo")
class EchoController {

    @GetMapping("/{name}")
    fun echo(@PathVariable("name") name: String): EchoResponse {
        return EchoResponse("Hello $name")
    }
}