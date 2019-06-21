package com.tencent.mm.plugin.appbrand.jsapi.u.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

final class b$1
  implements ap.a
{
  b$1(b paramb)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(117372);
    b localb;
    Object localObject;
    int i;
    if (this.idQ.idM != null)
    {
      localb = this.idQ;
      localObject = this.idQ.idM;
      if (((c)localObject).idR == null)
        break label85;
      i = ((c)localObject).idR.getCurrentPosition();
    }
    while (true)
    {
      int j = (int)(this.idQ.idN * 1000.0D);
      try
      {
        int k = Math.abs(i - localb.idO);
        if (k < 250);
        while (true)
        {
          AppMethodBeat.o(117372);
          return true;
          label85: i = 0;
          break;
          localb.idO = i;
          double d1 = j * 1.0D / 1000.0D;
          double d2 = i * 1.0D / 1000.0D;
          localObject = new java/math/BigDecimal;
          ((BigDecimal)localObject).<init>(d2);
          d2 = ((BigDecimal)localObject).setScale(3, 4).doubleValue();
          localObject = localb.aFV();
          ((JSONObject)localObject).put("position", d2);
          ((JSONObject)localObject).put("duration", d1);
          b.g localg = new com/tencent/mm/plugin/appbrand/jsapi/u/b/b$g;
          localg.<init>((byte)0);
          localb.a(localg, (JSONObject)localObject);
        }
      }
      catch (JSONException localJSONException)
      {
        while (true)
          ab.e("MicroMsg.AppBrand.SameLayer.AppBrandVideoEventHandler", "OnXWebVideoTimeUpdate fail", new Object[] { localJSONException });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.b.b.1
 * JD-Core Version:    0.6.2
 */