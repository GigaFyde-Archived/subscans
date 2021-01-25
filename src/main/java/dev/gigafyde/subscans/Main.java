package dev.gigafyde.subscans;

import dev.gigafyde.subscans.listeners.ReactionRoleListener;
import dev.gigafyde.subscans.listeners.ServerLogListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.MemberCachePolicy;

public class Main {
    public static JDA jda;

    public static void main(String[] args) throws Exception {
        jda = JDABuilder.createDefault(System.getenv("TOKEN"))
                .addEventListeners(new ReactionRoleListener(), new ServerLogListener())
                .enableIntents(GatewayIntent.GUILD_MEMBERS)
                .setMemberCachePolicy(MemberCachePolicy.ALL)
                .build();
        jda.awaitReady();
        ServerLogListener.serverlog = jda.getTextChannelById("803196535335813180");
        ReactionRoleListener.allseries = jda.getRoleById("794678279579500574");
        ReactionRoleListener.bladeofevolution = jda.getRoleById("795635019280023603");
        ReactionRoleListener.greatimmortal = jda.getRoleById("795634948835901480");
        ReactionRoleListener.gatewayofrevolution = jda.getRoleById("795635152750903296");
        ReactionRoleListener.immportalemperor = jda.getRoleById("799193875251855370");
        ReactionRoleListener.shinsujeilsword = jda.getRoleById("801463721577939005");
    }
}