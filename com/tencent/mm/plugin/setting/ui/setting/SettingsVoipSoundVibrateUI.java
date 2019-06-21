package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;

public class SettingsVoipSoundVibrateUI extends MMPreference
{
  private com.tencent.mm.ui.base.preference.f ehK;

  public final int JC()
  {
    return 2131165287;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(127629);
    paramf = paramPreference.mKey;
    boolean bool;
    if (paramf.equals("settings_voip_sound"))
    {
      com.tencent.mm.m.f.bS(((CheckBoxPreference)paramPreference).isChecked());
      initView();
      AppMethodBeat.o(127629);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (paramf.equals("settings_voip_shake"))
      {
        com.tencent.mm.m.f.bT(((CheckBoxPreference)paramPreference).isChecked());
        initView();
        bo.z(this, ((CheckBoxPreference)paramPreference).isChecked());
        AppMethodBeat.o(127629);
        bool = true;
      }
      else
      {
        bool = false;
        AppMethodBeat.o(127629);
      }
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(127626);
    this.ehK = this.yCw;
    this.ehK.removeAll();
    this.ehK.addPreferencesFromResource(2131165287);
    this.ehK.ce("settings_voip_sound", false);
    ((CheckBoxPreference)this.ehK.aqO("settings_voip_sound")).uOT = com.tencent.mm.m.f.MN();
    this.ehK.ce("settings_voip_shake", false);
    ((CheckBoxPreference)this.ehK.aqO("settings_voip_shake")).uOT = com.tencent.mm.m.f.MO();
    setBackBtn(new SettingsVoipSoundVibrateUI.1(this));
    AppMethodBeat.o(127626);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127625);
    super.onCreate(paramBundle);
    setMMTitle(2131303353);
    AppMethodBeat.o(127625);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(127630);
    super.onDestroy();
    AppMethodBeat.o(127630);
  }

  public void onPause()
  {
    AppMethodBeat.i(127627);
    super.onPause();
    AppMethodBeat.o(127627);
  }

  public void onResume()
  {
    AppMethodBeat.i(127628);
    super.onResume();
    initView();
    AppMethodBeat.o(127628);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsVoipSoundVibrateUI
 * JD-Core Version:    0.6.2
 */