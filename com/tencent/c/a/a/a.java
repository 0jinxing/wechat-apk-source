package com.tencent.c.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONException;
import org.json.JSONObject;

final class a
{
  public static String caZ = "ts";
  public static String cba = "times";
  public static String cbb = "mfreq";
  public static String cbc = "mdays";
  long caV;
  int caW;
  int caX;
  int caY;

  a()
  {
    this.caV = 0L;
    this.caW = 0;
    this.caX = 100;
    this.caY = 3;
  }

  a(String paramString)
  {
    AppMethodBeat.i(125740);
    this.caV = 0L;
    this.caW = 0;
    this.caX = 100;
    this.caY = 3;
    if (!s.co(paramString))
      AppMethodBeat.o(125740);
    while (true)
    {
      return;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        if (!localJSONObject.isNull(caZ))
          this.caV = localJSONObject.getLong(caZ);
        if (!localJSONObject.isNull(cbb))
          this.caX = localJSONObject.getInt(cbb);
        if (!localJSONObject.isNull(cba))
          this.caW = localJSONObject.getInt(cba);
        if (!localJSONObject.isNull(cbc))
        {
          this.caY = localJSONObject.getInt(cbc);
          AppMethodBeat.o(125740);
        }
      }
      catch (JSONException paramString)
      {
        s.zY();
        AppMethodBeat.o(125740);
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(125741);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put(caZ, this.caV);
      localJSONObject.put(cba, this.caW);
      localJSONObject.put(cbb, this.caX);
      localJSONObject.put(cbc, this.caY);
      String str = localJSONObject.toString();
      AppMethodBeat.o(125741);
      return str;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        s.zY();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.c.a.a.a
 * JD-Core Version:    0.6.2
 */