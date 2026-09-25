package com.nipher.paperclip;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = "spring.ai.openai.api-key=test-key")
public class PaperClipApplicationTests {
    @Test void contextLoads() {}
}
