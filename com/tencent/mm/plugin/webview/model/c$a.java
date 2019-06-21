package com.tencent.mm.plugin.webview.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public final class c$a
{
  public String cMn;
  public String csB;
  public String desc;
  public String thumbUrl;
  public String title;
  public String url;

  public final boolean valid()
  {
    AppMethodBeat.i(6571);
    boolean bool;
    if (!bo.isNullOrNil(this.url))
    {
      bool = true;
      AppMethodBeat.o(6571);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(6571);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.c.a
 * JD-Core Version:    0.6.2
 */