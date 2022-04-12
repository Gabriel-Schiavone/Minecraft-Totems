package me.snazzy.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

public class Commands implements CommandExecutor, Listener {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (sender instanceof Player) {

            String command = cmd.getName().toLowerCase();

            if (command.equals("totems")) {
                sender.sendMessage(
                        ChatColor.DARK_GREEN +
                                "" + ChatColor.BOLD +
                                "" + ChatColor.UNDERLINE +
                                "Available Totems:\n" + ChatColor.GREEN + "1.) Totem of Bans\n2.) Totem of Boom\n3.) Totem of Flight\n4.) Totem of Life\n5.) Totem of Nukes\n6.) Totem of Power\n7.) Totem of Speed\n8.) Totem of Vanish\n9.) Totem of Zeus\n10.) Totem of Teleportation");
                return true;
            }
            if (command.equals("totem")) {

                if (args.length != 2) {
                    return false;
                }

                if (sender.hasPermission("totem.cmd")) {

                    String titleOfBook;
                    switch (args[1]) {
                        case "speed":
                            titleOfBook = "Totem of Speed";
                            break;
                        case "teleportation":
                            titleOfBook = "Totem of Teleportation";
                            break;
                        case "bans":
                            titleOfBook = "Totem of Bans";
                            break;
                        case "boom":
                            titleOfBook = "Totem of Boom";
                            break;
                        case "flight":
                            titleOfBook = "Totem of Flight";
                            break;
                        case "life":
                            titleOfBook = "Totem of Life";
                            break;
                        case "nukes":
                            titleOfBook = "Totem of Nukes";
                            break;
                        case "power":
                            titleOfBook = "Totem of Power";
                            break;
                        case "vanish":
                            titleOfBook = "Totem of Vanish";
                            break;
                        case "zeus":
                            titleOfBook = "Totem of Zeus";
                            break;
                        default:
                            sender.sendMessage("That is not a valid totem.");
                            return false;
                    }

                    ItemStack totem = new ItemStack(Material.WRITTEN_BOOK);
                    BookMeta book = (BookMeta) totem.getItemMeta();
                    book.setAuthor("Mr_Snazzy");
                    book.setTitle(titleOfBook);
                    totem.setItemMeta(book);
                    ((Player) sender).getInventory().addItem(totem);
                }
            }
        }
        return true;
    }
}

