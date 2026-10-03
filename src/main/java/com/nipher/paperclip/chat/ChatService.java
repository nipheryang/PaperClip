package com.nipher.paperclip.chat;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.stereotype.Service;
import org.springframework.ai.chat.model.ChatResponse;

@Service
public class ChatService {

    private final ChatModel chatModel;

    public ChatService(ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    public String chat(String question) {
        ChatResponse response = chatModel.call(new Prompt(question));
        return response.getResult().getOutput().getText();
    }




}
