package vcore.utility.discord;

/** No-op implementation: never loads JNA or native libraries. */
final class DiscordRPCImpl implements DiscordRPC {
    public void Discord_UpdateHandlers(DiscordEventHandlers handlers) {}
    public void Discord_UpdatePresence(DiscordRichPresence presence) {}
    public void Discord_Respond(String userId, int reply) {}
    public void Discord_Register(String application, String command) {}
    public void Discord_Shutdown() {}
    public void Discord_UpdateConnection() {}
    public void Discord_RegisterSteamGame(String steamId, String command) {}
    public void Discord_RunCallbacks() {}
    public void Discord_Initialize(String applicationId, DiscordEventHandlers handlers, boolean autoRegister, String steamId) {}
    public void Discord_ClearPresence() {}
}
