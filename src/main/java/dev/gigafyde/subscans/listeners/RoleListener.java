package dev.gigafyde.subscans.listeners;

import dev.gigafyde.subscans.Main;
import java.util.Objects;
import net.dv8tion.jda.api.events.guild.member.GuildMemberRoleAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class RoleListener extends ListenerAdapter {
    @Override
    public void onGuildMemberRoleAdd(@NotNull GuildMemberRoleAddEvent event) {
        if (event.getRoles().contains(Main.jda.getRoleById("806161918028677130"))) {
            Objects.requireNonNull(Main.jda.getTextChannelById("806163761097474118")).sendMessage("**Thank you so much for supporting us! " + event.getMember().getAsMention()).queue();
        }
    }
}
