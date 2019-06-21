package com.tencent.mm.compatible.i;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class b
{
  private static int euG = 0;

  public static boolean Ml()
  {
    boolean bool = true;
    AppMethodBeat.i(93055);
    if (euG == 0)
    {
      SharedPreferences localSharedPreferences = ah.doB();
      if ((localSharedPreferences != null) && (localSharedPreferences.getBoolean("settings_support_swipe", true)))
        euG = 1;
    }
    else
    {
      if (euG != 1)
        break label58;
      AppMethodBeat.o(93055);
    }
    while (true)
    {
      return bool;
      euG = 2;
      break;
      label58: bool = false;
      AppMethodBeat.o(93055);
    }
  }

  public static void bK(boolean paramBoolean)
  {
    AppMethodBeat.i(93056);
    SharedPreferences localSharedPreferences = ah.doB();
    boolean bool = localSharedPreferences.getBoolean("settings_support_swipe", true);
    if (bool != paramBoolean)
      localSharedPreferences.edit().putBoolean("settings_support_swipe", paramBoolean).commit();
    ab.i("MicroMsg.StyleUtil", "switchSwipebackMode, from %B to %B", new Object[] { Boolean.valueOf(bool), Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(93056);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.i.b
 * JD-Core Version:    0.6.2
 */