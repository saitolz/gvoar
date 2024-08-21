package com.github.derick.lprojeto;
import com.github.derick.lprojeto.Comandos.VoarC;
import jdk.jfr.internal.tool.Main;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class LProjeto extends JavaPlugin {

    public static Main plugin;

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§f----------------------------------------");
        Bukkit.getConsoleSender().sendMessage("§8Nome: §fGVoar");
        Bukkit.getConsoleSender().sendMessage("§8Versao: §91.0");
        Bukkit.getConsoleSender().sendMessage("§8Ator: §fFulano");
        Bukkit.getConsoleSender().sendMessage("§f----------------------------------------");
        Bukkit.getConsoleSender().sendMessage("§aSistema voar Ligado Com Sucesso");
        comandos();
    }

    public void comandos(){
        getCommand("voar").setExecutor(new VoarC());
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§4Sistema Deliganndo...");
    }
}