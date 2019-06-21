package com.tencent.mm.console.a;

import android.content.Context;
import android.os.Looper;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.fp;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bs;
import java.util.Calendar;

public final class h
  implements com.tencent.mm.pluginsdk.cmd.a
{
  static
  {
    AppMethodBeat.i(16139);
    com.tencent.mm.pluginsdk.cmd.b.a(new h(), new String[] { "//sport" });
    AppMethodBeat.o(16139);
  }

  public static void init()
  {
  }

  public final boolean a(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    AppMethodBeat.i(16138);
    boolean bool;
    if (ab.getLogLevel() > 1)
    {
      bool = false;
      AppMethodBeat.o(16138);
    }
    while (true)
    {
      return bool;
      if (paramArrayOfString.length >= 2)
        break;
      bool = true;
      AppMethodBeat.o(16138);
    }
    paramContext = paramArrayOfString[1];
    int i = -1;
    switch (paramContext.hashCode())
    {
    default:
      label96: switch (i)
      {
      default:
      case 0:
      case 1:
      case 2:
      case 3:
      }
      break;
    case -734972924:
    case 94746189:
    case 1761741959:
    case 1840324855:
    }
    while (true)
    {
      bool = true;
      AppMethodBeat.o(16138);
      break;
      if (!paramContext.equals("setdevicestep"))
        break label96;
      i = 0;
      break label96;
      if (!paramContext.equals("clear"))
        break label96;
      i = 1;
      break label96;
      if (!paramContext.equals("setextapistep"))
        break label96;
      i = 2;
      break label96;
      if (!paramContext.equals("updatehistorystep"))
        break label96;
      i = 3;
      break label96;
      i = Integer.valueOf(paramArrayOfString[2]).intValue();
      bo.dpC();
      paramContext = Calendar.getInstance();
      paramContext.set(11, 0);
      paramContext.set(12, 0);
      paramContext.set(13, 0);
      long l1 = paramContext.getTimeInMillis();
      long l2 = System.currentTimeMillis();
      ((com.tencent.mm.plugin.sport.a.b)g.K(com.tencent.mm.plugin.sport.a.b.class)).b("", "gh_43f2581f6fd6", (int)(l1 / 1000L), (int)(l2 / 1000L), i, bs.dut());
      continue;
      ((com.tencent.mm.plugin.sport.a.b)g.K(com.tencent.mm.plugin.sport.a.b.class)).cvZ();
      Process.killProcess(Process.myPid());
      continue;
      paramContext = new fp();
      paramContext.czu.action = 2;
      paramContext.czu.czx = Integer.valueOf(paramArrayOfString[2]).intValue();
      paramContext.czu.baZ = 1L;
      com.tencent.mm.sdk.b.a.xxA.a(paramContext, Looper.getMainLooper());
      continue;
      paramContext = Calendar.getInstance();
      paramContext.add(5, -1);
      paramContext.set(10, 23);
      paramContext.set(12, 59);
      paramContext.set(13, 59);
      l2 = paramContext.getTimeInMillis();
      paramContext.add(5, -120);
      paramContext.set(10, 0);
      paramContext.set(12, 0);
      paramContext.set(13, 0);
      l1 = paramContext.getTimeInMillis();
      ((com.tencent.mm.plugin.sport.a.b)g.K(com.tencent.mm.plugin.sport.a.b.class)).a(l1, l2, null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.a.h
 * JD-Core Version:    0.6.2
 */