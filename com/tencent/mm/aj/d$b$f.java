package com.tencent.mm.aj;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d$b$f
{
  public String description;
  public String fwa;
  public String iconUrl;

  public static List<f> d(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(11277);
    LinkedList localLinkedList = new LinkedList();
    if (paramJSONArray == null)
      AppMethodBeat.o(11277);
    while (true)
    {
      return localLinkedList;
      try
      {
        int i = paramJSONArray.length();
        for (int j = 0; j < i; j++)
        {
          f localf = new com/tencent/mm/aj/d$b$f;
          localf.<init>();
          JSONObject localJSONObject = paramJSONArray.optJSONObject(j);
          localf.iconUrl = localJSONObject.optString("icon");
          localf.description = localJSONObject.optString("description");
          localf.fwa = localJSONObject.optString("description_key");
          localLinkedList.add(localf);
        }
      }
      catch (Exception paramJSONArray)
      {
        ab.e("MicroMsg.BizInfo", "exception:%s", new Object[] { bo.l(paramJSONArray) });
        AppMethodBeat.o(11277);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.d.b.f
 * JD-Core Version:    0.6.2
 */