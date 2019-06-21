package com.tencent.mm.plugin.appbrand.game.preload;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.j;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.l.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

public final class d$2
  implements b.a
{
  public d$2(d paramd, String paramString1, String paramString2)
  {
  }

  public final void AD(String paramString)
  {
  }

  public final void c(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    AppMethodBeat.i(130295);
    ab.v("MicroMsg.WAGamePreloadManager", "download errMsg:%d,mimeType:%s,filePath:%s,statusCode:%d,url:%s", new Object[] { Integer.valueOf(paramInt1), paramString1, paramString2, Integer.valueOf(paramInt2), this.val$url });
    if ((this.htz.htq == null) || (paramInt2 != 200))
    {
      ab.e("MicroMsg.WAGamePreloadManager", "download fileSystem is null or download failed!");
      AppMethodBeat.o(130295);
    }
    while (true)
    {
      return;
      d.a(this.htz, this.val$url);
      d.b(this.htz);
      paramString1 = this.fYh.substring(0, this.fYh.lastIndexOf("/") + 1);
      paramString1 = this.htz.htq.X(paramString1, true);
      if ((paramString1 == j.gXA) || (paramString1 == j.gXF))
        this.htz.htq.a(this.fYh, new File(paramString2), true);
      d.c(this.htz).addAndGet(1);
      AppMethodBeat.o(130295);
    }
  }

  public final void g(int paramInt, long paramLong1, long paramLong2)
  {
  }

  public final void p(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(130296);
    if (paramJSONObject != null);
    while (true)
    {
      try
      {
        int i = paramJSONObject.getInt("Content-Length");
        d.d(this.htz).addAndGet(i);
        AppMethodBeat.o(130296);
        return;
      }
      catch (JSONException paramJSONObject)
      {
        ab.printErrStackTrace("MicroMsg.WAGamePreloadManager", paramJSONObject, "content-length get error", new Object[0]);
      }
      AppMethodBeat.o(130296);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.preload.d.2
 * JD-Core Version:    0.6.2
 */