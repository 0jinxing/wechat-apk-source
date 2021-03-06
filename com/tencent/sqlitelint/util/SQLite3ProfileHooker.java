package com.tencent.sqlitelint.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;

public final class SQLite3ProfileHooker
{
  private static final String TAG = "SQLiteLint.SQLite3ProfileHooker";
  private static volatile boolean sIsTryHook;

  private static boolean doHook()
  {
    boolean bool = false;
    AppMethodBeat.i(94117);
    if (!hookOpenSQLite3Profile())
    {
      SLog.i("SQLiteLint.SQLite3ProfileHooker", "doHook hookOpenSQLite3Profile failed", new Object[0]);
      AppMethodBeat.o(94117);
    }
    while (true)
    {
      return bool;
      bool = nativeDoHook();
      AppMethodBeat.o(94117);
    }
  }

  private static boolean doUnHook()
  {
    AppMethodBeat.i(94118);
    unHookOpenSQLite3Profile();
    nativeStopProfile();
    AppMethodBeat.o(94118);
    return true;
  }

  public static void hook()
  {
    AppMethodBeat.i(94115);
    SLog.i("SQLiteLint.SQLite3ProfileHooker", "hook sIsTryHook: %b", new Object[] { Boolean.valueOf(sIsTryHook) });
    nativeStartProfile();
    if (!sIsTryHook)
    {
      SLog.i("SQLiteLint.SQLite3ProfileHooker", "hook hookRet: %b", new Object[] { Boolean.valueOf(doHook()) });
      sIsTryHook = true;
    }
    AppMethodBeat.o(94115);
  }

  private static boolean hookOpenSQLite3Profile()
  {
    boolean bool = true;
    AppMethodBeat.i(94119);
    try
    {
      Class localClass = Class.forName("android.database.sqlite.SQLiteDebug");
      Field localField = localClass.getDeclaredField("DEBUG_SQL_TIME");
      localField.setAccessible(true);
      localField.setBoolean(localClass, true);
      localField.setAccessible(false);
      AppMethodBeat.o(94119);
      return bool;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      while (true)
      {
        SLog.e("SQLiteLint.SQLite3ProfileHooker", "prepareHookBeforeOpenDatabase: e=%s", new Object[] { localClassNotFoundException.getLocalizedMessage() });
        AppMethodBeat.o(94119);
        bool = false;
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      while (true)
        SLog.e("SQLiteLint.SQLite3ProfileHooker", "prepareHookBeforeOpenDatabase: e=%s", new Object[] { localIllegalAccessException.getLocalizedMessage() });
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      while (true)
        SLog.e("SQLiteLint.SQLite3ProfileHooker", "prepareHookBeforeOpenDatabase: e=%s", new Object[] { localNoSuchFieldException.getLocalizedMessage() });
    }
  }

  private static native boolean nativeDoHook();

  private static native void nativeStartProfile();

  private static native void nativeStopProfile();

  public static void unHook()
  {
    AppMethodBeat.i(94116);
    if (sIsTryHook)
    {
      SLog.i("SQLiteLint.SQLite3ProfileHooker", "unHook unHookRet: %b", new Object[] { Boolean.valueOf(doUnHook()) });
      sIsTryHook = false;
    }
    AppMethodBeat.o(94116);
  }

  private static boolean unHookOpenSQLite3Profile()
  {
    boolean bool = true;
    AppMethodBeat.i(94120);
    try
    {
      Class localClass = Class.forName("android.database.sqlite.SQLiteDebug");
      Field localField = localClass.getDeclaredField("DEBUG_SQL_TIME");
      localField.setAccessible(true);
      localField.setBoolean(localClass, false);
      localField.setAccessible(false);
      AppMethodBeat.o(94120);
      return bool;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      while (true)
      {
        SLog.e("SQLiteLint.SQLite3ProfileHooker", "unHookOpenSQLite3Profile: e=%s", new Object[] { localClassNotFoundException.getLocalizedMessage() });
        AppMethodBeat.o(94120);
        bool = false;
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      while (true)
        SLog.e("SQLiteLint.SQLite3ProfileHooker", "unHookOpenSQLite3Profile: e=%s", new Object[] { localIllegalAccessException.getLocalizedMessage() });
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      while (true)
        SLog.e("SQLiteLint.SQLite3ProfileHooker", "unHookOpenSQLite3Profile: e=%s", new Object[] { localNoSuchFieldException.getLocalizedMessage() });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.sqlitelint.util.SQLite3ProfileHooker
 * JD-Core Version:    0.6.2
 */