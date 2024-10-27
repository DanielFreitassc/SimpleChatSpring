package com.danielfreitassc.backend.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import com.danielfreitassc.backend.dtos.ChatInputDto;
import com.danielfreitassc.backend.dtos.ChatOutputDto;

import jakarta.validation.Valid;

@Controller
public class LiveChatController{
    
    @MessageMapping("/new-message")
    @SendTo("/topic")
    public ChatOutputDto newMessage(@Valid ChatInputDto chatInputDto) {
        return new ChatOutputDto(HtmlUtils.htmlEscape(chatInputDto.user()+":"+chatInputDto.message()));
    }
}