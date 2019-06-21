package com.tencent.mm.plugin.appbrand.jsapi.base;

import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.r.g;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class d<CONTEXT extends c> extends a<CONTEXT>
{
  protected static float[] s(JSONObject paramJSONObject)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramJSONObject.optString("position"));
      float f1 = g.a(localJSONObject, "left", 0.0F);
      float f2 = g.a(localJSONObject, "top", 0.0F);
      float f3 = g.a(localJSONObject, "width", 0.0F);
      float f4 = g.a(localJSONObject, "height", 0.0F);
      int i = paramJSONObject.optInt("zIndex", 0);
      paramJSONObject = new float[5];
      paramJSONObject[0] = f1;
      paramJSONObject[1] = f2;
      paramJSONObject[2] = f3;
      paramJSONObject[3] = f4;
      paramJSONObject[4] = i;
      return paramJSONObject;
    }
    catch (Exception paramJSONObject)
    {
      while (true)
        paramJSONObject = null;
    }
  }

  protected static int t(JSONObject paramJSONObject)
  {
    int i = -1;
    try
    {
      boolean bool = paramJSONObject.getBoolean("hide");
      if (bool);
      for (i = 4; ; i = 0)
        label15: return i;
    }
    catch (JSONException paramJSONObject)
    {
      break label15;
    }
  }

  protected static Boolean u(JSONObject paramJSONObject)
  {
    try
    {
      boolean bool = paramJSONObject.getBoolean("fixed");
      paramJSONObject = Boolean.valueOf(bool);
      return paramJSONObject;
    }
    catch (JSONException paramJSONObject)
    {
      while (true)
        paramJSONObject = null;
    }
  }

  protected static Boolean v(JSONObject paramJSONObject)
  {
    try
    {
      boolean bool = paramJSONObject.getBoolean("fullscreen");
      paramJSONObject = Boolean.valueOf(bool);
      return paramJSONObject;
    }
    catch (JSONException paramJSONObject)
    {
      while (true)
        paramJSONObject = null;
    }
  }

  protected int r(JSONObject paramJSONObject)
  {
    throw new JSONException("viewId do not exist, override the method getViewId(data).");
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.base.d
 * JD-Core Version:    0.6.2
 */