package com.tencent.mm.plugin.appbrand.jsapi.s;

import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.r.g;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
{
  public static void a(TextView paramTextView, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126631);
    if ((paramTextView == null) || (paramJSONObject == null))
      AppMethodBeat.o(126631);
    while (true)
    {
      return;
      try
      {
        String str = paramJSONObject.getString("color");
        if (!bo.isNullOrNil(str))
          paramTextView.setTextColor(g.Ee(str));
        try
        {
          label41: paramTextView.setTextSize(0, g.av((float)paramJSONObject.getDouble("fontSize")));
          try
          {
            label56: str = paramJSONObject.getString("textAlign");
            if ("left".equals(str))
              paramTextView.setGravity(3);
          }
          catch (JSONException localJSONException3)
          {
            try
            {
              str = paramJSONObject.getString("fontWeight");
              if ("bold".equals(str))
              {
                paramTextView.getPaint().setFakeBoldText(true);
                int i = g.a(paramJSONObject, "lineHeight", Math.round(paramTextView.getTextSize() * 1.2F));
                if ((paramTextView instanceof com.tencent.mm.plugin.appbrand.widget.d))
                  ((com.tencent.mm.plugin.appbrand.widget.d)paramTextView).setLineHeight(i);
              }
            }
            catch (JSONException localJSONException3)
            {
              try
              {
                str = paramJSONObject.getString("lineBreak");
                if ("ellipsis".equals(str))
                {
                  paramTextView.setEllipsize(TextUtils.TruncateAt.END);
                  paramTextView.setSingleLine(true);
                }
              }
              catch (JSONException localJSONException3)
              {
                try
                {
                  while (true)
                  {
                    paramTextView.setText(paramJSONObject.getString("content"));
                    AppMethodBeat.o(126631);
                    break;
                    if ("center".equals(str))
                    {
                      paramTextView.setGravity(1);
                      continue;
                      localJSONException1 = localJSONException1;
                    }
                    else if ("right".equals(localJSONException1))
                    {
                      paramTextView.setGravity(5);
                      continue;
                      if ("normal".equals(localJSONException1))
                      {
                        paramTextView.getPaint().setFakeBoldText(false);
                        continue;
                        localJSONException2 = localJSONException2;
                        continue;
                        if ("clip".equals(localJSONException2))
                        {
                          paramTextView.setSingleLine(true);
                          continue;
                          localJSONException3 = localJSONException3;
                        }
                        else if ("break-word".equals(localJSONException3))
                        {
                          paramTextView.setSingleLine(false);
                        }
                        else if ("break-all".equals(localJSONException3))
                        {
                          paramTextView.setSingleLine(false);
                        }
                      }
                    }
                  }
                }
                catch (JSONException paramTextView)
                {
                  AppMethodBeat.o(126631);
                }
              }
            }
          }
        }
        catch (JSONException localJSONException4)
        {
          break label56;
        }
      }
      catch (JSONException localJSONException5)
      {
        break label41;
      }
    }
  }

  public static void a(e parame, com.tencent.mm.plugin.appbrand.widget.c.a parama, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126630);
    if ((parama == null) || (paramJSONObject == null))
      AppMethodBeat.o(126630);
    while (true)
    {
      return;
      try
      {
        paramJSONObject = paramJSONObject.getString("iconPath");
        if (!TextUtils.isEmpty(paramJSONObject))
        {
          paramJSONObject = ((com.tencent.mm.plugin.appbrand.d.b)parame.B(com.tencent.mm.plugin.appbrand.d.b.class)).b(parame, paramJSONObject);
          parame = (com.tencent.mm.plugin.appbrand.d.a)parame.B(com.tencent.mm.plugin.appbrand.d.a.class);
          b.1 local1 = new com/tencent/mm/plugin/appbrand/jsapi/s/b$1;
          local1.<init>(parama);
          parame.a(paramJSONObject, local1);
        }
        AppMethodBeat.o(126630);
      }
      catch (NullPointerException parame)
      {
        com.tencent.luggage.g.d.printErrStackTrace("Luggage.ViewAttributeHelper", parame, "attachImageViewAttribute", new Object[0]);
        AppMethodBeat.o(126630);
      }
      catch (JSONException parame)
      {
        label90: break label90;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.s.b
 * JD-Core Version:    0.6.2
 */