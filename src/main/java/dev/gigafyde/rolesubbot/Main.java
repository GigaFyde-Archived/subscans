package dev.gigafyde.rolesubbot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Main {
    public static JDA jda;
    public static void main(String[] args) throws Exception {
        jda = JDABuilder.createDefault(System.getenv("TOKEN"))
                .addEventListeners(new ReactionListener())
                .build();
        jda.awaitReady();
        ReactionListener.allseries = jda.getRoleById("794678279579500574");
        ReactionListener.bladeofevolution = jda.getRoleById("795635019280023603");
        ReactionListener.greatimmortal = jda.getRoleById("795634948835901480");
        ReactionListener.gatewayofrevolution = jda.getRoleById("795635152750903296");
        ReactionListener.immportalemperor = jda.getRoleById("799193875251855370");
    }
}
