package org.splendid.pvp;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class PvpPluginMain implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            // Yetki kontrolü
            if (player.hasPermission("pvp.perm")) {
                givePvpEquipment(player);
                player.sendMessage("PvP ekipmanları alındı!");
            } else {
                player.sendMessage("Bu komutu kullanma yetkiniz yok!");
            }
        } else {
            sender.sendMessage("Bu komut sadece oyuncular tarafından kullanılabilir!");
        }

        return true;
    }

    private void givePvpEquipment(Player player) {
        player.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD));
        player.getInventory().addItem(new ItemStack(Material.DIAMOND_AXE));
        player.getInventory().addItem(new ItemStack(Material.DIAMOND_HELMET));
        player.getInventory().addItem(new ItemStack(Material.DIAMOND_CHESTPLATE));
        player.getInventory().addItem(new ItemStack(Material.DIAMOND_LEGGINGS));
        player.getInventory().addItem(new ItemStack(Material.DIAMOND_BOOTS));
    }
}
