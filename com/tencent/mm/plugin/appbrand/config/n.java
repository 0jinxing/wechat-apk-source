package com.tencent.mm.plugin.appbrand.config;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ci.g;
import com.tencent.mm.plugin.appbrand.service.d;
import com.tencent.mm.plugin.appbrand.service.d.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vending.g.e;
import java.util.List;

public final class n
  implements d
{
  public final void a(String paramString, d.a parama)
  {
    AppMethodBeat.i(129878);
    r.a(paramString, false, new n.1(this, parama));
    AppMethodBeat.o(129878);
  }

  public final void aE(List<String> paramList)
  {
    AppMethodBeat.i(129881);
    if (bo.ek(paramList))
      AppMethodBeat.o(129881);
    while (true)
    {
      return;
      ab.i("MicroMsg.AppBrand.WxaAttrExportService", "batchSync list %s", new Object[] { bo.c(paramList, ", ") });
      r.a(paramList, j.a.hhq);
      AppMethodBeat.o(129881);
    }
  }

  public final void b(String paramString, d.a parama)
  {
    AppMethodBeat.i(129880);
    if (bo.isNullOrNil(paramString))
    {
      if (parama != null)
        parama.d(null);
      AppMethodBeat.o(129880);
    }
    while (true)
    {
      return;
      al localal = new al();
      new ak(localal.oAl.getLooper()).post(new n.3(this, parama, paramString, localal));
      AppMethodBeat.o(129880);
    }
  }

  public final WxaAttributes zb(String paramString)
  {
    AppMethodBeat.i(129876);
    paramString = com.tencent.mm.plugin.appbrand.app.f.auO().d(paramString, new String[0]);
    AppMethodBeat.o(129876);
    return paramString;
  }

  public final WxaAttributes zc(String paramString)
  {
    AppMethodBeat.i(129877);
    paramString = com.tencent.mm.plugin.appbrand.app.f.auO().e(paramString, new String[0]);
    AppMethodBeat.o(129877);
    return paramString;
  }

  public final e<WxaAttributes> zd(String paramString)
  {
    AppMethodBeat.i(129879);
    paramString = g.da(paramString).b(new n.2(this, paramString));
    AppMethodBeat.o(129879);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.n
 * JD-Core Version:    0.6.2
 */