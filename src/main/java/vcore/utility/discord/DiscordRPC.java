package vcore.utility.discord;

/** Mobile-safe Discord RPC facade. Native Discord RPC is intentionally disabled. */
public interface DiscordRPC {
    DiscordRPC INSTANCE = new DiscordRPCImpl();

    static boolean isSupported() { return false; }
    static DiscordRPC getInstance() { return INSTANCE; }

    void Discord_UpdateHandlers(DiscordEventHandlers handlers);
    void Discord_UpdatePresence(DiscordRichPresence presence);
    void Discord_Respond(String userId, int reply);
    void Discord_Register(String application, String command);
    void Discord_Shutdown();
    void Discord_UpdateConnection();
    void Discord_RegisterSteamGame(String steamId, String command);
    void Discord_RunCallbacks();
    void Discord_Initialize(String applicationId, DiscordEventHandlers handlers, boolean autoRegister, String steamId);
    void Discord_ClearPresence();
}
