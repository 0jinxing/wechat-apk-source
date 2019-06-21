package com.tencent.mm.plugin.appbrand.widget.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class c
{
  public void a(String paramString, d paramd)
  {
    AppMethodBeat.i(87563);
    ab.d("IconLoadErrorHandler ", "setTabBarFail: ".concat(String.valueOf(paramString)));
    if (paramd.jpw != null)
      paramd.jpw.destroy(paramd.index);
    AppMethodBeat.o(87563);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.i.c
 * JD-Core Version:    0.6.2
 */