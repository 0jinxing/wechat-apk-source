package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.widget.a.c.a;

public class SettingsAboutSystemUI extends MMPreference
{
  private f ehK;
  private boolean isDeleteCancel = false;
  private ProgressDialog qlZ = null;
  private boolean qmh = false;
  private int qmi = -1;
  private int qmj = -1;
  private boolean qmk = false;

  private void a(LinearLayout paramLinearLayout, int paramInt1, int paramInt2, boolean paramBoolean, View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(127132);
    TextView localTextView = (TextView)View.inflate(this.mController.ylL, 2130970442, null);
    localTextView.setText(paramInt1);
    localTextView.setTag(Integer.valueOf(paramInt2));
    paramLinearLayout.addView(localTextView);
    localTextView.setOnClickListener(paramOnClickListener);
    if (paramBoolean)
      localTextView.setCompoundDrawablesWithIntrinsicBounds(2131231853, 0, 0, 0);
    AppMethodBeat.o(127132);
  }

  private void ciE()
  {
    int i = 0;
    AppMethodBeat.i(127127);
    IconPreference localIconPreference = (IconPreference)this.ehK.aqO("settings_plugins");
    if (bo.a((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(-2046825377, null), false))
    {
      localIconPreference.NL(0);
      localIconPreference.ey(getString(2131296988), 2130839673);
      if (!com.tencent.mm.x.c.PK().bY(262158, 266266))
        break label132;
      j = 0;
      label76: localIconPreference.NN(j);
      com.tencent.mm.plugin.r.a.bVv();
      if (!com.tencent.mm.ax.c.lQ(com.tencent.mm.ax.b.fKD))
        break label138;
    }
    label132: label138: for (int j = i; ; j = 8)
    {
      localIconPreference.NN(j);
      this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(127127);
      return;
      localIconPreference.NL(8);
      localIconPreference.ey("", -1);
      break;
      j = 8;
      break label76;
    }
  }

  private boolean ciF()
  {
    AppMethodBeat.i(127128);
    startActivity(new Intent(this, SettingsFontUI.class));
    AppMethodBeat.o(127128);
    return true;
  }

  private void ciG()
  {
    int i = 1;
    AppMethodBeat.i(127131);
    if (bo.ank(com.tencent.mm.m.g.Nu().getValue("SilentDownloadApkAtWiFi")) != 0);
    for (int j = 1; ; j = 0)
    {
      if ((com.tencent.mm.sdk.platformtools.g.cdh & 0x1) != 0)
      {
        ab.d("MicroMsg.SettingsAboutSystemUI", "channel pack, not silence download.");
        j = 1;
      }
      if (j == 0)
        break;
      this.ehK.ce("settings_silence_update_mode", true);
      AppMethodBeat.o(127131);
      return;
    }
    this.ehK.ce("settings_silence_update_mode", false);
    label108: Preference localPreference;
    if ((((Integer)com.tencent.mm.kernel.g.RP().Ry().get(7, Integer.valueOf(0))).intValue() & 0x1000000) == 0)
    {
      j = i;
      localPreference = this.ehK.aqO("settings_silence_update_mode");
      if (j == 0)
        break label158;
    }
    label158: for (j = 2131303263; ; j = 2131303262)
    {
      localPreference.setSummary(getString(j));
      this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(127131);
      break;
      j = 0;
      break label108;
    }
  }

  private void ciH()
  {
    AppMethodBeat.i(127133);
    int i = bo.getInt(com.tencent.mm.m.g.Nu().getValue("SIGHTAutoLoadNetwork"), 1);
    int j = bo.a((Integer)com.tencent.mm.kernel.g.RP().Ry().get(327686, null), i);
    ab.i("MicroMsg.SettingsAboutSystemUI", "auto getSightViewSummary %d, %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
    if (this.qmi == -1)
      this.qmi = j;
    this.qmj = j;
    if (3 == j)
      i = 2131303274;
    while (true)
    {
      Preference localPreference = this.ehK.aqO("settings_sns_sight_auto_download");
      if (localPreference != null)
        localPreference.setSummary(getString(i));
      this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(127133);
      return;
      if (2 == j)
        i = 2131303276;
      else
        i = 2131303273;
    }
  }

  private void jC(boolean paramBoolean)
  {
    AppMethodBeat.i(127129);
    if (paramBoolean)
    {
      getPackageManager().setComponentEnabledSetting(new ComponentName(ah.getPackageName(), "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 1, 1);
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xLb, Integer.valueOf(1));
      AppMethodBeat.o(127129);
    }
    while (true)
    {
      return;
      getPackageManager().setComponentEnabledSetting(new ComponentName(ah.getPackageName(), "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 2, 1);
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xLb, Integer.valueOf(2));
      AppMethodBeat.o(127129);
    }
  }

  private void kp(boolean paramBoolean)
  {
    AppMethodBeat.i(127130);
    CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)this.ehK.aqO("settings_nfc_switch");
    ah.getContext().getSharedPreferences(ah.doA(), 0).edit().putBoolean("settings_nfc_switch", paramBoolean).commit();
    localCheckBoxPreference.uOT = paramBoolean;
    this.ehK.notifyDataSetChanged();
    AppMethodBeat.o(127130);
  }

  public final int JC()
  {
    return 2131165292;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    AppMethodBeat.i(127126);
    paramf = paramPreference.mKey;
    boolean bool3;
    if (paramf.equals("settings_landscape_mode"))
      if (this.ehZ.getBoolean("settings_landscape_mode", false))
      {
        setRequestedOrientation(-1);
        AppMethodBeat.o(127126);
        bool3 = bool2;
      }
    while (true)
    {
      return bool3;
      setRequestedOrientation(1);
      break;
      if (paramf.equals("settings_voicerecorder_mode"))
      {
        if (com.tencent.mm.compatible.e.q.etd.epO == 1);
        for (bool3 = false; ; bool3 = true)
        {
          if (!this.ehZ.getBoolean("settings_voicerecorder_mode", bool3))
            com.tencent.mm.ui.base.h.a(this.mController.ylL, 2131303351, 2131297061, new SettingsAboutSystemUI.8(this), new SettingsAboutSystemUI.9(this));
          AppMethodBeat.o(127126);
          bool3 = bool2;
          break;
        }
      }
      int j;
      if (paramf.equals("settings_nfc_switch"))
      {
        paramf = NfcAdapter.getDefaultAdapter(this);
        if (paramf == null)
          ab.i("MicroMsg.SettingsAboutSystemUI", "lo-nfc-goTosetNfcSwitch phone not suppot nfc");
        while (true)
        {
          AppMethodBeat.o(127126);
          bool3 = bool2;
          break;
          int i = ((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xLb, Integer.valueOf(0))).intValue();
          j = ((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xLc, Integer.valueOf(0))).intValue();
          if (((i == 2) || ((i == 0) && (j != 1))) && (!paramf.isEnabled()) && (this.ehZ.getBoolean("settings_nfc_switch", false)))
          {
            kp(false);
            com.tencent.mm.ui.base.h.d(this.mController.ylL, getString(2131301702), "", getString(2131301703), getString(2131296868), new SettingsAboutSystemUI.6(this), new SettingsAboutSystemUI.7(this));
          }
          else
          {
            jC(this.ehZ.getBoolean("settings_nfc_switch", false));
          }
        }
      }
      if (paramf.equals("settings_voice_play_mode"))
      {
        boolean bool4 = ((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(26, Boolean.FALSE)).booleanValue();
        if (!bool4);
        for (bool3 = true; ; bool3 = false)
        {
          ab.d("MicroMsg.SettingsAboutSystemUI", "set voice mode from %B to %B", new Object[] { Boolean.valueOf(bool4), Boolean.valueOf(bool3) });
          paramf = com.tencent.mm.kernel.g.RP().Ry();
          bool3 = bool1;
          if (!bool4)
            bool3 = true;
          paramf.set(26, Boolean.valueOf(bool3));
          AppMethodBeat.o(127126);
          bool3 = bool2;
          break;
        }
      }
      if (paramf.equals("settings_enter_button_send"))
      {
        paramf = (CheckBoxPreference)this.ehK.aqO("settings_enter_button_send");
        if (paramf != null)
        {
          bool3 = paramf.isChecked();
          ab.d("MicroMsg.SettingsAboutSystemUI", "set enter button send : %s", new Object[] { Boolean.valueOf(bool3) });
          com.tencent.mm.kernel.g.RP().Ry().set(66832, Boolean.valueOf(bool3));
        }
        AppMethodBeat.o(127126);
        bool3 = bool2;
      }
      else
      {
        Object localObject1;
        Object localObject2;
        if (paramf.equals("settings_sns_sight_auto_download"))
        {
          localObject1 = new c.a(this.mController.ylL);
          ((c.a)localObject1).Qd(2131296868);
          ((c.a)localObject1).PV(2131303275);
          paramPreference = View.inflate(this.mController.ylL, 2130970095, null);
          paramf = (LinearLayout)paramPreference.findViewById(2131825985);
          j = bo.getInt(com.tencent.mm.m.g.Nu().getValue("SIGHTAutoLoadNetwork"), 1);
          j = bo.a((Integer)com.tencent.mm.kernel.g.RP().Ry().get(327686, null), j);
          localObject2 = new SettingsAboutSystemUI.2(this, paramf, j);
          if (1 == j)
          {
            bool3 = true;
            label698: a(paramf, 2131303273, 1, bool3, (View.OnClickListener)localObject2);
            if (2 != j)
              break label806;
            bool3 = true;
            label720: a(paramf, 2131303276, 2, bool3, (View.OnClickListener)localObject2);
            if (3 != j)
              break label812;
          }
          label806: label812: for (bool3 = true; ; bool3 = false)
          {
            a(paramf, 2131303274, 3, bool3, (View.OnClickListener)localObject2);
            ((c.a)localObject1).fn(paramPreference);
            paramPreference = ((c.a)localObject1).aMb();
            paramf.setTag(paramPreference);
            paramPreference.show();
            addDialog(paramPreference);
            this.qmk = true;
            AppMethodBeat.o(127126);
            bool3 = bool2;
            break;
            bool3 = false;
            break label698;
            bool3 = false;
            break label720;
          }
        }
        if (paramf.equals("settings_silence_update_mode"))
        {
          localObject2 = new c.a(this.mController.ylL);
          ((c.a)localObject2).Qd(2131296868);
          ((c.a)localObject2).PV(2131303261);
          localObject1 = View.inflate(this.mController.ylL, 2130970095, null);
          paramf = (LinearLayout)((View)localObject1).findViewById(2131825985);
          paramPreference = new SettingsAboutSystemUI.10(this, paramf);
          if ((((Integer)com.tencent.mm.kernel.g.RP().Ry().get(7, Integer.valueOf(0))).intValue() & 0x1000000) == 0)
          {
            bool3 = true;
            label929: a(paramf, 2131303263, 0, bool3, paramPreference);
            if (bool3)
              break label1007;
          }
          label1007: for (bool3 = true; ; bool3 = false)
          {
            a(paramf, 2131303262, 1, bool3, paramPreference);
            ((c.a)localObject2).fn((View)localObject1);
            paramPreference = ((c.a)localObject2).aMb();
            paramf.setTag(paramPreference);
            paramPreference.show();
            addDialog(paramPreference);
            AppMethodBeat.o(127126);
            bool3 = bool2;
            break;
            bool3 = false;
            break label929;
          }
        }
        if (paramf.equals("settings_language"))
        {
          startActivity(new Intent(this.mController.ylL, SettingsLanguageUI.class));
          AppMethodBeat.o(127126);
          bool3 = bool2;
        }
        else if (paramf.equals("settings_text_size"))
        {
          bool3 = ciF();
          AppMethodBeat.o(127126);
        }
        else if (paramf.equals("settings_chatting_bg"))
        {
          paramf = new Intent();
          paramf.setClass(this, SettingsChattingBackgroundUI.class);
          this.mController.ylL.startActivity(paramf);
          AppMethodBeat.o(127126);
          bool3 = bool2;
        }
        else if (paramf.equals("settings_manage_findmoreui"))
        {
          paramf = new Intent();
          paramf.setClass(this, SettingsManageFindMoreUI.class);
          startActivity(paramf);
          AppMethodBeat.o(127126);
          bool3 = bool2;
        }
        else if (paramf.equals("settings_plugins"))
        {
          com.tencent.mm.kernel.g.RP().Ry().set(-2046825377, Boolean.FALSE);
          paramf = new Intent();
          paramf.setClass(this, SettingsPluginsUI.class);
          startActivity(paramf);
          com.tencent.mm.x.c.PK().bZ(262158, 266266);
          AppMethodBeat.o(127126);
          bool3 = bool2;
        }
        else if (paramf.equals("settings_reset"))
        {
          com.tencent.mm.ui.base.h.d(this.mController.ylL, getResources().getString(2131303235), "", getString(2131296871), getString(2131296868), new SettingsAboutSystemUI.5(this), null);
          AppMethodBeat.o(127126);
          bool3 = bool2;
        }
        else if (paramf.equals("settings_emoji_manager"))
        {
          paramf = new Intent();
          paramf.putExtra("10931", 2);
          com.tencent.mm.bp.d.b(this.mController.ylL, "emoji", ".ui.EmojiMineUI", paramf);
          AppMethodBeat.o(127126);
          bool3 = bool2;
        }
        else if (paramf.equals("settngs_clean"))
        {
          if (!com.tencent.mm.kernel.g.RP().isSDCardAvailable())
          {
            t.hO(this.mController.ylL);
            AppMethodBeat.o(127126);
            bool3 = bool2;
          }
          else
          {
            com.tencent.mm.bp.d.b(this.mController.ylL, "clean", ".ui.CleanUI", new Intent());
            AppMethodBeat.o(127126);
            bool3 = bool2;
          }
        }
        else if (paramf.equals("settings_traffic_statistic"))
        {
          startActivity(new Intent(this, SettingsNetStatUI.class));
          AppMethodBeat.o(127126);
          bool3 = bool2;
        }
        else if (paramf.equals("settings_text_size"))
        {
          bool3 = ciF();
          AppMethodBeat.o(127126);
        }
        else
        {
          if (paramf.equals("settings_swipeback_mode"))
          {
            paramf = (CheckBoxPreference)paramPreference;
            bool3 = com.tencent.mm.compatible.i.b.Ml();
            if (!bool3);
            for (j = 2131303285; ; j = 2131303284)
            {
              com.tencent.mm.ui.base.h.a(this.mController.ylL, getString(j), null, new SettingsAboutSystemUI.3(this), new SettingsAboutSystemUI.4(this, paramf, bool3));
              AppMethodBeat.o(127126);
              bool3 = bool2;
              break;
            }
          }
          if (paramf.equals("settings_take_photo"))
            startActivity(new Intent(this, SettingsAboutCamera.class));
          AppMethodBeat.o(127126);
          bool3 = false;
        }
      }
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(127123);
    setMMTitle(2131303026);
    this.ehK = this.yCw;
    setBackBtn(new SettingsAboutSystemUI.1(this));
    f localf = this.ehK;
    if (!com.tencent.mm.compatible.util.d.iW(19));
    for (boolean bool = true; ; bool = false)
    {
      localf.ce("settings_swipeback_mode", bool);
      if (!com.tencent.mm.bp.d.afj("backup"))
        this.ehK.ce("settings_bak_chat", true);
      ciE();
      this.ehK.ce("settings_traffic_statistic", com.tencent.mm.bp.d.dlL());
      if (ae.gjt)
        this.ehK.ce("settings_take_photo", true);
      AppMethodBeat.o(127123);
      return;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127122);
    super.onCreate(paramBundle);
    this.qmh = false;
    initView();
    AppMethodBeat.o(127122);
  }

  public void onDestroy()
  {
    boolean bool1 = true;
    AppMethodBeat.i(127125);
    super.onDestroy();
    int i;
    com.tencent.mm.plugin.report.service.h localh;
    if (this.qmk)
    {
      i = this.qmj;
      if (this.qmi != this.qmj)
        break label126;
      bool2 = true;
      ab.i("MicroMsg.SettingsAboutSystemUI", "kvstat, autodownload sight change: %d, %b", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool2) });
      localh = com.tencent.mm.plugin.report.service.h.pYm;
      i = this.qmj;
      if (this.qmi != this.qmj)
        break label131;
    }
    label131: for (boolean bool2 = bool1; ; bool2 = false)
    {
      localh.e(11437, new Object[] { Integer.valueOf(1), Integer.valueOf(i), Boolean.valueOf(bool2) });
      AppMethodBeat.o(127125);
      return;
      label126: bool2 = false;
      break;
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(127124);
    super.onResume();
    Object localObject = (CheckBoxPreference)this.ehK.aqO("settings_voice_play_mode");
    if (localObject != null)
    {
      ((CheckBoxPreference)localObject).uOT = ((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(26, Boolean.FALSE)).booleanValue();
      ((Preference)localObject).yDf = false;
    }
    localObject = (CheckBoxPreference)this.ehK.aqO("settings_enter_button_send");
    if (localObject != null)
    {
      ((CheckBoxPreference)localObject).uOT = ((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(66832, Boolean.FALSE)).booleanValue();
      ((Preference)localObject).yDf = false;
    }
    localObject = (CheckBoxPreference)this.ehK.aqO("settings_swipeback_mode");
    if (localObject != null)
    {
      ((CheckBoxPreference)localObject).uOT = com.tencent.mm.compatible.i.b.Ml();
      ((Preference)localObject).yDf = false;
    }
    localObject = this.ehK.aqO("settings_language");
    if (localObject != null)
      ((Preference)localObject).setSummary(aa.gx(this.mController.ylL));
    ciE();
    ciH();
    ciH();
    ciG();
    localObject = NfcAdapter.getDefaultAdapter(this);
    CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)this.ehK.aqO("settings_nfc_switch");
    if (localObject == null)
    {
      this.ehK.ce("settings_nfc_switch", true);
      AppMethodBeat.o(127124);
    }
    while (true)
    {
      return;
      this.ehK.ce("settings_nfc_switch", false);
      localCheckBoxPreference.setSummary(bo.nullAsNil((String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xLf, null)));
      if (!this.qmh)
        break;
      ab.i("MicroMsg.SettingsAboutSystemUI", "lo-nfc-updateNfcOpenSwitch go setSystemNfc and back");
      if (!((NfcAdapter)localObject).isEnabled())
        break;
      jC(true);
      kp(true);
      AppMethodBeat.o(127124);
    }
    int i = ((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xLb, Integer.valueOf(0))).intValue();
    if (i == 0)
      if (((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xLc, Integer.valueOf(0))).intValue() == 1)
        kp(true);
    while (true)
    {
      this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(127124);
      break;
      kp(false);
      continue;
      if (i == 1)
        kp(true);
      else
        kp(false);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI
 * JD-Core Version:    0.6.2
 */