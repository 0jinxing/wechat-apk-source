package com.tencent.mm.plugin.webview.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;

public final class am extends j<al>
{
  public static final String[] fnj;

  static
  {
    AppMethodBeat.i(6738);
    fnj = new String[] { j.a(al.ccO, "WebviewLocalData") };
    AppMethodBeat.o(6738);
  }

  public am(e parame)
  {
    super(parame, al.ccO, "WebviewLocalData", null);
  }

  public static int au(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(6737);
    int i = (paramString1 + paramString2 + paramString3).hashCode();
    AppMethodBeat.o(6737);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.am
 * JD-Core Version:    0.6.2
 */