package top.alazeprt.aonebot.action;

import top.alazeprt.aonebot.util.MapUtil;

import java.util.HashMap;
import java.util.Map;

import static top.alazeprt.aonebot.client.websocket.WebsocketBotClient.gson;

public class SetGroupSign extends PostAction{
    private final long groupId;

    public SetGroupSign(long groupId) {
        this.groupId = groupId;
    }

    @Override
    public String getData() {
        Map<String, Object> map = new HashMap<>();
        map.put("action", "set_group_sign");
        map.put("params", MapUtil.of("group_id", groupId));
        map.put("echo", "aob_" + System.currentTimeMillis()%10000);
        return gson.toJson(map);
    }
}
