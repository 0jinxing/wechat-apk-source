package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class FTSSOSHomeWebViewUI$c
{
  String content;
  int icon;
  int position;
  int type;
  int uBV;

  private FTSSOSHomeWebViewUI$c(FTSSOSHomeWebViewUI paramFTSSOSHomeWebViewUI)
  {
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(8474);
    paramObject = (c)paramObject;
    boolean bool = this.content.equals(paramObject.content);
    AppMethodBeat.o(8474);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.c
 * JD-Core Version:    0.6.2
 */