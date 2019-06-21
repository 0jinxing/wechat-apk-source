package com.tencent.mm.plugin.appbrand.jsapi.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.s.b.a.a;
import com.tencent.mm.plugin.appbrand.s.b.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

final class b extends ah
  implements a.b
{
  private static final int CTRL_INDEX = 341;
  private static final String NAME = "onLocationChange";
  private final c hKI;

  b(c paramc)
  {
    this.hKI = paramc;
  }

  public final void a(int paramInt, String paramString, a.a parama)
  {
    AppMethodBeat.i(93821);
    if (paramInt == -1)
    {
      ab.e("MicroMsg.AppBrand.EventOnLocationChange", "errCode:%d, errStr:%s", new Object[] { Integer.valueOf(paramInt), paramString });
      AppMethodBeat.o(93821);
    }
    while (true)
    {
      return;
      paramString = new HashMap(7);
      paramString.put("longitude", Double.valueOf(parama.longitude));
      paramString.put("latitude", Double.valueOf(parama.latitude));
      paramString.put("speed", Double.valueOf(parama.iSf));
      paramString.put("accuracy", Double.valueOf(parama.iSg));
      paramString.put("altitude", Double.valueOf(parama.altitude));
      paramString.put("verticalAccuracy", Float.valueOf(0.0F));
      paramString.put("horizontalAccuracy", Double.valueOf(parama.iSg));
      if (!bo.isNullOrNil(parama.buildingId))
      {
        paramString.put("buildingId", parama.buildingId);
        paramString.put("floorName", parama.floorName);
      }
      paramString = new JSONObject(paramString).toString();
      ab.v("MicroMsg.AppBrand.EventOnLocationChange", "onLocationChanged %s, %s, %s", new Object[] { this.hKI.getAppId(), parama.bIy, paramString });
      try
      {
        j(this.hKI).AM(paramString).aCj();
        AppMethodBeat.o(93821);
      }
      finally
      {
        AppMethodBeat.o(93821);
      }
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.e.b
 * JD-Core Version:    0.6.2
 */