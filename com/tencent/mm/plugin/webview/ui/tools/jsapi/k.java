package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.c;
import com.tencent.mm.at.o;
import com.tencent.mm.sdk.platformtools.bo;

public final class k
{
  public static void agC(String paramString)
  {
    AppMethodBeat.i(9839);
    if ((!bo.isNullOrNil(paramString)) && (paramString.startsWith("http")))
      o.ahk().a(paramString, null);
    AppMethodBeat.o(9839);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.k
 * JD-Core Version:    0.6.2
 */