package com.relaxingleg;

import com.relaxingleg.commands.music.NowPlaying;
import com.relaxingleg.commands.music.Play;
import com.relaxingleg.commands.music.Queue;
import com.relaxingleg.commands.music.Repeat;
import com.relaxingleg.commands.music.Skip;
import com.relaxingleg.commands.music.Stop;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;
public class Main {
    public static void main(String[] args) throws LoginException {
        //ENTER YOUR BOT TOKEN IN THE LINE BELOW
        JDA jda = JDABuilder.createDefault(Token.TOKEN).build();
        //ENTER YOUR BOT TOKEN IN THE LINE ABOVE
        jda.addEventListener(new Listeners());
        CommandManager manager = new CommandManager();
        manager.add(new Play());
        manager.add(new Skip());
        manager.add(new Stop());
        manager.add(new NowPlaying());
        manager.add(new Queue());
        manager.add(new Repeat());
        jda.addEventListener(manager);
    }
}
