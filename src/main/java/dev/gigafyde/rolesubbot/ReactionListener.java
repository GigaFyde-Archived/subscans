package dev.gigafyde.rolesubbot;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.message.guild.react.GuildMessageReactionAddEvent;
import net.dv8tion.jda.api.events.message.guild.react.GuildMessageReactionRemoveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class ReactionListener extends ListenerAdapter {
    public static Role allseries;
    public static Role greatimmortal;
    public static Role devilcantlast;
    public static Role matchlessemperor;

    @Override
    public void onGuildMessageReactionAdd(GuildMessageReactionAddEvent event) {
        if (!event.getChannel().getId().equals("795472007797669898")) return;
        if (event.getReactionEmote().getName().equals("\u0030\ufe0f\u20e3"))
            event.getGuild().addRoleToMember(event.getMember(), allseries).reason("Reaction Role").queue();
        if (event.getReactionEmote().getName().equals("\u0031\ufe0f\u20e3"))
            event.getGuild().addRoleToMember(event.getMember(), greatimmortal).reason("Reaction Role").queue();
        if (event.getReactionEmote().getName().equals("\u0032\ufe0f\u20e3"))
            event.getGuild().addRoleToMember(event.getMember(), devilcantlast).reason("Reaction Role").queue();
        if (event.getReactionEmote().getName().equals("\u0033\ufe0f\u20e3"))
            event.getGuild().addRoleToMember(event.getMember(), matchlessemperor).reason("Reaction Role").queue();
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
            event.getGuild().removeRoleFromMember(member, devilcantlast).reason("Reaction Role").queue();
        if (event.getReactionEmote().getName().equals("\u0033\ufe0f\u20e3"))
            event.getGuild().removeRoleFromMember(member, matchlessemperor).reason("Reaction Role").queue();
    }

}
