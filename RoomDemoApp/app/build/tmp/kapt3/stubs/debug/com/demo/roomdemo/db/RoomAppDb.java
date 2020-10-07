package com.demo.roomdemo.db;

import java.lang.System;

@androidx.room.Database(entities = {com.demo.roomdemo.db.BookEntity.class}, version = 2)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/demo/roomdemo/db/RoomAppDb;", "Landroidx/room/RoomDatabase;", "()V", "userDao", "Lcom/demo/roomdemo/db/UserDao;", "Companion", "app_debug"})
public abstract class RoomAppDb extends androidx.room.RoomDatabase {
    private static com.demo.roomdemo.db.RoomAppDb INSTANCE;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.room.migration.Migration migration_1_2 = null;
    public static final com.demo.roomdemo.db.RoomAppDb.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.demo.roomdemo.db.UserDao userDao();
    
    public RoomAppDb() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\rR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lcom/demo/roomdemo/db/RoomAppDb$Companion;", "", "()V", "INSTANCE", "Lcom/demo/roomdemo/db/RoomAppDb;", "migration_1_2", "Landroidx/room/migration/Migration;", "getMigration_1_2", "()Landroidx/room/migration/Migration;", "destroyInstance", "", "getAppDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.room.migration.Migration getMigration_1_2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.demo.roomdemo.db.RoomAppDb getAppDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        public final void destroyInstance() {
        }
        
        private Companion() {
            super();
        }
    }
}