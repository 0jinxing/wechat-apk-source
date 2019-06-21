package com.tencent.mm.plugin.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class a
{
  public static String arO()
  {
    AppMethodBeat.i(123481);
    String str = ah.getContext().getSharedPreferences(ah.doA(), 0).getString("reg_last_exit_ui", "");
    AppMethodBeat.o(123481);
    return str;
  }

  private static String arP()
  {
    AppMethodBeat.i(123483);
    String str = ah.getContext().getSharedPreferences(ah.doA(), 0).getString("reg_next_enter_ui", "");
    AppMethodBeat.o(123483);
    return str;
  }

  public static void f(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(123485);
    if (paramBoolean);
    for (paramString = paramString + "," + bo.anU() + "," + arO(); ; paramString = paramString + "," + bo.anU() + "," + arP())
    {
      e.pXa.a(10645, paramString, true, true);
      AppMethodBeat.o(123485);
      return;
    }
  }

  public static void wA(String paramString)
  {
    AppMethodBeat.i(123482);
    ah.getContext().getSharedPreferences(ah.doA(), 0).edit().putString("reg_next_enter_ui", paramString).commit();
    AppMethodBeat.o(123482);
  }

  public static void wB(String paramString)
  {
    AppMethodBeat.i(123484);
    paramString = paramString + "," + bo.anU() + "," + arO();
    e.pXa.a(10645, paramString, true, true);
    AppMethodBeat.o(123484);
  }

  public static void wz(String paramString)
  {
    AppMethodBeat.i(123480);
    ah.getContext().getSharedPreferences(ah.doA(), 0).edit().putString("reg_last_exit_ui", paramString).commit();
    AppMethodBeat.o(123480);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.b.a
 * JD-Core Version:    0.6.2
 */