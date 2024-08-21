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
            if (p.hasPermission("GVoar.perm")) {
                if (p.getAllowFlight()) {
                    p.setAllowFlight(false);
                    p.sendMessage("§4seu modo de voo foi desativado.");
                } else {
                    p.setAllowFlight(true);
                    p.sendMessage("§7seu modo de voo foi ativado.");
                }
            } else {
                    p.sendMessage("§4possui Permissão usar esse comando.");
            }
            return true;
        }
        return false;
    }
}
