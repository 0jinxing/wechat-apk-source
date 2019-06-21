package com.tencent.mm.plugin.voiceprint.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.av;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.voiceprint.model.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.q;

public class SettingsVoicePrintUI extends MMPreference
  implements com.tencent.mm.ai.f
{
  private ProgressDialog ehJ = null;
  private com.tencent.mm.ui.base.preference.f ehK;
  private View iym;
  private boolean lYR = false;
  private VoiceHeaderPreference sMc;

  private void cHZ()
  {
    AppMethodBeat.i(26155);
    com.tencent.mm.plugin.report.service.h.pYm.e(11390, new Object[] { Integer.valueOf(3) });
    Intent localIntent = new Intent();
    localIntent.setClass(this, VoiceCreateUI.class);
    localIntent.putExtra("kscene_type", 71);
    localIntent.putExtra("createVoicePrint", true);
    startActivityForResult(localIntent, 1);
    this.lYR = false;
    AppMethodBeat.o(26155);
  }

  public final int JC()
  {
    return 2131165295;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(26153);
    String str = paramPreference.mKey;
    paramPreference = new Intent();
    boolean bool;
    if (str.equals("settings_voiceprint_title"))
    {
      paramf = (CheckBoxPreference)paramf.aqO("settings_voiceprint_title");
      ab.d("MicroMsg.VoiceSettingsUI", "checkPref.isChecked() " + paramf.isChecked());
      if ((this.ehJ != null) && (this.ehJ.isShowing()))
        this.ehJ.dismiss();
      paramPreference = this.mController.ylL;
      getString(2131297061);
      this.ehJ = com.tencent.mm.ui.base.h.b(paramPreference, getString(2131297086), true, new SettingsVoicePrintUI.4(this));
      if (paramf.isChecked())
      {
        aw.Rg().a(new i(1), 0);
        AppMethodBeat.o(26153);
        bool = true;
      }
    }
    while (true)
    {
      return bool;
      aw.Rg().a(new i(2), 0);
      break;
      if (str.equals("settings_voiceprint_unlock"))
      {
        paramPreference.setClass(this, VoiceUnLockUI.class);
        paramPreference.putExtra("kscene_type", 73);
        startActivity(paramPreference);
        AppMethodBeat.o(26153);
        bool = true;
      }
      else if (str.equals("settings_voiceprint_reset"))
      {
        paramPreference.setClass(this, VoiceCreateUI.class);
        paramPreference.putExtra("KvoicePrintReset", true);
        paramPreference.putExtra("kscene_type", 73);
        startActivityForResult(paramPreference, 1);
        AppMethodBeat.o(26153);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(26153);
        bool = false;
      }
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(26152);
    aw.ZK();
    int i = bo.g(c.Ry().get(40, Integer.valueOf(0)), 0);
    ab.i("MicroMsg.VoiceSettingsUI", "plugSwitch " + i + " " + (i & 0x20000));
    this.ehK = this.yCw;
    this.sMc = ((VoiceHeaderPreference)this.ehK.aqO("settings_voiceprint_header"));
    ((CheckBoxPreference)this.ehK.aqO("settings_voiceprint_title")).qg(true);
    this.ehK.notifyDataSetChanged();
    if ((this.ehJ != null) && (this.ehJ.isShowing()))
      this.ehJ.dismiss();
    AppCompatActivity localAppCompatActivity = this.mController.ylL;
    getString(2131297061);
    this.ehJ = com.tencent.mm.ui.base.h.b(localAppCompatActivity, getString(2131297086), true, new SettingsVoicePrintUI.2(this));
    aw.Rg().a(new i(0), 0);
    this.ehK.ce("settings_voiceprint_unlock", true);
    this.ehK.ce("settings_voiceprint_reset", true);
    this.ehK.ce("settings_voiceprint_create", true);
    setBackBtn(new SettingsVoicePrintUI.3(this));
    AppMethodBeat.o(26152);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(26156);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 == 1) && (paramIntent != null))
      this.lYR = paramIntent.getBooleanExtra("KIsCreateSuccess", false);
    AppMethodBeat.o(26156);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(26149);
    super.onCreate(paramBundle);
    setMMTitle(2131303342);
    aw.Rg().a(615, this);
    this.iym = findViewById(2131826069);
    initView();
    this.iym.setBackgroundResource(2131690691);
    aw.ZK();
    c.Ry().set(ac.a.xJG, Boolean.FALSE);
    aw.ZK();
    c.Ry().set(ac.a.xJH, Boolean.FALSE);
    aw.ZK();
    c.Ry().set(ac.a.xJI, Boolean.FALSE);
    aw.ZK();
    c.Ry().set(ac.a.xJJ, Boolean.FALSE);
    ab.i("MicroMsg.VoiceSettingsUI", "unset all voiceprint config");
    AppMethodBeat.o(26149);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(26151);
    super.onDestroy();
    aw.Rg().b(615, this);
    if (this.ehJ != null)
      this.ehJ.dismiss();
    AppMethodBeat.o(26151);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(26157);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.VoiceSettingsUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(26157);
      return;
    }
    ab.i("MicroMsg.VoiceSettingsUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 80:
    }
    while (true)
    {
      AppMethodBeat.o(26157);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        cHZ();
        AppMethodBeat.o(26157);
        break;
      }
      com.tencent.mm.ui.base.h.a(this, getString(2131301928), getString(2131301936), getString(2131300878), getString(2131297773), false, new SettingsVoicePrintUI.6(this), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(26148);
          paramAnonymousDialogInterface.dismiss();
          AppMethodBeat.o(26148);
        }
      });
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(26150);
    super.onResume();
    if (this.lYR)
    {
      this.lYR = false;
      if ((this.ehJ != null) && (this.ehJ.isShowing()))
        this.ehJ.dismiss();
      AppCompatActivity localAppCompatActivity = this.mController.ylL;
      getString(2131297061);
      this.ehJ = com.tencent.mm.ui.base.h.b(localAppCompatActivity, getString(2131297086), true, new SettingsVoicePrintUI.1(this));
      ab.d("MicroMsg.VoiceSettingsUI", "resume after create voiceprint, get switch status");
      aw.Rg().a(new i(1), 0);
    }
    AppMethodBeat.o(26150);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(26154);
    ab.d("MicroMsg.VoiceSettingsUI", "onSceneEnd, errType:%d, errCode:%d, sceneType:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramm.getType()) });
    if ((paramInt1 != 0) && (paramInt2 != 0))
    {
      this.ehK.ce("settings_voiceprint_unlock", true);
      this.ehK.ce("settings_voiceprint_reset", true);
      this.ehK.ce("settings_voiceprint_create", true);
      ((CheckBoxPreference)this.ehK.aqO("settings_voiceprint_title")).qg(false);
      this.sMc.ej(getString(2131304326), "");
      this.ehK.notifyDataSetChanged();
      if (this.ehJ != null)
        this.ehJ.dismiss();
      AppMethodBeat.o(26154);
      return;
    }
    if (paramm.getType() == 615)
    {
      paramm = (i)paramm;
      if (paramm.mStatus != 1)
        break label494;
      ab.d("MicroMsg.VoiceSettingsUI", "voiceprint exist");
      this.ehK.ce("settings_voiceprint_unlock", false);
      this.ehK.notifyDataSetChanged();
      paramInt1 = r.YF();
      paramString = (CheckBoxPreference)this.ehK.aqO("settings_voiceprint_title");
      ab.d("MicroMsg.VoiceSettingsUI", "opScene.getSwitch:%d", new Object[] { Integer.valueOf(paramm.sLm) });
      if (paramm.sLm <= 0)
        break label431;
      ab.d("MicroMsg.VoiceSettingsUI", "voiceprint open");
      paramString.qg(true);
      this.ehK.ce("settings_voiceprint_reset", false);
      this.ehK.ce("settings_voiceprint_unlock", false);
      paramInt1 = 0x20000 | paramInt1;
      this.sMc.ej(getString(2131304328), "");
      label318: ab.i("MicroMsg.VoiceSettingsUI", "scene end plugSwitch %d", new Object[] { Integer.valueOf(paramInt1) });
      av.fly.ak("last_login_use_voice", String.valueOf(paramInt1));
      aw.ZK();
      c.Ry().set(40, Integer.valueOf(paramInt1));
      this.ehK.ce("settings_voiceprint_create", true);
      this.ehK.ce("settings_voiceprint_title", false);
      this.sMc.a(null);
      this.ehK.notifyDataSetChanged();
    }
    while (true)
    {
      if (this.ehJ != null)
        this.ehJ.dismiss();
      AppMethodBeat.o(26154);
      break;
      label431: ab.d("MicroMsg.VoiceSettingsUI", "voiceprint close");
      paramString.qg(false);
      this.ehK.ce("settings_voiceprint_reset", true);
      this.ehK.ce("settings_voiceprint_unlock", true);
      paramInt1 = 0xFFFDFFFF & paramInt1;
      this.sMc.ej(getString(2131304326), "");
      break label318;
      label494: ab.d("MicroMsg.VoiceSettingsUI", "voiceprint not exist");
      com.tencent.mm.plugin.report.service.h.pYm.e(11390, new Object[] { Integer.valueOf(2) });
      this.ehK.ce("settings_voiceprint_unlock", true);
      this.ehK.ce("settings_voiceprint_reset", true);
      this.ehK.ce("settings_voiceprint_create", true);
      this.ehK.ce("settings_voiceprint_title", true);
      this.sMc.ej(getString(2131304330), getString(2131304329));
      this.sMc.a(new SettingsVoicePrintUI.5(this));
      this.ehK.notifyDataSetChanged();
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.ui.SettingsVoicePrintUI
 * JD-Core Version:    0.6.2
 */