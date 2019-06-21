package com.tencent.mm.openim.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
{
  public List<c.a> geU;

  public c()
  {
    AppMethodBeat.i(128608);
    this.geU = new LinkedList();
    AppMethodBeat.o(128608);
  }

  public final c vj(String paramString)
  {
    AppMethodBeat.i(128609);
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      paramString = localJSONObject.optJSONArray("custom_info");
      if (paramString == null)
      {
        AppMethodBeat.o(128609);
        return this;
      }
      for (int i = 0; i < paramString.length(); i++)
      {
        localJSONObject = paramString.getJSONObject(i);
        c.a locala = new com/tencent/mm/openim/a/c$a;
        locala.<init>();
        this.geU.add(locala.f(localJSONObject));
      }
    }
    catch (JSONException paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.OpenIMCustomDetail", paramString, "parse", new Object[0]);
        AppMethodBeat.o(128609);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.a.c
 * JD-Core Version:    0.6.2
 */