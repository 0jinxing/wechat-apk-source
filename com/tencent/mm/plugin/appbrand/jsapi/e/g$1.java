package com.tencent.mm.plugin.appbrand.jsapi.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.s.b.a.a;
import com.tencent.mm.plugin.appbrand.s.b.a.b;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

final class g$1
  implements a.b
{
  g$1(g paramg, c paramc, boolean paramBoolean, int paramInt)
  {
  }

  public final void a(int paramInt, String paramString, a.a parama)
  {
    AppMethodBeat.i(93824);
    ab.i("MicroMsg.JsApiGetLocation", "errCode:%d, errStr:%s, location:%s", new Object[] { Integer.valueOf(paramInt), paramString, parama });
    this.hKP.aDD();
    if (paramInt == 0)
    {
      paramString = new HashMap(4);
      paramString.put("latitude", Double.valueOf(parama.latitude));
      paramString.put("longitude", Double.valueOf(parama.longitude));
      paramString.put("speed", Double.valueOf(parama.iSf));
      paramString.put("accuracy", Double.valueOf(parama.iSg));
      if (this.hKO)
        paramString.put("altitude", Double.valueOf(parama.altitude));
      if (b.dnO())
        paramString.put("provider", parama.bIy);
      paramString.put("verticalAccuracy", Integer.valueOf(0));
      paramString.put("horizontalAccuracy", Double.valueOf(parama.iSg));
      if (!bo.isNullOrNil(parama.buildingId))
      {
        paramString.put("buildingId", parama.buildingId);
        paramString.put("floorName", parama.floorName);
      }
      this.hIt.M(this.eIl, this.hKP.j("ok", paramString));
      AppMethodBeat.o(93824);
    }
    while (true)
    {
      return;
      parama = new HashMap(1);
      parama.put("errCode", Integer.valueOf(paramInt));
      this.hIt.M(this.eIl, this.hKP.j("fail:".concat(String.valueOf(paramString)), parama));
      AppMethodBeat.o(93824);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.e.g.1
 * JD-Core Version:    0.6.2
 */