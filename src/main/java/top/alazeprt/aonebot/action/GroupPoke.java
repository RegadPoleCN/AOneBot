package top.alazeprt.aonebot.action;

import top.alazeprt.aonebot.util.MapUtil;

import java.util.HashMap;
import java.util.Map;

import static top.alazeprt.aonebot.client.websocket.WebsocketBotClient.gson;

public class GroupPoke extends PostAction{
    private final long groupId;
    private final long userId;

    public GroupPoke(long groupId, long userId) {
        this.groupId = groupId;
        this.userId = userId;
    }

    @Override
    public String getData() {
        Map<String, Object> map = new HashMap<>();
        map.put("action", "group_poke");
        map.put("params", MapUtil.of("group_id", groupId, "user_id", userId));
        map.put("echo", "aob_" + System.currentTimeMillis()%10000);
        return gson.toJson(map);
    }
}
