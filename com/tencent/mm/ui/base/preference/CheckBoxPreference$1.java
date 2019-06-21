package com.tencent.mm.ui.base.preference;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;

final class CheckBoxPreference$1
  implements MMSwitchBtn.a
{
  CheckBoxPreference$1(CheckBoxPreference paramCheckBoxPreference)
  {
  }

  public final void di(boolean paramBoolean)
  {
    AppMethodBeat.i(107134);
    this.yBp.callChangeListener(Boolean.valueOf(paramBoolean));
    AppMethodBeat.o(107134);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.CheckBoxPreference.1
 * JD-Core Version:    0.6.2
 */