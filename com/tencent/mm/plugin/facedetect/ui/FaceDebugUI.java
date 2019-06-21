package com.tencent.mm.plugin.facedetect.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.model.av;
import com.tencent.mm.plugin.facedetect.model.e;
import com.tencent.mm.plugin.facedetect.model.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.q;
import java.io.File;

public class FaceDebugUI extends MMPreference
{
  private f ehK;
  private View iym;
  private CheckBoxPreference lWd = null;
  private CheckBoxPreference lWe = null;
  private CheckBoxPreference lWf = null;
  private CheckBoxPreference lWg = null;
  private CheckBoxPreference lWh = null;
  private CheckBoxPreference lWi = null;

  private void btf()
  {
    AppMethodBeat.i(358);
    this.ehK = this.yCw;
    this.lWd = ((CheckBoxPreference)this.ehK.aqO("face_debug_switch"));
    this.lWe = ((CheckBoxPreference)this.ehK.aqO("face_debug_save_pic_switch"));
    this.lWf = ((CheckBoxPreference)this.ehK.aqO("face_debug_save_final_switch"));
    this.lWg = ((CheckBoxPreference)this.ehK.aqO("face_debug_save_lipreading_switch"));
    this.lWh = ((CheckBoxPreference)this.ehK.aqO("face_debug_save_voice_switch"));
    this.lWi = ((CheckBoxPreference)this.ehK.aqO("face_debug_force_upload_video"));
    this.ehK.notifyDataSetChanged();
    AppMethodBeat.o(358);
  }

  private void btg()
  {
    AppMethodBeat.i(361);
    boolean bool1 = e.bst();
    boolean bool2 = e.bsv();
    boolean bool3 = e.bsw();
    boolean bool4 = e.bsx();
    boolean bool5 = e.bsy();
    boolean bool6 = e.bsu();
    if (!bool1)
    {
      this.lWd.qg(false);
      this.ehK.ce("face_debug_save_pic_switch", true);
      this.ehK.ce("face_debug_save_final_switch", true);
      this.ehK.ce("face_debug_save_lipreading_switch", true);
      this.ehK.ce("face_debug_save_voice_switch", true);
      this.ehK.ce("face_debug_force_upload_video", true);
    }
    while (true)
    {
      this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(361);
      return;
      this.lWd.qg(true);
      this.ehK.ce("face_debug_save_pic_switch", false);
      this.ehK.ce("face_debug_save_final_switch", false);
      this.ehK.ce("face_debug_save_lipreading_switch", false);
      this.ehK.ce("face_debug_save_voice_switch", false);
      this.ehK.ce("face_debug_force_upload_video", false);
      this.lWe.qg(bool2);
      this.lWf.qg(bool3);
      this.lWg.qg(bool4);
      this.lWh.qg(bool5);
      this.lWi.qg(bool6);
    }
  }

  public final int JC()
  {
    return 2131165236;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool = true;
    AppMethodBeat.i(362);
    btf();
    if ("face_debug_switch".equals(paramPreference.mKey))
    {
      e.gU(this.lWd.isChecked());
      btg();
      AppMethodBeat.o(362);
    }
    while (true)
    {
      return bool;
      if ("face_debug_save_pic_switch".equals(paramPreference.mKey))
      {
        e.gV(this.lWe.isChecked());
        btg();
        AppMethodBeat.o(362);
      }
      else if ("face_debug_save_final_switch".equals(paramPreference.mKey))
      {
        e.gW(this.lWf.isChecked());
        btg();
        AppMethodBeat.o(362);
      }
      else if ("face_debug_save_lipreading_switch".equals(paramPreference.mKey))
      {
        e.gX(this.lWg.isChecked());
        btg();
        AppMethodBeat.o(362);
      }
      else if ("face_debug_save_voice_switch".equals(paramPreference.mKey))
      {
        e.gY(this.lWh.isChecked());
        btg();
        AppMethodBeat.o(362);
      }
      else if ("face_debug_force_upload_video".equals(paramPreference.mKey))
      {
        e.gZ(this.lWi.isChecked());
        btg();
        AppMethodBeat.o(362);
      }
      else if ("face_debug_clear_resource".equals(paramPreference.mKey))
      {
        paramf = new File(p.vo(0));
        if (paramf.exists())
          paramf.delete();
        paramf = new File(p.vo(1));
        if (paramf.exists())
          paramf.delete();
        av.fly.ak("LAST_LOGIN_FACE_MODEL_DETECT_VERSION", "-1");
        av.fly.ak("LAST_LOGIN_FACE_MODEL_ALIGNMENT_VERSION", "-1");
        AppMethodBeat.o(362);
      }
      else if ("face_debug_check_resource".equals(paramPreference.mKey))
      {
        paramPreference = new File(p.vo(0));
        paramf = new File(p.vo(1));
        t.makeText(this.mController.ylL, String.format("is detect model exists: %b, is alignment model exists: %b", new Object[] { Boolean.valueOf(paramPreference.exists()), Boolean.valueOf(paramf.exists()) }), 0).show();
        ab.i("MicroMsg.FaceDebugUI", "hy: detect bin md5: %s", new Object[] { g.v(paramPreference) });
        ab.i("MicroMsg.FaceDebugUI", "hy: alignment bin md5: %s", new Object[] { g.v(paramf) });
        AppMethodBeat.o(362);
      }
      else
      {
        AppMethodBeat.o(362);
        bool = false;
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(357);
    super.onCreate(paramBundle);
    this.iym = findViewById(2131826069);
    this.iym.setBackgroundResource(2131690691);
    btf();
    setMMTitle(getString(2131299455));
    setBackBtn(new FaceDebugUI.1(this));
    AppMethodBeat.o(357);
  }

  public void onResume()
  {
    AppMethodBeat.i(359);
    super.onResume();
    btg();
    AppMethodBeat.o(359);
  }

  public void onStop()
  {
    AppMethodBeat.i(360);
    super.onStop();
    AppMethodBeat.o(360);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceDebugUI
 * JD-Core Version:    0.6.2
 */