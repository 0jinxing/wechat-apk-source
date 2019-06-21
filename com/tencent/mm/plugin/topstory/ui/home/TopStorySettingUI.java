package com.tencent.mm.plugin.topstory.ui.home;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.compatible.util.q;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.topstory.a.c.c;
import com.tencent.mm.protocal.protobuf.ahn;
import com.tencent.mm.protocal.protobuf.aho;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.Iterator;
import java.util.LinkedList;

public class TopStorySettingUI extends MMPreference
  implements com.tencent.mm.ai.f
{
  private com.tencent.mm.ui.base.preference.f ehK;
  private final String sCA = "feedback";
  private IconPreference sCB;
  private IconPreference sCC;
  private int sCD = -1;
  private int sCE = -1;
  private String sCF = "";
  private String sCG = "";
  private int sCH = -1;
  private final String sCy = "unlike";
  private final String sCz = "black";
  private com.tencent.mm.ui.base.p tipDialog = null;

  private boolean FB(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(1632);
    ab.i("MicroMsg.TopStory.TopStorySettingUI", "goDetailSettingUI, type:%s", new Object[] { Integer.valueOf(paramInt) });
    if ((paramInt != 1) && (paramInt != 2))
    {
      this.sCH = -1;
      AppMethodBeat.o(1632);
      return bool;
    }
    this.sCH = paramInt;
    if (paramInt == 1)
      paramInt = 1;
    while (true)
      if (((paramInt != 0) && (this.sCD < 0)) || ((paramInt == 0) && (this.sCE < 0)))
      {
        if (!bBL())
        {
          com.tencent.mm.ui.base.h.b(this, getString(2131306039), "", true);
          AppMethodBeat.o(1632);
          break;
          paramInt = 0;
          continue;
        }
        if (paramInt != 0)
        {
          localObject = new c(3);
          g.RO().eJo.a((m)localObject, 0);
        }
        while (true)
        {
          this.tipDialog = com.tencent.mm.ui.base.h.b(this, getString(2131306038), true, new TopStorySettingUI.2(this));
          ab.i("MicroMsg.TopStory.TopStorySettingUI", "wait for data");
          AppMethodBeat.o(1632);
          break;
          localObject = new c(1);
          g.RO().eJo.a((m)localObject, 0);
        }
      }
    if (this.tipDialog != null)
    {
      this.tipDialog.dismiss();
      this.tipDialog = null;
    }
    Object localObject = new Intent();
    if (paramInt != 0)
    {
      ((Intent)localObject).putExtra("k_topstory_type", 1);
      ((Intent)localObject).putExtra("k_topstory_user_list", this.sCF);
      com.tencent.mm.plugin.websearch.api.aa.d(this, ".ui.home.TopStorySettingVisibilityDetailUI", (Intent)localObject);
    }
    while (true)
    {
      AppMethodBeat.o(1632);
      bool = true;
      break;
      ((Intent)localObject).putExtra("k_topstory_type", 2);
      ((Intent)localObject).putExtra("k_topstory_user_list", this.sCG);
      com.tencent.mm.plugin.websearch.api.aa.d(this, ".ui.home.TopStorySettingVisibilityDetailUI", (Intent)localObject);
    }
  }

  private static boolean bBK()
  {
    AppMethodBeat.i(1633);
    int i = g.Rg().acS();
    boolean bool;
    if ((i == 4) || (i == 6))
    {
      bool = true;
      AppMethodBeat.o(1633);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(1633);
    }
  }

  private static boolean bBL()
  {
    AppMethodBeat.i(1634);
    boolean bool;
    if (((com.tencent.mm.kernel.b.h)g.RM().Rn()).SG())
    {
      bool = bBK();
      AppMethodBeat.o(1634);
    }
    while (true)
    {
      return bool;
      if (at.isConnected(ah.getContext()));
      for (int i = 6; ; i = 0)
      {
        if (i != 6)
          break label67;
        bool = true;
        AppMethodBeat.o(1634);
        break;
      }
      label67: AppMethodBeat.o(1634);
      bool = false;
    }
  }

  private void cFF()
  {
    AppMethodBeat.i(1630);
    ab.i("MicroMsg.TopStory.TopStorySettingUI", "updateSummary %s, %s", new Object[] { Integer.valueOf(this.sCD), Integer.valueOf(this.sCE) });
    if (this.sCD <= 0)
    {
      this.sCB.setSummary("");
      if (this.sCE > 0)
        break label112;
      this.sCC.setSummary("");
    }
    while (true)
    {
      this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(1630);
      return;
      this.sCB.setSummary(this.sCD);
      break;
      label112: this.sCC.setSummary(this.sCE);
    }
  }

  public final int JC()
  {
    return 2131165305;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    boolean bool = true;
    AppMethodBeat.i(1626);
    paramf = paramPreference.mKey;
    if ("unlike".equals(paramf))
    {
      com.tencent.mm.plugin.report.service.h.pYm.e(17080, new Object[] { Integer.valueOf(1), Integer.valueOf(2), this.sCD });
      bool = FB(1);
      AppMethodBeat.o(1626);
    }
    while (true)
    {
      return bool;
      if ("black".equals(paramf))
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(17080, new Object[] { Integer.valueOf(2), Integer.valueOf(2), this.sCE });
        bool = FB(2);
        AppMethodBeat.o(1626);
        continue;
      }
      if ("feedback".equals(paramf))
        paramf = new StringBuilder("https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=feedback/index");
      try
      {
        paramf.append("&deviceName=").append(q.encode(com.tencent.mm.protocal.d.DEVICE_NAME, "UTF-8"));
        label194: paramf.append("&imei=");
        try
        {
          paramf.append("&deviceBrand=").append(q.encode(Build.BRAND, "UTF-8"));
          try
          {
            label222: paramf.append("&deviceModel=").append(q.encode(Build.MODEL, "UTF-8"));
            label242: paramf.append("&from=settingPage");
            paramPreference = paramf.append("&uin=");
            g.RN();
            paramPreference.append(a.QG());
            paramf.append("&version=").append(com.tencent.mm.protocal.d.vxo);
            try
            {
              paramf.append("&lang=").append(q.encode(com.tencent.mm.sdk.platformtools.aa.dor(), "UTF-8"));
              try
              {
                label304: paramf.append("&ostype=").append(q.encode(com.tencent.mm.protocal.d.vxk, "UTF-8"));
                label324: paramf.append("&scene=32");
                paramf.append("&timeZone=").append(bo.dpA());
                paramf.append("&templateVersion=").append(com.tencent.mm.plugin.websearch.api.aa.Id(1));
                paramf.append("#/list/4155");
                ab.i("MicroMsg.TopStory.TopStorySettingUI", "url is:" + paramf.toString());
                paramPreference = new Intent();
                paramPreference.putExtra("rawUrl", paramf.toString());
                paramPreference.putExtra("convertActivityFromTranslucent", false);
                paramPreference.putExtra("customize_status_bar_color", 0);
                paramPreference.putExtra("status_bar_style", null);
                paramPreference.putExtra("prePublishId", "wes##2##1");
                paramPreference.putExtra("KPublisherId", "wes##2##1");
                paramPreference.putExtra("preChatTYPE", 10);
                com.tencent.mm.bp.d.b(ah.getContext(), "webview", ".ui.tools.WebViewUI", paramPreference);
                AppMethodBeat.o(1626);
                continue;
                AppMethodBeat.o(1626);
                bool = false;
              }
              catch (Exception paramPreference)
              {
                break label324;
              }
            }
            catch (Exception paramPreference)
            {
              break label304;
            }
          }
          catch (Exception paramPreference)
          {
            break label242;
          }
        }
        catch (Exception paramPreference)
        {
          break label222;
        }
      }
      catch (Exception paramPreference)
      {
        break label194;
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(1627);
    super.onCreate(paramBundle);
    setMMTitle(getString(2131296398));
    setBackBtn(new TopStorySettingUI.1(this));
    this.ehK = this.yCw;
    this.sCB = ((IconPreference)this.ehK.aqO("unlike"));
    this.sCC = ((IconPreference)this.ehK.aqO("black"));
    g.Rg().a(2748, this);
    AppMethodBeat.o(1627);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(1629);
    super.onDestroy();
    if (this.tipDialog != null)
      this.tipDialog.dismiss();
    g.Rg().b(2748, this);
    AppMethodBeat.o(1629);
  }

  public void onResume()
  {
    AppMethodBeat.i(1628);
    super.onResume();
    this.sCD = -1;
    this.sCE = -1;
    this.sCF = "";
    this.sCG = "";
    cFF();
    c localc1 = new c(1);
    c localc2 = new c(3);
    g.RO().eJo.a(localc1, 0);
    g.RO().eJo.a(localc2, 0);
    ab.i("MicroMsg.TopStory.TopStorySettingUI", "onResume doscene");
    AppMethodBeat.o(1628);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(1631);
    ab.i("MicroMsg.TopStory.TopStorySettingUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      paramInt1 = 1;
    aho localaho;
    while ((paramm instanceof c))
    {
      paramm = (c)paramm;
      paramInt2 = paramm.type;
      if (paramInt1 == 0)
      {
        ab.i("MicroMsg.TopStory.TopStorySettingUI", "onSceneEnd fail, type:%s", new Object[] { Integer.valueOf(paramInt2) });
        if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
        {
          this.tipDialog.dismiss();
          this.tipDialog = null;
          com.tencent.mm.ui.base.h.b(this, getString(2131306039), "", true);
        }
        AppMethodBeat.o(1631);
        return;
        paramInt1 = 0;
      }
      else
      {
        paramString = (ahn)paramm.ehh.fsH.fsP;
        if (paramString.vHk.isEmpty())
        {
          if (paramInt2 == 3)
            this.sCD = 0;
          while (true)
          {
            cFF();
            AppMethodBeat.o(1631);
            break;
            if (paramm.type == 1)
              this.sCE = 0;
          }
        }
        if (paramInt2 != 3)
          break label359;
        paramm = new StringBuilder();
        this.sCD = 0;
        paramString = paramString.vHk.iterator();
        while (paramString.hasNext())
        {
          localaho = (aho)paramString.next();
          this.sCD += 1;
          paramm.append(localaho.vHl).append(",");
        }
        this.sCF = paramm.toString();
      }
    }
    while (true)
    {
      if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
      {
        this.tipDialog.dismiss();
        this.tipDialog = null;
        FB(this.sCH);
      }
      cFF();
      AppMethodBeat.o(1631);
      break;
      label359: if (paramInt2 == 1)
      {
        paramm = new StringBuilder();
        this.sCE = 0;
        paramString = paramString.vHk.iterator();
        while (paramString.hasNext())
        {
          localaho = (aho)paramString.next();
          this.sCE += 1;
          paramm.append(localaho.vHl).append(",");
        }
        this.sCG = paramm.toString();
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.home.TopStorySettingUI
 * JD-Core Version:    0.6.2
 */