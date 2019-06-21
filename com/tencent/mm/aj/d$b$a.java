package com.tencent.mm.aj;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d$b$a
{
  public ArrayList<String> fvG;

  public static a qI(String paramString)
  {
    AppMethodBeat.i(11271);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(11271);
    }
    while (true)
    {
      return paramString;
      a locala = new a();
      ab.d("MicroMsg.BizInfo", "BizAcctTransferInfo is [%s]", new Object[] { paramString });
      try
      {
        Object localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(paramString);
        localObject = ((JSONObject)localObject).optJSONArray("origin_name_list");
        if (localObject != null)
        {
          paramString = new java/util/ArrayList;
          paramString.<init>();
          locala.fvG = paramString;
          for (int i = 0; i < ((JSONArray)localObject).length(); i++)
            locala.fvG.add(((JSONArray)localObject).optString(i));
        }
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.BizInfo", "exception:%s", new Object[] { bo.l(paramString) });
        AppMethodBeat.o(11271);
        paramString = locala;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.d.b.a
 * JD-Core Version:    0.6.2
 */