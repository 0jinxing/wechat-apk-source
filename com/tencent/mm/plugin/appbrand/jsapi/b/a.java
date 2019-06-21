package com.tencent.mm.plugin.appbrand.jsapi.b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.util.Log;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.page.ac;
import com.tencent.mm.plugin.appbrand.r.g;
import com.tencent.mm.sdk.platformtools.ab;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a extends com.tencent.mm.plugin.appbrand.jsapi.a<c>
{
  public static final int CTRL_INDEX = 372;
  public static final String NAME = "canvasGetImageData";

  private static Map<String, Object> e(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(103839);
    ByteBuffer localByteBuffer = o(paramArrayOfInt);
    paramArrayOfInt = new HashMap();
    paramArrayOfInt.put("data", localByteBuffer);
    paramArrayOfInt.put("width", Integer.valueOf(paramInt1));
    paramArrayOfInt.put("height", Integer.valueOf(paramInt2));
    AppMethodBeat.o(103839);
    return paramArrayOfInt;
  }

  private static ByteBuffer o(int[] paramArrayOfInt)
  {
    AppMethodBeat.i(103840);
    byte[] arrayOfByte = new byte[paramArrayOfInt.length * 4];
    int i = 0;
    for (int j = 0; i < paramArrayOfInt.length; j++)
    {
      int k = j + 1;
      arrayOfByte[j] = ((byte)(byte)(paramArrayOfInt[i] >> 16 & 0xFF));
      int m = k + 1;
      arrayOfByte[k] = ((byte)(byte)(paramArrayOfInt[i] >> 8 & 0xFF));
      j = m + 1;
      arrayOfByte[m] = ((byte)(byte)(paramArrayOfInt[i] & 0xFF));
      arrayOfByte[j] = ((byte)(byte)(paramArrayOfInt[i] >> 24 & 0xFF));
      i++;
    }
    paramArrayOfInt = ByteBuffer.wrap(arrayOfByte);
    AppMethodBeat.o(103840);
    return paramArrayOfInt;
  }

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(103838);
    int i;
    Object localObject;
    float f;
    int j;
    int k;
    int m;
    int n;
    try
    {
      i = paramJSONObject.getInt("canvasId");
      localObject = ((com.tencent.mm.plugin.appbrand.jsapi.base.f)paramc.B(com.tencent.mm.plugin.appbrand.jsapi.base.f.class)).c(paramc);
      if (localObject == null)
      {
        ab.w("MicroMsg.JsApiCanvasGetImageData", "invoke JsApi canvasGetImageData failed, component view is null.");
        paramc.M(paramInt, j("fail:page is null", null));
        AppMethodBeat.o(103838);
        return;
      }
    }
    catch (JSONException paramJSONObject)
    {
      while (true)
      {
        ab.i("MicroMsg.JsApiCanvasGetImageData", "get canvas id failed, %s", new Object[] { Log.getStackTraceString(paramJSONObject) });
        paramc.M(paramInt, j("fail:illegal canvasId", null));
        AppMethodBeat.o(103838);
        continue;
        localObject = ((e)localObject).aBf().q(i);
        if (localObject == null)
        {
          ab.w("MicroMsg.JsApiCanvasGetImageData", "view(%s) is null.", new Object[] { Integer.valueOf(i) });
          paramc.M(paramInt, j("fail:view is null", null));
          AppMethodBeat.o(103838);
        }
        else if (!(localObject instanceof CoverViewContainer))
        {
          ab.w("MicroMsg.JsApiCanvasGetImageData", "the viewId is not a canvas(%s).", new Object[] { Integer.valueOf(i) });
          paramc.M(paramInt, j("fail:illegal view type", null));
          AppMethodBeat.o(103838);
        }
        else
        {
          localObject = (View)((CoverViewContainer)localObject).ah(View.class);
          if (!(localObject instanceof com.tencent.mm.plugin.appbrand.canvas.widget.a))
          {
            ab.i("MicroMsg.JsApiCanvasGetImageData", "the view is not a instance of CanvasView.(%s)", new Object[] { Integer.valueOf(i) });
            paramc.M(paramInt, j("fail:illegal view type", null));
            AppMethodBeat.o(103838);
          }
          else
          {
            f = g.aNQ();
            j = paramJSONObject.optInt("x");
            k = paramJSONObject.optInt("y");
            m = paramJSONObject.optInt("width");
            n = paramJSONObject.optInt("height");
            if ((m != 0) && (n != 0))
              break;
            ab.i("MicroMsg.JsApiCanvasGetImageData", "width(%s) or height(%s) is 0.(%s)", new Object[] { Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i) });
            paramc.M(paramInt, j("fail:width or height is 0", null));
            AppMethodBeat.o(103838);
          }
        }
      }
      if (m >= 0)
        break label981;
    }
    int i1 = -m;
    j += m;
    while (true)
    {
      if (n < 0)
      {
        m = -n;
        k += n;
        n = m;
      }
      while (true)
      {
        int i2 = Math.round(j * f);
        int i3 = Math.round(k * f);
        int i4 = Math.round(i1 * f);
        int i5 = Math.round(n * f);
        m = ((View)localObject).getMeasuredWidth();
        int i6 = ((View)localObject).getMeasuredHeight();
        if (i2 < 0);
        label528: label964: label971: for (int i7 = 0; ; i7 = i2)
        {
          if (i3 < 0);
          for (int i8 = 0; ; i8 = i3)
          {
            while (true)
            {
              if (i2 + i4 > m)
              {
                m -= i7;
                label511: if (i3 + i5 <= i6)
                  break label855;
                i2 = i6 - i8;
                i3 = Math.round(i7 / f);
                i6 = Math.round(i8 / f);
                i5 = Math.round(m / f);
                i4 = Math.round(i2 / f);
              }
              try
              {
                Bitmap localBitmap = Bitmap.createBitmap(m, i2, Bitmap.Config.ARGB_8888);
                paramJSONObject = new com/tencent/mm/plugin/appbrand/canvas/f;
                paramJSONObject.<init>(localBitmap);
                paramJSONObject.save();
                paramJSONObject.translate(-i7, -i8);
                ((com.tencent.mm.plugin.appbrand.canvas.widget.a)localObject).e(paramJSONObject);
                paramJSONObject.restore();
                paramJSONObject = Bitmap.createScaledBitmap(localBitmap, i5, i4, false);
                localObject = new int[i1 * n];
                paramJSONObject.getPixels((int[])localObject, (i6 - k) * i1 + (i3 - j), i1, 0, 0, i5, i4);
                paramc.M(paramInt, a(paramc, "ok", e((int[])localObject, i1, n)));
                AppMethodBeat.o(103838);
                break;
                if (i2 < m)
                  break label971;
                paramc.M(paramInt, a(paramc, "ok", e(new int[i1 * n], i1, n)));
                AppMethodBeat.o(103838);
                break;
                if (i3 < i6)
                  break label964;
                paramc.M(paramInt, a(paramc, "ok", e(new int[i1 * n], i1, n)));
                AppMethodBeat.o(103838);
                break;
                if (i2 + i4 <= 0)
                {
                  paramc.M(paramInt, a(paramc, "ok", e(new int[i1 * n], i1, n)));
                  AppMethodBeat.o(103838);
                  break;
                }
                m = i4;
                if (i2 >= 0)
                  break label511;
                m = i4 + i2;
                break label511;
                label855: if (i3 + i5 <= 0)
                {
                  paramc.M(paramInt, a(paramc, "ok", e(new int[i1 * n], i1, n)));
                  AppMethodBeat.o(103838);
                  break;
                }
                i2 = i5;
                if (i3 >= 0)
                  break label528;
                i2 = i5 + i3;
              }
              catch (Exception paramJSONObject)
              {
                ab.w("MicroMsg.JsApiCanvasGetImageData", "create bitmap failed, viewId(%s). Exception : %s", new Object[] { Integer.valueOf(i), paramJSONObject });
                paramc.M(paramInt, j("fail:create bitmap failed", null));
                AppMethodBeat.o(103838);
              }
            }
            break;
          }
        }
      }
      label981: i1 = m;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.b.a
 * JD-Core Version:    0.6.2
 */