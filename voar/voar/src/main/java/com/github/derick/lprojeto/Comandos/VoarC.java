package com.github.derick.lprojeto.Comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class VoarC implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Apenas jogadores podem executar esse comando.");
            return true;
        }
        Player p = (Player)sender;
        if (command.getName().equalsIgnoreCase("voar")) {
            if (p.hasPermission("FulanoFlx.Voar")) {
                if (p.getAllowFlight()) {
                    p.setAllowFlight(false);
                    p.sendMessage("seu modo de voo foi desativado.");
                } else {
                    p.setAllowFlight(true);
                    p.sendMessage("seu modo de voo foi ativado.");
                }
            } else {
                p.sendMessage("npossui permisspara usar esse comando.");
            }
            return true;
        }
        return false;
    }
}
