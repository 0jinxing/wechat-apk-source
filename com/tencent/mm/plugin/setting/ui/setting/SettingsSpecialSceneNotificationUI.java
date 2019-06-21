package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;

public class SettingsSpecialSceneNotificationUI extends MMPreference
{
  private com.tencent.mm.ui.base.preference.f ehK;

  public final int JC()
  {
    return 2131165286;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(127495);
    paramf = paramPreference.mKey;
    boolean bool;
    if (paramf.equals("settings_specail_scene_sound"))
    {
      com.tencent.mm.m.f.bQ(((CheckBoxPreference)paramPreference).isChecked());
      initView();
      AppMethodBeat.o(127495);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (paramf.equals("settings_specail_scene_shake"))
      {
        com.tencent.mm.m.f.bR(((CheckBoxPreference)paramPreference).isChecked());
        initView();
        bo.z(this, ((CheckBoxPreference)paramPreference).isChecked());
        AppMethodBeat.o(127495);
        bool = true;
      }
      else
      {
        bool = false;
        AppMethodBeat.o(127495);
      }
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(127492);
    this.ehK = this.yCw;
    this.ehK.removeAll();
    this.ehK.addPreferencesFromResource(2131165286);
    this.ehK.ce("settings_specail_scene_sound", false);
    ((CheckBoxPreference)this.ehK.aqO("settings_specail_scene_sound")).uOT = com.tencent.mm.m.f.ML();
    this.ehK.ce("settings_specail_scene_shake", false);
    ((CheckBoxPreference)this.ehK.aqO("settings_specail_scene_shake")).uOT = com.tencent.mm.m.f.MM();
    setBackBtn(new SettingsSpecialSceneNotificationUI.1(this));
    AppMethodBeat.o(127492);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127491);
    super.onCreate(paramBundle);
    setMMTitle(2131303282);
    AppMethodBeat.o(127491);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(127496);
    super.onDestroy();
    AppMethodBeat.o(127496);
  }

  public void onPause()
  {
    AppMethodBeat.i(127493);
    super.onPause();
    AppMethodBeat.o(127493);
  }

  public void onResume()
  {
    AppMethodBeat.i(127494);
    super.onResume();
    initView();
    AppMethodBeat.o(127494);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsSpecialSceneNotificationUI
 * JD-Core Version:    0.6.2
 */