package com.tencent.mm.plugin.appbrand.jsapi;

import android.graphics.Bitmap;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.magicbrush.handler.MBCanvasHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.game.b;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.s;
import com.tencent.mm.sdk.platformtools.ab;

public final class ad extends ac<s>
{
  private Bitmap d(s params)
  {
    Object localObject = null;
    AppMethodBeat.i(130406);
    o localo = params.getRuntime();
    ab.i("MicroMsg.JsApiCaptureScreenWC", "getBitmapFromView appId:%s, isGame:%b", new Object[] { localo.mAppId, Boolean.valueOf(localo.xy()) });
    if (localo.xy())
      params = ((b)params).getMBRuntime();
    try
    {
      params = params.getCanvasHandler().a(null, true);
      AppMethodBeat.o(130406);
      while (true)
      {
        return params;
        params = super.b(params);
        AppMethodBeat.o(130406);
      }
    }
    catch (Exception params)
    {
      while (true)
        params = localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.ad
 * JD-Core Version:    0.6.2
 */