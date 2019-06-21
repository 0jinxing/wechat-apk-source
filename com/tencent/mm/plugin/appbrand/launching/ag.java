package com.tencent.mm.plugin.appbrand.launching;

import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;

public enum ag
{
  public static void Ck(String paramString)
  {
    AppMethodBeat.i(131955);
    al.d(new ag.1(paramString));
    AppMethodBeat.o(131955);
  }

  public static String getMMString(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(131956);
    paramArrayOfObject = e.getMMString(paramInt, paramArrayOfObject);
    AppMethodBeat.o(131956);
    return paramArrayOfObject;
  }

  public static void oZ(int paramInt)
  {
    AppMethodBeat.i(131954);
    Ck(ah.getResources().getString(paramInt));
    AppMethodBeat.o(131954);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.ag
 * JD-Core Version:    0.6.2
 */