package com.tencent.mm.pluginsdk.ui.preference;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SpecialCheckBoxPreference$1
  implements CompoundButton.OnCheckedChangeListener
{
  SpecialCheckBoxPreference$1(SpecialCheckBoxPreference paramSpecialCheckBoxPreference)
  {
  }

  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    AppMethodBeat.i(28123);
    int i = paramCompoundButton.getId();
    if (i == 2131826016)
    {
      SpecialCheckBoxPreference.a(this.vrB);
      AppMethodBeat.o(28123);
    }
    while (true)
    {
      return;
      if (i == 2131826017)
      {
        SpecialCheckBoxPreference.b(this.vrB);
        AppMethodBeat.o(28123);
      }
      else
      {
        if (i == 2131826018)
          SpecialCheckBoxPreference.c(this.vrB);
        AppMethodBeat.o(28123);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.SpecialCheckBoxPreference.1
 * JD-Core Version:    0.6.2
 */