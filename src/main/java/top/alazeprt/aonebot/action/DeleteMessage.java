package top.alazeprt.aonebot.action;

import java.util.HashMap;
import java.util.Map;

import static top.alazeprt.aonebot.BotClient.gson;

public class DeleteMessage extends PostAction {
    private final long messageId;

    public DeleteMessage(long messageId) {
        this.messageId = messageId;
    }

    @Override
    public String getData() {
        Map<String, Object> map = new HashMap<>();
        map.put("action", "delete_msg");
        map.put("params", Map.of("message_id", messageId));
        map.put("echo", "aob_" + System.currentTimeMillis()%10000);
        return gson.toJson(map);
    }
}
