package com.tencent.mm.console.a;

import android.content.Context;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.pluginsdk.cmd.b;
import com.tencent.mm.sdk.platformtools.ab;

public final class c
  implements com.tencent.mm.pluginsdk.cmd.a
{
  static
  {
    AppMethodBeat.i(16129);
    b.a(new c(), new String[] { "//fav" });
    AppMethodBeat.o(16129);
  }

  public static void init()
  {
  }

  public final boolean a(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(16128);
    if (ab.getLogLevel() > 1)
      AppMethodBeat.o(16128);
    while (true)
    {
      return bool;
      if (paramArrayOfString.length >= 2)
        break;
      AppMethodBeat.o(16128);
      bool = true;
    }
    paramContext = paramArrayOfString[1];
    switch (paramContext.hashCode())
    {
    default:
      label80: i = -1;
      label83: switch (i)
      {
      default:
      case 0:
      case 1:
      }
      break;
    case -1938535405:
    case -1648140403:
    }
    while (true)
    {
      AppMethodBeat.o(16128);
      bool = true;
      break;
      if (!paramContext.equals("resendfavitem"))
        break label80;
      break label83;
      if (!paramContext.equals("uploadfavitem"))
        break label80;
      i = 1;
      break label83;
      paramContext = new gh();
      paramContext.cAH.type = 39;
      paramContext.cAH.cAQ = paramArrayOfString[2];
      paramContext.cAH.cAR = paramArrayOfString[3];
      com.tencent.mm.sdk.b.a.xxA.a(paramContext, Looper.getMainLooper());
      continue;
      paramContext = new gh();
      paramContext.cAH.type = 38;
      paramContext.cAH.cAQ = paramArrayOfString[2];
      com.tencent.mm.sdk.b.a.xxA.a(paramContext, Looper.getMainLooper());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.a.c
 * JD-Core Version:    0.6.2
 */