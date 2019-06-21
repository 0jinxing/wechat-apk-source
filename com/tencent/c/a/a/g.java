package com.tencent.c.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONException;
import org.json.JSONObject;

final class g
{
  String bFQ = null;
  String cbq = null;
  String cbr = "0";
  long cbs = 0L;

  static g cn(String paramString)
  {
    AppMethodBeat.i(125775);
    g localg = new g();
    if (s.co(paramString));
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      if (!localJSONObject.isNull("ui"))
        localg.bFQ = localJSONObject.getString("ui");
      if (!localJSONObject.isNull("mc"))
        localg.cbq = localJSONObject.getString("mc");
      if (!localJSONObject.isNull("mid"))
        localg.cbr = localJSONObject.getString("mid");
      if (!localJSONObject.isNull("ts"))
        localg.cbs = localJSONObject.getLong("ts");
      AppMethodBeat.o(125775);
      return localg;
    }
    catch (JSONException paramString)
    {
      while (true)
        s.zY();
    }
  }

  private JSONObject zQ()
  {
    AppMethodBeat.i(125778);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      s.a(localJSONObject, "ui", this.bFQ);
      s.a(localJSONObject, "mc", this.cbq);
      s.a(localJSONObject, "mid", this.cbr);
      localJSONObject.put("ts", this.cbs);
      AppMethodBeat.o(125778);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        s.zY();
    }
  }

  final int a(g paramg)
  {
    int i = 1;
    AppMethodBeat.i(125776);
    if (paramg == null)
      AppMethodBeat.o(125776);
    while (true)
    {
      return i;
      if ((s.cp(this.cbr)) && (s.cp(paramg.cbr)))
      {
        if (this.cbr.equals(paramg.cbr))
        {
          i = 0;
          AppMethodBeat.o(125776);
        }
        else if (this.cbs >= paramg.cbs)
        {
          AppMethodBeat.o(125776);
        }
        else
        {
          AppMethodBeat.o(125776);
          i = -1;
        }
      }
      else if (s.cp(this.cbr))
      {
        AppMethodBeat.o(125776);
      }
      else
      {
        AppMethodBeat.o(125776);
        i = -1;
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(125777);
    String str = zQ().toString();
    AppMethodBeat.o(125777);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.c.a.a.g
 * JD-Core Version:    0.6.2
 */