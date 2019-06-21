package com.tencent.mm.bo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.support.v4.app.v.c;
import android.text.format.Time;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class a
{
  private static String evP = "";

  public static String My()
  {
    AppMethodBeat.i(89331);
    if (bo.isNullOrNil(evP))
      evP = com.tencent.mm.kernel.a.Mz().getString("message_channel_id", "message_channel_new_id");
    String str = evP;
    AppMethodBeat.o(89331);
    return str;
  }

  public static void aii(String paramString)
  {
    evP = paramString;
  }

  public static int bWV()
  {
    if (Build.VERSION.SDK_INT < 19);
    for (int i = 2130839731; ; i = 2130839733)
      return i;
  }

  public static v.c bt(Context paramContext, String paramString)
  {
    AppMethodBeat.i(89332);
    paramContext = new v.c(paramContext, paramString);
    AppMethodBeat.o(89332);
    return paramContext;
  }

  public static String dgM()
  {
    AppMethodBeat.i(89333);
    Object localObject;
    int i;
    if (d.iW(26))
    {
      localObject = new Time();
      ((Time)localObject).setToNow();
      i = ((Time)localObject).hour;
      int j = ((Time)localObject).minute;
      ah.getContext();
      if (!com.tencent.mm.m.a.bS(i, j))
      {
        ab.w("MicroMsg.NotificationHelper", "no shake & sound notification during background deactive time");
        i = 1;
        if (i == 0)
          break label75;
        localObject = "message_dnd_mode_channel_id";
        AppMethodBeat.o(89333);
      }
    }
    while (true)
    {
      return localObject;
      i = 0;
      break;
      label75: localObject = My();
      AppMethodBeat.o(89333);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bo.a
 * JD-Core Version:    0.6.2
 */