package com.tencent.mm.plugin.webview.modelcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;

public final class a$b extends j<a.a>
{
  public final boolean hrm;

  public a$b(e parame)
  {
    super(parame, a.a.cYj(), "WebViewCacheAppIdOccupation", null);
    AppMethodBeat.i(6817);
    if (parame != null);
    for (boolean bool = true; ; bool = false)
    {
      this.hrm = bool;
      AppMethodBeat.o(6817);
      return;
    }
  }

  final void ay(String paramString, long paramLong)
  {
    AppMethodBeat.i(6818);
    if (!this.hrm)
      AppMethodBeat.o(6818);
    while (true)
    {
      return;
      a.a locala = new a.a((byte)0);
      locala.field_appId = paramString;
      if (b(locala, new String[0]))
      {
        locala.field_occupation += paramLong;
        c(locala, new String[0]);
        AppMethodBeat.o(6818);
      }
      else
      {
        locala.field_occupation = paramLong;
        b(locala);
        AppMethodBeat.o(6818);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modelcache.a.b
 * JD-Core Version:    0.6.2
 */