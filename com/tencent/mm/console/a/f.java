package com.tencent.mm.console.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.nv;
import com.tencent.mm.modelstat.WatchDogPushReceiver;
import com.tencent.mm.pluginsdk.cmd.b;
import com.tencent.mm.sdk.platformtools.ab;

public final class f
  implements com.tencent.mm.pluginsdk.cmd.a
{
  static
  {
    AppMethodBeat.i(16135);
    b.a(new f(), new String[] { "//recovery" });
    AppMethodBeat.o(16135);
  }

  public static void init()
  {
  }

  public final boolean a(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(16134);
    if (ab.getLogLevel() > 1)
      AppMethodBeat.o(16134);
    while (true)
    {
      return bool;
      if (paramArrayOfString.length >= 2)
        break;
      AppMethodBeat.o(16134);
      bool = true;
    }
    paramContext = paramArrayOfString[1];
    switch (paramContext.hashCode())
    {
    default:
      label96: i = -1;
      label99: switch (i)
      {
      default:
      case 0:
      case 1:
      case 2:
      case 3:
      }
      break;
    case -1145939284:
    case -877169230:
    case -1421107579:
    case 107332:
    }
    while (true)
    {
      AppMethodBeat.o(16134);
      bool = true;
      break;
      if (!paramContext.equals("testpush"))
        break label96;
      break label99;
      if (!paramContext.equals("testmm"))
        break label96;
      i = 1;
      break label99;
      if (!paramContext.equals("testmmonline"))
        break label96;
      i = 2;
      break label99;
      if (!paramContext.equals("log"))
        break label96;
      i = 3;
      break label99;
      WatchDogPushReceiver.aku();
      continue;
      paramContext = new nv();
      paramContext.cKm.action = 1;
      com.tencent.mm.sdk.b.a.xxA.m(paramContext);
      continue;
      paramContext = new nv();
      paramContext.cKm.action = 3;
      com.tencent.mm.sdk.b.a.xxA.m(paramContext);
      continue;
      paramContext = new nv();
      paramContext.cKm.action = 2;
      com.tencent.mm.sdk.b.a.xxA.m(paramContext);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.a.f
 * JD-Core Version:    0.6.2
 */