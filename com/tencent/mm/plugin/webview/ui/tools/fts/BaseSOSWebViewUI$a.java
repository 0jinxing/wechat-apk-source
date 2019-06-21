package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.ui.widget.a.b;

public final class BaseSOSWebViewUI$a
  implements a.b
{
  int aTq;
  String rMJ;
  String userName;

  public BaseSOSWebViewUI$a(BaseSOSWebViewUI paramBaseSOSWebViewUI)
  {
  }

  public final int compareTo(Object paramObject)
  {
    AppMethodBeat.i(8350);
    int i;
    if ((paramObject == null) || (!(paramObject instanceof FTSBaseWebViewUI.a)))
    {
      i = -1;
      AppMethodBeat.o(8350);
    }
    while (true)
    {
      return i;
      paramObject = (FTSBaseWebViewUI.a)paramObject;
      i = this.rMJ.compareTo(paramObject.rMJ);
      AppMethodBeat.o(8350);
    }
  }

  public final String getTagName()
  {
    return this.rMJ;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI.a
 * JD-Core Version:    0.6.2
 */