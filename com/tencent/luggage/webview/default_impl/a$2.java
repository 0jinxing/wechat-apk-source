package com.tencent.luggage.webview.default_impl;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$2
  implements Runnable
{
  a$2(a parama, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(90920);
    a.a(this.bRM).loadUrl(this.val$url);
    AppMethodBeat.o(90920);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.webview.default_impl.a.2
 * JD-Core Version:    0.6.2
 */