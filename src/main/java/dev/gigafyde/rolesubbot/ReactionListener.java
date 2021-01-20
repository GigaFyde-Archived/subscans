package dev.gigafyde.rolesubbot;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.message.guild.react.GuildMessageReactionAddEvent;
import net.dv8tion.jda.api.events.message.guild.react.GuildMessageReactionRemoveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class ReactionListener extends ListenerAdapter {
    public static Role allseries;
    public static Role greatimmortal;
    public static Role bladeofevolution;
    public static Role gatewayofrevolution;
    public static Role immportalemperor;
    public static Role shinsujeilsword;

    @Override
    public void onGuildMessageReactionAdd(GuildMessageReactionAddEvent event) {
        if (!event.getChannel().getId().equals("795472007797669898")) return;
        if (event.getReactionEmote().getName().equals("\u0030\ufe0f\u20e3"))
            event.getGuild().addRoleToMember(event.getMember(), allseries).reason("Reaction Role").queue();
        if (event.getReactionEmote().getName().equals("\u0031\ufe0f\u20e3"))
            event.getGuild().addRoleToMember(event.getMember(), greatimmortal).reason("Reaction Role").queue();
        if (event.getReactionEmote().getName().equals("\u0032\ufe0f\u20e3"))
            event.getGuild().addRoleToMember(event.getMember(), bladeofevolution).reason("Reaction Role").queue();
        if (event.getReactionEmote().getName().equals("\u0033\ufe0f\u20e3"))
            event.getGuild().addRoleToMember(event.getMember(), gatewayofrevolution).reason("Reaction Role").queue();
        if (event.getReactionEmote().getName().equals("\u0034\ufe0f\u20e3"))
            event.getGuild().addRoleToMember(event.getMember(), immportalemperor).reason("Reaction Role").queue();
        if (event.getReactionEmote().getName().equals("\u0035\ufe0f\u20e3"))
            event.getGuild().addRoleToMember(event.getMember(), shinsujeilsword).reason("Reaction Role").queue();
    }

    @Override
    public void onGuildMessageReactionRemove(GuildMessageReactionRemoveEvent event) {
        Member member = event.getGuild().retrieveMemberById(event.getUserId()).complete();
        if (!event.getChannel().getId().equals("795472007797669898")) return;
        if (event.getReactionEmote().getName().equals("\u0030\ufe0f\u20e3"))
            event.getGuild().removeRoleFromMember(member, allseries).reason("Reaction Role").queue();
        if (event.getReactionEmote().getName().equals("\u0031\ufe0f\u20e3"))
            event.getGuild().removeRoleFromMember(member, greatimmortal).reason("Reaction Role").queue();
        if (event.getReactionEmote().getName().equals("\u0032\ufe0f\u20e3"))
            event.getGuild().removeRoleFromMember(member, bladeofevolution).reason("Reaction Role").queue();
        if (event.getReactionEmote().getName().equals("\u0033\ufe0f\u20e3"))
            event.getGuild().removeRoleFromMember(member, gatewayofrevolution).reason("Reaction Role").queue();
        if (event.getReactionEmote().getName().equals("\u0034\ufe0f\u20e3"))
            event.getGuild().removeRoleFromMember(member, immportalemperor).reason("Reaction Role").queue();
        if (event.getReactionEmote().getName().equals("\u0035\ufe0f\u20e3"))
            event.getGuild().removeRoleFromMember(member, shinsujeilsword).reason("Reaction Role").queue();
    }
}
