package com.github.derick.lprojeto.Comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class AjudaC implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("ajuda")){}

        sender.sendMessage("§cUse o comandos Corretos:");
        sender.sendMessage("§cUse o comando Correto §c/ajuda");
        sender.sendMessage("§cUse o comando Correto §c/voar");
        sender.sendMessage("§cUse o comando Correto §c/vida");
        sender.sendMessage("§cUse o comando Correto §c/fome");
        return false;
    }
}
