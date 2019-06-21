package com.tencent.mm.plugin.websearch.api;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ah
  implements c
{
  public c uaz;

  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void _getAllHosts(String paramString)
  {
    AppMethodBeat.i(124171);
    if (this.uaz != null)
      this.uaz._getAllHosts(paramString);
    AppMethodBeat.o(124171);
  }

  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void _getHtmlContent(String paramString)
  {
    AppMethodBeat.i(124172);
    if (this.uaz != null)
      this.uaz._getHtmlContent(paramString);
    AppMethodBeat.o(124172);
  }

  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void _ready(boolean paramBoolean)
  {
    AppMethodBeat.i(124173);
    if (this.uaz != null)
      this.uaz._ready(paramBoolean);
    AppMethodBeat.o(124173);
  }

  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void _sendMessage(String paramString)
  {
    AppMethodBeat.i(124170);
    if (this.uaz != null)
      this.uaz._sendMessage(paramString);
    AppMethodBeat.o(124170);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.api.ah
 * JD-Core Version:    0.6.2
 */