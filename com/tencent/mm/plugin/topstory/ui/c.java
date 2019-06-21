package com.tencent.mm.plugin.topstory.ui;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.te;
import com.tencent.mm.g.a.te.b;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.topstory.a.h;
import com.tencent.mm.plugin.websearch.api.an;
import com.tencent.mm.pluginsdk.ui.tools.i;
import com.tencent.mm.protocal.protobuf.chn;
import com.tencent.mm.protocal.protobuf.cht;
import com.tencent.mm.protocal.protobuf.chu;
import com.tencent.mm.protocal.protobuf.tn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.xweb.WebView.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.TimeZone;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
{
  public static com.tencent.mm.at.a.a.c sBm;
  public static com.tencent.mm.at.a.a.c sBn;

  static
  {
    AppMethodBeat.i(1547);
    com.tencent.mm.at.a.a.c.a locala = new com.tencent.mm.at.a.a.c.a();
    locala.ePH = true;
    locala.ePG = true;
    locala.eQf = true;
    locala.ePT = 2130838444;
    sBm = locala.ahG();
    locala = new com.tencent.mm.at.a.a.c.a();
    locala.ePH = true;
    locala.ePG = true;
    locala.ePT = 2130838444;
    sBn = locala.ahG();
    AppMethodBeat.o(1547);
  }

  public static void W(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(1536);
    ab.i("MicroMsg.TopStory.TopStoryUILogic", "click top story scene %d version %d ", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(com.tencent.mm.plugin.websearch.api.aa.HV(1)) });
    String str1 = "";
    int i = 0;
    if (((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().cEN())
    {
      localObject = ((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().cEP();
      str1 = ((cht)localObject).cJb;
      i = 1;
      an.a((cht)localObject, 102, 1, 0, 0L, "");
    }
    int j = ((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().cEU();
    if (j > 0)
      an.a(((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().cEW(), 102, 2, j, 0L, "");
    Object localObject = new te();
    ((te)localObject).cPr.actionType = 1;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    if (((te)localObject).cPs.cPt)
    {
      localObject = new te();
      ((te)localObject).cPr.actionType = 2;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      ab.i("MicroMsg.TopStory.TopStoryUILogic", "TopStoryHomeUI Exist And Clear");
    }
    String str2 = String.valueOf(System.currentTimeMillis());
    String str3 = paramContext.getString(2131300133);
    chn localchn = new chn();
    localchn.xgj = cFx();
    localchn.scene = paramInt;
    localchn.hlm = "";
    localchn.ctj = str3;
    localchn.cdf = 100;
    localchn.sBd = ((PluginTopStoryUI)com.tencent.mm.kernel.g.M(PluginTopStoryUI.class)).getFirstLoadWebView();
    String str4 = com.tencent.mm.plugin.websearch.api.aa.HP(paramInt);
    localchn.cvF = str4;
    localchn.cIy = str4;
    localchn.xgm = str3;
    localchn.xgl = 1;
    localchn.xgn = com.tencent.mm.plugin.websearch.api.aa.bVP();
    localchn.xgo = ((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).getWebViewType().name();
    a(localchn.tZG, str1, str2, true);
    b(localchn, "clickTopStory", System.currentTimeMillis());
    final boolean bool = true;
    Intent localIntent = new Intent();
    try
    {
      localIntent.putExtra("key_context", localchn.toByteArray());
      if ((com.tencent.mm.protocal.d.vxo >= 654311424) || (com.tencent.mm.protocal.d.vxs))
      {
        localObject = ((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lHF, "{\"tabs\":[{\"wording\":\"好看\",\"wording_cn\":\"好看\",\"wording_en\":\"Wow\",\"wording_hk\":\"好看\",\"wording_tw\":\"好看\",\"category\":110,\"showWhenRedDot\":1,\"tabInfo\":\"{\\\"category\\\":110}\"},{\"wording\":\"精选\",\"wording_cn\":\"精选\",\"wording_en\":\"Recommended\",\"wording_hk\":\"精選\",\"wording_tw\":\"精選\",\"category\":100,\"showWhenRedDot\":0,\"tabInfo\":\"{\\\"category\\\":100}\"}]}");
        List localList = abB((String)localObject);
        int n;
        if (!localList.isEmpty())
          if ((((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().cEN()) || (((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().cEU() > 0))
          {
            k = 110;
            m = ((c.b)localList.get(0)).category;
            String str5 = ((c.b)localList.get(0)).sBt;
            n = 0;
            label547: if (n >= localList.size())
              break label838;
            if (((c.b)localList.get(n)).category != k)
              break label778;
            str5 = ((c.b)localList.get(n)).sBt;
            localchn.url = com.tencent.mm.plugin.topstory.a.g.a(paramInt, str4, str3, str2, str1, str5, i, j);
            localIntent.putExtra("key_tabconfig", (String)localObject);
            localIntent.putExtra("key_chosetab", k);
            if (k != 110)
              break label832;
            bool = false;
          }
        while (true)
        {
          localIntent.addFlags(67108864);
          com.tencent.mm.plugin.websearch.api.aa.d(paramContext, ".ui.home.TopStoryHomeUI", localIntent);
          al.d(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(1529);
              ((a)com.tencent.mm.kernel.g.M(a.class)).getWebViewMgr().a(this.sBo, bool);
              AppMethodBeat.o(1529);
            }
          });
          ((PluginTopStoryUI)com.tencent.mm.kernel.g.M(PluginTopStoryUI.class)).setFirstLoadWebView(1);
          com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xVs, Long.valueOf(System.currentTimeMillis()));
          ((com.tencent.mm.plugin.boots.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.boots.a.c.class)).dC(com.tencent.mm.plugin.boots.a.b.jJq, 884);
          AppMethodBeat.o(1536);
          return;
          n = ((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xVV, Integer.valueOf(0))).intValue();
          k = n;
          if (n != 0)
            break;
          k = 110;
          break;
          label778: n++;
          break label547;
          localchn.url = com.tencent.mm.plugin.topstory.a.g.a(paramInt, str4, str3, str2, str1, "", 0, 0);
          localIntent.putExtra("key_tabconfig", "");
          localIntent.putExtra("key_chosetab", 0);
        }
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        int m;
        continue;
        label832: bool = true;
        continue;
        label838: int k = m;
        continue;
        localObject = "";
      }
    }
  }

  public static final String a(chn paramchn)
  {
    AppMethodBeat.i(1544);
    Collections.sort(paramchn.xgk, new c.3());
    StringBuffer localStringBuffer = new StringBuffer();
    for (int i = 1; i < paramchn.xgk.size(); i++)
    {
      localStringBuffer.append(((chu)paramchn.xgk.get(i - 1)).name);
      localStringBuffer.append("->");
      localStringBuffer.append(((chu)paramchn.xgk.get(i)).name);
      localStringBuffer.append(":");
      localStringBuffer.append(((chu)paramchn.xgk.get(i)).timestamp - ((chu)paramchn.xgk.get(i - 1)).timestamp);
      localStringBuffer.append("\n");
    }
    if (paramchn.xgk.size() > 2)
    {
      localStringBuffer.append("TotalUseTime:");
      localStringBuffer.append(((chu)paramchn.xgk.get(paramchn.xgk.size() - 1)).timestamp - ((chu)paramchn.xgk.get(0)).timestamp);
      localStringBuffer.append("\n");
    }
    paramchn.xgk.clear();
    localStringBuffer.append("============");
    localStringBuffer.append("\n");
    if (com.tencent.mm.plugin.topstory.a.g.cFm())
      com.tencent.mm.sdk.g.d.post(new c.a(localStringBuffer.toString()), "TopStory.SaveTraceTask");
    paramchn = localStringBuffer.toString();
    AppMethodBeat.o(1544);
    return paramchn;
  }

  public static void a(Context paramContext, chn paramchn, String paramString)
  {
    AppMethodBeat.i(1538);
    a(paramchn.tZG, "", paramString, false);
    b(paramchn, "clickTopStory", System.currentTimeMillis());
    paramString = new Intent();
    try
    {
      paramString.putExtra("key_context", paramchn.toByteArray());
      label46: com.tencent.mm.plugin.websearch.api.aa.d(paramContext, ".ui.home.TopStoryTabHomeUI", paramString);
      al.d(new c.2(paramchn));
      AppMethodBeat.o(1538);
      return;
    }
    catch (IOException localIOException)
    {
      break label46;
    }
  }

  private static void a(List<tn> paramList, String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(1540);
    tn localtn = new tn();
    localtn.key = "redPointMsgId";
    localtn.waE = String.valueOf(paramString1);
    paramList.add(localtn);
    paramString1 = new tn();
    paramString1.key = "currentPage";
    paramString1.waD = 1L;
    paramList.add(paramString1);
    paramString1 = new tn();
    paramString1.key = "is_prefetch";
    paramString1.waD = 0L;
    paramList.add(paramString1);
    paramString1 = new tn();
    paramString1.key = "seq";
    paramString1.waE = paramString2;
    paramList.add(paramString1);
    paramString1 = new tn();
    paramString1.key = "requestId";
    paramString1.waE = paramString2;
    paramList.add(paramString1);
    paramString1 = new tn();
    paramString1.key = "recType";
    paramString1.waD = 0L;
    paramList.add(paramString1);
    if (paramBoolean)
    {
      paramString1 = new tn();
      paramString1.key = "direction";
      paramString1.waD = 1L;
      paramList.add(paramString1);
      paramString1 = new tn();
      paramString1.key = "time_zone_min";
      paramString2 = TimeZone.getDefault();
      int i = paramString2.getOffset(GregorianCalendar.getInstance(paramString2).getTimeInMillis());
      paramString1.waE = ((0 - i) / 1000 / 60);
      paramList.add(paramString1);
    }
    AppMethodBeat.o(1540);
  }

  public static List<c.b> abB(String paramString)
  {
    AppMethodBeat.i(1537);
    ArrayList localArrayList = new ArrayList();
    Object localObject1;
    int i;
    JSONObject localJSONObject;
    Object localObject2;
    try
    {
      localObject1 = new org/json/JSONObject;
      ((JSONObject)localObject1).<init>(paramString);
      paramString = ((JSONObject)localObject1).getJSONArray("tabs");
      i = 0;
      if (i < paramString.length())
      {
        localJSONObject = paramString.getJSONObject(i);
        localObject1 = new com/tencent/mm/plugin/topstory/ui/c$b;
        ((c.b)localObject1).<init>();
        ((c.b)localObject1).category = localJSONObject.getInt("category");
        localObject2 = com.tencent.mm.sdk.platformtools.aa.dor();
        if (((String)localObject2).equals("zh_TW"));
        for (((c.b)localObject1).cEh = localJSONObject.getString("wording_tw"); ; ((c.b)localObject1).cEh = localJSONObject.getString("wording_hk"))
        {
          if (!bo.isNullOrNil(((c.b)localObject1).cEh))
            break label222;
          localArrayList.clear();
          AppMethodBeat.o(1537);
          return localArrayList;
          if (!((String)localObject2).equals("zh_HK"))
            break;
        }
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.w("MicroMsg.TopStory.TopStoryUILogic", "parse tabconfig failed: %s", new Object[] { paramString.getMessage() });
        localArrayList.clear();
        AppMethodBeat.o(1537);
        continue;
        if (((String)localObject2).equals("zh_CN"))
          ((c.b)localObject1).cEh = localJSONObject.getString("wording_cn");
        else
          ((c.b)localObject1).cEh = localJSONObject.getString("wording_en");
      }
    }
    label222: boolean bool;
    if (localJSONObject.getInt("showWhenRedDot") == 1)
    {
      bool = true;
      label237: ((c.b)localObject1).sBs = bool;
      ((c.b)localObject1).sBt = localJSONObject.getString("tabInfo");
      if (((c.b)localObject1).category != 110)
        break label424;
      if (!((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().cEN())
        break label418;
      j = 1;
      ((c.b)localObject1).sBu = j;
      ((c.b)localObject1).sBv = ((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().cEU();
      if (((c.b)localObject1).sBv > 0)
      {
        localObject2 = ((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().cEW();
        if (localObject2 != null)
          ((c.b)localObject1).sBx = ((cht)localObject2).cJb;
      }
      if (((c.b)localObject1).sBu > 0)
      {
        localObject2 = ((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().cEP();
        if (localObject2 != null)
          ((c.b)localObject1).sBw = ((cht)localObject2).cJb;
      }
    }
    label418: label424: 
    while (((c.b)localObject1).category != 100)
      while (true)
      {
        localArrayList.add(localObject1);
        i++;
        break;
        bool = false;
        break label237;
        j = 0;
      }
    if (((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().cFb());
    for (int j = 1; ; j = 0)
    {
      ((c.b)localObject1).sBu = j;
      if (((c.b)localObject1).sBu <= 0)
        break;
      ((c.b)localObject1).sBw = ((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().cFc();
      break;
    }
  }

  public static void abC(String paramString)
  {
    AppMethodBeat.i(1545);
    paramString = new com.tencent.mm.plugin.topstory.a.c.d(paramString);
    com.tencent.mm.kernel.g.Rg().a(paramString.getType(), new c.4(paramString));
    com.tencent.mm.kernel.g.Rg().a(paramString, 0);
    AppMethodBeat.o(1545);
  }

  public static void an(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(1535);
    ab.i("MicroMsg.TopStory.TopStoryUILogic", "startTopStoryUploadUI, appid:%s", new Object[] { paramString2 });
    if (com.tencent.mm.pluginsdk.model.app.g.bT(paramString2, true) == null)
    {
      i.c(paramString1, "", paramString2, -1, "appinfo error: not found.");
      ab.i("MicroMsg.TopStory.TopStoryUILogic", "startTopStoryUploadUI appinfo error");
      AppMethodBeat.o(1535);
    }
    while (true)
    {
      return;
      try
      {
        Object localObject1 = new org/json/JSONObject;
        ((JSONObject)localObject1).<init>(paramString3);
        Object localObject2 = ((JSONObject)localObject1).getJSONObject("source");
        String str1 = ((JSONObject)localObject2).getString("title");
        String str2 = ((JSONObject)localObject2).optString("description", "");
        String str3 = ((JSONObject)localObject2).getString("thumbUrl");
        String str4 = ((JSONObject)localObject1).getString("appVersion");
        localObject1 = ((JSONObject)localObject2).optString("mediaName", "");
        localObject2 = ((JSONObject)localObject2).optString("mediaHeadUrl", "");
        Intent localIntent = new android/content/Intent;
        localIntent.<init>();
        localIntent.putExtra("KEY_BIZTYPE", paramString1);
        localIntent.putExtra("KEY_APPID", paramString2);
        localIntent.putExtra("KEY_EXTINFO", paramString3);
        localIntent.putExtra("KEY_TITLE", str1);
        localIntent.putExtra("KEY_DESC", str2);
        localIntent.putExtra("KEY_THUMBURL", str3);
        localIntent.putExtra("KEY_APPVERSION", str4);
        localIntent.putExtra("KEY_MEDIANAME", (String)localObject1);
        localIntent.putExtra("KEY_MEDIAHEADURL", (String)localObject2);
        localIntent.addFlags(268435456).addFlags(32768);
        com.tencent.mm.plugin.websearch.api.aa.d(ah.getContext(), ".ui.home.TopStoryUploadUI", localIntent);
        AppMethodBeat.o(1535);
      }
      catch (JSONException paramString3)
      {
        ab.printErrStackTrace("MicroMsg.TopStory.TopStoryUILogic", paramString3, "startTopStoryUploadUI", new Object[0]);
        i.c(paramString1, "", paramString2, -1, "extInfo error: parse failed.");
        AppMethodBeat.o(1535);
      }
    }
  }

  public static final String au(String paramString, long paramLong)
  {
    AppMethodBeat.i(1539);
    paramString = paramString + "_" + paramLong;
    AppMethodBeat.o(1539);
    return paramString;
  }

  private static void b(chn paramchn, String paramString, long paramLong)
  {
    AppMethodBeat.i(1542);
    h.a(paramchn, paramString, paramLong);
    if (paramchn.xgk.size() != 0)
      AppMethodBeat.o(1542);
    while (true)
    {
      return;
      chu localchu = new chu();
      localchu.name = paramString;
      localchu.timestamp = paramLong;
      paramchn.xgk.add(localchu);
      AppMethodBeat.o(1542);
    }
  }

  public static final void c(chn paramchn, String paramString, long paramLong)
  {
    AppMethodBeat.i(1543);
    h.a(paramchn, paramString, paramLong);
    if (paramchn.xgk.size() > 0)
    {
      chu localchu = new chu();
      localchu.name = paramString;
      localchu.timestamp = paramLong;
      paramchn.xgk.add(localchu);
    }
    AppMethodBeat.o(1543);
  }

  public static final String cFx()
  {
    AppMethodBeat.i(1541);
    te localte = new te();
    localte.cPr.actionType = 3;
    com.tencent.mm.sdk.b.a.xxA.m(localte);
    String str = "";
    if (localte.cPs.cPu != null)
      str = localte.cPs.cPu.xgj;
    if (bo.isNullOrNil(str))
    {
      str = UUID.randomUUID().toString();
      AppMethodBeat.o(1541);
    }
    while (true)
    {
      return str;
      AppMethodBeat.o(1541);
    }
  }

  public static void eZ(Context paramContext)
  {
    AppMethodBeat.i(1546);
    an.l("", 0, 0, 100);
    com.tencent.mm.plugin.websearch.api.aa.d(paramContext, ".ui.home.TopStorySettingUI", new Intent());
    AppMethodBeat.o(1546);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.c
 * JD-Core Version:    0.6.2
 */