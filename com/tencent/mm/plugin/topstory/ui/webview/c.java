package com.tencent.mm.plugin.topstory.ui.webview;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.topstory.a.e;
import com.tencent.mm.plugin.topstory.a.h;
import com.tencent.mm.plugin.topstory.ui.PluginTopStoryUI;
import com.tencent.mm.plugin.topstory.ui.home.a;
import com.tencent.mm.protocal.protobuf.bpw;
import com.tencent.mm.protocal.protobuf.chn;
import com.tencent.mm.protocal.protobuf.cve;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
  implements f
{
  private com.tencent.mm.plugin.topstory.a.c.b sAq;
  public f sEu;
  public f sHA;
  public a sHt;
  private boolean sHu;
  public c.b sHv;
  public byte[] sHw;
  byte[] sHx;
  byte[] sHy;
  public f sHz;

  public c()
  {
    AppMethodBeat.i(2153);
    this.sHz = new c.1(this);
    this.sEu = new c.2(this);
    this.sHA = new c.3(this);
    AppMethodBeat.o(2153);
  }

  private void a(chn paramchn, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(2158);
    if (this.sHu)
    {
      if (this.sHt != null)
        this.sHt.abD(paramString);
      this.sHu = false;
      AppMethodBeat.o(2158);
    }
    while (true)
    {
      return;
      if ((!paramBoolean) && (paramchn.cdf == 100))
      {
        this.sHv = new c.b(this, (byte)0);
        this.sHv.sHE = paramchn;
        this.sHv.jKz = System.currentTimeMillis();
        this.sHv.sHD = paramString;
        AppMethodBeat.o(2158);
      }
      else
      {
        this.sHv = null;
        AppMethodBeat.o(2158);
      }
    }
  }

  private static String cHm()
  {
    AppMethodBeat.i(2159);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("ret", -1);
      label22: String str = localJSONObject.toString();
      AppMethodBeat.o(2159);
      return str;
    }
    catch (JSONException localJSONException)
    {
      break label22;
    }
  }

  public final void a(chn paramchn, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    AppMethodBeat.i(2156);
    ab.i("MicroMsg.TopStory.TopStoryWebData", "loadDataFromServer directRequest:%s", new Object[] { Boolean.valueOf(paramBoolean2) });
    if ((!paramBoolean2) && (this.sAq != null) && (paramchn.cvF.equals(this.sAq.cPu.cvF)))
    {
      this.sHu = paramBoolean1;
      ab.i("MicroMsg.TopStory.TopStoryWebData", "Wait current net scene");
      h.a(paramchn, "WaitCurrentNetScene", System.currentTimeMillis());
      AppMethodBeat.o(2156);
    }
    while (true)
    {
      return;
      this.sAq = new com.tencent.mm.plugin.topstory.a.c.b(paramchn, paramInt);
      g.Rg().a(1943, this);
      g.Rg().a(this.sAq, 0);
      this.sHu = paramBoolean1;
      ab.i("MicroMsg.TopStory.TopStoryWebData", "Start new net scene");
      AppMethodBeat.o(2156);
    }
  }

  public final void cHl()
  {
    AppMethodBeat.i(2154);
    d.post(new c.a(this, (byte)0), "TopStory.LoadHtmlDataFromSdcardTask");
    AppMethodBeat.o(2154);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(2157);
    if (paramm.equals(this.sAq))
    {
      g.Rg().b(1943, this);
      this.sAq = null;
      paramm = (com.tencent.mm.plugin.topstory.a.c.b)paramm;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        ab.i("MicroMsg.TopStory.TopStoryWebData", "netscene topstory error");
        a(paramm.cPu, cHm(), true);
        AppMethodBeat.o(2157);
      }
    }
    while (true)
    {
      return;
      cve localcve = paramm.cFt();
      paramString = localcve.vOy;
      ((com.tencent.mm.plugin.topstory.a.b)g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().lC(localcve.xri);
      a(paramm.cPu, paramString, false);
      if ((paramm.cFt().xrh != null) && ((paramm.cFt().xrh.wSe == 1) || (((PluginTopStoryUI)g.M(PluginTopStoryUI.class)).getTopStoryCommand().sBl)))
        d.post(new c.4(this, localcve, paramString), "TopStory.CacheHomeData");
      AppMethodBeat.o(2157);
    }
  }

  public final void y(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(2155);
    if (bo.isNullOrNil(paramString1))
      AppMethodBeat.o(2155);
    while (true)
    {
      return;
      JSONObject localJSONObject;
      if (this.sHw != null)
        localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("json", paramString1);
        localJSONObject.put("newQuery", true);
        localJSONObject.put("isCache", true);
        if (paramBoolean);
        for (int i = 1; ; i = 0)
        {
          localJSONObject.put("recType", i);
          if (!bo.isNullOrNil(paramString2))
          {
            paramString1 = new org/json/JSONArray;
            paramString1.<init>(paramString2);
            localJSONObject.put("filterDocidList", paramString1);
          }
          label110: this.sHw = new String(this.sHw).replace("'###preloadObjFeedsData###'", localJSONObject.toString() + "\n").getBytes();
          ab.i("MicroMsg.TopStory.TopStoryWebData", "attachDataToHtml htmlBytes:%s", new Object[] { Integer.valueOf(this.sHw.length) });
          AppMethodBeat.o(2155);
          break;
        }
      }
      catch (Exception paramString1)
      {
        break label110;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.webview.c
 * JD-Core Version:    0.6.2
 */