package com.tencent.mm.plugin.fts.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.KeyboardLinearLayout.a;

final class FTSMainUI$12
  implements KeyboardLinearLayout.a
{
  FTSMainUI$12(FTSMainUI paramFTSMainUI)
  {
  }

  public final void sD(int paramInt)
  {
    AppMethodBeat.i(61881);
    if (paramInt == -3)
    {
      ab.d("MicroMsg.FTS.FTSMainUI", "KEYBOARD_STATE_SHOW");
      new ak().postDelayed(new FTSMainUI.12.1(this), 0L);
      AppMethodBeat.o(61881);
    }
    while (true)
    {
      return;
      if (paramInt == -2)
      {
        new ak().postDelayed(new FTSMainUI.12.2(this), 0L);
        ab.d("MicroMsg.FTS.FTSMainUI", "KEYBOARD_STATE_HIDE");
      }
      AppMethodBeat.o(61881);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSMainUI.12
 * JD-Core Version:    0.6.2
 */