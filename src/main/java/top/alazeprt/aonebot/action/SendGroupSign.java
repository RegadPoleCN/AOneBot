package top.alazeprt.aonebot.action;

import top.alazeprt.aonebot.util.MapUtil;

import java.util.HashMap;
import java.util.Map;

import static top.alazeprt.aonebot.client.websocket.WebsocketBotClient.gson;

public class SendGroupSign extends PostAction{
    private final long groupId;

    public SendGroupSign(long groupId) {
        this.groupId = groupId;
    }

    @Override
    public String getData() {
        Map<String, Object> map = new HashMap<>();
        map.put("action", "send_group_sign");
        map.put("params", MapUtil.of("group_id", groupId));
        map.put("echo", "aob_" + System.currentTimeMillis()%10000);
        return gson.toJson(map);
    }
}
