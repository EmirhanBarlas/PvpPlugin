# PvpPlugin
Hello, today I will introduce you to a plugin that I built with Java 16 for Minecraft. The main feature of the plugin is that it is pvp focused, you can edit the plugin as you wish, among the following lines...


    private void givePvpEquipment(Player player) {
        player.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD));
        player.getInventory().addItem(new ItemStack(Material.DIAMOND_AXE));
        player.getInventory().addItem(new ItemStack(Material.DIAMOND_HELMET));
        player.getInventory().addItem(new ItemStack(Material.DIAMOND_CHESTPLATE));
        player.getInventory().addItem(new ItemStack(Material.DIAMOND_LEGGINGS));
        player.getInventory().addItem(new ItemStack(Material.DIAMOND_BOOTS));
        // add new lines here
    }
