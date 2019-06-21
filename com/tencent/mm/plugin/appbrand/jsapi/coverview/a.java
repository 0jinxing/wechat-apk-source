package com.tencent.mm.plugin.appbrand.jsapi.coverview;

import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.s.d.b;
import com.tencent.mm.plugin.appbrand.jsapi.s.d.c;
import com.tencent.mm.plugin.appbrand.jsapi.s.d.d;
import com.tencent.mm.plugin.appbrand.jsapi.s.d.e;
import com.tencent.mm.plugin.appbrand.jsapi.s.d.f;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  public static void a(e parame, MotionEvent paramMotionEvent, String paramString, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(126288);
    int k = paramMotionEvent.getActionIndex();
    int m = paramMotionEvent.getPointerId(k);
    float f1 = paramMotionEvent.getX(k);
    float f2 = paramMotionEvent.getY(k);
    d.f localf = new d.f();
    localf.b(m, f1, f2);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("data", paramString);
      label79: ab.i("MicroMsg.InsertViewTouchEventDispatch", "action:%d", new Object[] { Integer.valueOf(paramMotionEvent.getAction()) });
      switch (paramMotionEvent.getAction())
      {
      default:
        paramMotionEvent = null;
      case 0:
      case 2:
      case 1:
      case 3:
      }
      while (true)
      {
        if ((paramMotionEvent != null) && (paramBoolean))
        {
          paramMotionEvent.AM(localJSONObject.toString());
          parame.a(paramMotionEvent);
          AppMethodBeat.o(126288);
          return;
        }
        try
        {
          localJSONObject.put("touch", localf.toJSONObject());
          label182: paramMotionEvent = new d.c();
          continue;
          paramString = new JSONArray();
          try
          {
            localJSONObject.put("touches", paramString);
            label210: paramMotionEvent = y(paramMotionEvent);
            if (paramMotionEvent.length > 0)
              while (j < paramMotionEvent.length)
              {
                paramString.put(paramMotionEvent[j].toJSONObject());
                j++;
              }
            paramMotionEvent = new d.d();
            continue;
            try
            {
              localJSONObject.put("touch", localf.toJSONObject());
              label269: paramMotionEvent = new d.e();
              continue;
              paramString = new JSONArray();
              try
              {
                localJSONObject.put("touches", paramString);
                label297: paramMotionEvent = y(paramMotionEvent);
                if (paramMotionEvent.length > 0)
                  for (j = i; j < paramMotionEvent.length; j++)
                    paramString.put(paramMotionEvent[j].toJSONObject());
                paramMotionEvent = new d.b();
                continue;
                if (paramMotionEvent != null)
                {
                  paramMotionEvent.AM(localJSONObject.toString());
                  parame.b(paramMotionEvent);
                }
                AppMethodBeat.o(126288);
              }
              catch (JSONException localJSONException1)
              {
                break label297;
              }
            }
            catch (JSONException paramMotionEvent)
            {
              break label269;
            }
          }
          catch (JSONException localJSONException2)
          {
            break label210;
          }
        }
        catch (JSONException paramMotionEvent)
        {
          break label182;
        }
      }
    }
    catch (JSONException paramString)
    {
      break label79;
    }
  }

  private static d.f[] y(MotionEvent paramMotionEvent)
  {
    int i = 0;
    AppMethodBeat.i(126289);
    ArrayList localArrayList = new ArrayList();
    for (int j = 0; j < paramMotionEvent.getPointerCount(); j++)
    {
      d.f localf = new d.f();
      localf.id = paramMotionEvent.getPointerId(j);
      localf.x = paramMotionEvent.getX(j);
      localf.y = paramMotionEvent.getY(j);
      localArrayList.add(localf);
    }
    paramMotionEvent = new d.f[localArrayList.size()];
    for (j = i; j < localArrayList.size(); j++)
      paramMotionEvent[j] = ((d.f)localArrayList.get(j));
    AppMethodBeat.o(126289);
    return paramMotionEvent;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.coverview.a
 * JD-Core Version:    0.6.2
 */