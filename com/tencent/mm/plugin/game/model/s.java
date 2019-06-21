package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.gx;
import com.tencent.mm.g.a.gx.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.a.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class s
{
  public static void a(gx paramgx)
  {
    AppMethodBeat.i(111335);
    Object localObject = paramgx.cBD.cBy;
    ab.d("MicroMsg.GameJsapiProcessor", "writeMsg param=%s", new Object[] { localObject });
    if (localObject != null);
    while (true)
    {
      try
      {
        paramgx = new org/json/JSONObject;
        paramgx.<init>((String)localObject);
        if ((paramgx.isNull("type")) || (bo.getInt(paramgx.optString("type"), 0) == 0))
        {
          new JSONArray();
          paramgx = paramgx.getJSONArray("localIdList");
          int i = paramgx.length();
          localObject = new long[i];
          int j = 0;
          if (j < i)
          {
            localObject[j] = paramgx.getLong(j);
            j++;
            continue;
          }
          ((c)g.K(c.class)).bCY().d((long[])localObject);
          AppMethodBeat.o(111335);
          return;
        }
        if (bo.getInt(paramgx.optString("type"), 0) == 65536)
        {
          ((c)g.K(c.class)).bCY().hY("GameRawMessage", "update GameRawMessage set isRead=1 where 1=1");
          AppMethodBeat.o(111335);
          continue;
        }
      }
      catch (JSONException paramgx)
      {
        ab.w("MicroMsg.GameJsapiProcessor", "JSONException : %s", new Object[] { paramgx.getMessage() });
        AppMethodBeat.o(111335);
        continue;
        AppMethodBeat.o(111335);
        continue;
      }
      AppMethodBeat.o(111335);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.s
 * JD-Core Version:    0.6.2
 */