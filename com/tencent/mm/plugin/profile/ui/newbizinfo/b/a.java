package com.tencent.mm.plugin.profile.ui.newbizinfo.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class a
{
  public String bCu;
  public String myX;
  public String pqt;
  public int pqu;
  public String userName;

  public static a ag(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(23933);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.BizAccount", "json is null, err");
      paramJSONObject = null;
      AppMethodBeat.o(23933);
    }
    while (true)
    {
      return paramJSONObject;
      a locala = new a();
      try
      {
        locala.userName = paramJSONObject.optString("UserName");
        locala.bCu = paramJSONObject.optString("NickName");
        locala.myX = paramJSONObject.optString("HeadImgUrl");
        locala.pqt = paramJSONObject.optString("FriendSubscribeDesc");
        locala.pqu = paramJSONObject.optInt("IsSubscribed");
        AppMethodBeat.o(23933);
        paramJSONObject = locala;
      }
      catch (Exception paramJSONObject)
      {
        while (true)
          ab.b("MicroMsg.BizAccount", "", new Object[] { paramJSONObject });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.b.a
 * JD-Core Version:    0.6.2
 */