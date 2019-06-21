package com.tencent.mm.plugin.profile.ui.newbizinfo.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b
{
  public int eWK;
  public List<String> ewK;
  public String fgd;
  public String hAg;
  public int oyB;
  public String pqA;
  public String pqB;
  public String pqC;
  public String pqv;
  public int pqw;
  public List<String> pqx;
  public String pqy;
  public String pqz;
  public int status;
  public String title;
  public int type;
  public int videoHeight;
  public int videoWidth;

  public static b ah(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(23934);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.MessageInfo", "json is null, err");
      paramJSONObject = null;
      AppMethodBeat.o(23934);
    }
    while (true)
    {
      return paramJSONObject;
      b localb = new b();
      try
      {
        localb.title = paramJSONObject.optString("Title");
        localb.hAg = paramJSONObject.optString("CoverImgUrl");
        localb.pqv = paramJSONObject.optString("ArticleUrl");
        localb.pqw = paramJSONObject.optInt("IsOriginalArticle", 0);
        Object localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        localb.pqx = ((List)localObject1);
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        localb.ewK = ((List)localObject1);
        JSONArray localJSONArray = paramJSONObject.optJSONArray("UserInfoList");
        if (localJSONArray != null)
          for (int i = 0; i < localJSONArray.length(); i++)
          {
            Object localObject2 = localJSONArray.optJSONObject(i);
            localObject1 = ((JSONObject)localObject2).optString("HeadImgUrl");
            localObject2 = ((JSONObject)localObject2).optString("UserName");
            if ((!bo.isNullOrNil((String)localObject1)) && (!bo.isNullOrNil((String)localObject2)))
            {
              localb.pqx.add(localObject1);
              localb.ewK.add(localObject2);
            }
          }
        localb.pqy = paramJSONObject.optString("UserInfoListDesc");
        localb.status = paramJSONObject.optInt("Status");
        localb.type = paramJSONObject.optInt("Type");
        localb.pqz = paramJSONObject.optString("AppMsgId");
        localb.pqA = paramJSONObject.optString("ItemIndex");
        localb.pqB = paramJSONObject.optString("ReportContent");
        localb.pqC = paramJSONObject.optString("Digest");
        localb.fgd = paramJSONObject.optString("VideoId");
        localb.videoHeight = paramJSONObject.optInt("VideoHeight");
        localb.videoWidth = paramJSONObject.optInt("VideoWidth");
        localb.eWK = paramJSONObject.optInt("VideoDuration");
        localb.oyB = paramJSONObject.optInt("DateTime");
        AppMethodBeat.o(23934);
        paramJSONObject = localb;
      }
      catch (Exception paramJSONObject)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.MessageInfo", paramJSONObject, "", new Object[0]);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.b.b
 * JD-Core Version:    0.6.2
 */