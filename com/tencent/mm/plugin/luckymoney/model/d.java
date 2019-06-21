package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.atb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
{
  public atb nWu;
  public String nWv;
  public boolean nWw;
  public String nWx;

  public static d Qg(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(42273);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(42273);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        paramString = new com/tencent/mm/plugin/luckymoney/model/d;
        paramString.<init>();
        paramString.nWv = localJSONObject.optString("showSourceMac");
        paramString.nWx = localJSONObject.optString("illegal_msg");
        paramString.nWw = localJSONObject.optBoolean("is_illegal");
        localJSONObject = localJSONObject.optJSONObject("showSource");
        if (localJSONObject != null)
          paramString.nWu = v.Z(localJSONObject);
        AppMethodBeat.o(42273);
      }
      catch (JSONException paramString)
      {
        ab.printErrStackTrace("MicroMsg.EnvelopSourceMac", paramString, "", new Object[0]);
        AppMethodBeat.o(42273);
        paramString = localObject;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.d
 * JD-Core Version:    0.6.2
 */