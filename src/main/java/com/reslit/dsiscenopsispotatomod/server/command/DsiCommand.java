package com.reslit.dsiscenopsispotatomod.server.command;

import java.util.Map;
import java.util.HashMap;

import org.slf4j.Logger;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;

import net.minecraft.Util;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.MessageArgument;
import net.minecraft.commands.arguments.coordinates.Coordinates;
import net.minecraft.commands.arguments.coordinates.Vec3Argument;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.ChatType;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;

public class DsiCommand {
    private static final Logger LOGGER = LogUtils.getLogger();

    private static Map<Integer, Vec3> lastPositionMap = new HashMap<>();

    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        LiteralArgumentBuilder<CommandSourceStack> dsiCommand = Commands.literal("dsi")
            .requires((commandSource) -> commandSource.hasPermission(2))
            .then(Commands.literal("go")
                .then(Commands.literal("home")
                    .executes((cmdContext) -> { return perform(cmdContext.getSource(), true); }))
                .then(Commands.literal("back")
                    .executes((cmdContext) -> { return perform(cmdContext.getSource(), false);})));
    
        dispatcher.register(dsiCommand);
    }

    private static int perform(CommandSourceStack source, Boolean goHome) throws CommandSyntaxException {
        LOGGER.info("## perform");
        Entity entity = source.getEntity();
        if (entity instanceof ServerPlayer) {
            ServerPlayer splayer = (ServerPlayer) entity;

            if (goHome) {
                setCurrentPosition(entity);
                BlockPos pos = splayer.getRespawnPosition();
                splayer.teleportTo(pos.getX(), pos.getY() + 1, pos.getZ());
            } else {
                Vec3 v3 = getLastPosition(entity);

                if (v3 != null) {
                    splayer.teleportTo(v3.x, v3.y, v3.z);
                }
            }
        }
        LOGGER.info("## perform end");
        // ITextComponent messageValue = MessageArgument.getMessage(commandContext, "message");
        // String unformattedText = messageValue.toString();
        // ITextComponent pigifiedTextComponent = new StringTextComponent(unformattedText);
    
        // TranslationTextComponent finalText = new TranslationTextComponent("chat.type.announcement",
        //         commandContext.getSource().getDisplayName(), pigifiedTextComponent);
    
        // Entity entity = commandContext.getSource().getEntity();
        // if (entity != null) {
        //   commandContext.getSource().getServer().getPlayerList().func_232641_a_(finalText, ChatType.CHAT, entity.getUUID());
        //   //func_232641_a_ is sendMessage()
        // } else {
        //   commandContext.getSource().getServer().getPlayerList().func_232641_a_(finalText, ChatType.SYSTEM, Util.DUMMY_UUID);
        // }
        return 1;
    }

    private static void setCurrentPosition(Entity entity) {
        lastPositionMap.put(System.identityHashCode(entity), new Vec3(entity.getX(), entity.getY(), entity.getZ()));
    }

    private static Vec3 getLastPosition(Entity entity) {
        if (lastPositionMap.containsKey(System.identityHashCode(entity))) {
            return lastPositionMap.get(System.identityHashCode(entity));
        }
        return null;
    }
}
