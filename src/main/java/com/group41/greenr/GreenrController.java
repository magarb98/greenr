package com.group41.greenr;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreenrController
{
    @RequestMapping("/")
    public String hello()
    {
        return "Hello User";
    }
}