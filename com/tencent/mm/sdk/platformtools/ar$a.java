package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ar$a
{
  private static SharedPreferences ubh;
  public static String xAa;
  public static String xAb;

  static
  {
    AppMethodBeat.i(93418);
    ubh = ah.getContext().getSharedPreferences("pref_MultiProcSP_dyncfg", 4);
    xAa = "pref_key_is_enable_MultiProcSP";
    xAb = "pref_key_is_disabled_MultiProcSP_manually";
    AppMethodBeat.o(93418);
  }

  private static boolean amE(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(93416);
    reload();
    if (ubh == null)
    {
      ab.w("MicroMsg.MultiProcSharedPreferences", "SharedPreferences in DynamicConfigStorage initialize failed.");
      AppMethodBeat.o(93416);
    }
    while (true)
    {
      return bool;
      bool = ubh.getBoolean(paramString, false);
      ab.d("MicroMsg.MultiProcSharedPreferences", "DynamicConfigStorage, getValue:%b", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(93416);
    }
  }

  public static boolean doX()
  {
    AppMethodBeat.i(93414);
    boolean bool;
    if ((!amE(xAb)) && (amE(xAa)))
    {
      bool = true;
      AppMethodBeat.o(93414);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(93414);
    }
  }

  public static void pi(boolean paramBoolean)
  {
    AppMethodBeat.i(93413);
    setValue(xAb, paramBoolean);
    AppMethodBeat.o(93413);
  }

  private static void reload()
  {
    AppMethodBeat.i(93415);
    ubh = ah.getContext().getSharedPreferences("pref_MultiProcSP_dyncfg", 4);
    AppMethodBeat.o(93415);
  }

  public static void setValue(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(93417);
    if (ubh == null)
    {
      ab.w("MicroMsg.MultiProcSharedPreferences", "SharedPreferences in DynamicConfigStorage initialize failed.");
      AppMethodBeat.o(93417);
    }
    while (true)
    {
      return;
      SharedPreferences.Editor localEditor = ubh.edit();
      localEditor.putBoolean(paramString, paramBoolean);
      localEditor.commit();
      AppMethodBeat.o(93417);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.ar.a
 * JD-Core Version:    0.6.2
 */