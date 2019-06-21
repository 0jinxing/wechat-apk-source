package com.tencent.mm.plugin.webview.luggage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.permission.LuggageGetA8Key.a;
import java.util.Map;

final class d$16 extends LuggageGetA8Key.a
{
  d$16(d paramd)
  {
  }

  public final void NN(String paramString)
  {
    AppMethodBeat.i(6033);
    this.uiy.NN(paramString);
    AppMethodBeat.o(6033);
  }

  public final void a(final int paramInt1, final String paramString1, final int paramInt2, final int paramInt3, final String paramString2)
  {
    AppMethodBeat.i(6036);
    this.uiy.uim = false;
    d.a(this.uiy, new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(6032);
        d.16.this.uiy.b(paramInt1, paramString1, paramInt2, paramInt3);
        AppMethodBeat.o(6032);
      }
    });
    AppMethodBeat.o(6036);
  }

  public final void cWY()
  {
    this.uiy.uim = false;
  }

  public final void e(String paramString1, String paramString2, Map<String, String> paramMap)
  {
    AppMethodBeat.i(6034);
    this.uiy.uim = false;
    d.a(this.uiy, new d.16.1(this, paramString1, paramString2, paramMap));
    AppMethodBeat.o(6034);
  }

  public final void ha(String paramString1, String paramString2)
  {
    AppMethodBeat.i(6035);
    this.uiy.uim = false;
    d.a(this.uiy, new d.16.2(this, paramString1, paramString2));
    AppMethodBeat.o(6035);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.d.16
 * JD-Core Version:    0.6.2
 */