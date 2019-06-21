package com.tencent.mm.plugin.appbrand.appusage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import java.util.ArrayList;
import java.util.Locale;

public final class w$c
{
  private w$c(w paramw)
  {
  }

  public final ArrayList<AppBrandRecentTaskInfo> gi(long paramLong)
  {
    AppMethodBeat.i(129674);
    h localh = w.a(this.haq);
    String str = String.format(Locale.US, "%s=? and %s<? ", new Object[] { "scene", "updateTime" });
    Object localObject = String.format(Locale.US, "%s desc limit %d offset 0 ", new Object[] { "updateTime", Integer.valueOf(30) });
    localObject = w.f(localh.a("AppBrandLauncherLayoutItem", null, str, new String[] { "2", String.valueOf(paramLong) }, null, null, (String)localObject, 2));
    AppMethodBeat.o(129674);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.w.c
 * JD-Core Version:    0.6.2
 */