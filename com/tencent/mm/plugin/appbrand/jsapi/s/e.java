package com.tencent.mm.plugin.appbrand.jsapi.s;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
{
  public static void b(View paramView, JSONObject paramJSONObject)
  {
    int i = 1;
    AppMethodBeat.i(126632);
    if ((paramView == null) || (paramJSONObject == null))
    {
      AppMethodBeat.o(126632);
      return;
    }
    int j = g.Ee(paramJSONObject.optString("bgColor"));
    int k = g.Ee(paramJSONObject.optString("borderColor"));
    float f1 = g.a(paramJSONObject, "borderRadius", 0.0F);
    float f2 = g.a(paramJSONObject, "borderWidth", 0.0F);
    Object localObject;
    if ((paramView instanceof f))
    {
      localObject = (f)paramView;
      ((f)localObject).setBgColor(j);
      ((f)localObject).setBorderColor(k);
      ((f)localObject).setBorderRadius(f1);
      ((f)localObject).setBorderWidth(f2);
    }
    for (j = 1; ; j = 0)
      try
      {
        f2 = (float)paramJSONObject.getDouble("opacity");
        k = j;
        if (f2 >= 0.0F)
        {
          k = j;
          if (f2 <= 1.0F)
          {
            paramView.setAlpha(f2);
            k = 1;
          }
        }
        localObject = paramJSONObject.optJSONArray("padding");
        if ((localObject != null) && (((JSONArray)localObject).length() == 4))
        {
          int m = g.a((JSONArray)localObject, 0);
          j = g.a((JSONArray)localObject, 1);
          int n = g.a((JSONArray)localObject, 2);
          paramView.setPadding(g.a((JSONArray)localObject, 3), m, j, n);
        }
        f1 = (float)paramJSONObject.optDouble("rotate", 0.0D);
        float f3 = (float)paramJSONObject.optDouble("scaleX", 1.0D);
        f2 = (float)paramJSONObject.optDouble("scaleY", 1.0D);
        if (paramJSONObject.has("rotate"))
        {
          paramView.setRotation(f1);
          k = 1;
        }
        if (paramJSONObject.has("scaleX"))
        {
          paramView.setScaleX(f3);
          k = 1;
        }
        if (paramJSONObject.has("scaleY"))
        {
          paramView.setScaleY(f2);
          k = i;
          if (k != 0)
            paramView.invalidate();
          AppMethodBeat.o(126632);
        }
      }
      catch (JSONException localJSONException)
      {
        while (true)
          k = j;
      }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.s.e
 * JD-Core Version:    0.6.2
 */