package com.tencent.mm.api;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.plugin.i.c;
import com.tencent.mm.sdk.platformtools.bo;

public final class a
{
  public static String cC(String paramString)
  {
    AppMethodBeat.i(105476);
    String str = paramString;
    if (bo.isNullOrNil(paramString))
      str = "tempConv";
    paramString = new StringBuilder(c.XX());
    paramString.append(g.x(str.getBytes())).append("/");
    paramString.append("conv/");
    paramString = paramString.toString();
    AppMethodBeat.o(105476);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.api.a
 * JD-Core Version:    0.6.2
 */