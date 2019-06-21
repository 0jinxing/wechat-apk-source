package com.tencent.mm.plugin.appbrand.task;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;

public enum g
{
  public int code;
  public int iFi;

  static
  {
    AppMethodBeat.i(132847);
    iFf = new g("WASERVICE", 0, 1, 2147483647);
    iFg = new g("WAGAME", 1, 2, 2);
    iFh = new g("NIL", 2, 0, 0);
    iFj = new g[] { iFf, iFg, iFh };
    AppMethodBeat.o(132847);
  }

  private g(int paramInt1, int paramInt2)
  {
    this.code = paramInt1;
    this.iFi = paramInt2;
  }

  public static g H(Intent paramIntent)
  {
    AppMethodBeat.i(132845);
    int i = paramIntent.getIntExtra("AppBrandServiceType", iFh.code);
    for (paramIntent : values())
      if (paramIntent.code == i)
      {
        AppMethodBeat.o(132845);
        return paramIntent;
      }
    paramIntent = new IllegalStateException("AppBrandServiceType DeserializeFrom[Intent] Unreached Code");
    AppMethodBeat.o(132845);
    throw paramIntent;
  }

  public static g c(AppBrandInitConfigWC paramAppBrandInitConfigWC)
  {
    AppMethodBeat.i(132846);
    if (paramAppBrandInitConfigWC.xy())
    {
      paramAppBrandInitConfigWC = iFg;
      AppMethodBeat.o(132846);
    }
    while (true)
    {
      return paramAppBrandInitConfigWC;
      paramAppBrandInitConfigWC = iFf;
      AppMethodBeat.o(132846);
    }
  }

  public static g eB(boolean paramBoolean)
  {
    if (paramBoolean);
    for (g localg = iFg; ; localg = iFf)
      return localg;
  }

  public final Intent G(Intent paramIntent)
  {
    AppMethodBeat.i(132844);
    paramIntent.putExtra("AppBrandServiceType", this.code);
    AppMethodBeat.o(132844);
    return paramIntent;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.task.g
 * JD-Core Version:    0.6.2
 */