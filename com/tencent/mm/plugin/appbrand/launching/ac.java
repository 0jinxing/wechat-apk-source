package com.tencent.mm.plugin.appbrand.launching;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.axr;
import com.tencent.mm.sdk.e.j;

public class ac extends j<ab>
{
  public static final String[] fjY;

  static
  {
    AppMethodBeat.i(94159);
    fjY = new String[] { j.a(ab.gSs, "LaunchWxaAppPBTable") };
    AppMethodBeat.o(94159);
  }

  public final boolean b(String paramString, axr paramaxr)
  {
    AppMethodBeat.i(94158);
    boolean bool;
    if ((TextUtils.isEmpty(paramString)) || (paramaxr == null))
    {
      bool = false;
      AppMethodBeat.o(94158);
    }
    while (true)
    {
      return bool;
      ab localab = new ab();
      localab.field_appId = paramString;
      localab.field_launchPB = paramaxr;
      bool = super.a(localab);
      AppMethodBeat.o(94158);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.ac
 * JD-Core Version:    0.6.2
 */