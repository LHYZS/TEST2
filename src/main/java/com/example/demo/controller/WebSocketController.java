package com.example.demo.controller;

import com.example.demo.config.WebSocketServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
@RequestMapping(value ="/socket")
public class WebSocketController {
    @RequestMapping("/push")
    public String pushMsg(HttpServletRequest request) {
        String message = request.getParameter("fuwu");
        try {
            WebSocketServer.sendInfo(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "server";
    }

}
