package com.tencent.mm.plugin.appbrand.jsapi.b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.page.ac;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.vfs.b;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class c extends com.tencent.mm.plugin.appbrand.jsapi.a<com.tencent.mm.plugin.appbrand.jsapi.c>
{
  public static final int CTRL_INDEX = 100;
  public static final String NAME = "canvasToTempFilePath";

  public static int w(JSONObject paramJSONObject)
  {
    float f1 = 0.0F;
    AppMethodBeat.i(103846);
    float f2 = (float)paramJSONObject.optDouble("quality", 1.0D);
    if (f2 < 0.0F);
    while (true)
    {
      int i = (int)f1;
      AppMethodBeat.o(103846);
      return i;
      if (f2 > 1.0F)
        f1 = 100.0F;
      else
        f1 = f2 * 100.0F;
    }
  }

  public static Bitmap.CompressFormat x(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103847);
    Bitmap.CompressFormat localCompressFormat = Bitmap.CompressFormat.PNG;
    if ("jpg".equalsIgnoreCase(paramJSONObject.optString("fileType")))
      localCompressFormat = Bitmap.CompressFormat.JPEG;
    AppMethodBeat.o(103847);
    return localCompressFormat;
  }

  public final void a(final com.tencent.mm.plugin.appbrand.jsapi.c paramc, final JSONObject paramJSONObject, final int paramInt)
  {
    AppMethodBeat.i(103845);
    com.tencent.mm.plugin.appbrand.r.m.aNS().aa(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(103844);
        if (!paramc.isRunning())
        {
          ab.w("MicroMsg.JsApiCanvasToTempFilePath", "invoke JsApi insertView failed, current page view is null.");
          paramc.M(paramInt, c.this.j("fail", null));
          AppMethodBeat.o(103844);
        }
        e locale;
        c localc;
        JSONObject localJSONObject;
        com.tencent.mm.plugin.appbrand.jsapi.base.g localg;
        int i;
        label249: View localView2;
        while (true)
        {
          return;
          locale = ((com.tencent.mm.plugin.appbrand.jsapi.base.f)paramc.B(com.tencent.mm.plugin.appbrand.jsapi.base.f.class)).c(paramc);
          if (locale == null)
          {
            ab.w("MicroMsg.JsApiCanvasToTempFilePath", "invoke JsApi canvasToTempFilePath failed, component view is null.");
            paramc.M(paramInt, c.this.j("fail:page is null", null));
            AppMethodBeat.o(103844);
          }
          else
          {
            localc = c.this;
            localJSONObject = paramJSONObject;
            localg = new com.tencent.mm.plugin.appbrand.jsapi.base.g(paramc, paramInt);
            try
            {
              i = localJSONObject.getInt("canvasId");
              View localView1 = locale.aBf().q(i);
              if (localView1 != null)
                break label249;
              ab.w("MicroMsg.JsApiCanvasToTempFilePath", "get view by viewId(%s) return null.", new Object[] { Integer.valueOf(i) });
              localg.AR(localc.j("fail:get canvas by canvasId failed", null));
              AppMethodBeat.o(103844);
            }
            catch (JSONException localJSONException)
            {
              ab.w("MicroMsg.JsApiCanvasToTempFilePath", "canvasId do not exist. exception : %s", new Object[] { localJSONException });
              localg.AR(localc.j("fail:canvasId do not exist", null));
              AppMethodBeat.o(103844);
            }
            continue;
            if (!(localJSONException instanceof CoverViewContainer))
            {
              ab.w("MicroMsg.JsApiCanvasToTempFilePath", "the view(%s) is not a instance of CoverViewContainer.", new Object[] { Integer.valueOf(i) });
              localg.AR(localc.j("fail:the view is not a instance of CoverViewContainer", null));
              AppMethodBeat.o(103844);
            }
            else
            {
              localView2 = (View)((CoverViewContainer)localJSONException).ah(View.class);
              if (localView2 != null)
                break;
              ab.w("MicroMsg.JsApiCanvasToTempFilePath", "getTargetView return null, viewId(%s).", new Object[] { Integer.valueOf(i) });
              localg.AR(localc.j("fail:target view is null.", null));
              AppMethodBeat.o(103844);
            }
          }
        }
        int j = localView2.getMeasuredWidth();
        int k = localView2.getMeasuredHeight();
        label660: label688: label1121: label1124: 
        while (true)
        {
          while (true)
          {
            Object localObject2;
            float f1;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            try
            {
              localObject2 = Bitmap.createBitmap(j, k, Bitmap.Config.ARGB_8888);
              f1 = com.tencent.mm.plugin.appbrand.r.g.h(localJSONObject, "x");
              f2 = com.tencent.mm.plugin.appbrand.r.g.h(localJSONObject, "y");
              f3 = com.tencent.mm.plugin.appbrand.r.g.a(localJSONObject, "width", j);
              f4 = com.tencent.mm.plugin.appbrand.r.g.a(localJSONObject, "height", k);
              if (f1 + f3 <= j)
                break label1124;
              f3 = j - f1;
              if (f2 + f4 <= k)
                break label1121;
              f4 = k - f2;
              f5 = bo.getFloat(localJSONObject.optString("destWidth"), f3);
              f6 = bo.getFloat(localJSONObject.optString("destHeight"), f4);
              if (((int)f1 >= 0) && ((int)f2 >= 0) && ((int)f3 > 0) && ((int)f4 > 0) && ((int)(f1 + f3) <= j) && ((int)(f2 + f4) <= k) && ((int)f5 > 0) && ((int)f6 > 0))
                break label660;
              ab.e("MicroMsg.JsApiCanvasToTempFilePath", "illegal arguments(x : %s, y : %s, width : %s, height : %s) failed, viewId(%s).", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Integer.valueOf(i) });
              localg.AR(localc.j("fail:illegal arguments", null));
              AppMethodBeat.o(103844);
            }
            catch (Exception localException)
            {
              ab.w("MicroMsg.JsApiCanvasToTempFilePath", "create bitmap failed, viewId(%s). Exception : %s", new Object[] { Integer.valueOf(i), localException });
              localg.AR(localc.j("fail:create bitmap failed", null));
              AppMethodBeat.o(103844);
            }
            break;
            Bitmap.CompressFormat localCompressFormat;
            if ((localException instanceof com.tencent.mm.plugin.appbrand.canvas.widget.a))
            {
              ((com.tencent.mm.plugin.appbrand.canvas.widget.a)localException).e(new com.tencent.mm.plugin.appbrand.canvas.f((Bitmap)localObject2));
              if (f3 == j)
              {
                localObject1 = localObject2;
                if (f4 == k);
              }
              else
              {
                localObject1 = Bitmap.createBitmap((Bitmap)localObject2, (int)f1, (int)f2, (int)f3, (int)f4, null, false);
                ab.i("MicroMsg.JsApiCanvasToTempFilePath", "bitmap recycle %s", new Object[] { localObject2 });
                ((Bitmap)localObject2).recycle();
              }
              if (f3 == f5)
              {
                localObject2 = localObject1;
                if (f4 == f6);
              }
              else
              {
                localObject2 = Bitmap.createScaledBitmap((Bitmap)localObject1, (int)f5, (int)f6, false);
                ab.i("MicroMsg.JsApiCanvasToTempFilePath", "bitmap recycle %s", new Object[] { localObject1 });
                ((Bitmap)localObject1).recycle();
              }
              localCompressFormat = c.x(localJSONObject);
              if (localCompressFormat != Bitmap.CompressFormat.JPEG)
                break label918;
            }
            for (Object localObject1 = "jpg"; ; localObject1 = "png")
            {
              localObject3 = locale.asE().yh("canvas_" + i + "." + (String)localObject1);
              if (localObject3 != null)
                break label926;
              ab.e("MicroMsg.JsApiCanvasToTempFilePath", "toTempFilePath, alloc file failed");
              localg.AR(localc.j("fail alloc file failed", null));
              AppMethodBeat.o(103844);
              break;
              ((View)localObject1).draw(new com.tencent.mm.plugin.appbrand.canvas.f((Bitmap)localObject2));
              break label688;
            }
            Object localObject3 = com.tencent.mm.vfs.j.w(((b)localObject3).dMD());
            ab.d("MicroMsg.JsApiCanvasToTempFilePath", "toTempFilePath, savePath = %s", new Object[] { localObject3 });
            try
            {
              d.a((Bitmap)localObject2, c.w(localJSONObject), localCompressFormat, (String)localObject3, true);
              localObject2 = new com.tencent.mm.plugin.appbrand.r.j();
              locale.asE().a(new File((String)localObject3), (String)localObject1, true, (com.tencent.mm.plugin.appbrand.r.j)localObject2);
              localObject1 = (String)((com.tencent.mm.plugin.appbrand.r.j)localObject2).value;
              ab.d("MicroMsg.JsApiCanvasToTempFilePath", "toTempFilePath, returnPath = %s", new Object[] { localObject1 });
              localObject2 = new HashMap();
              ((Map)localObject2).put("tempFilePath", localObject1);
              localg.AR(localc.j("ok", (Map)localObject2));
              AppMethodBeat.o(103844);
            }
            catch (IOException localIOException)
            {
              ab.w("MicroMsg.JsApiCanvasToTempFilePath", "save bitmap to file failed, viewId(%s). exception : %s", new Object[] { Integer.valueOf(i), localIOException });
              localg.AR(localc.j("fail:write file failed", null));
              AppMethodBeat.o(103844);
            }
          }
          break;
        }
      }
    });
    AppMethodBeat.o(103845);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.b.c
 * JD-Core Version:    0.6.2
 */