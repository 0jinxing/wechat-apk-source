package com.tencent.mm.plugin.nearby.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.Preference.a;

final class NearbyPersonalInfoUI$3
  implements Preference.a
{
  NearbyPersonalInfoUI$3(NearbyPersonalInfoUI paramNearbyPersonalInfoUI)
  {
  }

  public final boolean a(Preference paramPreference, Object paramObject)
  {
    AppMethodBeat.i(55485);
    paramPreference = (String)paramObject;
    if ("male".equalsIgnoreCase(paramPreference))
      NearbyPersonalInfoUI.a(this.oQH, 1);
    while (true)
    {
      AppMethodBeat.o(55485);
      return false;
      if ("female".equalsIgnoreCase(paramPreference))
        NearbyPersonalInfoUI.a(this.oQH, 2);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbyPersonalInfoUI.3
 * JD-Core Version:    0.6.2
 */