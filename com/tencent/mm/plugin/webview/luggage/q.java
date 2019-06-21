package com.tencent.mm.plugin.webview.luggage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.c.d;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

public final class q
{
  public d uiI;
  public final HashMap<String, String> ujw;
  public final HashMap<String, c.d> ujx;

  public q(d paramd)
  {
    AppMethodBeat.i(6230);
    this.ujw = new HashMap();
    this.ujx = new HashMap();
    this.uiI = paramd;
    AppMethodBeat.o(6230);
  }

  public static String aef(String paramString)
  {
    AppMethodBeat.i(6232);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(6232);
    while (true)
    {
      return paramString;
      int i = paramString.indexOf("#");
      if (i < 0)
      {
        AppMethodBeat.o(6232);
      }
      else
      {
        paramString = paramString.substring(0, i);
        AppMethodBeat.o(6232);
      }
    }
  }

  public final String getAppId()
  {
    AppMethodBeat.i(6231);
    String str = this.uiI.getUrl();
    if (bo.isNullOrNil(str))
    {
      str = null;
      AppMethodBeat.o(6231);
    }
    while (true)
    {
      return str;
      str = aef(str);
      str = (String)this.ujw.get(str);
      AppMethodBeat.o(6231);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.q
 * JD-Core Version:    0.6.2
 */