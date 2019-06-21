package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aa.g;
import com.tencent.mm.aa.i;

public final class m
{
  private final String TAG = "MircoMsg.XWebCodeCacheMeta";
  private String ckz;
  private String script;
  private int size;
  private long uJa;
  private m.a uJb;

  public m(String paramString)
  {
    this.ckz = paramString;
    this.uJb = m.a.uJc;
  }

  public m(String paramString, long paramLong, int paramInt)
  {
    this.script = paramString;
    this.uJa = paramLong;
    this.size = paramInt;
    this.uJb = m.a.uJd;
  }

  public final String toString()
  {
    AppMethodBeat.i(9854);
    Object localObject = new StringBuilder("//XWEB_SCRIPT:");
    i locali = new i();
    try
    {
      if (this.uJb == m.a.uJc)
      {
        locali.g("cache_mode", "fullcache");
        locali.g("js_src_kind", "path");
        locali.g("js_src", this.ckz);
        ((StringBuilder)localObject).append(locali.toString());
      }
      while (true)
      {
        localObject = ((StringBuilder)localObject).toString();
        AppMethodBeat.o(9854);
        return localObject;
        locali.g("cache_mode", "nocache");
        locali.g("js_src_kind", "string");
        locali.g("js_src", this.script);
        locali.g("js_param_kind", "buffer");
        locali.g("js_param", Long.toHexString(this.uJa));
        locali.K("js_param_length", this.size);
        ((StringBuilder)localObject).append(locali.toString());
      }
    }
    catch (g localg)
    {
      while (true)
        d.printErrStackTrace("MircoMsg.XWebCodeCacheMeta", localg, "toString", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.m
 * JD-Core Version:    0.6.2
 */