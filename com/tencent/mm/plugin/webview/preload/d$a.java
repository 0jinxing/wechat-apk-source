package com.tencent.mm.plugin.webview.preload;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;

public final class d$a
{
  public String data;
  public Map<String, String> ipC;
  public int statusCode;

  public d$a()
  {
    AppMethodBeat.i(7041);
    this.ipC = new HashMap();
    this.data = "";
    AppMethodBeat.o(7041);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.preload.d.a
 * JD-Core Version:    0.6.2
 */