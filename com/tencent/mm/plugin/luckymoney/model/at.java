package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.atb;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONException;
import org.json.JSONObject;

public final class at
{
  public atb nWu;
  public as nZp;

  public static at Ql(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(42424);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(42424);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      try
      {
        at localat = new com/tencent/mm/plugin/luckymoney/model/at;
        localat.<init>();
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        paramString = localJSONObject.optJSONObject("operation");
        if (paramString != null)
          localat.nZp = v.Y(paramString);
        localat.nWu = v.Z(localJSONObject.optJSONObject("source"));
        AppMethodBeat.o(42424);
        paramString = localat;
      }
      catch (JSONException paramString)
      {
        d.printErrStackTrace("MicroMsg.ShowSourceOpen", paramString, "", new Object[0]);
        AppMethodBeat.o(42424);
        paramString = localObject;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.at
 * JD-Core Version:    0.6.2
 */