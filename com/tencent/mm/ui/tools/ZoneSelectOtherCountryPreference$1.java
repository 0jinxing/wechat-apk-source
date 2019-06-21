package com.tencent.mm.ui.tools;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ZoneSelectOtherCountryPreference$1
  implements View.OnClickListener
{
  ZoneSelectOtherCountryPreference$1(ZoneSelectOtherCountryPreference paramZoneSelectOtherCountryPreference)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(35019);
    if (ZoneSelectOtherCountryPreference.a(this.zIr) != null)
      ZoneSelectOtherCountryPreference.a(this.zIr).onClick();
    AppMethodBeat.o(35019);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ZoneSelectOtherCountryPreference.1
 * JD-Core Version:    0.6.2
 */