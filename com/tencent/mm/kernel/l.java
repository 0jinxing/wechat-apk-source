package com.tencent.mm.kernel;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.sdk.platformtools.ab;

public final class l
{
  public static boolean bL(Context paramContext)
  {
    AppMethodBeat.i(58021);
    boolean bool;
    if (paramContext == null)
    {
      ab.e("MicroMsg.WeChatAppStatus", "getFullExitStatus context == null");
      bool = false;
      AppMethodBeat.o(58021);
    }
    while (true)
    {
      return bool;
      bool = paramContext.getSharedPreferences("system_config_prefs", h.Mu()).getBoolean("settings_fully_exit", true);
      AppMethodBeat.o(58021);
    }
  }

  public static boolean bM(Context paramContext)
  {
    boolean bool = false;
    AppMethodBeat.i(58023);
    if (paramContext == null)
    {
      ab.e("MicroMsg.WeChatAppStatus", "getShutDownWxStatus context == null");
      AppMethodBeat.o(58023);
    }
    while (true)
    {
      return bool;
      bool = paramContext.getSharedPreferences("system_config_prefs_showdown", h.Mu()).getBoolean("shut_down_weixin", false);
      AppMethodBeat.o(58023);
    }
  }

  public static void m(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(58020);
    if (paramContext == null)
    {
      ab.e("MicroMsg.WeChatAppStatus", "editFullExitStatus context == null");
      AppMethodBeat.o(58020);
    }
    while (true)
    {
      return;
      paramContext.getSharedPreferences("system_config_prefs", h.Mu()).edit().putBoolean("settings_fully_exit", paramBoolean).commit();
      ab.i("MicroMsg.WeChatAppStatus", "editFullExitStatus to ".concat(String.valueOf(paramBoolean)));
      AppMethodBeat.o(58020);
    }
  }

  public static void n(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(58022);
    if (paramContext == null)
    {
      ab.e("MicroMsg.WeChatAppStatus", "editShutDownWxStatus context == null");
      AppMethodBeat.o(58022);
    }
    while (true)
    {
      return;
      paramContext.getSharedPreferences("system_config_prefs_showdown", h.Mu()).edit().putBoolean("shut_down_weixin", paramBoolean).commit();
      ab.i("MicroMsg.WeChatAppStatus", "editShutDownWxStatus to ".concat(String.valueOf(paramBoolean)));
      AppMethodBeat.o(58022);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kernel.l
 * JD-Core Version:    0.6.2
 */