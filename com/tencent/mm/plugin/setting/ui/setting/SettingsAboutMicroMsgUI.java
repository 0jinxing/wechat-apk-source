package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.i;
import com.tencent.mm.plugin.p.b;
import com.tencent.mm.pluginsdk.f.e.a;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.protocal.protobuf.aph;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.IconSummaryPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.r;
import com.tencent.mm.ui.v;

@i
public class SettingsAboutMicroMsgUI extends MMPreference
  implements com.tencent.mm.ai.f
{
  private com.tencent.mm.ui.base.preference.f ehK;
  private boolean qlV = false;
  private aph qlW;
  private int qlX = 0;
  Intent qlY = null;
  private ProgressDialog qlZ;
  private ap qma;
  private com.tencent.mm.ai.f qmb = null;

  private void ciD()
  {
    AppMethodBeat.i(127102);
    this.ehK = this.yCw;
    this.ehK.removeAll();
    this.ehK.addPreferencesFromResource(2131165277);
    SettingsAboutMMHeaderPreference localSettingsAboutMMHeaderPreference = (SettingsAboutMMHeaderPreference)this.ehK.aqO("settings_about_mm_header");
    String str = com.tencent.mm.sdk.platformtools.g.ar(this.mController.ylL, com.tencent.mm.protocal.d.vxo);
    Object localObject = str;
    if (com.tencent.mm.protocal.d.vxr)
      localObject = str + " " + getString(2131296513);
    localSettingsAboutMMHeaderPreference.qlS = ((String)localObject);
    int i;
    if (aa.doo())
    {
      i = bo.h((Integer)com.tencent.mm.kernel.g.RP().Ry().get(12304, null));
      localObject = (IconPreference)this.ehK.aqO("settings_update");
      if (i > 0)
      {
        ((IconPreference)localObject).NL(0);
        ((IconPreference)localObject).ey(String.valueOf(i), r.ik(this.mController.ylL));
      }
    }
    else
    {
      if ((com.tencent.mm.sdk.platformtools.g.cdh & 0x1) == 0)
        break label394;
      i = 1;
      label186: if ((!this.qlV) || (com.tencent.mm.sdk.platformtools.g.xyg))
        break label400;
      localObject = (IconSummaryPreference)this.ehK.aqO("funtion_update");
      ((IconSummaryPreference)localObject).qlf = 0;
      str = com.tencent.mm.sdk.platformtools.g.ar(null, this.qlX);
      ((IconSummaryPreference)localObject).aqR(getString(2131296988));
      ((IconSummaryPreference)localObject).setSummary(str);
      ((IconSummaryPreference)localObject).dAA();
      this.ehK.aqP("funtion_check_update");
      label261: if (!aa.doo())
        this.ehK.ce("settings_report", true);
      if (!com.tencent.mm.pluginsdk.f.e.vdx.Ch())
        this.ehK.ce("funtion_about_wechat", true);
      if (bo.isNullOrNil((String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xRG, null)))
        break label564;
      localObject = (IconPreference)this.ehK.aqO("funtion_crowdtest_update");
      if (com.tencent.mm.x.c.PK().bY(262157, 266263))
        ((IconPreference)localObject).NN(0);
    }
    while (true)
    {
      this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(127102);
      return;
      ((IconPreference)localObject).NL(8);
      ((IconPreference)localObject).ey("", -1);
      break;
      label394: i = 0;
      break label186;
      label400: if ((i == 0) && (this.qlW != null) && (this.qlW.wtp != 0) && (!bo.isNullOrNil(this.qlW.wtq)) && (!com.tencent.mm.sdk.platformtools.g.xyg))
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SettingsAboutMicroMsgUI", "show alpha update. url:%s, hint:%d", new Object[] { this.qlW.wtq, Integer.valueOf(this.qlW.wtr) });
        if (this.qlW.wtr != 0)
        {
          localObject = (IconSummaryPreference)this.ehK.aqO("funtion_update");
          ((IconSummaryPreference)localObject).qlf = 0;
          ((IconSummaryPreference)localObject).aqR(getString(2131296988));
          this.ehK.aqP("funtion_check_update");
          break label261;
        }
        this.ehK.aqP("funtion_update");
        break label261;
      }
      this.ehK.aqP("funtion_update");
      break label261;
      label564: this.ehK.aqP("funtion_crowdtest_update");
    }
  }

  public final int JC()
  {
    return 2131165277;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    boolean bool = true;
    AppMethodBeat.i(127103);
    paramf = paramPreference.mKey;
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SettingsAboutMicroMsgUI", paramf + " item has been clicked!");
    if (paramf.equals("settings_update"))
      if (aa.doo())
      {
        com.tencent.mm.kernel.g.RN();
        paramf = getString(2131303297, new Object[] { Integer.valueOf(com.tencent.mm.kernel.a.QF()), Integer.valueOf(bo.h((Integer)com.tencent.mm.kernel.g.RP().Ry().get(12304, null))) });
        if (paramf == null)
          AppMethodBeat.o(127103);
      }
    while (true)
    {
      return bool;
      com.tencent.mm.kernel.g.RP().Ry().set(12304, Integer.valueOf(0));
      paramPreference = new Intent();
      paramPreference.putExtra("title", getString(2131303296));
      paramPreference.putExtra("rawUrl", paramf);
      paramPreference.putExtra("showShare", false);
      com.tencent.mm.bp.d.b(this.mController.ylL, "webview", ".ui.tools.WebViewUI", paramPreference);
      AppMethodBeat.o(127103);
      continue;
      if (aa.doo());
      for (paramf = getString(2131303101, new Object[] { aa.dor(), Integer.valueOf(com.tencent.mm.protocal.d.vxo) }); ; paramf = "https://blog.wechat.com/")
      {
        paramPreference = new Intent();
        paramPreference.putExtra("rawUrl", paramf);
        paramPreference.putExtra("showShare", false);
        paramPreference.putExtra("show_bottom", false);
        com.tencent.mm.bp.d.b(this.mController.ylL, "webview", ".ui.tools.WebViewUI", paramPreference);
        AppMethodBeat.o(127103);
        break;
      }
      if (paramf.equals("funtion_update"))
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(405L, 16L, 1L, true);
        paramPreference = "";
        if (this.qlV)
          paramf = getString(2131303102, new Object[] { aa.dor(), Integer.valueOf(this.qlX) });
        while (true)
        {
          paramPreference = new Intent();
          paramPreference.putExtra("rawUrl", paramf);
          paramPreference.putExtra("showShare", true);
          paramPreference.putExtra("show_bottom", false);
          com.tencent.mm.bp.d.b(this.mController.ylL, "webview", ".ui.tools.WebViewUI", paramPreference);
          AppMethodBeat.o(127103);
          break;
          paramf = paramPreference;
          if (this.qlW != null)
          {
            paramf = paramPreference;
            if (this.qlW.wtp != 0)
            {
              paramf = paramPreference;
              if (!bo.isNullOrNil(this.qlW.wtq))
                paramf = this.qlW.wtq;
            }
          }
        }
      }
      if (paramf.equals("funtion_check_update"))
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(405L, 17L, 1L, true);
        if (com.tencent.mm.plugin.p.d.bQU() != null)
        {
          com.tencent.mm.plugin.p.d.bQU().bQS();
          if ((com.tencent.mm.sdk.platformtools.g.cdh & 0x1) != 0)
          {
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.SettingsAboutMicroMsgUI", "package has set external update mode");
            paramf = Uri.parse(com.tencent.mm.sdk.platformtools.g.xyc);
            paramPreference = new Intent("android.intent.action.VIEW", paramf).addFlags(268435456);
            if ((paramf == null) || (paramPreference == null) || (!bo.k(this.mController.ylL, paramPreference)))
            {
              com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.SettingsAboutMicroMsgUI", "parse market uri failed, jump to weixin.qq.com");
              startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://weixin.qq.com")).addFlags(268435456));
              com.tencent.mm.plugin.report.service.h.pYm.a(405L, 18L, 1L, true);
            }
            while (true)
            {
              AppMethodBeat.o(127103);
              break;
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SettingsAboutMicroMsgUI", "parse market uri ok");
              startActivity(paramPreference);
              com.tencent.mm.plugin.report.service.h.pYm.a(405L, 19L, 1L, true);
            }
          }
          if ((this.qlW != null) && (this.qlW.wtp != 0) && (!bo.isNullOrNil(this.qlW.wtq)))
          {
            paramPreference = this.qlW.wtq;
            paramf = new Intent();
            paramf.putExtra("rawUrl", paramPreference);
            paramf.putExtra("showShare", false);
            paramf.putExtra("show_bottom", false);
            com.tencent.mm.bp.d.b(this.mController.ylL, "webview", ".ui.tools.WebViewUI", paramf);
            com.tencent.mm.plugin.report.service.h.pYm.a(405L, 20L, 1L, true);
            AppMethodBeat.o(127103);
          }
          else
          {
            ah.getContext().getSharedPreferences("system_config_prefs", 0).edit().putLong("recomended_update_ignore", bo.anT()).commit();
            paramf = com.tencent.mm.plugin.p.d.bQU().c(this, new SettingsAboutMicroMsgUI.6(this));
            if (paramf == null)
              com.tencent.mm.plugin.report.service.h.pYm.a(405L, 21L, 1L, true);
          }
        }
        else
        {
          AppMethodBeat.o(127103);
          bool = false;
          continue;
          com.tencent.mm.plugin.report.service.h.pYm.a(405L, 22L, 1L, true);
          paramf.update(3);
          AppMethodBeat.o(127103);
        }
      }
      else if (paramf.equals("funtion_about_wechat"))
      {
        com.tencent.mm.bp.d.b(this, "whatsnew", ".ui.WhatsNewUI", new Intent());
        AppMethodBeat.o(127103);
      }
      else if (paramf.equals("settings_report"))
      {
        paramf = new Intent();
        paramf.putExtra("showShare", false);
        paramf.putExtra("show_feedback", false);
        paramf.putExtra("rawUrl", "https://support.weixin.qq.com/security/readtemplate?t=complaints/index");
        com.tencent.mm.bp.d.b(this.mController.ylL, "webview", ".ui.tools.WebViewUI", paramf);
        AppMethodBeat.o(127103);
      }
      else if (paramf.equals("settings_quit_wechat"))
      {
        com.tencent.mm.ui.base.h.a(this.mController.ylL, 2131301299, 2131301298, 2131297088, 2131296990, new DialogInterface.OnClickListener()
        {
          private ap fJs = null;
          private com.tencent.mm.ai.f fQS = null;

          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(127091);
            com.tencent.mm.modelstat.c.akc().commitNow();
            ((com.tencent.mm.plugin.expt.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.c.class)).logout();
            com.tencent.mm.kernel.g.RQ();
            if (com.tencent.mm.kernel.a.jP(com.tencent.mm.kernel.g.RN().eIV))
            {
              paramAnonymousDialogInterface = com.tencent.mm.kernel.g.Rg();
              Object localObject = new SettingsAboutMicroMsgUI.2.1(this);
              this.fQS = ((com.tencent.mm.ai.f)localObject);
              paramAnonymousDialogInterface.a(281, (com.tencent.mm.ai.f)localObject);
              localObject = new com.tencent.mm.modelsimple.ab(2);
              com.tencent.mm.kernel.g.Rg().a((m)localObject, 0);
              this.fJs = new ap(new SettingsAboutMicroMsgUI.2.2(this, (com.tencent.mm.modelsimple.ab)localObject), false);
              this.fJs.ae(5000L, 5000L);
              paramAnonymousDialogInterface = SettingsAboutMicroMsgUI.this;
              AppCompatActivity localAppCompatActivity = SettingsAboutMicroMsgUI.this.mController.ylL;
              SettingsAboutMicroMsgUI.this.getString(2131297061);
              SettingsAboutMicroMsgUI.a(paramAnonymousDialogInterface, com.tencent.mm.ui.base.h.b(localAppCompatActivity, SettingsAboutMicroMsgUI.this.getString(2131305615), true, new SettingsAboutMicroMsgUI.2.3(this, (com.tencent.mm.modelsimple.ab)localObject)));
              AppMethodBeat.o(127091);
            }
            while (true)
            {
              return;
              SettingsAboutMicroMsgUI.b(SettingsAboutMicroMsgUI.this);
              AppMethodBeat.o(127091);
            }
          }
        }
        , null);
        AppMethodBeat.o(127103);
      }
      else if (paramf.equals("funtion_crowdtest_update"))
      {
        com.tencent.mm.x.c.PK().bZ(262157, 266263);
        paramf = (String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xRG, null);
        paramPreference = new Intent();
        paramPreference.putExtra("rawUrl", paramf);
        paramPreference.putExtra("showShare", false);
        paramPreference.putExtra("show_bottom", false);
        com.tencent.mm.bp.d.b(this.mController.ylL, "webview", ".ui.tools.WebViewUI", paramPreference);
        AppMethodBeat.o(127103);
      }
      else
      {
        AppMethodBeat.o(127103);
        bool = false;
      }
    }
  }

  public final View ciC()
  {
    AppMethodBeat.i(127097);
    LinearLayout localLinearLayout = (LinearLayout)v.hu(this.mController.ylL).inflate(2130970627, null);
    TextView localTextView1 = (TextView)localLinearLayout.findViewById(2131827373);
    TextView localTextView2 = (TextView)localLinearLayout.findViewById(2131827374);
    Object localObject1 = com.tencent.mm.kernel.g.RP().Ry().get(274436, "").toString();
    Object localObject2 = localObject1;
    if (bo.isNullOrNil((String)localObject1))
      localObject2 = aa.doq();
    localObject1 = localObject2;
    if (!bo.isNullOrNil((String)localObject2))
    {
      localObject1 = localObject2;
      if (!bo.amU((String)localObject2))
        localObject1 = "";
    }
    localObject2 = getString(2131305909, new Object[] { aa.dor(), localObject1, "setting", Integer.valueOf(0), Integer.valueOf(0) });
    localTextView1.setText(String.format("<a href='%s'>%s</a>", new Object[] { getString(2131304189), getString(2131300943) }));
    localTextView2.setText(String.format("<a href='%s'>%s</a>", new Object[] { localObject2, getString(2131302021) }));
    j.h(localTextView1, 1);
    j.h(localTextView2, 1);
    ((TextView)localLinearLayout.findViewById(2131827375)).setText(localLinearLayout.getResources().getString(2131296877, new Object[] { Integer.valueOf(2019) }));
    AppMethodBeat.o(127097);
    return localLinearLayout;
  }

  public final void initView()
  {
    AppMethodBeat.i(127101);
    setMMTitle("");
    xE(getResources().getColor(2131689613));
    setBackGroundColorResource(2131689613);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(127087);
        SettingsAboutMicroMsgUI.this.aqX();
        SettingsAboutMicroMsgUI.this.finish();
        AppMethodBeat.o(127087);
        return true;
      }
    });
    if (this.nDp != null)
    {
      int i = this.mController.ylL.getResources().getDimensionPixelSize(2131427595);
      this.nDp.setPadding(i, 0, i, 0);
      this.nDp.setBackgroundColor(getResources().getColor(2131689613));
    }
    ciD();
    AppMethodBeat.o(127101);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127098);
    super.onCreate(paramBundle);
    dyb();
    initView();
    com.tencent.mm.kernel.g.Rg().a(11, this);
    if (com.tencent.mm.plugin.p.d.bQU() != null)
    {
      paramBundle = com.tencent.mm.plugin.p.d.bQU().bQT();
      com.tencent.mm.kernel.g.Rg().a((m)paramBundle, 0);
      com.tencent.mm.plugin.report.service.h.pYm.a(405L, 15L, 1L, true);
    }
    AppMethodBeat.o(127098);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(127100);
    com.tencent.mm.kernel.g.Rg().b(11, this);
    super.onDestroy();
    AppMethodBeat.o(127100);
  }

  public void onResume()
  {
    AppMethodBeat.i(127099);
    super.onResume();
    ciD();
    AppMethodBeat.o(127099);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(127104);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.SettingsAboutMicroMsgUI", "onSceneEnd " + paramInt2 + " errType " + paramInt1);
    paramString = (b)paramm;
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.SettingsAboutMicroMsgUI", "updateInfo.getDownloadUrls() " + paramString.bQQ());
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.SettingsAboutMicroMsgUI", "updateInfo.getPackVersion() " + paramString.bQP());
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.SettingsAboutMicroMsgUI", "updateInfo.now getPackVersion() " + com.tencent.mm.protocal.d.vxo);
    if ((com.tencent.mm.plugin.p.d.oEm) || ((paramInt1 == 0) && (paramInt2 == 0)))
    {
      this.qlX = paramString.bQP();
      if ((this.qlX <= 0) || (this.qlX <= com.tencent.mm.protocal.d.vxo))
        break label224;
      this.qlV = true;
      if (!com.tencent.mm.kernel.g.RN().QY())
        break label212;
      com.tencent.mm.x.c.PK().x(262145, true);
    }
    while (true)
    {
      this.qlW = paramString.bQR();
      ciD();
      AppMethodBeat.o(127104);
      return;
      label212: com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.SettingsAboutMicroMsgUI", "SubCoreHub.getNewBadge() uin not ready!");
      continue;
      label224: this.qlV = false;
      if (com.tencent.mm.kernel.g.RN().QY())
        com.tencent.mm.x.c.PK().x(262145, false);
      else
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.SettingsAboutMicroMsgUI", "SubCoreHub.getNewBadge() uin not ready!");
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI
 * JD-Core Version:    0.6.2
 */