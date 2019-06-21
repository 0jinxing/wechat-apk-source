package com.tencent.mm.plugin.appbrand.jsapi.media;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.Locale;
import org.json.JSONObject;

public final class d extends a
{
  private static final int CTRL_INDEX = 528;
  private static final String NAME = "compressImage";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(114356);
    if (paramc == null)
    {
      ab.e("MicroMsg.JsApiCompressImage.javayhu", "fail:component is null");
      AppMethodBeat.o(114356);
    }
    while (true)
    {
      return;
      if (paramJSONObject == null)
      {
        ab.w("MicroMsg.JsApiCompressImage.javayhu", "fail:data is null");
        paramc.M(paramInt, j("fail:invalid data", null));
        AppMethodBeat.o(114356);
      }
      else
      {
        String str = paramJSONObject.optString("src");
        if (bo.isNullOrNil(str))
        {
          ab.w("MicroMsg.JsApiCompressImage.javayhu", "fail:data src is null");
          paramc.M(paramInt, j("fail:data src is null", null));
          AppMethodBeat.o(114356);
        }
        else if (paramc.asE() == null)
        {
          ab.w("MicroMsg.JsApiCompressImage.javayhu", "fail:runtime fileSystem is null");
          paramc.M(paramInt, j("fail:runtime fileSystem is null", null));
          AppMethodBeat.o(114356);
        }
        else
        {
          int i = paramJSONObject.optInt("quality", 80);
          int j;
          if (i > 0)
          {
            j = i;
            if (i <= 100);
          }
          else
          {
            ab.w("MicroMsg.JsApiCompressImage.javayhu", "invalid quality, set to default");
            j = 80;
          }
          ab.i("MicroMsg.JsApiCompressImage.javayhu", "compressImage, quality:%d, src:%s", new Object[] { Integer.valueOf(j), str });
          com.tencent.mm.sdk.g.d.f(new d.1(this, str, paramc, j, new WeakReference(paramc), paramInt), String.format(Locale.US, "AppBrandJsApiCompressImage[%s#%d]", new Object[] { str, Integer.valueOf(j) }));
          AppMethodBeat.o(114356);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.d
 * JD-Core Version:    0.6.2
 */