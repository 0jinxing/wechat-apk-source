package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.ui.widget.a.b;

public final class FTSBaseWebViewUI$a
  implements a.b
{
  int aTq;
  String rMJ;
  String userName;

  public FTSBaseWebViewUI$a(FTSBaseWebViewUI paramFTSBaseWebViewUI)
  {
  }

  public final int compareTo(Object paramObject)
  {
    AppMethodBeat.i(8397);
    int i;
    if ((paramObject == null) || (!(paramObject instanceof a)))
    {
      i = -1;
      AppMethodBeat.o(8397);
    }
    while (true)
    {
      return i;
      paramObject = (a)paramObject;
      i = this.rMJ.compareTo(paramObject.rMJ);
      AppMethodBeat.o(8397);
    }
  }

  public final String getTagName()
  {
    return this.rMJ;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI.a
 * JD-Core Version:    0.6.2
 */