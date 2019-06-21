package com.tencent.mm.plugin.appbrand.config;

import android.database.Cursor;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.fw;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class WxaAttributes extends fw
{
  public static final c.a gSs;
  private WxaAttributes.a hhM;
  private WxaAttributes.d hhN;
  private WxaAttributes.e hhO;
  private List<WxaAttributes.WxaEntryInfo> hhP = null;
  private b hhQ;

  static
  {
    AppMethodBeat.i(96177);
    c.a locala = new c.a();
    locala.xDb = new Field[20];
    locala.columns = new String[21];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "usernameHash";
    locala.xDd.put("usernameHash", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" usernameHash INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "usernameHash";
    locala.columns[1] = "username";
    locala.xDd.put("username", "TEXT");
    localStringBuilder.append(" username TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "appId";
    locala.xDd.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "nickname";
    locala.xDd.put("nickname", "TEXT");
    localStringBuilder.append(" nickname TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "shortNickname";
    locala.xDd.put("shortNickname", "TEXT");
    localStringBuilder.append(" shortNickname TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "brandIconURL";
    locala.xDd.put("brandIconURL", "TEXT");
    localStringBuilder.append(" brandIconURL TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "roundedSquareIconURL";
    locala.xDd.put("roundedSquareIconURL", "TEXT");
    localStringBuilder.append(" roundedSquareIconURL TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "bigHeadURL";
    locala.xDd.put("bigHeadURL", "TEXT");
    localStringBuilder.append(" bigHeadURL TEXT");
    localStringBuilder.append(", ");
    locala.columns[8] = "smallHeadURL";
    locala.xDd.put("smallHeadURL", "TEXT");
    localStringBuilder.append(" smallHeadURL TEXT");
    localStringBuilder.append(", ");
    locala.columns[9] = "signature";
    locala.xDd.put("signature", "TEXT");
    localStringBuilder.append(" signature TEXT");
    localStringBuilder.append(", ");
    locala.columns[10] = "appOpt";
    locala.xDd.put("appOpt", "INTEGER default '0' ");
    localStringBuilder.append(" appOpt INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[11] = "registerSource";
    locala.xDd.put("registerSource", "TEXT");
    localStringBuilder.append(" registerSource TEXT");
    localStringBuilder.append(", ");
    locala.columns[12] = "appInfo";
    locala.xDd.put("appInfo", "TEXT");
    localStringBuilder.append(" appInfo TEXT");
    localStringBuilder.append(", ");
    locala.columns[13] = "versionInfo";
    locala.xDd.put("versionInfo", "TEXT");
    localStringBuilder.append(" versionInfo TEXT");
    localStringBuilder.append(", ");
    locala.columns[14] = "bindWxaInfo";
    locala.xDd.put("bindWxaInfo", "TEXT");
    localStringBuilder.append(" bindWxaInfo TEXT");
    localStringBuilder.append(", ");
    locala.columns[15] = "dynamicInfo";
    locala.xDd.put("dynamicInfo", "TEXT");
    localStringBuilder.append(" dynamicInfo TEXT");
    localStringBuilder.append(", ");
    locala.columns[16] = "reserved";
    locala.xDd.put("reserved", "TEXT");
    localStringBuilder.append(" reserved TEXT");
    localStringBuilder.append(", ");
    locala.columns[17] = "syncTimeSecond";
    locala.xDd.put("syncTimeSecond", "LONG default '0' ");
    localStringBuilder.append(" syncTimeSecond LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[18] = "syncVersion";
    locala.xDd.put("syncVersion", "TEXT");
    localStringBuilder.append(" syncVersion TEXT");
    localStringBuilder.append(", ");
    locala.columns[19] = "bizMenu";
    locala.xDd.put("bizMenu", "TEXT");
    localStringBuilder.append(" bizMenu TEXT");
    locala.columns[20] = "rowid";
    locala.sql = localStringBuilder.toString();
    gSs = locala;
    AppMethodBeat.o(96177);
  }

  private List<WxaAttributes.b.a> k(JSONArray paramJSONArray)
  {
    Object localObject1 = null;
    AppMethodBeat.i(96175);
    Object localObject2;
    if (paramJSONArray != null)
    {
      ArrayList localArrayList = new ArrayList();
      try
      {
        int i = paramJSONArray.length();
        for (int j = 0; ; j++)
        {
          localObject2 = localArrayList;
          if (j >= i)
            break;
          localObject2 = paramJSONArray.getJSONObject(j);
          WxaAttributes.b.a locala = new com/tencent/mm/plugin/appbrand/config/WxaAttributes$b$a;
          locala.<init>();
          locala.name = ((JSONObject)localObject2).optString("name", "");
          locala.type = ((JSONObject)localObject2).optInt("type");
          JSONObject localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>(((JSONObject)localObject2).optString("value", ""));
          locala.userName = localJSONObject.optString("userName", "");
          locala.csu = localJSONObject.optString("pagePath", "");
          locala.version = localJSONObject.optInt("version");
          locala.hia = k(((JSONObject)localObject2).optJSONArray("sub_button_list"));
          localArrayList.add(locala);
        }
      }
      catch (JSONException paramJSONArray)
      {
        AppMethodBeat.o(96175);
        localObject2 = localObject1;
      }
    }
    while (true)
    {
      return localObject2;
      localObject2 = null;
      AppMethodBeat.o(96175);
    }
  }

  public final c.a Ag()
  {
    return gSs;
  }

  public final WxaAttributes.a ayJ()
  {
    AppMethodBeat.i(96170);
    if (this.hhM == null)
      this.hhM = WxaAttributes.a.zx(this.field_appInfo);
    WxaAttributes.a locala = this.hhM;
    AppMethodBeat.o(96170);
    return locala;
  }

  public final WxaAttributes.d ayK()
  {
    boolean bool1 = true;
    int i = 0;
    AppMethodBeat.i(96171);
    if (this.hhN == null)
      try
      {
        Object localObject1 = new org/json/JSONObject;
        ((JSONObject)localObject1).<init>(this.field_dynamicInfo);
        Object localObject2 = localObject1;
        if (localObject1 == null)
          localObject2 = new JSONObject();
        this.hhN = new WxaAttributes.d();
        Object localObject3 = ((JSONObject)localObject2).optJSONObject("NewSetting");
        localObject1 = localObject3;
        if (localObject3 == null)
          localObject1 = new JSONObject();
        this.hhN.hib.bQM = ((JSONObject)localObject1).optInt("MaxLocalstorageSize", 5);
        this.hhN.hib.hid = ((JSONObject)localObject1).optInt("OpendataMaxLocalstorageSize", 5);
        this.hhN.hib.hie = ((JSONObject)localObject1).optInt("MaxCodeSize", 5);
        this.hhN.hib.hgX = ((JSONObject)localObject1).optInt("ExpendedMaxWebviewDepth", 5);
        this.hhN.hib.bQv = ((JSONObject)localObject1).optInt("MaxBackgroundLifespan", 600);
        this.hhN.hib.bQw = ((JSONObject)localObject1).optInt("MaxRequestConcurrent", 5);
        this.hhN.hib.bQx = ((JSONObject)localObject1).optInt("MaxUploadConcurrent", 5);
        this.hhN.hib.bQy = ((JSONObject)localObject1).optInt("MaxDownloadConcurrent", 5);
        this.hhN.hib.bQz = ((JSONObject)localObject1).optInt("MaxWebsocketConnect", 2);
        this.hhN.hib.bQA = ((JSONObject)localObject1).optInt("MaxWorkerConcurrent", 1);
        localObject3 = this.hhN.hib;
        if (((JSONObject)localObject1).optInt("WebsocketSkipPortCheck", 0) != 0)
        {
          bool2 = true;
          ((WxaAttributes.d.a)localObject3).bQB = bool2;
          localObject3 = this.hhN.hib;
          if (((JSONObject)localObject1).optInt("TLSSkipHostnameCheck", 0) == 0)
            break label638;
          bool2 = true;
          ((WxaAttributes.d.a)localObject3).bQC = bool2;
          this.hhN.hib.hif = ((JSONObject)localObject1).optInt("MaxFileStorageSize", 10);
          this.hhN.hib.hig = ((JSONObject)localObject1).optInt("BackgroundNetworkInterruptedTimeout", 5);
          localObject3 = this.hhN.hib;
          if (((JSONObject)localObject1).optInt("CanKeepAliveByAudioPlay", 0) <= 0)
            break label644;
          bool2 = true;
          ((WxaAttributes.d.a)localObject3).hgY = bool2;
          this.hhN.hib.hhb = ((JSONObject)localObject1).optInt("LifeSpanBeforeSuspend", 5);
          this.hhN.hib.hhc = ((JSONObject)localObject1).optInt("LifeSpanAfterSuspend", 300);
          localObject3 = this.hhN.hib;
          if (((JSONObject)localObject1).optInt("ScanCodeEnableZZM", 0) == 0)
            break label650;
          bool2 = true;
          ((WxaAttributes.d.a)localObject3).bQK = bool2;
          localObject3 = this.hhN.hib;
          if (((JSONObject)localObject1).optInt("CanPreFetchData", 0) <= 0)
            break label656;
          bool2 = true;
          ((WxaAttributes.d.a)localObject3).hbV = bool2;
          localObject3 = this.hhN.hib;
          if (((JSONObject)localObject1).optInt("CanPeriodFetchData", 0) <= 0)
            break label662;
          bool2 = bool1;
          ((WxaAttributes.d.a)localObject3).hbW = bool2;
          this.hhN.hib.hbX = ((JSONObject)localObject1).optInt("PeriodFetchData", 0);
          localObject1 = ((JSONObject)localObject2).optJSONArray("NewCategories");
          if (localObject1 == null)
            break label668;
          this.hhN.hic = new LinkedList();
          while (i < ((JSONArray)localObject1).length())
          {
            localObject2 = ((JSONArray)localObject1).optJSONObject(i);
            if (localObject2 != null)
              this.hhN.hic.add(new Pair(((JSONObject)localObject2).optString("first"), ((JSONObject)localObject2).optString("second")));
            i++;
          }
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          locald = null;
          continue;
          boolean bool2 = false;
          continue;
          label638: bool2 = false;
          continue;
          label644: bool2 = false;
          continue;
          label650: bool2 = false;
          continue;
          label656: bool2 = false;
          continue;
          label662: bool2 = false;
        }
      }
    label668: WxaAttributes.d locald = this.hhN;
    AppMethodBeat.o(96171);
    return locald;
  }

  public final WxaAttributes.e ayL()
  {
    AppMethodBeat.i(96172);
    WxaAttributes.e locale;
    if ((this.hhO == null) && (!bo.isNullOrNil(this.field_versionInfo)))
    {
      locale = WxaAttributes.e.zz(this.field_versionInfo);
      this.hhO = locale;
      AppMethodBeat.o(96172);
    }
    while (true)
    {
      return locale;
      locale = this.hhO;
      AppMethodBeat.o(96172);
    }
  }

  public final List<WxaAttributes.WxaEntryInfo> ayM()
  {
    AppMethodBeat.i(96173);
    if ((this.hhP == null) && (!bo.isNullOrNil(this.field_bindWxaInfo)))
      try
      {
        Object localObject1 = new org/json/JSONObject;
        ((JSONObject)localObject1).<init>(this.field_bindWxaInfo);
        localObject1 = ((JSONObject)localObject1).optJSONArray("bizEntryInfo");
        if (localObject1 != null)
        {
          Object localObject2 = new java/util/LinkedList;
          ((LinkedList)localObject2).<init>();
          this.hhP = ((List)localObject2);
          for (int i = 0; i < ((JSONArray)localObject1).length(); i++)
          {
            localObject2 = ((JSONArray)localObject1).optJSONObject(i);
            if (localObject2 != null)
            {
              String str = ((JSONObject)localObject2).optString("username");
              if (!bo.isNullOrNil(str))
              {
                WxaAttributes.WxaEntryInfo localWxaEntryInfo = new com/tencent/mm/plugin/appbrand/config/WxaAttributes$WxaEntryInfo;
                localWxaEntryInfo.<init>();
                localWxaEntryInfo.username = str;
                localWxaEntryInfo.title = ((JSONObject)localObject2).optString("title");
                localWxaEntryInfo.iconUrl = ((JSONObject)localObject2).optString("icon_url");
                this.hhP.add(localWxaEntryInfo);
              }
            }
          }
        }
      }
      catch (Exception localException)
      {
        this.hhP = null;
      }
    List localList = this.hhP;
    AppMethodBeat.o(96173);
    return localList;
  }

  public final b ayN()
  {
    AppMethodBeat.i(96174);
    if ((this.hhQ == null) && (!bo.isNullOrNil(this.field_bizMenu)));
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(this.field_bizMenu);
      b localb = new com/tencent/mm/plugin/appbrand/config/WxaAttributes$b;
      localb.<init>();
      this.hhQ = localb;
      this.hhQ.fvv = localJSONObject.optInt("interactive_mode", 0);
      this.hhQ.type = localJSONObject.optInt("type", 0);
      this.hhQ.hhZ = k(localJSONObject.optJSONArray("button_list"));
      localb = this.hhQ;
      AppMethodBeat.o(96174);
      return localb;
    }
    catch (Exception localException)
    {
      while (true)
        this.hhQ = null;
    }
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(96169);
    super.d(paramCursor);
    this.hhM = null;
    this.hhN = null;
    this.hhO = null;
    this.hhP = null;
    this.hhQ = null;
    AppMethodBeat.o(96169);
  }

  public final String toString()
  {
    AppMethodBeat.i(96176);
    String str = "WxaAttributes{field_username='" + this.field_username + '\'' + ", field_appId='" + this.field_appId + '\'' + ", field_nickname='" + this.field_nickname + '\'' + ", field_brandIconURL='" + this.field_brandIconURL + '\'' + ", field_roundedSquareIconURL='" + this.field_roundedSquareIconURL + '\'' + ", field_bigHeadURL='" + this.field_bigHeadURL + '\'' + ", field_smallHeadURL='" + this.field_smallHeadURL + '\'' + ", field_signature='" + this.field_signature + '\'' + ", field_appOpt=" + this.field_appOpt + ", field_registerSource='" + this.field_registerSource + '\'' + ", field_appInfo='" + this.field_appInfo + '\'' + ", field_versionInfo='" + this.field_versionInfo + '\'' + ", field_bindWxaInfo='" + this.field_bindWxaInfo + '\'' + ", field_dynamicInfo='" + this.field_dynamicInfo + '\'' + ", field_bizMenu='" + this.field_bizMenu + '\'' + '}';
    AppMethodBeat.o(96176);
    return str;
  }

  public static final class b
  {
    public int fvv;
    public List<WxaAttributes.b.a> hhZ;
    public int type;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.WxaAttributes
 * JD-Core Version:    0.6.2
 */