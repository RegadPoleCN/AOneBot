package top.alazeprt.aonebot.action;

import top.alazeprt.aonebot.util.MapUtil;

import java.util.HashMap;
import java.util.Map;

import static top.alazeprt.aonebot.client.websocket.WebsocketBotClient.gson;

public class FriendPoke extends PostAction{
    private final long userId;

    public FriendPoke(long userId) {
        this.userId = userId;
    }

    @Override
    public String getData() {
        Map<String, Object> map = new HashMap<>();
        map.put("action", "friend_poke");
        map.put("params", MapUtil.of("user_id", userId));
        map.put("echo", "aob_" + System.currentTimeMillis()%10000);
        return gson.toJson(map);
    }
}
