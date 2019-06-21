package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.Context;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.b.b;
import com.tencent.mm.modelgeo.d;
import com.tencent.mm.plugin.webview.stub.WebViewStubTempUI;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;

final class g$69
  implements b.b
{
  g$69(g paramg, String paramString)
  {
  }

  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    return false;
  }

  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, Bundle paramBundle)
  {
    AppMethodBeat.i(9131);
    if (!paramBoolean)
    {
      if ((!g.z(this.uHd)) && (!d.agA()))
      {
        g.A(this.uHd);
        if (g.i(this.uHd) != null)
          WebViewStubTempUI.c(g.i(this.uHd), g.i(this.uHd).getString(2131300421), g.i(this.uHd).getString(2131297061), g.i(this.uHd).getString(2131300878), g.i(this.uHd).getString(2131296868), new g.69.1(this), new g.69.2(this));
      }
      paramBoolean = true;
      AppMethodBeat.o(9131);
    }
    while (true)
    {
      return paramBoolean;
      ab.v("MicroMsg.MsgHandler", "doGeoLocation.onGetLocation, fLongitude:%f, fLatitude:%f, locType:%d, speed:%f, accuracy:%f", new Object[] { Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Integer.valueOf(paramInt), Double.valueOf(paramDouble1), Double.valueOf(paramDouble2) });
      if (g.B(this.uHd) != null)
        g.B(this.uHd).c(g.C(this.uHd));
      if (g.C(this.uHd) == null)
      {
        ab.w("MicroMsg.MsgHandler", "already callback");
        paramBoolean = false;
        AppMethodBeat.o(9131);
      }
      else
      {
        g.D(this.uHd);
        HashMap localHashMap = new HashMap();
        localHashMap.put("longitude", Float.valueOf(paramFloat1));
        g.b(this.uHd, String.valueOf(paramFloat1));
        localHashMap.put("latitude", Float.valueOf(paramFloat2));
        g.c(this.uHd, String.valueOf(paramFloat2));
        localHashMap.put("speed", Double.valueOf(paramDouble1));
        localHashMap.put("accuracy", Double.valueOf(paramDouble2));
        localHashMap.put("type", this.uHO);
        if (paramBundle != null)
        {
          localHashMap.put("indoor_building_id", paramBundle.getString("indoor_building_id"));
          localHashMap.put("indoor_building_floor", paramBundle.getString("indoor_building_floor"));
          localHashMap.put("indoor_building_type", Integer.valueOf(paramBundle.getInt("indoor_building_type")));
        }
        g.a(this.uHd, g.j(this.uHd), "geo_location:ok", localHashMap);
        paramBoolean = false;
        AppMethodBeat.o(9131);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.69
 * JD-Core Version:    0.6.2
 */