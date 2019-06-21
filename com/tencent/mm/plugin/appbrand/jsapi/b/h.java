package com.tencent.mm.plugin.appbrand.jsapi.b;

import android.graphics.Paint.FontMetrics;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.a.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.jsapi.u;
import com.tencent.mm.plugin.appbrand.r.g;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class h extends u
{
  public static final int CTRL_INDEX = 436;
  public static final String NAME = "measureText";

  public final String b(c paramc, JSONObject paramJSONObject)
  {
    int i = -1;
    AppMethodBeat.i(103855);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiMeasureText", "measureText, data is null");
      paramc = j("fail:data is null", null);
      AppMethodBeat.o(103855);
    }
    while (true)
    {
      return paramc;
      String str1 = paramJSONObject.optString("text");
      float f1 = (float)paramJSONObject.optDouble("fontSize", 16.0D);
      ab.i("MicroMsg.JsApiMeasureText", "measureText data:%s", new Object[] { paramJSONObject.toString() });
      if ((TextUtils.isEmpty(str1)) || (f1 <= 0.0F))
      {
        ab.e("MicroMsg.JsApiMeasureText", "measureText, param is illegal");
        paramc = j("fail:param is illegal", null);
        AppMethodBeat.o(103855);
        continue;
      }
      paramc = new a();
      paramc.setTextSize(g.av(f1));
      try
      {
        paramc.yB(paramJSONObject.getString("fontFamily"));
      }
      catch (JSONException localJSONException2)
      {
        try
        {
          label136: String str2 = paramJSONObject.getString("fontStyle");
          j = str2.hashCode();
          switch (j)
          {
          default:
            label188: j = -1;
            label191: switch (j)
            {
            default:
            case 0:
            case 1:
            case 2:
            }
            break;
          case -1657669071:
          case -1178781136:
          case -1039745817:
          }
        }
        catch (JSONException localJSONException2)
        {
          try
          {
            label220: paramJSONObject = paramJSONObject.getString("fontWeight");
            int j = paramJSONObject.hashCode();
            switch (j)
            {
            default:
              j = i;
              label263: switch (j)
              {
              default:
              case 0:
              case 1:
              }
              break;
            case 3029637:
            case -1039745817:
            }
            while (true)
            {
              float f2 = paramc.measureText(str1);
              paramc = paramc.getFontMetrics();
              f1 = Math.abs(paramc.bottom - paramc.top);
              ab.i("MicroMsg.JsApiMeasureText", "fontMetrics.bottom : %f, fontMetrics.top : %f, width : %f, height : %f", new Object[] { Float.valueOf(paramc.bottom), Float.valueOf(paramc.top), Float.valueOf(f2), Float.valueOf(f1) });
              f2 = g.au(f2);
              f1 = g.au(f1);
              paramc = new HashMap();
              paramc.put("width", Float.valueOf(f2));
              paramc.put("height", Float.valueOf(f1));
              ab.i("MicroMsg.JsApiMeasureText", "map:%s", new Object[] { paramc.toString() });
              paramc = j("ok", paramc);
              AppMethodBeat.o(103855);
              break;
              localJSONException1 = localJSONException1;
              ab.i("MicroMsg.JsApiMeasureText", "get 'fontFamily' error");
              break label136;
              if (!localJSONException1.equals("oblique"))
                break label188;
              j = 0;
              break label191;
              if (!localJSONException1.equals("italic"))
                break label188;
              j = 1;
              break label191;
              if (!localJSONException1.equals("normal"))
                break label188;
              j = 2;
              break label191;
              paramc.nE(2);
              break label220;
              localJSONException2 = localJSONException2;
              ab.i("MicroMsg.JsApiMeasureText", "get 'fontStyle' error.");
              break label220;
              paramc.nE(2);
              break label220;
              paramc.nE(0);
              break label220;
              j = i;
              if (!paramJSONObject.equals("bold"))
                break label263;
              j = 0;
              break label263;
              j = i;
              if (!paramJSONObject.equals("normal"))
                break label263;
              j = 1;
              break label263;
              paramc.setFakeBoldText(true);
            }
          }
          catch (JSONException paramJSONObject)
          {
            while (true)
            {
              ab.i("MicroMsg.JsApiMeasureText", "get 'fontWeight' error.");
              continue;
              paramc.setFakeBoldText(false);
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.b.h
 * JD-Core Version:    0.6.2
 */