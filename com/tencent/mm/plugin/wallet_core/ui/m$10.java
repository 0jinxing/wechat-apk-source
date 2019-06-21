package com.tencent.mm.plugin.wallet_core.ui;

import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class m$10
  implements CompoundButton.OnCheckedChangeListener
{
  m$10(Button paramButton)
  {
  }

  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    AppMethodBeat.i(47401);
    if (!paramBoolean)
    {
      this.tHR.setEnabled(false);
      this.tHR.setClickable(false);
      AppMethodBeat.o(47401);
    }
    while (true)
    {
      return;
      this.tHR.setEnabled(true);
      this.tHR.setClickable(true);
      AppMethodBeat.o(47401);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.m.10
 * JD-Core Version:    0.6.2
 */