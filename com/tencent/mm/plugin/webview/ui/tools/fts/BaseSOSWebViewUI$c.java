package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.ui.widget.a.b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class BaseSOSWebViewUI$c
{
  List<a.b> kPL;
  int type;
  String uAH;
  String uAI;
  Map<String, Object> uAJ;

  protected BaseSOSWebViewUI$c(BaseSOSWebViewUI paramBaseSOSWebViewUI)
  {
    AppMethodBeat.i(8357);
    this.uAH = "";
    this.uAI = "";
    this.uAJ = new HashMap();
    AppMethodBeat.o(8357);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(8358);
    if (this == paramObject)
      AppMethodBeat.o(8358);
    while (true)
    {
      return bool;
      if ((paramObject instanceof c))
      {
        paramObject = (c)paramObject;
        if ((paramObject.type == this.type) && (paramObject.uAI.equals(this.uAI)))
        {
          AppMethodBeat.o(8358);
        }
        else
        {
          AppMethodBeat.o(8358);
          bool = false;
        }
      }
      else
      {
        AppMethodBeat.o(8358);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI.c
 * JD-Core Version:    0.6.2
 */