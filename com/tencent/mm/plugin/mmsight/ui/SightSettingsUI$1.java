package com.tencent.mm.plugin.mmsight.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SightSettingsUI$1
  implements Runnable
{
  SightSettingsUI$1(SightSettingsUI paramSightSettingsUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(55279);
    ab.i("MicroMsg.SightSettingsUI", "has connect");
    SightSettingsUI.a(this.oDq);
    AppMethodBeat.o(55279);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.SightSettingsUI.1
 * JD-Core Version:    0.6.2
 */