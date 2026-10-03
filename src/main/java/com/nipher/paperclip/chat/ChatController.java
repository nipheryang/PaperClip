package com.nipher.paperclip.chat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    // 声明路由，标在处理方法上
    @GetMapping("/api/v1/chat")
    // @RequestParam String q：把 URL 的 ?q=... 绑到方法参数
    public String chat (@RequestParam String q) {
        // 调业务、把结果作为 HTTP 响应体返回
        return chatService.chat(q);
    }



}
