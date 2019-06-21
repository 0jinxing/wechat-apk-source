package com.tencent.mm.plugin.appbrand.jsapi.q;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class l extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 534;
  public static final String NAME = "setVolume";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(126433);
    ab.i("MicroMsg.JsApiSetVolume", "invoke JsApiSetVolume!");
    if (paramc == null)
    {
      ab.e("MicroMsg.JsApiSetVolume", "fail:component is null");
      AppMethodBeat.o(126433);
    }
    while (true)
    {
      return;
      Object localObject = paramc.getContext();
      if (localObject == null)
      {
        ab.e("MicroMsg.JsApiSetVolume", "fail:context is null");
        paramc.M(paramInt, j("fail:context is null", null));
        AppMethodBeat.o(126433);
      }
      else if (!(localObject instanceof Activity))
      {
        ab.e("MicroMsg.JsApiSetVolume", "fail:context is not Activity");
        paramc.M(paramInt, j("fail:context is not Activity", null));
        AppMethodBeat.o(126433);
      }
      else
      {
        localObject = (AudioManager)((Context)localObject).getSystemService("audio");
        if (localObject == null)
        {
          ab.e("MicroMsg.JsApiSetVolume", "fail:manager is null");
          paramc.M(paramInt, j("fail:manager is null", null));
          AppMethodBeat.o(126433);
        }
        else
        {
          int i = ((AudioManager)localObject).getStreamVolume(3);
          int j = ((AudioManager)localObject).getStreamMaxVolume(3);
          int k = paramJSONObject.optInt("value", i);
          ab.i("MicroMsg.JsApiSetVolume", "JsApiSetVolume value:%d, current:%d, max:%d", new Object[] { Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(j) });
          int m;
          if (k < 0)
            m = 0;
          while (true)
          {
            if (m == i)
              break label278;
            com.tencent.mm.compatible.b.a.b((AudioManager)localObject, 3, m);
            paramc.M(paramInt, j("ok", null));
            AppMethodBeat.o(126433);
            break;
            m = j;
            if (k <= j)
              m = k;
          }
          label278: paramc.M(paramInt, j("fail:volume does not change", null));
          AppMethodBeat.o(126433);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.q.l
 * JD-Core Version:    0.6.2
 */