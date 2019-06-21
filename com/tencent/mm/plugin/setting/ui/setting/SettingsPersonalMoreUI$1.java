package com.tencent.mm.plugin.setting.ui.setting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.Preference.a;

final class SettingsPersonalMoreUI$1
  implements Preference.a
{
  SettingsPersonalMoreUI$1(SettingsPersonalMoreUI paramSettingsPersonalMoreUI)
  {
  }

  public final boolean a(Preference paramPreference, Object paramObject)
  {
    AppMethodBeat.i(127381);
    paramPreference = (String)paramObject;
    if ("male".equalsIgnoreCase(paramPreference))
      SettingsPersonalMoreUI.a(this.qoi, 1);
    while (true)
    {
      AppMethodBeat.o(127381);
      return false;
      if ("female".equalsIgnoreCase(paramPreference))
        SettingsPersonalMoreUI.a(this.qoi, 2);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalMoreUI.1
 * JD-Core Version:    0.6.2
 */