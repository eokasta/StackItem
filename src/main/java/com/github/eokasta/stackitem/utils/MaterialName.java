package com.github.eokasta.stackitem.utils;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;

public enum MaterialName {

    AIR__0("Ar"),
    STONE__0("Pedra"),
    STONE__1("Granito"),
    STONE__2("Granito Polido"),
    STONE__3("Diorito"),
    STONE__4("Diorito Polido"),
    STONE__5("Andesito"),
    STONE__6("Andesito Polido"),
    GRASS__0("Bloco de Grama"),
    DIRT__0("Terra"),
    DIRT__1("Terra infértil"),
    DIRT__2("Podzol"),
    COBBLESTONE__0("Pedregulho"),
    WOOD__0("Tábuas de carvalho"),
    WOOD__1("Tábuas de pinheiro"),
    WOOD__2("Tábuas de eucalipto"),
    WOOD__3("Tábuas de madeira da selva"),
    WOOD__4("Tábuas de acácia"),
    WOOD__5("Tábuas de carvalho escuro"),
    SAPLING__0("Muda de carvalho"),
    SAPLING__1("Muda de pinheiro"),
    SAPLING__2("Muda de eucalipto"),
    SAPLING__3("Muda de arvore da selva"),
    SAPLING__4("Muda de acácia"),
    SAPLING__5("Muda de carvalho escuro"),
    BEDROCK__0("Rocha-mãe"),
    WATER__0("Água"),
    STATIONARY_WATER__0("Água"),
    LAVA__0("Lava"),
    STATIONARY_LAVA__0("Lava"),
    SAND__0("Areia"),
    SAND__1("Areia vermelha"),
    GRAVEL__0("Cascalho"),
    GOLD_ORE__0("Minério de ouro"),
    IRON_ORE__0("Minério de ferro"),
    COAL_ORE__0("Minério de carvão"),
    LOG__0("Maderia de carvalho"),
    LOG__1("Maderia de oinheiro"),
    LOG__2("Maderia de eucalipto"),
    LOG__3("Maderia da selva"),
    LEAVES__0("Folhas de carvalho"),
    LEAVES__1("Folhas de pinheiro"),
    LEAVES__2("Folhas de eucalipto"),
    LEAVES__3("Folhas da selva "),
    SPONGE__0("Esponja"),
    SPONGE__1("Esponja úmida"),
    GLASS__0("Vidro"),
    LAPIS_ORE__0("Minério de lápis-lazúli"),
    LAPIS_BLOCK__0("Bloco de lápis-lazúli"),
    DISPENSER__0("Ejetor"),
    SANDSTONE__0("Arenito"),
    SANDSTONE__1("Arenito talhado"),
    SANDSTONE__2("Arenito lapidado"),
    NOTE_BLOCK__0("Bloco musical"),
    BED_BLOCK__0("Cama"),
    POWERED_RAIL__0("Trilho elétrico"),
    DETECTOR_RAIL__0("Trilho detector"),
    PISTON_STICKY_BASE__0("Pistão grudento"),
    WEB__0("Teia de aranha"),
    LONG_GRASS__0("Arbusto"),
    LONG_GRASS__1("Grama"),
    LONG_GRASS__2("Samambaia"),
    DEAD_BUSH__0("Arbusto seco"),
    PISTON_BASE__0("Pistão"),
    PISTON_EXTENSION__0("Pistão"),
    WOOL__0("Lã branca"),
    WOOL__1("Lã laranja"),
    WOOL__2("Lã magenta"),
    WOOL__3("Lã azul-clara"),
    WOOL__4("Lã amarela"),
    WOOL__5("Lã verde-limão"),
    WOOL__6("Lã rosa"),
    WOOL__7("Lã cinza"),
    WOOL__8("Lã cinza-clara"),
    WOOL__9("Lã ciano"),
    WOOL__10("Lã roxa"),
    WOOL__11("Lã azul"),
    WOOL__12("Lã marrom"),
    WOOL__13("Lã verde"),
    WOOL__14("Lã vermelha"),
    WOOL__15("Lã preta"),
    PISTON_MOVING_PIECE__0("Pistão"),
    YELLOW_FLOWER__0("Dente-de-leão"),
    RED_ROSE__0("Papoula"),
    RED_ROSE__1("Orquídea-azul"),
    RED_ROSE__2("Hortência"),
    RED_ROSE__3("Flor-silvestre-azul"),
    RED_ROSE__4("Tulipa vermelha"),
    RED_ROSE__5("Tulipa laranja"),
    RED_ROSE__6("Tulipa branca"),
    RED_ROSE__7("Tulipa rosa"),
    RED_ROSE__8("Margarida"),
    BROWN_MUSHROOM__0("Cogumelo"),
    RED_MUSHROOM__0("Cogumelo"),
    GOLD_BLOCK__0("Bloco de ouro"),
    IRON_BLOCK__0("Bloco de ferro"),
    DOUBLE_STEP__0("Laje dupla de pedra"),
    DOUBLE_STEP__1("Laje dupla de arenito"),
    DOUBLE_STEP__2("Laje dupla de madeira"),
    DOUBLE_STEP__3("Laje dupla de pedregulho"),
    DOUBLE_STEP__4("Laje dupla de tijolos"),
    DOUBLE_STEP__5("Laje dupla de tijolos de pedra"),
    DOUBLE_STEP__6("Laje dupla de tijolos do Nether"),
    DOUBLE_STEP__7("Laje dupla de quartzo"),
    STEP__0("Laje de pedra"),
    STEP__1("Laje de arenito"),
    STEP__2("Laje de madeira"),
    STEP__3("Laje de pedregulho"),
    STEP__4("Laje de tijolos"),
    STEP__5("Laje de tijolos de pedra"),
    STEP__6("Laje de tijolos do Nether"),
    STEP__7("Laje de quartzo"),
    BRICK__0("Tijolos"),
    TNT__0("Dinamite"),
    BOOKSHELF__0("Estante"),
    MOSSY_COBBLESTONE__0("Pedregulho musgoso"),
    OBSIDIAN__0("Obsidiana"),
    TORCH__0("Tocha"),
    FIRE__0("Fogo"),
    MOB_SPAWNER__0("Gerador de monstros"),
    WOOD_STAIRS__0("Escadas de carvalho"),
    CHEST__0("Baú"),
    REDSTONE_WIRE__0("Pó de redstone"),
    DIAMOND_ORE__0("Minério de diamante"),
    DIAMOND_BLOCK__0("Bloco de diamante"),
    WORKBENCH__0("Bancada de trabalho"),
    CROPS__0("Plantação"),
    SOIL__0("Terra arada"),
    FURNACE__0("Fornalha"),
    BURNING_FURNACE__0("Fornalha"),
    SIGN_POST__0("Placa"),
    WOODEN_DOOR__0("Porta de madeira"),
    LADDER__0("Escada"),
    RAILS__0("Trilho"),
    COBBLESTONE_STAIRS__0("Escadas de pedra"),
    WALL_SIGN__0("Placa"),
    LEVER__0("Alavanca"),
    STONE_PLATE__0("Placa de pressão de pedra"),
    IRON_DOOR_BLOCK__0("Porta de ferro"),
    WOOD_PLATE__0("Placa de pressão de madeira"),
    REDSTONE_ORE__0("Minério de redstone"),
    GLOWING_REDSTONE_ORE__0("Minério de redstone"),
    REDSTONE_TORCH_OFF__0("Tocha de redstone"),
    REDSTONE_TORCH_ON__0("Tocha de restone"),
    STONE_BUTTON__0("Botão"),
    SNOW__0("Neve"),
    ICE__0("Gelo"),
    SNOW_BLOCK__0("Neve"),
    CACTUS__0("Cacto"),
    CLAY__0("Argila"),
    SUGAR_CANE_BLOCK__0("Cana-de-açucar"),
    JUKEBOX__0("Toca-discos"),
    FENCE__0("Cerca de carvalho"),
    PUMPKIN__0("Abóbora"),
    NETHERRACK__0("Rocha do Nether"),
    SOUL_SAND__0("Areia das almas"),
    GLOWSTONE__0("Pedra luminosa"),
    PORTAL__0("Portal"),
    JACK_O_LANTERN__0("Abóbora de Halloween"),
    CAKE_BLOCK__0("Bolo"),
    DIODE_BLOCK_OFF__0("Repetidor de redstone"),
    DIODE_BLOCK_ON__0("Repetidor de redstone"),
    STAINED_GLASS__0("Vidro branco"),
    STAINED_GLASS__1("Vidro laranja"),
    STAINED_GLASS__2("Vidro magenta"),
    STAINED_GLASS__3("Vidro azul-claro"),
    STAINED_GLASS__4("Vidro amarelo"),
    STAINED_GLASS__5("Vidro verde-limão"),
    STAINED_GLASS__6("Vidro rosa"),
    STAINED_GLASS__7("Vidro cinza"),
    STAINED_GLASS__8("Vidro cinza-claro"),
    STAINED_GLASS__9("Vidro ciano"),
    STAINED_GLASS__10("Vidro lilás"),
    STAINED_GLASS__11("Vidro azul"),
    STAINED_GLASS__12("Vidro marrom"),
    STAINED_GLASS__13("Vidro verde"),
    STAINED_GLASS__14("Vidro vermelho"),
    STAINED_GLASS__15("Vidro preto"),
    LOCKED_CHEST__0("Baú trancado"),
    TRAP_DOOR__0("Alçapão de madeira"),
    MONSTER_EGGS__0("Pedra infestada"),
    MONSTER_EGGS__1("Pedregulho infestado"),
    MONSTER_EGGS__2("Tijolos de pedra infestados"),
    MONSTER_EGGS__3("Tijolos de pedra musgosos infestados"),
    MONSTER_EGGS__4("Tijolos de pedra rachados infestados"),
    MONSTER_EGGS__5("Tijolos de pedra talhados infestados"),
    SMOOTH_BRICK__0("Tijolos de pedra"),
    SMOOTH_BRICK__1("Tijolos de pedra mugosos"),
    SMOOTH_BRICK__2("Tijolos de pedra rachados"),
    SMOOTH_BRICK__3("Tijolos de pedra talhados"),
    HUGE_MUSHROOM_1__0("Bloco de cogumelo"),
    HUGE_MUSHROOM_2__0("Bloco de cogumelo"),
    IRON_FENCE__0("Barras de ferro"),
    THIN_GLASS__0("Painel de vidro"),
    MELON_BLOCK__0("Melancia"),
    PUMPKIN_STEM__0("Plantação de abóbora"),
    MELON_STEM__0("Plantação de melancia"),
    VINE__0("Vinhas"),
    FENCE_GATE__0("Portão de carvalho"),
    BRICK_STAIRS__0("Escadas de tijolos"),
    SMOOTH_STAIRS__0("Escadas de tijolos de pedra"),
    MYCEL__0("Micélio"),
    WATER_LILY__0("Vitória-régia"),
    NETHER_BRICK__0("Tijolos do Nether"),
    NETHER_FENCE__0("Cerca de tijolos do Nether"),
    NETHER_BRICK_STAIRS__0("Escadas de tijolos do Nether"),
    NETHER_WARTS__0("Plantação de fungo do Nether"),
    ENCHANTMENT_TABLE__0("Mesa de encantamentos"),
    BREWING_STAND__0("Suporte de poções"),
    CAULDRON__0("Caldeirão"),
    ENDER_PORTAL__0("Portal"),
    ENDER_PORTAL_FRAME__0("Portal do Fim"),
    ENDER_STONE__0("Pedra do fim"),
    DRAGON_EGG__0("Ovo do dragão"),
    REDSTONE_LAMP_OFF__0("Lâmpada de redstone"),
    REDSTONE_LAMP_ON__0("Lâmpada de redstone"),
    WOOD_DOUBLE_STEP__0("Laje Dupla de carvalho"),
    WOOD_DOUBLE_STEP__1("Laje Dupla de pinheiro"),
    WOOD_DOUBLE_STEP__2("Laje Dupla de eucalipto"),
    WOOD_DOUBLE_STEP__3("Laje Dupla de madeira da selva"),
    WOOD_DOUBLE_STEP__4("Laje Dupla de acácia"),
    WOOD_DOUBLE_STEP__5("Laje Dupla de carvalho escuro"),
    WOOD_STEP__0("Laje de carvalho"),
    WOOD_STEP__1("Laje de pinheiro"),
    WOOD_STEP__2("Laje de eucalipto"),
    WOOD_STEP__3("Laje de madeira da selva"),
    WOOD_STEP__4("Laje de acácia"),
    WOOD_STEP__5("Laje de carvalho escuro"),
    COCOA__0("Cacau"),
    SANDSTONE_STAIRS__0("Escadas de arenito"),
    EMERALD_ORE__0("Minério de esmeralda"),
    ENDER_CHEST__0("Baú do ender"),
    TRIPWIRE_HOOK__0("Gancho de armadilha"),
    TRIPWIRE__0("Gancho de armadilha"),
    EMERALD_BLOCK__0("Bloco de esmeralda"),
    SPRUCE_WOOD_STAIRS__0("Escadas de pinheiro"),
    BIRCH_WOOD_STAIRS__0("Escadas de eucalipto"),
    JUNGLE_WOOD_STAIRS__0("Escadas de madeira da selva"),
    COMMAND__0("Bloco de comando"),
    BEACON__0("Sinalizador"),
    COBBLE_WALL__0("Parede de pedregulho"),
    COBBLE_WALL__1("Parede de pedregulho musgosa"),
    FLOWER_POT__0("Vaso de flor"),
    CARROT__0("Plantação de cenouras"),
    POTATO__0("Plantação de batatas"),
    WOOD_BUTTON__0("Botão"),
    SKULL__0("Cabeça"),
    ANVIL__0("Bigorna"),
    ANVIL__1("Bigorna ligeiramente danificada"),
    ANVIL__2("Bigorna muito danificada"),
    TRAPPED_CHEST__0("Baú com armadilha"),
    GOLD_PLATE__0("Placa de pressão de pesagem leve"),
    IRON_PLATE__0("Placa de pressão de pesagem pesada"),
    IRON_PLATE__1("Placa de pressão de pesagem pesada"),
    REDSTONE_COMPARATOR_OFF__0("Comparador de redstone"),
    REDSTONE_COMPARATOR_ON__0("Comparador de redstone"),
    DAYLIGHT_DETECTOR__0("Detector de luz solar"),
    REDSTONE_BLOCK__0("Bloco de redstone"),
    QUARTZ_ORE__0("Minério de quartzo"),
    HOPPER__0("Funil"),
    QUARTZ_BLOCK__0("Bloco de quartzo"),
    QUARTZ_BLOCK__1("Bloco de quartzo talhado"),
    QUARTZ_BLOCK__2("Pilar de quartzo"),
    QUARTZ_STAIRS__0("Escadas de quartzo"),
    ACTIVATOR_RAIL__0("Trilho ativador"),
    DROPPER__0("Liberador"),
    STAINED_CLAY__0("Argila branca"),
    STAINED_CLAY__1("Argila laranja"),
    STAINED_CLAY__2("Argila magenta"),
    STAINED_CLAY__3("Argila azul-clara"),
    STAINED_CLAY__4("Argila amarela"),
    STAINED_CLAY__5("Argila verde-limão"),
    STAINED_CLAY__6("Argila rosa"),
    STAINED_CLAY__7("Argila cinza"),
    STAINED_CLAY__8("Argila cinza-clara"),
    STAINED_CLAY__9("Argila ciano"),
    STAINED_CLAY__10("Argila lilás"),
    STAINED_CLAY__11("Argila azul"),
    STAINED_CLAY__12("Argila marrom"),
    STAINED_CLAY__13("Argila verde"),
    STAINED_CLAY__14("Argila vermelha"),
    STAINED_CLAY__15("Argila preta"),
    STAINED_GLASS_PANE__0("Painel de vidro branco"),
    STAINED_GLASS_PANE__1("Painel de vidro laranja"),
    STAINED_GLASS_PANE__2("Painel de vidro magenta"),
    STAINED_GLASS_PANE__3("Painel de vidro azul-claro"),
    STAINED_GLASS_PANE__4("Painel de vidro amarelo"),
    STAINED_GLASS_PANE__5("Painel de vidro verde-limão"),
    STAINED_GLASS_PANE__6("Painel de vidro rosa"),
    STAINED_GLASS_PANE__7("Painel de vidro cinza"),
    STAINED_GLASS_PANE__8("Painel de vidro cinza-claro"),
    STAINED_GLASS_PANE__9("Painel de vidro ciano"),
    STAINED_GLASS_PANE__10("Painel de vidro lilás"),
    STAINED_GLASS_PANE__11("Painel de vidro azul"),
    STAINED_GLASS_PANE__12("Painel de vidro marrom"),
    STAINED_GLASS_PANE__13("Painel de vidro verde"),
    STAINED_GLASS_PANE__14("Painel de vidro vermelho"),
    STAINED_GLASS_PANE__15("Painel de vidro preto"),
    LEAVES_2__0("Folhas de acácia"),
    LEAVES_2__1("Folhas de carvalho escuro"),
    LOG_2__0("Madeira de acácia"),
    LOG_2__1("Madeira de carvalho escuro"),
    ACACIA_STAIRS__0("Escadas de acácia"),
    DARK_OAK_STAIRS__0("Escadas de carvalho escuro"),
    SLIME_BLOCK__0("Bloco de slime"),
    BARRIER__0("Barreira"),
    IRON_TRAPDOOR__0("Alçapão de ferro"),
    PRISMARINE__0("Prismarinho"),
    PRISMARINE__1("Tijolos de prismarinho"),
    PRISMARINE__2("Prismarinho escuro"),
    SEA_LANTERN__0("Lanterna do mar"),
    HAY_BLOCK__0("Fardo de feno"),
    CARPET__0("Carpete"),
    CARPET__1("Carpete laranja"),
    CARPET__2("Carpete magenta"),
    CARPET__3("Carpete azul-claro"),
    CARPET__4("Carpete amarelo"),
    CARPET__5("Carpete verde-limão"),
    CARPET__6("Carpete rosa"),
    CARPET__7("Carpete cinza"),
    CARPET__8("Carpete cinza-claro"),
    CARPET__9("Carpete ciano"),
    CARPET__10("Carpete lilás"),
    CARPET__11("Carpete azul"),
    CARPET__12("Carpete marrom"),
    CARPET__13("Carpete verde"),
    CARPET__14("Carpete vermelho"),
    CARPET__15("Carpete preto"),
    HARD_CLAY__0("Argila endurecida"),
    COAL_BLOCK__0("Bloco de carvão"),
    PACKED_ICE__0("Gelo compactado"),
    DOUBLE_PLANT__0("Girassol"),
    DOUBLE_PLANT__1("Lilás"),
    DOUBLE_PLANT__2("Grama alta"),
    DOUBLE_PLANT__3("Samambaia grande"),
    DOUBLE_PLANT__4("Roseira"),
    DOUBLE_PLANT__5("Peônia"),
    STANDING_BANNER__0("Estandarte"),
    WALL_BANNER__0("Estandarte"),
    DAYLIGHT_DETECTOR_INVERTED__0("Detector de luz solar"),
    RED_SANDSTONE__0("Arenito vermelho"),
    RED_SANDSTONE__1("Arenito vermelho talhado"),
    RED_SANDSTONE__2("Arenito vermelho liso"),
    RED_SANDSTONE_STAIRS__0("Escadas de arenito vermelho"),
    DOUBLE_STONE_SLAB2__0("Laje dupla de arenito vermelho"),
    STONE_SLAB2__0("Laje de arenito vermelho"),
    SPRUCE_FENCE_GATE__0("Portão de pinheiro"),
    BIRCH_FENCE_GATE__0("Portão de eucalipto"),
    JUNGLE_FENCE_GATE__0("Portão de madeira da selva"),
    DARK_OAK_FENCE_GATE__0("Portão de carvalho escuro"),
    ACACIA_FENCE_GATE__0("Portão de acácia"),
    SPRUCE_FENCE__0("Cerca de pinhero"),
    BIRCH_FENCE__0("Cerca de eucalipto"),
    JUNGLE_FENCE__0("Cerca de madeira da selva"),
    DARK_OAK_FENCE__0("Cerca de Carvalho escuro"),
    ACACIA_FENCE__0("Cerca de acácia"),
    SPRUCE_DOOR__0("Porta de pinheiro"),
    BIRCH_DOOR__0("Porta de eucalipto"),
    JUNGLE_DOOR__0("Porta de madeira da selva"),
    ACACIA_DOOR__0("Porta de acácia"),
    DARK_OAK_DOOR__0("Porta de carvalho escuro"),
    END_ROD__0("Lâmpada do End"),
    CHORUS_PLANT__0("Planta do coro"),
    CHORUS_FLOWER__0("Flor do coro"),
    PURPUR_BLOCK__0("Bloco de púrpura"),
    PURPUR_PILLAR__0("Pilar de púrpura"),
    PURPUR_STAIRS__0("Escadas de púrpura"),
    PURPUR_DOUBLE_SLAB__0("Laje dupla de púrpura"),
    PURPUR_SLAB__0("Laje de púrpura"),
    END_BRICKS__0("Tijolos de dedra do fim"),
    BEETROOT_BLOCK__0("Plantação de beterraba"),
    GRASS_PATH__0("Caminho de Grama"),
    END_GATEWAY__0("Portal do End"),
    COMMAND_REPEATING__0("Bloco de comando em repetição"),
    COMMAND_CHAIN__0("Bloco de comando em cadeia"),
    FROSTED_ICE__0("Gelo compactado"),
    MAGMA__0("Bloco de magma"),
    NETHER_WART_BLOCK__0("Bloco de fungos do Nether"),
    RED_NETHER_BRICK__0("Tijolos vermelhos do Nether"),
    BONE_BLOCK__0("Bloco de ossos"),
    STRUCTURE_VOID__0("Vazio da estrutura"),
    OBSERVER__0("Observador"),
    WHITE_SHULKER_BOX__0("Caixa de Shulker branca"),
    ORANGE_SHULKER_BOX__0("Caixa de Shulker laranja"),
    MAGENTA_SHULKER_BOX__0("Caixa de Shulker magenta"),
    LIGHT_BLUE_SHULKER_BOX__0("Caixa de Shulker azul-clara"),
    YELLOW_SHULKER_BOX__0("Caixa de Shulker amarela"),
    LIME_SHULKER_BOX__0("Caixa de Shulker verde-limão"),
    PINK_SHULKER_BOX__0("Caixa de Shulker rosa"),
    GRAY_SHULKER_BOX__0("Caixa de Shulker cinza"),
    SILVER_SHULKER_BOX__0("Caixa de Shulker cinza-clara"),
    CYAN_SHULKER_BOX__0("Caixa de Shulker ciano"),
    PURPLE_SHULKER_BOX__0("Caixa de Shulker roxa"),
    BLUE_SHULKER_BOX__0("Caixa de Shulker azul"),
    BROWN_SHULKER_BOX__0("Caixa de Shulker marrom"),
    GREEN_SHULKER_BOX__0("Caixa de Shulker verde"),
    RED_SHULKER_BOX__0("Caixa de Shulker vermelha"),
    BLACK_SHULKER_BOX__0("Caixa de Shulker preta"),
    WHITE_GLAZED_TERRACOTTA__0("Azulejo branco"),
    ORANGE_GLAZED_TERRACOTTA__0("Azulejo laranja"),
    MAGENTA_GLAZED_TERRACOTTA__0("Azulejo magenta"),
    LIGHT_BLUE_GLAZED_TERRACOTTA__0("Azulejo azul-claro"),
    YELLOW_GLAZED_TERRACOTTA__0("Azulejo amrelo"),
    LIME_GLAZED_TERRACOTTA__0("Azulejo verde-limão"),
    PINK_GLAZED_TERRACOTTA__0("Azulejo rosa"),
    GRAY_GLAZED_TERRACOTTA__0("Azulejo cinza"),
    SILVER_GLAZED_TERRACOTTA__0("Azulejo cinza-claro"),
    CYAN_GLAZED_TERRACOTTA__0("Azulejo ciano"),
    PURPLE_GLAZED_TERRACOTTA__0("Azulejo roxo"),
    BLUE_GLAZED_TERRACOTTA__0("Azulejo azul"),
    BROWN_GLAZED_TERRACOTTA__0("Azulejo marrom"),
    GREEN_GLAZED_TERRACOTTA__0("Azulejo verde"),
    RED_GLAZED_TERRACOTTA__0("Azulejo vermelho"),
    BLACK_GLAZED_TERRACOTTA__0("Azulejo preto"),
    CONCRETE__0("Concreto branco"),
    CONCRETE__1("Concreto laranja"),
    CONCRETE__2("Concreto magenta"),
    CONCRETE__3("Concreto azul-claro"),
    CONCRETE__4("Concreto amarelo"),
    CONCRETE__5("Concreto verde-limão"),
    CONCRETE__6("Concreto rosa"),
    CONCRETE__7("Concreto cinza"),
    CONCRETE__8("Concreto cinza-claro"),
    CONCRETE__9("Concreto ciano"),
    CONCRETE__10("Concreto roxo"),
    CONCRETE__11("Concreto azul"),
    CONCRETE__12("Concreto marrom"),
    CONCRETE__13("Concreto verde"),
    CONCRETE__14("Concreto vermelho"),
    CONCRETE__15("Concreto preto"),
    CONCRETE_POWDER__0("Cimento branco"),
    CONCRETE_POWDER__1("Cimento laranja"),
    CONCRETE_POWDER__2("Cimento magenta"),
    CONCRETE_POWDER__3("Cimento azul-claro"),
    CONCRETE_POWDER__4("Cimento amarelo"),
    CONCRETE_POWDER__5("Cimento verde-limão"),
    CONCRETE_POWDER__6("Cimento rosa"),
    CONCRETE_POWDER__7("Cimento cinza"),
    CONCRETE_POWDER__8("Cimento cinza-claro"),
    CONCRETE_POWDER__9("Cimento ciano"),
    CONCRETE_POWDER__10("Cimento roxo"),
    CONCRETE_POWDER__11("Cimento azul"),
    CONCRETE_POWDER__12("Cimento marrom"),
    CONCRETE_POWDER__13("Cimento verde"),
    CONCRETE_POWDER__14("Cimento vermelho"),
    CONCRETE_POWDER__15("Cimento preto"),
    STRUCTURE_BLOCK__0("Bloco de estrutura"),
    IRON_SPADE__0("Pá de ferro"),
    IRON_PICKAXE__0("Picareta de ferro"),
    IRON_AXE__0("Machado de ferro"),
    FLINT_AND_STEEL__0("Isqueiro"),
    APPLE__0("Maça"),
    BOW__0("Arco"),
    ARROW__0("Flecha"),
    COAL__0("Carvão"),
    COAL__1("Carvão vegetal"),
    DIAMOND__0("Diamante"),
    IRON_INGOT__0("Barra de ferro"),
    GOLD_INGOT__0("Barra de ouro"),
    IRON_SWORD__0("Espada de ferro"),
    WOOD_SWORD__0("Espara de madeira"),
    WOOD_SPADE__0("Pá de madeira"),
    WOOD_PICKAXE__0("Picareta de madeira"),
    WOOD_AXE__0("Machado de madeira"),
    STONE_SWORD__0("Espada de pedra"),
    STONE_SPADE__0("Pá de pedra"),
    STONE_PICKAXE__0("Picareta de pedra"),
    STONE_AXE__0("Machado de pedra"),
    DIAMOND_SWORD__0("Espada de diamante"),
    DIAMOND_SPADE__0("Pá de diamante"),
    DIAMOND_PICKAXE__0("Picareta de diamante"),
    DIAMOND_AXE__0("Machado de diamante"),
    STICK__0("Graveto"),
    BOWL__0("Tigela"),
    MUSHROOM_SOUP__0("Ensopado de cogumelos"),
    GOLD_SWORD__0("Espada de ouro"),
    GOLD_SPADE__0("Pá de ouro"),
    GOLD_PICKAXE__0("Picareta de ouro"),
    GOLD_AXE__0("Machado de ouro"),
    STRING__0("Linha"),
    FEATHER__0("Pena"),
    SULPHUR__0("Pólvora"),
    WOOD_HOE__0("Enxada de madeira"),
    STONE_HOE__0("Enxada de pedra"),
    IRON_HOE__0("Enxada de ferro"),
    DIAMOND_HOE__0("Enxada de diamante"),
    GOLD_HOE__0("Enxada de ouro"),
    SEEDS__0("Sementes"),
    WHEAT__0("Trigo"),
    BREAD__0("Pão"),
    LEATHER_HELMET__0("Capuz de couro"),
    LEATHER_CHESTPLATE__0("Túnica de couro"),
    LEATHER_LEGGINGS__0("Calças de couro"),
    LEATHER_BOOTS__0("Botas de couro"),
    CHAINMAIL_HELMET__0("Capacete de cota de malha"),
    CHAINMAIL_CHESTPLATE__0("Peitoral de cota de malha"),
    CHAINMAIL_LEGGINGS__0("Calças de cota de malha"),
    CHAINMAIL_BOOTS__0("Botas de cota de malha"),
    IRON_HELMET__0("Capacete de ferro"),
    IRON_CHESTPLATE__0("Peitoral de ferro"),
    IRON_LEGGINGS__0("Calças de ferro"),
    IRON_BOOTS__0("Botas de ferro"),
    DIAMOND_HELMET__0("Capacete de diamante"),
    DIAMOND_CHESTPLATE__0("Peitoral de diamante"),
    DIAMOND_LEGGINGS__0("Calças de diamante"),
    DIAMOND_BOOTS__0("Botas de diamante"),
    GOLD_HELMET__0("Capacete de ouro"),
    GOLD_CHESTPLATE__0("Peitoral de ouro"),
    GOLD_LEGGINGS__0("Calças de ouro"),
    GOLD_BOOTS__0("Botas de ouro"),
    FLINT__0("Pederneira"),
    PORK__0("Costeleta de porco crua"),
    GRILLED_PORK__0("Costeleta de porco assada"),
    PAINTING__0("Pintura"),
    GOLDEN_APPLE__0("Maça dourada"),
    GOLDEN_APPLE__1("Maça dourada encantada"),
    SIGN__0("Placa"),
    WOOD_DOOR__0("Porta de carvalho"),
    BUCKET__0("Balde"),
    WATER_BUCKET__0("Balde de água"),
    LAVA_BUCKET__0("Balde de lava"),
    MINECART__0("Carrinho"),
    SADDLE__0("Sela"),
    IRON_DOOR__0("Porta de ferro"),
    REDSTONE__0("Redstone"),
    SNOW_BALL__0("Bola de neve"),
    BOAT__0("Bote"),
    LEATHER__0("Couro"),
    MILK_BUCKET__0("Balde de leite"),
    CLAY_BRICK__0("Tijolo"),
    CLAY_BALL__0("Argila"),
    SUGAR_CANE__0("Cana-de-açucar"),
    PAPER__0("Papel"),
    BOOK__0("Livro"),
    SLIME_BALL__0("Gosma de slime"),
    STORAGE_MINECART__0("Carrinho com baú"),
    POWERED_MINECART__0("Carrinho com fornalha"),
    EGG__0("Ovo"),
    COMPASS__0("Bússola"),
    FISHING_ROD__0("Vara de pescar"),
    WATCH__0("Relógio"),
    GLOWSTONE_DUST__0("Pó de pedra luminosa"),
    RAW_FISH__0("Peixe cru"),
    RAW_FISH__1("Salmão cru"),
    RAW_FISH__2("Peixe-palhaço"),
    RAW_FISH__3("Baiacu"),
    COOKED_FISH__0("Peixe assado"),
    COOKED_FISH__1("Salmão assado"),
    INK_SACK__0("Bolsa de tinta"),
    INK_SACK__1("Vermelho da rosa"),
    INK_SACK__2("Verde do cacto"),
    INK_SACK__3("Sementes de cacau"),
    INK_SACK__4("Lápis-lazúli"),
    INK_SACK__5("Corante lilás"),
    INK_SACK__6("Corante ciano"),
    INK_SACK__7("Corante cinza-claro"),
    INK_SACK__8("Corante cinza"),
    INK_SACK__9("Corante rosa"),
    INK_SACK__10("Corante verde-limão"),
    INK_SACK__11("Amarelo do dente-de-leão"),
    INK_SACK__12("Corante azul-claro"),
    INK_SACK__13("Corante magenta"),
    INK_SACK__14("Corante laranja"),
    INK_SACK__15("Farinha de osso"),
    BONE__0("Osso"),
    SUGAR__0("Açúcar"),
    CAKE__0("Bolo"),
    BED__0("Cama"),
    DIODE__0("Repetidor de redstone"),
    COOKIE__0("Biscoito"),
    MAP__0("Mapa"),
    SHEARS__0("Tesourão"),
    MELON__0("Melancia"),
    PUMPKIN_SEEDS__0("Sementes de abóbora"),
    MELON_SEEDS__0("Sementes de melancia"),
    RAW_BEEF__0("Bife cru"),
    COOKED_BEEF__0("Bife"),
    RAW_CHICKEN__0("Frango cru"),
    COOKED_CHICKEN__0("Frango assado"),
    ROTTEN_FLESH__0("Carne podre"),
    ENDER_PEARL__0("Pérola do ender"),
    BLAZE_ROD__0("Vara incandescente"),
    GHAST_TEAR__0("Lágrima de ghast"),
    GOLD_NUGGET__0("Pepita de ouro"),
    NETHER_STALK__0("Fungo do Nether"),

    POTION__0("Frasco de água"),
    POTION__8193("Poção de regeneração"),
    POTION__8225("Poção de regeneração"),
    POTION__8257("Poção de regeneração"),
    POTION__16385("Poção arremessável de regeneração"),
    POTION__16417("Poção arremessável de regeneração"),
    POTION__16449("Poção arremessável de regeneração"),
    POTION__8194("Poção de velocidade"),
    POTION__8226("Poção de velocidade"),
    POTION__8258("Poção de velocidade"),
    POTION__16386("Poção arremessável de velocidade"),
    POTION__16418("Poção arremessável de velocidade"),
    POTION__16450("Poção arremessável de velocidade"),
    POTION__8227("Poção de resistência ao fogo"),
    POTION__8259("Poção de resistência ao fogo"),
    POTION__16419("Poção arremessável de resistência ao fogo"),
    POTION__16451("Poção arremessável de resistência ao fogo"),
    POTION__8196("Poção de veneno"),
    POTION__8228("Poção de veneno"),
    POTION__8260("Poção de veneno"),
    POTION__16388("Poção arremessável de veneno"),
    POTION__16420("Poção arremessável de veneno"),
    POTION__16452("Poção arremessável de veneno"),
    POTION__8261("Poção de regeneração instantânea"),
    POTION__8229("Poção de regeneração instantânea"),
    POTION__16453("Poção arremessável de regeneração instantânea"),
    POTION__16421("Poção arremessável de regeneração instantânea"),
    POTION__8230("Poção de visão noturna"),
    POTION__8262("Poção de visão noturna"),
    POTION__16422("Poção arremessável de visão noturna"),
    POTION__16454("Poção arremessável de visão noturna"),
    POTION__8232("Poção de fraqueza"),
    POTION__8264("Poção de fraqueza"),
    POTION__16424("Poção arremessável de fraqueza"),
    POTION__16456("Poção arremessável de fraqueza"),
    POTION__8201("Poção de força"),
    POTION__8233("Poção de força"),
    POTION__8265("Poção de força"),
    POTION__16393("Poção arremessável de força"),
    POTION__16425("Poção arremessável de força"),
    POTION__16457("Poção arremessável de força"),
    POTION__8268("Poção de dano instantâneo"),
    POTION__8236("Poção de dano instantâneo"),
    POTION__16460("Poção arremessável de dano instantâneo"),
    POTION__16428("Poção arremessável de dano instantâneo"),
    POTION__8237("Poção de respiração"),
    POTION__8269("Poção de respiração"),
    POTION__16429("Poção arremessável de respiração"),
    POTION__16461("Poção arremessável de respiração"),
    POTION__8238("Poção de invisibilidade"),
    POTION__8270("Poção de invisibilidade"),
    POTION__16430("Poção arremessável de invisibilidade"),
    POTION__16462("Poção arremessável de invisibilidade"),

    GLASS_BOTTLE__0("Frasco de vidro"),
    SPIDER_EYE__0("Olho de aranha"),
    FERMENTED_SPIDER_EYE__0("Olho de Aranha fermentado"),
    BLAZE_POWDER__0("Pó de blaze"),
    MAGMA_CREAM__0("Creme de magma"),
    BREWING_STAND_ITEM__0("Suporte de poções"),
    CAULDRON_ITEM__0("Caldeirão"),
    EYE_OF_ENDER__0("Olho do End"),
    SPECKLED_MELON__0("Melancia reluzente"),

    MONSTER_EGG__0("Ovo de invocação"),
    MONSTER_EGG__50("Ovo de invocação de creeper"),
    MONSTER_EGG__51("Ovo de invocação de esqueleto"),
    MONSTER_EGG__52("Ovo de invocação de aranha"),
    MONSTER_EGG__54("Ovo de invocação de zumbi"),
    MONSTER_EGG__55("Ovo de invocação de slime"),
    MONSTER_EGG__56("Ovo de invocação de ghast"),
    MONSTER_EGG__57("Ovo de invocação de homem-porco zumbi"),
    MONSTER_EGG__58("Ovo de invocação de enderman"),
    MONSTER_EGG__59("Ovo de invocação de aranha da caverna"),
    MONSTER_EGG__60("Ovo de invocação de traça"),
    MONSTER_EGG__61("Ovo de invocação de blaze"),
    MONSTER_EGG__62("Ovo de invocação de cubo de magma"),
    MONSTER_EGG__65("Ovo de invocação de morcego"),
    MONSTER_EGG__66("Ovo de invocação de bruxa"),
    MONSTER_EGG__67("Ovo de invocação de endermite"),
    MONSTER_EGG__68("Ovo de invocação de guardião"),
    MONSTER_EGG__90("Ovo de invocação de porco"),
    MONSTER_EGG__91("Ovo de invocação de ovelha"),
    MONSTER_EGG__92("Ovo de invocação de vaca"),
    MONSTER_EGG__93("Ovo de invocação de galinha"),
    MONSTER_EGG__94("Ovo de invocação de lula"),
    MONSTER_EGG__95("Ovo de invocação de lobo"),
    MONSTER_EGG__96("Ovo de invocação de coguvaca"),
    MONSTER_EGG__98("Ovo de invocação de jaguatirica"),
    MONSTER_EGG__100("Ovo de invocação de cavalo"),
    MONSTER_EGG__101("Ovo de invocação de coelho"),
    MONSTER_EGG__120("Ovo de invocação de aldeão"),

    EXP_BOTTLE__0("Frasco de experiência"),
    FIREBALL__0("Bola de fogo"),
    BOOK_AND_QUILL__0("Pena e livro"),
    WRITTEN_BOOK__0("Livro escrito"),
    EMERALD__0("Esmeralda"),
    ITEM_FRAME__0("Moldura"),
    FLOWER_POT_ITEM__0("Vaso de flor"),
    CARROT_ITEM__0("Cenoura"),
    POTATO_ITEM__0("Batata"),
    BAKED_POTATO__0("Batata assada"),
    POISONOUS_POTATO__0("Batata venenosa"),
    EMPTY_MAP__0("Mapa em branco"),
    GOLDEN_CARROT__0("Cenoura dourada"),
    SKULL_ITEM__0("Crânio de esqueleto"),
    SKULL_ITEM__1("Crânio de esqueleto do whiter"),
    SKULL_ITEM__2("Cabeça de zumbi"),
    SKULL_ITEM__3("Cabeça"),
    SKULL_ITEM__4("Cabeça de creeper"),
    SKULL_ITEM__5("Cabeça de dragão"),
    CARROT_STICK__0("Vara de pesca com cenoura"),
    NETHER_STAR__0("Estrela do Nether"),
    PUMPKIN_PIE__0("Torta de abóbora"),
    FIREWORK__0("Fogos de artifício"),
    FIREWORK_CHARGE__0("Estrela de fogos de artifício"),
    ENCHANTED_BOOK__0("Livro encantado"),
    REDSTONE_COMPARATOR__0("Comparador de redstone"),
    NETHER_BRICK_ITEM__0("Tijolo do Nether"),
    QUARTZ__0("Quartzo do Nether"),
    EXPLOSIVE_MINECART__0("Carrinho com dinamite"),
    HOPPER_MINECART__0("Carrinho com funil"),
    PRISMARINE_SHARD__0("Fragmento de prismarinho"),
    PRISMARINE_CRYSTALS__0("Cristais de prismarinho"),
    RABBIT__0("Coelho cru"),
    COOKED_RABBIT__0("Coelho assado"),
    RABBIT_STEW__0("Ensopado de coelho"),
    RABBIT_FOOT__0("Pé de coelho"),
    RABBIT_HIDE__0("Pele de coelho"),
    ARMOR_STAND__0("Suporte de armaduras"),
    IRON_BARDING__0("Armadura de ferro para cavalo"),
    GOLD_BARDING__0("Armadura de ouro para cavalo"),
    DIAMOND_BARDING__0("Armadura de diamante para cavalo"),
    LEASH__0("Laço"),
    NAME_TAG__0("Etiqueta"),
    COMMAND_MINECART__0("Carrinho com bloco de comando"),
    MUTTON__0("Carneiro cru"),
    COOKED_MUTTON__0("Carneiro assado"),
    BANNER__0("Estandarte preto"),
    BANNER__1("Estandarte vermelho"),
    BANNER__2("Estandarte verde"),
    BANNER__3("Estandarte marrom"),
    BANNER__4("Estandarte azul"),
    BANNER__5("Estandarte lilás"),
    BANNER__6("Estandarte ciano"),
    BANNER__7("Estandarte cinza-claro"),
    BANNER__8("Estandarte cinza"),
    BANNER__9("Estandarte rosa"),
    BANNER__10("Estandarte verde-limão"),
    BANNER__11("Estandarte amarelo"),
    BANNER__12("Estandarte azul-claro"),
    BANNER__13("Estandarte magenta"),
    BANNER__14("Estandarte laranja"),
    BANNER__15("Estandarte branco"),
    END_CRYSTAL__0("Cristal do End"),
    SPRUCE_DOOR_ITEM__0("Porta de pinheiro"),
    BIRCH_DOOR_ITEM__0("Porta de eucalipto"),
    JUNGLE_DOOR_ITEM__0("Porta de madeira da selva"),
    ACACIA_DOOR_ITEM__0("Porta de acácia"),
    DARK_OAK_DOOR_ITEM__0("Porta de carvalho escuro"),
    CHORUS_FRUIT__0("Fruta do coro"),
    CHORUS_FRUIT_POPPED__0("Fruta do coro estourada"),
    BEETROOT__0("Beterraba"),
    BEETROOT_SEEDS__0("Sementes de beterraba"),
    BEETROOT_SOUP__0("Sopa de beterraba"),
    DRAGONS_BREATH__0("Bafo de dragão"),
    SPLASH_POTION__0("Poção arremessável"),
    SPECTRAL_ARROW__0("Flecha espectral"),
    TIPPED_ARROW__0("Flecha especial"),
    LINGERING_POTION__0("Poção prolongada"),
    SHIELD__0("Escudo"),
    ELYTRA__0("Élitros"),
    BOAT_SPRUCE__0("Bote de pinheiro"),
    BOAT_BIRCH__0("Bote eucalipto"),
    BOAT_JUNGLE__0("Bote de madeira da selva"),
    BOAT_ACACIA__0("Bote de acácia"),
    BOAT_DARK_OAK__0("Bote de carvalho escuro"),
    TOTEM__0("Totem da imortalidade"),
    SHULKER_SHELL__0("Casco de Shulker"),
    IRON_NUGGET__0("Pepita de ferro"),
    KNOWLEDGE_BOOK__0("Livro do conhecimento"),
    GOLD_RECORD__0("Disco de música"),
    GREEN_RECORD__0("Disco de música"),
    RECORD_3__0("Disco de música"),
    RECORD_4__0("Disco de música"),
    RECORD_5__0("Disco de música"),
    RECORD_6__0("Disco de música"),
    RECORD_7__0("Disco de música"),
    RECORD_8__0("Disco de música"),
    RECORD_9__0("Disco de música"),
    RECORD_10__0("Disco de música"),
    RECORD_11__0("Disco de música"),
    RECORD_12__0("Disco de música");

    private String name;

    MaterialName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static MaterialName valueOf(ItemStack item) {
        try {
            return valueOf(item.getType() + "__" + item.getDurability());
        } catch (Throwable e) {
            return valueOf(item.getType() + "__0");
        }
    }

    public static MaterialName valueOf(String name, short durability) {
        try {
            return valueOf(name + "__" + durability);
        } catch (Throwable e) {
            return valueOf(name + "__0");
        }
    }
    public static MaterialName valueOf(String name, byte data) {
        try {
            return valueOf(name + "__" + data);
        } catch (Throwable e) {
            return valueOf(name + "__0");
        }
    }
    public static MaterialName valueOf(String name, int data) {
        try {
            return valueOf(name + "__" + data);
        } catch (Throwable e) {
            return valueOf(name + "__0");
        }
    }
    public static MaterialName valueOf(Material material, short durability) {
        try {
            return valueOf(material.name() + "__" + durability);
        } catch (Throwable e) {
            return valueOf(material.name() + "__0");
        }
    }
    public static MaterialName valueOf(Material material, byte data) {
        try {
            return valueOf(material.name() + "__" + data);
        } catch (Throwable e) {
            return valueOf(material.name() + "__0");
        }
    }
    public static MaterialName valueOf(Material material, int data) {
        try {
            return valueOf(material.name() + "__" + data);
        } catch (Throwable e) {
            return valueOf(material.name() + "__0");
        }
    }

    public static MaterialName valueOf(Material material) {
        return valueOf(material.name() + "__0");
    }

    public static MaterialName valueOf(Item item) {
        return valueOf(item.getItemStack());
    }
    public static MaterialName valueOf(Block block) {
        return valueOf(block.getType(), block.getData());
    }

    @Override
    public String toString() {
        return this.name;
    }
    
}
