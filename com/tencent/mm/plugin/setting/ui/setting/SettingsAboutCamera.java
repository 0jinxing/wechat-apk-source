package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public class SettingsAboutCamera extends MMPreference
{
  private f ehK;

  private void ciB()
  {
    AppMethodBeat.i(127083);
    boolean bool = ((Boolean)g.RP().Ry().get(ac.a.xPS, Boolean.TRUE)).booleanValue();
    CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)this.ehK.aqO("settings_auto_mul_terminal_sync");
    localCheckBoxPreference.yDf = false;
    localCheckBoxPreference.uOT = bool;
    bool = ((Boolean)g.RP().Ry().get(ac.a.xPU, Boolean.TRUE)).booleanValue();
    localCheckBoxPreference = (CheckBoxPreference)this.ehK.aqO("settings_take_photo_auto_save_photo");
    localCheckBoxPreference.yDf = false;
    localCheckBoxPreference.uOT = bool;
    bool = ((Boolean)g.RP().Ry().get(ac.a.xPV, Boolean.TRUE)).booleanValue();
    localCheckBoxPreference = (CheckBoxPreference)this.ehK.aqO("settings_take_photo_auto_save_video");
    localCheckBoxPreference.uOT = bool;
    localCheckBoxPreference.yDf = false;
    this.ehK.notifyDataSetChanged();
    AppMethodBeat.o(127083);
  }

  public final int JC()
  {
    return 2131165280;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool1 = true;
    AppMethodBeat.i(127082);
    paramf = paramPreference.mKey;
    ac.a locala;
    if (paramf.equals("settings_auto_mul_terminal_sync"))
    {
      bool2 = ((Boolean)g.RP().Ry().get(ac.a.xPS, Boolean.TRUE)).booleanValue();
      paramPreference = g.RP().Ry();
      locala = ac.a.xPS;
      if (!bool2)
      {
        bool2 = true;
        paramPreference.set(locala, Boolean.valueOf(bool2));
      }
    }
    else
    {
      if (paramf.equals("settings_take_photo_auto_save_photo"))
      {
        bool2 = ((Boolean)g.RP().Ry().get(ac.a.xPU, Boolean.TRUE)).booleanValue();
        paramPreference = g.RP().Ry();
        locala = ac.a.xPU;
        if (bool2)
          break label212;
        bool2 = true;
        label127: paramPreference.set(locala, Boolean.valueOf(bool2));
      }
      if (paramf.equals("settings_take_photo_auto_save_video"))
      {
        bool2 = ((Boolean)g.RP().Ry().get(ac.a.xPV, Boolean.TRUE)).booleanValue();
        paramf = g.RP().Ry();
        paramPreference = ac.a.xPV;
        if (bool2)
          break label218;
      }
    }
    label212: label218: for (boolean bool2 = bool1; ; bool2 = false)
    {
      paramf.set(paramPreference, Boolean.valueOf(bool2));
      AppMethodBeat.o(127082);
      return false;
      bool2 = false;
      break;
      bool2 = false;
      break label127;
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(127084);
    this.ehK = this.yCw;
    setMMTitle(2131303198);
    setBackBtn(new SettingsAboutCamera.1(this));
    ciB();
    AppMethodBeat.o(127084);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127081);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(127081);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAboutCamera
 * JD-Core Version:    0.6.2
 */