package com.tencent.mm.plugin.recharge.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  public static final int[] pFK = { -1, -1 };
  public static final int[] pFL = { -2, -2 };
  public int cvp;
  public String name;
  public String pFM;
  public String pFN;
  public int[] pFO = pFK;

  public a(String paramString1, String paramString2, int paramInt)
  {
    this(paramString1, paramString2, "", paramInt);
  }

  public a(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    this.pFM = paramString1;
    this.name = paramString2;
    this.pFN = paramString3;
    this.cvp = paramInt;
  }

  public static a aj(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(44182);
    String str1 = paramJSONObject.optString("name");
    String str2 = paramJSONObject.optString("record");
    paramJSONObject = paramJSONObject.optString("location");
    if (!bo.isNullOrNil(str2))
    {
      paramJSONObject = new a(str2, str1, paramJSONObject, 2);
      AppMethodBeat.o(44182);
    }
    while (true)
    {
      return paramJSONObject;
      paramJSONObject = null;
      AppMethodBeat.o(44182);
    }
  }

  public final JSONObject toJson()
  {
    AppMethodBeat.i(44181);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("record", bo.bc(this.pFM, ""));
      localJSONObject.put("name", bo.bc(this.name, ""));
      localJSONObject.put("location", bo.bc(this.pFN, ""));
      AppMethodBeat.o(44181);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MallInputRecord", localJSONException, "", new Object[0]);
        Object localObject = null;
        AppMethodBeat.o(44181);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.model.a
 * JD-Core Version:    0.6.2
 */