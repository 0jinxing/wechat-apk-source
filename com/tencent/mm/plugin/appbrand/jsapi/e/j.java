package com.tencent.mm.plugin.appbrand.jsapi.e;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public final class j extends a
{
  public static final int CTRL_INDEX = 38;
  public static final String NAME = "openLocation";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(131112);
    try
    {
      f1 = bo.getFloat(paramJSONObject.optString("latitude"), 0.0F);
      f2 = bo.getFloat(paramJSONObject.optString("longitude"), 0.0F);
      localObject = e.Eh(paramJSONObject.optString("name"));
      str = e.Eh(paramJSONObject.optString("address"));
    }
    catch (Exception paramJSONObject)
    {
      try
      {
        float f1;
        float f2;
        String str;
        j = bo.getInt(paramJSONObject.optString("scale"), 0);
        paramJSONObject = new android/content/Intent;
        paramJSONObject.<init>();
        paramJSONObject.putExtra("map_view_type", 7);
        paramJSONObject.putExtra("kwebmap_slat", f1);
        paramJSONObject.putExtra("kwebmap_lng", f2);
        if (j > 0)
          paramJSONObject.putExtra("kwebmap_scale", j);
        paramJSONObject.putExtra("kPoiName", (String)localObject);
        paramJSONObject.putExtra("Kwebmap_locaion", str);
        Object localObject = paramc.getContext();
        if (localObject == null)
        {
          paramc.M(paramInt, j("fail", null));
          AppMethodBeat.o(131112);
        }
        while (true)
        {
          return;
          d.b((Context)localObject, "location", ".ui.RedirectUI", paramJSONObject);
          paramc.M(paramInt, j("ok", null));
          AppMethodBeat.o(131112);
          continue;
          paramJSONObject = paramJSONObject;
          paramc.M(paramInt, j("invalid_coordinate", null));
          AppMethodBeat.o(131112);
        }
      }
      catch (Exception paramJSONObject)
      {
        while (true)
          int j = i;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.e.j
 * JD-Core Version:    0.6.2
 */