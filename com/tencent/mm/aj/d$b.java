package com.tencent.mm.aj;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.WxaEntryInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d$b
{
  private int fmr = 0;
  private d.b.g fvA;
  private String fvB;
  private String fvC;
  private boolean fvD = false;
  public d.b.a fvE;
  private List<WxaAttributes.WxaEntryInfo> fvF;
  public JSONObject fvc = null;
  private boolean fvd = true;
  public boolean fve = false;
  private boolean fvf = false;
  public boolean fvg = false;
  private String fvh;
  private String fvi;
  private List<d.b.f> fvj = null;
  private d.b.d fvk = null;
  private d.b.c fvl = null;
  private d.b.e fvm = null;
  d.b.c.a fvn = null;
  private boolean fvo = false;
  boolean fvp = false;
  int fvq;
  public boolean fvr = false;
  public int fvs = 0;
  private String fvt;
  private d.b.b fvu = null;
  private int fvv = 0;
  private int fvw = d.fuV;
  private String fvx;
  private boolean fvy = false;
  private int fvz;

  static b qH(String paramString)
  {
    AppMethodBeat.i(11300);
    b localb = new b();
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(11300);
    while (true)
    {
      return localb;
      try
      {
        System.currentTimeMillis();
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        localb.fvc = localJSONObject;
        AppMethodBeat.o(11300);
      }
      catch (Exception paramString)
      {
        while (true)
          ab.e("MicroMsg.BizInfo", "exception:%s", new Object[] { bo.l(paramString) });
      }
    }
  }

  public final boolean adL()
  {
    boolean bool = false;
    AppMethodBeat.i(11293);
    if (this.fvc != null)
    {
      if (bo.getInt(this.fvc.optString("ReportLocationType"), 0) > 0)
        bool = true;
      this.fvo = bool;
    }
    bool = this.fvo;
    AppMethodBeat.o(11293);
    return bool;
  }

  public final boolean adZ()
  {
    AppMethodBeat.i(11280);
    if ((this.fvc != null) && (this.fvc.optJSONObject("WifiBizInfo") != null) && (this.fvc.optJSONObject("WifiBizInfo").optInt("IsWXWiFi") == 1))
      this.fvD = true;
    boolean bool = this.fvD;
    AppMethodBeat.o(11280);
    return bool;
  }

  public final boolean aea()
  {
    AppMethodBeat.i(11281);
    if (this.fvc != null)
      this.fvf = "1".equals(this.fvc.optString("IsShowMember"));
    boolean bool = this.fvf;
    AppMethodBeat.o(11281);
    return bool;
  }

  public final boolean aeb()
  {
    AppMethodBeat.i(11282);
    if (this.fvc != null)
      this.fvw = bo.getInt(this.fvc.optString("NotifyManage"), d.fuV);
    boolean bool;
    if (this.fvw == d.fuU)
    {
      bool = true;
      AppMethodBeat.o(11282);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(11282);
    }
  }

  public final String aec()
  {
    AppMethodBeat.i(11283);
    if (this.fvc != null)
      this.fvh = this.fvc.optString("VerifyContactPromptTitle");
    String str = this.fvh;
    AppMethodBeat.o(11283);
    return str;
  }

  public final String aed()
  {
    AppMethodBeat.i(11284);
    if (this.fvc != null)
      this.fvB = this.fvc.optString("TrademarkUrl");
    String str = this.fvB;
    AppMethodBeat.o(11284);
    return str;
  }

  public final String aee()
  {
    AppMethodBeat.i(11285);
    if (this.fvc != null)
      this.fvC = this.fvc.optString("TrademarkName");
    String str = this.fvC;
    AppMethodBeat.o(11285);
    return str;
  }

  public final String aef()
  {
    AppMethodBeat.i(11286);
    if (this.fvc != null)
      this.fvi = this.fvc.optString("ConferenceContactExpireTime");
    String str = this.fvi;
    AppMethodBeat.o(11286);
    return str;
  }

  public final List<d.b.f> aeg()
  {
    AppMethodBeat.i(11287);
    if ((this.fvc != null) && (this.fvj == null))
      this.fvj = d.b.f.d(this.fvc.optJSONArray("Privilege"));
    List localList = this.fvj;
    AppMethodBeat.o(11287);
    return localList;
  }

  public final int aeh()
  {
    AppMethodBeat.i(11288);
    if (this.fvc != null)
      this.fvv = this.fvc.optInt("InteractiveMode");
    int i = this.fvv;
    AppMethodBeat.o(11288);
    return i;
  }

  public final d.b.e aei()
  {
    AppMethodBeat.i(11289);
    if ((this.fvc != null) && (this.fvm == null))
      this.fvm = d.b.e.qN(this.fvc.optString("PayShowInfo"));
    d.b.e locale = this.fvm;
    AppMethodBeat.o(11289);
    return locale;
  }

  public final d.b.b aej()
  {
    AppMethodBeat.i(11290);
    if ((this.fvc != null) && (this.fvu == null))
    {
      localObject = this.fvc.optString("HardwareBizInfo");
      if (localObject != null)
        this.fvu = d.b.b.qJ((String)localObject);
    }
    Object localObject = this.fvu;
    AppMethodBeat.o(11290);
    return localObject;
  }

  public final d.b.d aek()
  {
    AppMethodBeat.i(11291);
    if ((this.fvc != null) && (this.fvk == null))
      this.fvk = d.b.d.qM(this.fvc.optString("VerifySource"));
    d.b.d locald = this.fvk;
    AppMethodBeat.o(11291);
    return locald;
  }

  public final d.b.g ael()
  {
    AppMethodBeat.i(11292);
    if ((this.fvc != null) && (this.fvA == null))
    {
      localObject = this.fvc.optString("RegisterSource");
      if (localObject != null)
        this.fvA = d.b.g.qO((String)localObject);
    }
    Object localObject = this.fvA;
    AppMethodBeat.o(11292);
    return localObject;
  }

  public final boolean aem()
  {
    boolean bool = true;
    AppMethodBeat.i(11294);
    if (this.fvc != null)
      if (bo.getInt(this.fvc.optString("IsTrademarkProtection"), 0) != 1)
        break label51;
    while (true)
    {
      this.fvy = bool;
      bool = this.fvy;
      AppMethodBeat.o(11294);
      return bool;
      label51: bool = false;
    }
  }

  public final String aen()
  {
    AppMethodBeat.i(11296);
    if (this.fvc != null)
      this.fvt = this.fvc.optString("SupportEmoticonLinkPrefix");
    String str = this.fvt;
    AppMethodBeat.o(11296);
    return str;
  }

  public final d.b.c aeo()
  {
    AppMethodBeat.i(11297);
    if ((this.fvc != null) && (this.fvl == null))
    {
      localObject = this.fvc.optString("MMBizMenu");
      if (localObject != null)
        this.fvl = d.b.c.qK((String)localObject);
    }
    Object localObject = this.fvl;
    AppMethodBeat.o(11297);
    return localObject;
  }

  public final String aep()
  {
    AppMethodBeat.i(11298);
    if (this.fvc != null)
      this.fvx = this.fvc.optString("ServicePhone");
    String str = this.fvx;
    AppMethodBeat.o(11298);
    return str;
  }

  public final boolean aeq()
  {
    AppMethodBeat.i(11299);
    if (this.fvc != null)
      this.fvz = this.fvc.optInt("FunctionFlag");
    boolean bool;
    if ((this.fvz & d.fuW) > 0)
    {
      bool = true;
      AppMethodBeat.o(11299);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(11299);
    }
  }

  public final d.b.c.a aer()
  {
    AppMethodBeat.i(11301);
    if ((this.fvc != null) && (this.fvn == null))
    {
      localObject = this.fvc.optString("EnterpriseBizInfo");
      if (localObject != null)
        this.fvn = d.b.c.a.qL((String)localObject);
    }
    Object localObject = this.fvn;
    AppMethodBeat.o(11301);
    return localObject;
  }

  public final int getServiceType()
  {
    AppMethodBeat.i(11295);
    if (this.fvc != null)
      this.fmr = this.fvc.optInt("ServiceType", 0);
    int i = this.fmr;
    AppMethodBeat.o(11295);
    return i;
  }

  public final List<WxaAttributes.WxaEntryInfo> getWxaEntryInfoList()
  {
    AppMethodBeat.i(11279);
    String str1;
    if (this.fvF == null)
    {
      this.fvF = new LinkedList();
      if (this.fvc != null)
      {
        str1 = this.fvc.optString("BindWxaInfo");
        if (TextUtils.isEmpty(str1));
      }
    }
    while (true)
    {
      try
      {
        Object localObject1 = new org/json/JSONObject;
        ((JSONObject)localObject1).<init>(str1);
        if (localObject1 == null)
          break label231;
        localObject1 = ((JSONObject)localObject1).optJSONArray("wxaEntryInfo");
        if (localObject1 == null)
          break label218;
        int i = 0;
        if (i >= ((JSONArray)localObject1).length())
          break label218;
        Object localObject2 = ((JSONArray)localObject1).optJSONObject(i);
        if (localObject2 != null)
        {
          String str2 = ((JSONObject)localObject2).optString("username");
          str1 = ((JSONObject)localObject2).optString("title");
          String str3 = ((JSONObject)localObject2).optString("title_key");
          localObject2 = ((JSONObject)localObject2).optString("icon_url");
          if ((!TextUtils.isEmpty(str2)) && ((!TextUtils.isEmpty(str1)) || (!TextUtils.isEmpty(str3))))
          {
            WxaAttributes.WxaEntryInfo localWxaEntryInfo = new WxaAttributes.WxaEntryInfo();
            localWxaEntryInfo.username = str2;
            localWxaEntryInfo.title = str1;
            localWxaEntryInfo.hih = str3;
            localWxaEntryInfo.iconUrl = ((String)localObject2);
            this.fvF.add(localWxaEntryInfo);
          }
        }
        i++;
        continue;
      }
      catch (JSONException localJSONException)
      {
      }
      List localList = null;
      continue;
      label218: localList = this.fvF;
      AppMethodBeat.o(11279);
      return localList;
      label231: localList = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.d.b
 * JD-Core Version:    0.6.2
 */