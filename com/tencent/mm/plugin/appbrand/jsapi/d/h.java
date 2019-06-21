package com.tencent.mm.plugin.appbrand.jsapi.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.widget.input.d.a.a;
import com.tencent.mm.plugin.appbrand.widget.input.d.a.b;
import com.tencent.mm.plugin.appbrand.widget.input.d.e;
import com.tencent.mm.plugin.appbrand.widget.input.i;
import com.tencent.mm.plugin.appbrand.widget.input.o;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class h extends a<e>
{
  public static final int CTRL_INDEX = 1;
  static final String NAME = "showKeyboard";

  protected i a(WeakReference<u> paramWeakReference, String paramString, int paramInt)
  {
    AppMethodBeat.i(123556);
    paramWeakReference = new h.6(this, paramWeakReference, paramInt, paramString);
    AppMethodBeat.o(123556);
    return paramWeakReference;
  }

  public void a(u paramu, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(123555);
    int i = paramJSONObject.optInt("cursor", -2);
    int j;
    if ((paramJSONObject.has("selectionStart")) || (paramJSONObject.has("selectionEnd")))
    {
      i = paramJSONObject.optInt("selectionStart", -2);
      j = paramJSONObject.optInt("selectionEnd", -2);
    }
    try
    {
      while (true)
      {
        int k = paramJSONObject.getInt("inputId");
        if (!aDy())
          break;
        h.1 local1 = new com/tencent/mm/plugin/appbrand/jsapi/d/h$1;
        local1.<init>(this, paramu, k, i, j, paramInt);
        al.d(local1);
        AppMethodBeat.o(123555);
        return;
        j = i;
      }
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        e locale = new e();
        if (!a(locale, paramJSONObject, paramu, paramInt))
        {
          AppMethodBeat.o(123555);
        }
        else
        {
          if (!paramJSONObject.has("inputId"))
          {
            long l = System.nanoTime();
            locale.jdk = (paramu.hashCode() + "#" + System.currentTimeMillis() + "#" + l).hashCode();
          }
          com.tencent.mm.plugin.appbrand.r.m.runOnUiThread(new h.2(this, paramu, i, j, paramJSONObject.optString("data"), locale, paramInt));
          AppMethodBeat.o(123555);
        }
      }
    }
  }

  protected void a(i parami)
  {
  }

  protected boolean a(e parame, JSONObject paramJSONObject, u paramu, int paramInt)
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(123557);
    if (!super.a(parame, paramJSONObject, paramu, paramInt))
      AppMethodBeat.o(123557);
    while (true)
    {
      return bool;
      parame.jji = paramJSONObject.optInt("parentId");
      parame.jdk = paramJSONObject.optInt("inputId");
      parame.jjp = Integer.valueOf(Math.max(0, parame.jjp.intValue()));
      if (parame.jjq == null);
      for (int j = 0; ; j = Math.max(0, parame.jjq.intValue()))
      {
        parame.jjq = Integer.valueOf(j);
        parame.jjj = paramJSONObject.optString("type", "text");
        if (o.jeT.contains(parame.jjj))
          break label159;
        paramu.M(paramInt, j("fail:unsupported input type", null));
        AppMethodBeat.o(123557);
        break;
      }
      label159: if (parame.jjM == null)
        parame.jjM = Boolean.TRUE;
      parame.jjk = paramJSONObject.optBoolean("password");
      parame.jjU = Boolean.valueOf(paramJSONObject.optBoolean("password"));
      if (aDz())
      {
        paramu = paramJSONObject.optJSONObject("dropdown");
        if (paramu != null)
        {
          paramJSONObject = new a.a();
          paramJSONObject.jiU = paramu.optInt("marginLeft");
          paramJSONObject.jiV = paramu.optInt("marginRight");
          paramJSONObject.jiW = paramu.optString("width");
          JSONArray localJSONArray = paramu.optJSONArray("options");
          if ((localJSONArray != null) && (localJSONArray.length() > 0))
          {
            paramJSONObject.jiX = new ArrayList();
            for (paramInt = i; paramInt < localJSONArray.length(); paramInt++)
            {
              Object localObject = localJSONArray.optJSONObject(paramInt);
              if (localObject != null)
              {
                paramu = ((JSONObject)localObject).optString("id");
                String str = ((JSONObject)localObject).optString("title");
                localObject = ((JSONObject)localObject).optString("content");
                if ((!bo.isNullOrNil(paramu)) && (!bo.isNullOrNil(str)))
                {
                  a.b localb = new a.b();
                  localb.id = paramu;
                  localb.title = str;
                  localb.content = ((String)localObject);
                  paramJSONObject.jiX.add(localb);
                }
              }
            }
            parame.jjn = paramJSONObject;
          }
        }
      }
      bool = true;
      AppMethodBeat.o(123557);
    }
  }

  protected boolean aDy()
  {
    return true;
  }

  protected boolean aDz()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.d.h
 * JD-Core Version:    0.6.2
 */