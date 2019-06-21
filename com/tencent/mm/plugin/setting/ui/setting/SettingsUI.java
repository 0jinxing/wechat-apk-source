package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.o;
import com.tencent.mm.g.a.em;
import com.tencent.mm.g.a.em.a;
import com.tencent.mm.g.a.jl;
import com.tencent.mm.kernel.i;
import com.tencent.mm.model.an;
import com.tencent.mm.model.bx;
import com.tencent.mm.platformtools.w;
import com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI;
import com.tencent.mm.plugin.account.friend.a.l.a;
import com.tencent.mm.pluginsdk.f.e.a;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.SwitchKeyValuePreference;
import com.tencent.mm.ui.q;
import com.tencent.mm.x.a.a;
import java.util.ArrayList;
import java.util.Set;

@i
public class SettingsUI extends MMPreference
  implements n.b
{
  private com.tencent.mm.ui.base.preference.f ehK;
  private ap fJs;
  private com.tencent.mm.ai.f fQS;
  private ap gyS;
  private com.tencent.mm.ui.widget.a.d iHZ;
  private View nVX;
  private ProgressDialog qlZ;
  private ap qma;
  private com.tencent.mm.ai.f qmb;
  private PersonalPreference qpt;
  private com.tencent.mm.ai.f qpu;
  private a.a qpv;
  private Dialog qpw;
  private com.tencent.mm.ui.widget.a.c qpx;
  private CheckBox qpy;
  private com.tencent.mm.ai.f qpz;

  public SettingsUI()
  {
    AppMethodBeat.i(127592);
    this.qpt = null;
    this.qlZ = null;
    this.fQS = null;
    this.qpu = null;
    this.qmb = null;
    this.qpv = new SettingsUI.1(this);
    this.qpw = null;
    this.fJs = null;
    this.qpz = null;
    AppMethodBeat.o(127592);
  }

  private void ciE()
  {
    int i = 0;
    AppMethodBeat.i(127601);
    IconPreference localIconPreference = (IconPreference)this.ehK.aqO("settings_about_micromsg");
    boolean bool1 = bo.a(Boolean.valueOf(com.tencent.mm.x.c.PK().bX(262145, 266243)), false);
    boolean bool2 = com.tencent.mm.x.c.PK().bY(262157, 266262);
    if (com.tencent.mm.sdk.platformtools.g.xyg)
    {
      localIconPreference.ey("", -1);
      localIconPreference.NL(8);
      bool2 = com.tencent.mm.x.c.PK().bY(262158, 266265);
      localIconPreference = (IconPreference)this.ehK.aqO("settings_about_system");
      if (!bool2)
        break label199;
      j = 0;
      label106: localIconPreference.NN(j);
      com.tencent.mm.plugin.r.a.bVv();
      if (!com.tencent.mm.ax.c.lQ(com.tencent.mm.ax.b.fKD))
        break label206;
    }
    label199: label206: for (int j = i; ; j = 8)
    {
      localIconPreference.NN(j);
      AppMethodBeat.o(127601);
      return;
      if (bool1)
      {
        localIconPreference.NL(0);
        localIconPreference.ey(getString(2131296988), 2130839673);
        break;
      }
      if (bool2)
      {
        localIconPreference.NN(0);
        break;
      }
      localIconPreference.NN(8);
      localIconPreference.ey("", -1);
      localIconPreference.NL(8);
      break;
      j = 8;
      break label106;
    }
  }

  private void cje()
  {
    AppMethodBeat.i(127606);
    ab.i("MicroMsg.SettingsUI", "oneliang logout mm");
    com.tencent.mm.plugin.setting.b.gkF.BY();
    com.tencent.mm.kernel.g.RP().Ry().b(this);
    Object localObject = new jl();
    ((jl)localObject).cEK.status = 0;
    ((jl)localObject).cEK.boZ = 0;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    localObject = new com.tencent.mm.g.a.z();
    ((com.tencent.mm.g.a.z)localObject).csU.csV = true;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    aj.amB("show_whatsnew");
    com.tencent.mm.kernel.l.m(this, true);
    ah.getContext().getSharedPreferences("switch_account_preferences", 0).edit().putBoolean("last_logout_switch_account", false).commit();
    localObject = new Intent();
    ((Intent)localObject).addFlags(67108864);
    ((Intent)localObject).putExtra("Intro_Switch", true);
    com.tencent.mm.plugin.setting.b.gkE.p((Intent)localObject, this.mController.ylL);
    w.I(this, null);
    finish();
    AppMethodBeat.o(127606);
  }

  private void cji()
  {
    AppMethodBeat.i(127598);
    IconPreference localIconPreference = (IconPreference)this.ehK.aqO("settings_account_info");
    if (localIconPreference == null)
    {
      ab.e("MicroMsg.SettingsUI", "safedevicesate preference is null");
      AppMethodBeat.o(127598);
      return;
    }
    localIconPreference.NQ(8);
    if (com.tencent.mm.x.c.PK().a(ac.a.xUP, 266257))
    {
      localIconPreference.NN(0);
      label67: if (bo.getInt(com.tencent.mm.m.g.Nu().getValue("VoiceprintEntry"), 0) == 1)
      {
        if (!((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xJI, Boolean.TRUE)).booleanValue())
          break label179;
        if ((com.tencent.mm.kernel.g.RP().Ry().getInt(40, 0) & 0x20000) == 0)
        {
          localIconPreference.ey(getString(2131296988), 2130839673);
          localIconPreference.NL(0);
          ab.i("MicroMsg.SettingsUI", "show voiceprint dot");
        }
      }
    }
    while (true)
    {
      this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(127598);
      break;
      localIconPreference.NN(8);
      break label67;
      label179: localIconPreference.NL(8);
      localIconPreference.ey("", -1);
    }
  }

  private void cjj()
  {
    AppMethodBeat.i(127602);
    IconPreference localIconPreference = (IconPreference)this.ehK.aqO("settings_about_privacy");
    if (localIconPreference != null)
      if (((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xQK, Integer.valueOf(0))).intValue() > ((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xQL, Integer.valueOf(0))).intValue())
      {
        localIconPreference.NN(0);
        AppMethodBeat.o(127602);
      }
    while (true)
    {
      return;
      localIconPreference.NN(8);
      AppMethodBeat.o(127602);
    }
  }

  private void cjk()
  {
    AppMethodBeat.i(127603);
    l.a locala = com.tencent.mm.plugin.account.friend.a.l.apS();
    SwitchKeyValuePreference localSwitchKeyValuePreference = (SwitchKeyValuePreference)this.ehK.aqO("settings_bind_mobile");
    boolean bool;
    if (localSwitchKeyValuePreference != null)
    {
      if ((locala != l.a.gvz) && (locala != l.a.gvA))
        break label83;
      bool = true;
      localSwitchKeyValuePreference.qk(bool);
      if ((locala != l.a.gvz) && (locala != l.a.gvA))
        break label88;
    }
    label83: label88: for (int i = 2131303208; ; i = 2131303207)
    {
      localSwitchKeyValuePreference.setSummary(i);
      AppMethodBeat.o(127603);
      return;
      bool = false;
      break;
    }
  }

  private void cjl()
  {
    AppMethodBeat.i(127605);
    Intent localIntent = new Intent(this, SettingsSwitchAccountUI.class);
    localIntent.putExtra("key_scene", 0);
    startActivity(localIntent);
    AppMethodBeat.o(127605);
  }

  private boolean cjm()
  {
    AppMethodBeat.i(127607);
    com.tencent.mm.plugin.report.service.h.pYm.e(11545, new Object[] { Integer.valueOf(1) });
    ab.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_LogoutOutside");
    if (this.qpw != null)
    {
      this.qpw.show();
      AppMethodBeat.o(127607);
    }
    while (true)
    {
      return true;
      ab.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_LogoutOutside");
      this.qpw = com.tencent.mm.ui.base.h.d(this, getString(2131303130), "", getString(2131303126), getString(2131303129), new SettingsUI.2(this), new SettingsUI.3(this));
      AppMethodBeat.o(127607);
    }
  }

  private boolean cjn()
  {
    AppMethodBeat.i(127608);
    com.tencent.mm.plugin.report.service.h.pYm.e(11545, new Object[] { Integer.valueOf(4) });
    ab.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_CloseWeChat");
    if (this.nVX == null)
    {
      this.nVX = View.inflate(this.mController.ylL, 2130970633, null);
      this.qpy = ((CheckBox)this.nVX.findViewById(2131827388));
      this.qpy.setChecked(true);
    }
    if (this.qpx == null)
      this.qpx = com.tencent.mm.ui.base.h.a(this.mController.ylL, null, this.nVX, getString(2131301051), getString(2131296868), new SettingsUI.4(this), new SettingsUI.5(this));
    while (true)
    {
      AppMethodBeat.o(127608);
      return true;
      this.qpx.show();
    }
  }

  private void cjo()
  {
    AppMethodBeat.i(127609);
    com.tencent.mm.ai.p localp = com.tencent.mm.kernel.g.Rg();
    Object localObject = new SettingsUI.19(this);
    this.qpu = ((com.tencent.mm.ai.f)localObject);
    localp.a(282, (com.tencent.mm.ai.f)localObject);
    localObject = new com.tencent.mm.modelsimple.p();
    com.tencent.mm.kernel.g.Rg().a((com.tencent.mm.ai.m)localObject, 0);
    AppMethodBeat.o(127609);
  }

  private void cjp()
  {
    AppMethodBeat.i(127611);
    Object localObject1 = com.tencent.mm.kernel.g.Rg();
    Object localObject2 = new SettingsUI.20(this);
    this.qmb = ((com.tencent.mm.ai.f)localObject2);
    ((com.tencent.mm.ai.p)localObject1).a(255, (com.tencent.mm.ai.f)localObject2);
    localObject2 = new com.tencent.mm.modelsimple.r(2);
    ((com.tencent.mm.modelsimple.r)localObject2).fPr = 1;
    com.tencent.mm.kernel.g.Rg().a((com.tencent.mm.ai.m)localObject2, 0);
    this.qma = new ap(Looper.getMainLooper(), new SettingsUI.21(this, (com.tencent.mm.modelsimple.r)localObject2), false);
    this.qma.ae(3000L, 3000L);
    localObject1 = this.mController.ylL;
    getString(2131297061);
    this.qlZ = com.tencent.mm.ui.base.h.b((Context)localObject1, getString(2131305733), false, new SettingsUI.22(this, (com.tencent.mm.modelsimple.r)localObject2));
    AppMethodBeat.o(127611);
  }

  private void kr(boolean paramBoolean)
  {
    AppMethodBeat.i(127610);
    aj.amB("welcome_page_show");
    if (paramBoolean)
      ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().II();
    while (true)
    {
      com.tencent.mm.g.a.z localz = new com.tencent.mm.g.a.z();
      localz.csU.csV = false;
      com.tencent.mm.sdk.b.a.xxA.m(localz);
      com.tencent.mm.plugin.setting.b.gkF.BV();
      ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().IH();
      finish();
      if (com.tencent.mm.pluginsdk.f.e.vdx != null)
        com.tencent.mm.pluginsdk.f.e.vdx.k(this.mController.ylL, paramBoolean);
      AppMethodBeat.o(127610);
      return;
      ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().k(-1, null);
    }
  }

  public final int JC()
  {
    return 2131165276;
  }

  public final void a(int paramInt, com.tencent.mm.sdk.e.n paramn, Object paramObject)
  {
    AppMethodBeat.i(127600);
    int i = bo.g(paramObject, 0);
    ab.d("MicroMsg.SettingsUI", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramn });
    if ((paramn != com.tencent.mm.kernel.g.RP().Ry()) || (i <= 0))
    {
      ab.e("MicroMsg.SettingsUI", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramn });
      AppMethodBeat.o(127600);
    }
    while (true)
    {
      return;
      if (4 == i)
      {
        com.tencent.mm.kernel.g.RP().Ry().get(2, null);
        com.tencent.mm.kernel.g.RP().Ry().get(4, null);
      }
      if (6 == i)
      {
        cjk();
        AppMethodBeat.o(127600);
      }
      else
      {
        if (64 == i)
          cji();
        AppMethodBeat.o(127600);
      }
    }
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    boolean bool = true;
    AppMethodBeat.i(127604);
    paramf = paramPreference.mKey;
    ab.i("MicroMsg.SettingsUI", paramf + " item has been clicked!");
    if ("settings_welab".equals(paramf))
    {
      paramPreference = new Intent();
      paramf = new ArrayList();
      paramf.add("labs_browse");
      paramPreference.putStringArrayListExtra("key_exclude_apps", paramf);
      ((com.tencent.mm.plugin.welab.a.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.welab.a.a.c.class)).D(this, paramPreference);
      AppMethodBeat.o(127604);
    }
    while (true)
    {
      return bool;
      if ("settings_account_info".equals(paramf))
      {
        if ((bo.getInt(com.tencent.mm.m.g.Nu().getValue("VoiceprintEntry"), 0) == 1) && ((com.tencent.mm.kernel.g.RP().Ry().getInt(40, 0) & 0x20000) == 0))
        {
          com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xJI, Boolean.FALSE);
          ab.i("MicroMsg.SettingsUI", "unset setting account info dot show");
        }
        com.tencent.mm.x.c.PK().b(ac.a.xUP, 266257);
        aA(SettingsAccountInfoUI.class);
        AppMethodBeat.o(127604);
      }
      else if ("settings_account".equals(paramf))
      {
        this.mController.ylL.startActivity(new Intent(this, SettingsPersonalInfoUI.class));
        AppMethodBeat.o(127604);
      }
      else if (paramf.equals("settings_bind_mobile"))
      {
        paramf = new Intent(this, BindMContactIntroUI.class);
        paramf.putExtra("key_upload_scene", 4);
        MMWizardActivity.J(this, paramf);
        AppMethodBeat.o(127604);
      }
      else if (paramf.equals("settings_about_privacy"))
      {
        int i = ((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xQK, Integer.valueOf(0))).intValue();
        if (i > ((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xQL, Integer.valueOf(0))).intValue())
          com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xQL, Integer.valueOf(i));
        startActivity(new Intent(this, SettingsPrivacyUI.class));
        AppMethodBeat.o(127604);
      }
      else if (paramf.equals("settings_about_system"))
      {
        com.tencent.mm.x.c.PK().bZ(262158, 266265);
        startActivity(new Intent(this, SettingsAboutSystemUI.class));
        AppMethodBeat.o(127604);
      }
      else if (paramf.equals("settings_about_micromsg"))
      {
        com.tencent.mm.x.c.PK().bZ(262145, 266243);
        com.tencent.mm.x.c.PK().bZ(262157, 266262);
        this.mController.ylL.startActivity(new Intent(this, SettingsAboutMicroMsgUI.class));
        new ak().postDelayed(new SettingsUI.29(this), 100L);
        AppMethodBeat.o(127604);
      }
      else if (paramf.equals("settings_about_device"))
      {
        paramf = new Intent();
        com.tencent.mm.bp.d.b(this.mController.ylL, "exdevice", ".ui.ExdeviceManageDeviceUI", paramf);
        AppMethodBeat.o(127604);
      }
      else if (paramf.equals("settings_logout"))
      {
        if (com.tencent.mm.au.b.ahP())
        {
          ab.i("MicroMsg.SettingsUI", "oversea user logout");
          com.tencent.mm.ui.base.h.a(this.mController.ylL, true, getResources().getString(2131303130), "", getResources().getString(2131303126), getString(2131296868), new SettingsUI.13(this), null);
          AppMethodBeat.o(127604);
        }
        else
        {
          com.tencent.mm.plugin.report.service.h.pYm.e(11545, new Object[] { Integer.valueOf(8) });
          ab.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_LogoutCloseEntrance");
          if (bx.fnB.aat().size() > 1)
            com.tencent.mm.plugin.report.service.h.pYm.e(14978, new Object[] { Integer.valueOf(1), Integer.valueOf(10), bx.fnB.aau() });
          while (true)
          {
            this.iHZ.cpD();
            AppMethodBeat.o(127604);
            break;
            com.tencent.mm.plugin.report.service.h.pYm.e(14978, new Object[] { Integer.valueOf(0), Integer.valueOf(10), bx.fnB.aau() });
          }
        }
      }
      else if (paramf.equals("settings_exit"))
      {
        bool = cjn();
        AppMethodBeat.o(127604);
      }
      else if (paramf.equals("settings_logout_option"))
      {
        bool = cjm();
        AppMethodBeat.o(127604);
      }
      else if (paramf.equals("settings_notification_preference"))
      {
        startActivity(new Intent(this, SettingsNotificationUI.class));
        AppMethodBeat.o(127604);
      }
      else if (paramf.equals("settings_chatting"))
      {
        aA(SettingsChattingUI.class);
        AppMethodBeat.o(127604);
      }
      else if (paramf.equals("settings_active_time"))
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(11351, new Object[] { Integer.valueOf(1), Integer.valueOf(0) });
        aA(SettingsActiveTimeUI.class);
        AppMethodBeat.o(127604);
      }
      else
      {
        if (paramf.equals("settings_feedback"))
          if ((!com.tencent.mm.sdk.platformtools.g.xyg) && (aa.dor().equals("zh_CN")))
          {
            paramf = getString(2131305626);
            label974: ab.d("MicroMsg.SettingsUI", "using faq webpage");
            paramPreference = new Intent();
            paramPreference.putExtra("showShare", false);
            paramPreference.putExtra("rawUrl", paramf);
            paramPreference.putExtra("show_feedback", false);
            paramPreference.putExtra("KShowFixToolsBtn", true);
            com.tencent.mm.bp.d.b(this.mController.ylL, "webview", ".ui.tools.WebViewUI", paramPreference);
          }
        label1282: label1289: 
        do
          while (true)
          {
            AppMethodBeat.o(127604);
            bool = false;
            break;
            if (aa.dor().equals("zh_HK"))
            {
              paramf = getString(2131305627);
              break label974;
            }
            if (aa.dor().equals("zh_TW"))
            {
              paramf = getString(2131305628);
              break label974;
            }
            paramf = getString(2131305629);
            break label974;
            if (!paramf.equals("settings_switch_account"))
              break label1289;
            if (bx.fnB.aat().size() > 1)
              com.tencent.mm.plugin.report.service.h.pYm.e(14978, new Object[] { Integer.valueOf(1), Integer.valueOf(6), bx.fnB.aau() });
            while (true)
            {
              if (!com.tencent.mm.kernel.g.RP().Ry().getBoolean(ac.a.xTI, true))
                break label1282;
              com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xTI, Boolean.FALSE);
              com.tencent.mm.ui.base.h.a(this, getString(2131303287), getString(2131303288), getString(2131296955), false, new SettingsUI.28(this));
              break;
              com.tencent.mm.plugin.report.service.h.pYm.e(14978, new Object[] { Integer.valueOf(0), Integer.valueOf(6), bx.fnB.aau() });
            }
            cjl();
          }
        while (!paramf.equals("settings_redesign"));
        startActivity(new Intent(this, SettingRedesign.class));
        AppMethodBeat.o(127604);
      }
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(127599);
    setMMTitle(2131303304);
    this.ehK = this.yCw;
    setBackBtn(new SettingsUI.23(this));
    this.iHZ = new com.tencent.mm.ui.widget.a.d(this, 1, false);
    this.iHZ.rBl = new SettingsUI.24(this);
    this.iHZ.zQf = new SettingsUI.25(this);
    this.iHZ.rBm = new SettingsUI.26(this);
    new SettingsUI.27(this);
    cjk();
    ciE();
    cjj();
    this.ehK.ce("settings_redesign", true);
    AppMethodBeat.o(127599);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(127595);
    ab.v("MicroMsg.SettingsUI", "settings handle");
    switch (paramInt1)
    {
    default:
      AppMethodBeat.o(127595);
    case 5:
    case 3:
    case 2:
    case 4:
    }
    while (true)
    {
      return;
      if (paramInt2 == -1)
        cje();
      AppMethodBeat.o(127595);
      continue;
      paramIntent = com.tencent.mm.pluginsdk.ui.tools.n.h(getApplicationContext(), paramIntent, com.tencent.mm.plugin.i.c.XW());
      if (paramIntent == null)
      {
        AppMethodBeat.o(127595);
      }
      else
      {
        localObject = new Intent();
        ((Intent)localObject).putExtra("CropImageMode", 1);
        ((Intent)localObject).putExtra("CropImage_OutputPath", paramIntent);
        ((Intent)localObject).putExtra("CropImage_ImgPath", paramIntent);
        com.tencent.mm.plugin.setting.b.gkE.a(this.mController.ylL, (Intent)localObject, 4);
        AppMethodBeat.o(127595);
        continue;
        if (paramIntent == null)
        {
          AppMethodBeat.o(127595);
        }
        else
        {
          localObject = com.tencent.mm.pluginsdk.ui.tools.n.h(getApplicationContext(), paramIntent, com.tencent.mm.plugin.i.c.XW());
          if (localObject == null)
          {
            AppMethodBeat.o(127595);
          }
          else
          {
            Intent localIntent = new Intent();
            localIntent.putExtra("CropImageMode", 1);
            o.acd();
            localIntent.putExtra("CropImage_OutputPath", com.tencent.mm.ah.d.D(com.tencent.mm.model.r.Yz(), true));
            localIntent.putExtra("CropImage_ImgPath", (String)localObject);
            com.tencent.mm.plugin.setting.b.gkE.a(this, paramIntent, localIntent, com.tencent.mm.plugin.i.c.XW(), 4, null);
            AppMethodBeat.o(127595);
            continue;
            if (paramIntent != null)
              break;
            AppMethodBeat.o(127595);
          }
        }
      }
    }
    Object localObject = paramIntent.getStringExtra("CropImage_OutputPath");
    if (localObject == null)
      ab.e("MicroMsg.SettingsUI", "crop picture failed");
    while (true)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(127595);
      break;
      new com.tencent.mm.ah.m(this.mController.ylL, (String)localObject).w(null);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127593);
    super.onCreate(paramBundle);
    initView();
    com.tencent.mm.kernel.g.RP().Ry().a(this);
    com.tencent.mm.x.c.PK().a(this.qpv);
    if ((bo.getInt(com.tencent.mm.m.g.Nu().getValue("VoiceprintEntry"), 0) == 1) && ((com.tencent.mm.kernel.g.RP().Ry().getInt(40, 0) & 0x20000) == 0))
    {
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xJG, Boolean.FALSE);
      ab.i("MicroMsg.SettingsUI", "unset more tab dot");
    }
    AppMethodBeat.o(127593);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(127594);
    if (com.tencent.mm.kernel.g.RK())
    {
      com.tencent.mm.kernel.g.RP().Ry().b(this);
      com.tencent.mm.x.c.PK().b(this.qpv);
    }
    if (this.fQS != null)
      com.tencent.mm.kernel.g.Rg().b(281, this.fQS);
    if (this.qmb != null)
      com.tencent.mm.kernel.g.Rg().b(255, this.qmb);
    if (this.qpz != null)
      com.tencent.mm.kernel.g.Rg().b(281, this.qpz);
    super.onDestroy();
    AppMethodBeat.o(127594);
  }

  public void onPause()
  {
    AppMethodBeat.i(127596);
    super.onPause();
    com.tencent.mm.kernel.g.RS().ae(new SettingsUI.12(this));
    AppMethodBeat.o(127596);
  }

  public void onResume()
  {
    AppMethodBeat.i(127597);
    Object localObject1 = (PersonalPreference)this.ehK.aqO("settings_account");
    if (localObject1 != null)
    {
      localObject2 = com.tencent.mm.model.r.Yz();
      ((PersonalPreference)localObject1).fru = null;
      ((PersonalPreference)localObject1).qkZ = -1;
      ((PersonalPreference)localObject1).qla = ((String)localObject2);
      if (((PersonalPreference)localObject1).moN != null)
        a.b.b(((PersonalPreference)localObject1).moN, ((PersonalPreference)localObject1).qla);
    }
    Object localObject2 = new em();
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
    if (!((em)localObject2).cxZ.cwB)
    {
      localObject2 = this.ehK.aqO("settings_about_device");
      this.ehK.d((Preference)localObject2);
    }
    cji();
    cjk();
    ciE();
    cjj();
    localObject2 = (IconPreference)this.ehK.aqO("settings_welab");
    localObject1 = (com.tencent.mm.plugin.welab.a.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.welab.a.a.c.class);
    if (((com.tencent.mm.plugin.welab.a.a.c)localObject1).ddo())
    {
      ((IconPreference)localObject2).NL(0);
      ((IconPreference)localObject2).ey(getString(2131296988), 2130839673);
      if (!((com.tencent.mm.plugin.welab.a.a.c)localObject1).ddp())
        break label246;
      if (!((com.tencent.mm.plugin.welab.a.a.c)localObject1).ddn())
        break label235;
      ((IconPreference)localObject2).hm(0, 2130840510);
    }
    while (true)
    {
      ab.v("MicroMsg.SettingsUI", "on resume");
      super.onResume();
      AppMethodBeat.o(127597);
      return;
      ((IconPreference)localObject2).NL(8);
      break;
      label235: ((IconPreference)localObject2).hm(0, 2131232179);
      continue;
      label246: ((IconPreference)localObject2).hm(8, -1);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsUI
 * JD-Core Version:    0.6.2
 */