package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONException;
import org.json.JSONObject;

public final class f
{
  public String txA;
  public int txv;
  public String txw;
  public String txx;
  public String txy;
  public String txz;

  public static f acw(String paramString)
  {
    AppMethodBeat.i(46720);
    if (!bo.isNullOrNil(paramString));
    while (true)
    {
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        paramString = new com/tencent/mm/plugin/wallet_core/model/f;
        paramString.<init>();
        paramString.txv = localJSONObject.optInt("menu_jump_type", -1);
        paramString.txw = localJSONObject.optString("menu_jump_url", "");
        paramString.txx = localJSONObject.optString("menu_username", "");
        paramString.txy = localJSONObject.optString("menu_path", "");
        paramString.txz = localJSONObject.optString("menu_title", "");
        paramString.txA = localJSONObject.optString("menu_icon_url", "");
        ab.i("BindCardMenu", "parse bind card menu, type: %s, title: %s", new Object[] { Integer.valueOf(paramString.txv), paramString.txz });
        AppMethodBeat.o(46720);
        return paramString;
      }
      catch (JSONException paramString)
      {
        ab.printErrStackTrace("BindCardMenu", paramString, "", new Object[0]);
      }
      paramString = null;
      AppMethodBeat.o(46720);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.f
 * JD-Core Version:    0.6.2
 */