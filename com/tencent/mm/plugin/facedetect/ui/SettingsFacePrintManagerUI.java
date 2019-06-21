package com.tencent.mm.plugin.facedetect.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.av;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;

public class SettingsFacePrintManagerUI extends MMPreference
  implements com.tencent.mm.ai.f
{
  private ProgressDialog ehJ = null;
  private com.tencent.mm.ui.base.preference.f ehK;
  private View iym;
  private FaceHeaderPreference lYQ;
  private boolean lYR = false;

  public final int JC()
  {
    return 2131165274;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(535);
    String str = paramPreference.mKey;
    paramPreference = new Intent();
    boolean bool;
    if (str.equals("settings_faceprint_title"))
    {
      paramf = (CheckBoxPreference)paramf.aqO("settings_faceprint_title");
      ab.d("MicroMsg.FaceSettingsManagerUI", "hy: checkPref.isChecked() " + paramf.isChecked());
      if ((this.ehJ != null) && (this.ehJ.isShowing()))
        this.ehJ.dismiss();
      paramPreference = this.mController.ylL;
      getString(2131297061);
      this.ehJ = com.tencent.mm.ui.base.h.b(paramPreference, getString(2131297086), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
        }
      });
      if (paramf.isChecked())
      {
        g.Rg().a(new com.tencent.mm.plugin.facedetect.b.q(1), 0);
        AppMethodBeat.o(535);
        bool = true;
      }
    }
    while (true)
    {
      return bool;
      g.Rg().a(new com.tencent.mm.plugin.facedetect.b.q(2), 0);
      break;
      if (str.equals("settings_faceprint_unlock"))
      {
        paramPreference.setClass(this, FaceDetectUI.class);
        paramPreference.putExtra("k_need_signature", true);
        paramPreference.putExtra("k_user_name", r.YC());
        paramPreference.putExtra("k_purpose", 2);
        startActivity(paramPreference);
        AppMethodBeat.o(535);
        bool = true;
      }
      else if (str.equals("settings_faceeprint_reset"))
      {
        paramPreference.setClass(this, FaceDetectUI.class);
        paramPreference.putExtra("k_need_signature", true);
        paramPreference.putExtra("k_user_name", r.YC());
        paramPreference.putExtra("k_purpose", 1);
        startActivityForResult(paramPreference, 1);
        AppMethodBeat.o(535);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(535);
        bool = false;
      }
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(534);
    int i = bo.g(g.RP().Ry().get(40, Integer.valueOf(0)), 0);
    ab.i("MicroMsg.FaceSettingsManagerUI", "plugSwitch " + i + " " + (i & 0x400000));
    this.ehK = this.yCw;
    this.lYQ = ((FaceHeaderPreference)this.ehK.aqO("settings_faceprint_header"));
    ((CheckBoxPreference)this.ehK.aqO("settings_faceprint_title")).qg(true);
    this.ehK.notifyDataSetChanged();
    if ((this.ehJ != null) && (this.ehJ.isShowing()))
      this.ehJ.dismiss();
    AppCompatActivity localAppCompatActivity = this.mController.ylL;
    getString(2131297061);
    this.ehJ = com.tencent.mm.ui.base.h.b(localAppCompatActivity, getString(2131297086), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
      }
    });
    g.Rg().a(new com.tencent.mm.plugin.facedetect.b.q(3), 0);
    this.ehK.ce("settings_faceprint_create", true);
    this.ehK.ce("settings_faceeprint_reset", true);
    this.ehK.ce("settings_faceprint_unlock", true);
    setBackBtn(new SettingsFacePrintManagerUI.3(this));
    AppMethodBeat.o(534);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(537);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 1)
    {
      if ((paramIntent != null) && (paramIntent.getIntExtra("err_code", 10) == 0))
        this.lYR = true;
      ab.i("MicroMsg.FaceSettingsManagerUI", "hy: is reg ok: %b", new Object[] { Boolean.valueOf(this.lYR) });
    }
    AppMethodBeat.o(537);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(531);
    super.onCreate(paramBundle);
    setMMTitle(2131299492);
    g.Rg().a(938, this);
    this.iym = findViewById(2131826069);
    initView();
    this.iym.setBackgroundResource(2131690691);
    com.tencent.mm.plugin.facedetect.model.p.M(this);
    AppMethodBeat.o(531);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(533);
    super.onDestroy();
    g.Rg().b(938, this);
    if (this.ehJ != null)
      this.ehJ.dismiss();
    AppMethodBeat.o(533);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(538);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.FaceSettingsManagerUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(538);
      return;
    }
    ab.i("MicroMsg.FaceSettingsManagerUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 23:
    }
    while (true)
    {
      AppMethodBeat.o(538);
      break;
      if ((paramArrayOfInt[0] != 0) || (paramArrayOfInt[1] != 0))
      {
        ab.w("MicroMsg.FaceSettingsManagerUI", "hy: permission not granted");
        finish();
      }
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(532);
    super.onResume();
    if (this.lYR)
    {
      this.lYR = false;
      if ((this.ehJ != null) && (this.ehJ.isShowing()))
        this.ehJ.dismiss();
      AppCompatActivity localAppCompatActivity = this.mController.ylL;
      getString(2131297061);
      this.ehJ = com.tencent.mm.ui.base.h.b(localAppCompatActivity, getString(2131297086), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
        }
      });
      ab.d("MicroMsg.FaceSettingsManagerUI", "hy: resume after create face, get switch status");
      g.Rg().a(new com.tencent.mm.plugin.facedetect.b.q(1), 0);
    }
    AppMethodBeat.o(532);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(536);
    ab.d("MicroMsg.FaceSettingsManagerUI", "hy: onSceneEnd, errType:%d, errCode:%d, sceneType:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramm.getType()) });
    if ((paramInt1 != 0) && (paramInt2 != 0))
    {
      this.ehK.ce("settings_faceprint_create", true);
      this.ehK.ce("settings_faceprint_unlock", true);
      this.ehK.ce("settings_faceeprint_reset", true);
      ((CheckBoxPreference)this.ehK.aqO("settings_faceprint_title")).qg(false);
      this.lYQ.setTitle(getString(2131303086));
      this.ehK.notifyDataSetChanged();
      if (this.ehJ != null)
        this.ehJ.dismiss();
      AppMethodBeat.o(536);
      return;
    }
    if (paramm.getType() == 938)
    {
      paramString = (com.tencent.mm.plugin.facedetect.b.q)paramm;
      if (!paramString.lSY)
        break label488;
      ab.d("MicroMsg.FaceSettingsManagerUI", "faceprint exist");
      this.ehK.ce("settings_faceprint_unlock", false);
      this.ehK.notifyDataSetChanged();
      paramInt1 = r.YF();
      paramm = (CheckBoxPreference)this.ehK.aqO("settings_faceprint_title");
      ab.d("MicroMsg.FaceSettingsManagerUI", "opScene.isOpenSwitch:%b", new Object[] { Boolean.valueOf(paramString.lSZ) });
      if (!paramString.lSZ)
        break label424;
      ab.d("MicroMsg.FaceSettingsManagerUI", "hy: faceprint open");
      paramm.qg(true);
      this.ehK.ce("settings_faceeprint_reset", false);
      this.ehK.ce("settings_faceprint_unlock", false);
      paramInt1 = 0x400000 | paramInt1;
      this.lYQ.ej(getString(2131303087), "");
      label312: ab.i("MicroMsg.FaceSettingsManagerUI", "scene end plugSwitch %d", new Object[] { Integer.valueOf(paramInt1) });
      av.fly.ak("last_login_use_voice", String.valueOf(paramInt1));
      g.RP().Ry().set(40, Integer.valueOf(paramInt1));
      this.ehK.ce("settings_faceprint_create", true);
      this.ehK.ce("settings_faceprint_title", false);
      this.lYQ.a(null);
      this.ehK.notifyDataSetChanged();
    }
    while (true)
    {
      if (this.ehJ != null)
        this.ehJ.dismiss();
      AppMethodBeat.o(536);
      break;
      label424: ab.d("MicroMsg.FaceSettingsManagerUI", "hy: faceprint close");
      paramm.qg(false);
      this.ehK.ce("settings_faceeprint_reset", true);
      this.ehK.ce("settings_faceprint_unlock", true);
      paramInt1 = 0xFFBFFFFF & paramInt1;
      this.lYQ.ej(getString(2131303086), "");
      break label312;
      label488: ab.d("MicroMsg.FaceSettingsManagerUI", "faceprint not exist");
      com.tencent.mm.plugin.report.service.h.pYm.e(11390, new Object[] { Integer.valueOf(2) });
      this.ehK.ce("settings_faceprint_create", true);
      this.ehK.ce("settings_faceprint_title", true);
      this.ehK.ce("settings_faceprint_unlock", true);
      this.ehK.ce("settings_faceeprint_reset", true);
      this.lYQ.setTitle(getString(2131303082));
      this.lYQ.a(new SettingsFacePrintManagerUI.5(this));
      this.ehK.notifyDataSetChanged();
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.SettingsFacePrintManagerUI
 * JD-Core Version:    0.6.2
 */