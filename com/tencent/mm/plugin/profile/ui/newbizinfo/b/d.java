package com.tencent.mm.plugin.profile.ui.newbizinfo.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ds;
import com.tencent.mm.protocal.protobuf.ku;
import com.tencent.mm.protocal.protobuf.kv;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d extends ds
{
  public static c.a fjX;
  private List<b> mGC;
  private List<a> pqD;
  private List<e> pqb;

  static
  {
    AppMethodBeat.i(23947);
    c.a locala = new c.a();
    locala.xDb = new Field[17];
    locala.columns = new String[18];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "username";
    locala.xDd.put("username", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" username TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "username";
    locala.columns[1] = "originalArticleCount";
    locala.xDd.put("originalArticleCount", "INTEGER default '1' ");
    localStringBuilder.append(" originalArticleCount INTEGER default '1' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "friendSubscribeCount";
    locala.xDd.put("friendSubscribeCount", "INTEGER default '1' ");
    localStringBuilder.append(" friendSubscribeCount INTEGER default '1' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "allArticleWording";
    locala.xDd.put("allArticleWording", "TEXT");
    localStringBuilder.append(" allArticleWording TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "historyArticlesUrl";
    locala.xDd.put("historyArticlesUrl", "TEXT");
    localStringBuilder.append(" historyArticlesUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "userRole";
    locala.xDd.put("userRole", "INTEGER default '1' ");
    localStringBuilder.append(" userRole INTEGER default '1' ");
    localStringBuilder.append(", ");
    locala.columns[6] = "banReason";
    locala.xDd.put("banReason", "TEXT");
    localStringBuilder.append(" banReason TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "showRecommendArticle";
    locala.xDd.put("showRecommendArticle", "INTEGER default '0' ");
    localStringBuilder.append(" showRecommendArticle INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[8] = "showService";
    locala.xDd.put("showService", "INTEGER default '0' ");
    localStringBuilder.append(" showService INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[9] = "messageListStr";
    locala.xDd.put("messageListStr", "TEXT");
    localStringBuilder.append(" messageListStr TEXT");
    localStringBuilder.append(", ");
    locala.columns[10] = "serviceInfoListStr";
    locala.xDd.put("serviceInfoListStr", "TEXT");
    localStringBuilder.append(" serviceInfoListStr TEXT");
    localStringBuilder.append(", ");
    locala.columns[11] = "bizAccountListStr";
    locala.xDd.put("bizAccountListStr", "TEXT");
    localStringBuilder.append(" bizAccountListStr TEXT");
    localStringBuilder.append(", ");
    locala.columns[12] = "cacheTime";
    locala.xDd.put("cacheTime", "LONG default '0' ");
    localStringBuilder.append(" cacheTime LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[13] = "decryptUserName";
    locala.xDd.put("decryptUserName", "TEXT default '' ");
    localStringBuilder.append(" decryptUserName TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[14] = "hiddenAvatar";
    locala.xDd.put("hiddenAvatar", "INTEGER default '0' ");
    localStringBuilder.append(" hiddenAvatar INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[15] = "hiddenButtonBeforeFocus";
    locala.xDd.put("hiddenButtonBeforeFocus", "INTEGER default '0' ");
    localStringBuilder.append(" hiddenButtonBeforeFocus INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[16] = "newBanReason";
    locala.xDd.put("newBanReason", "TEXT");
    localStringBuilder.append(" newBanReason TEXT");
    locala.columns[17] = "rowid";
    locala.sql = localStringBuilder.toString();
    fjX = locala;
    AppMethodBeat.o(23947);
  }

  private static List<e> UX(String paramString)
  {
    AppMethodBeat.i(23944);
    ArrayList localArrayList = new ArrayList();
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(23944);
    while (true)
    {
      return localArrayList;
      try
      {
        Object localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(paramString);
        paramString = new org/json/JSONArray;
        paramString.<init>(((JSONObject)localObject).optString("button_list"));
        for (int i = 0; i < paramString.length(); i++)
        {
          localObject = e.ai(paramString.getJSONObject(i));
          if (localObject != null)
            localArrayList.add(localObject);
        }
      }
      catch (JSONException paramString)
      {
        ab.b("MicroMsg.ProfileInfo", "", new Object[] { paramString });
        AppMethodBeat.o(23944);
      }
    }
  }

  private static List<a> UY(String paramString)
  {
    AppMethodBeat.i(23945);
    ArrayList localArrayList = new ArrayList();
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(23945);
    while (true)
    {
      return localArrayList;
      try
      {
        Object localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(paramString);
        paramString = new org/json/JSONArray;
        paramString.<init>(((JSONObject)localObject).optString("BizAccount"));
        for (int i = 0; i < paramString.length(); i++)
        {
          localObject = a.ag(paramString.getJSONObject(i));
          if (localObject != null)
            localArrayList.add(localObject);
        }
      }
      catch (JSONException paramString)
      {
        ab.b("MicroMsg.ProfileInfo", "", new Object[] { paramString });
        AppMethodBeat.o(23945);
      }
    }
  }

  private static List<b> UZ(String paramString)
  {
    AppMethodBeat.i(23946);
    ArrayList localArrayList = new ArrayList();
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(23946);
    while (true)
    {
      return localArrayList;
      try
      {
        Object localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(paramString);
        paramString = new org/json/JSONArray;
        paramString.<init>(((JSONObject)localObject).optString("ArticleInfo"));
        for (int i = 0; i < paramString.length(); i++)
        {
          localObject = b.ah(paramString.getJSONObject(i));
          if (localObject != null)
            localArrayList.add(localObject);
        }
      }
      catch (JSONException paramString)
      {
        ab.b("MicroMsg.ProfileInfo", "", new Object[] { paramString });
        AppMethodBeat.o(23946);
      }
    }
  }

  public static d a(String paramString, ku paramku)
  {
    AppMethodBeat.i(23943);
    d locald = new d();
    locald.field_username = paramString;
    paramku = paramku.vKQ.iterator();
    while (paramku.hasNext())
    {
      paramString = (kv)paramku.next();
      if (paramString.vMU.equals("OriginalArticleCount"))
      {
        locald.field_originalArticleCount = bo.getInt(paramString.pXM, -1);
      }
      else if (paramString.vMU.equals("FriendSubscribeCount"))
      {
        locald.field_friendSubscribeCount = bo.getInt(paramString.pXM, -1);
      }
      else if (paramString.vMU.equals("AllArticleWording"))
      {
        locald.field_allArticleWording = paramString.pXM;
      }
      else if (paramString.vMU.equals("HistoryArticlesUrl"))
      {
        locald.field_historyArticlesUrl = paramString.pXM;
      }
      else if (paramString.vMU.equals("ArticleList"))
      {
        locald.field_messageListStr = paramString.pXM;
        locald.mGC = UZ(locald.field_messageListStr);
      }
      else if (paramString.vMU.equals("BizAccountList"))
      {
        locald.field_bizAccountListStr = paramString.pXM;
        locald.pqD = UY(locald.field_bizAccountListStr);
      }
      else if (paramString.vMU.equals("MenuInfo"))
      {
        locald.field_serviceInfoListStr = paramString.pXM;
        locald.pqb = UX(locald.field_serviceInfoListStr);
      }
      else if (paramString.vMU.equals("UserRole"))
      {
        locald.field_userRole = bo.getInt(paramString.pXM, 0);
      }
      else if (paramString.vMU.equals("BanReason"))
      {
        locald.field_banReason = paramString.pXM;
      }
      else if (paramString.vMU.equals("ShowRecommendArticle"))
      {
        locald.field_showRecommendArticle = bo.getInt(paramString.pXM, 0);
      }
      else if (paramString.vMU.equals("ShowMenuService"))
      {
        locald.field_showService = bo.getInt(paramString.pXM, 0);
      }
      else if (paramString.vMU.equals("UserName"))
      {
        locald.field_decryptUserName = paramString.pXM;
      }
      else if (paramString.vMU.equals("HiddenAvatar"))
      {
        locald.field_hiddenAvatar = bo.getInt(paramString.pXM, 0);
      }
      else if (paramString.vMU.equals("HiddenButtonBeforeFocus"))
      {
        locald.field_hiddenButtonBeforeFocus = bo.getInt(paramString.pXM, 0);
      }
      else if (paramString.vMU.equals("NewBanReason"))
      {
        locald.field_newBanReason = paramString.pXM;
      }
    }
    locald.field_cacheTime = System.currentTimeMillis();
    AppMethodBeat.o(23943);
    return locald;
  }

  public final c.a Ag()
  {
    return fjX;
  }

  public final boolean arA()
  {
    if (this.field_hiddenAvatar == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final List<b> cbL()
  {
    AppMethodBeat.i(23939);
    if (this.mGC == null)
      this.mGC = UZ(this.field_messageListStr);
    List localList = this.mGC;
    AppMethodBeat.o(23939);
    return localList;
  }

  public final List<e> cbM()
  {
    AppMethodBeat.i(23940);
    if (this.pqb == null)
      this.pqb = UX(this.field_serviceInfoListStr);
    List localList = this.pqb;
    AppMethodBeat.o(23940);
    return localList;
  }

  public final boolean cbN()
  {
    AppMethodBeat.i(23941);
    boolean bool;
    if (!bo.isNullOrNil(this.field_allArticleWording))
    {
      bool = true;
      AppMethodBeat.o(23941);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(23941);
    }
  }

  public final boolean cbO()
  {
    boolean bool = true;
    if (this.field_showRecommendArticle == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final boolean cbP()
  {
    AppMethodBeat.i(23942);
    boolean bool;
    if ((this.field_newBanReason != null) && (!this.field_newBanReason.isEmpty()))
    {
      bool = true;
      AppMethodBeat.o(23942);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(23942);
    }
  }

  public final boolean cbQ()
  {
    if (this.field_hiddenButtonBeforeFocus == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean cbR()
  {
    boolean bool = true;
    if (this.field_showService == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final boolean isNormal()
  {
    boolean bool = true;
    if (this.field_userRole == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.b.d
 * JD-Core Version:    0.6.2
 */