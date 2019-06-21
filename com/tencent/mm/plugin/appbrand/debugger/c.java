package com.tencent.mm.plugin.appbrand.debugger;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.av.c;
import com.tencent.mm.plugin.appbrand.task.h;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

public final class c
  implements av.c, DebuggerShell.a
{
  public final void A(Intent paramIntent)
  {
    AppMethodBeat.i(129941);
    h.bt(paramIntent.getStringExtra("appId"), paramIntent.getIntExtra("versionType", 0));
    AppMethodBeat.o(129941);
  }

  public final String name()
  {
    return "ForceKillAppNotify";
  }

  public final void u(Map<String, String> paramMap)
  {
    AppMethodBeat.i(129940);
    String str;
    int i;
    if (DebuggerShell.ayT())
    {
      str = (String)paramMap.get(".sysmsg.AppBrandForceKill.AppId");
      i = bo.getInt((String)paramMap.get(".sysmsg.AppBrandForceKill.VersionType"), 0);
      if (bo.isNullOrNil(str))
        AppMethodBeat.o(129940);
    }
    while (true)
    {
      return;
      h.bt(str, i);
      AppMethodBeat.o(129940);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.debugger.c
 * JD-Core Version:    0.6.2
 */