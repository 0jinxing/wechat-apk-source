package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

public final class j$a
{
  public int id;
  public Orders.ShowInfo tzj;

  public static a az(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46764);
    if (paramJSONObject == null)
    {
      paramJSONObject = null;
      AppMethodBeat.o(46764);
    }
    while (true)
    {
      return paramJSONObject;
      a locala = new a();
      locala.id = paramJSONObject.optInt("id");
      paramJSONObject = paramJSONObject.optJSONObject("show_info");
      if (paramJSONObject != null)
      {
        Orders.ShowInfo localShowInfo = new Orders.ShowInfo();
        localShowInfo.name = paramJSONObject.optString("name");
        localShowInfo.value = paramJSONObject.optString("value");
        localShowInfo.tBK = paramJSONObject.optInt("value_attr");
        localShowInfo.mVA = paramJSONObject.optString("name_color");
        localShowInfo.tBF = paramJSONObject.optString("value_color");
        locala.tzj = localShowInfo;
      }
      AppMethodBeat.o(46764);
      paramJSONObject = locala;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.j.a
 * JD-Core Version:    0.6.2
 */