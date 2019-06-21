package com.tencent.mm.plugin.mmsight.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h.d;

final class SightSettingsUI$b$1
  implements h.d
{
  SightSettingsUI$b$1(SightSettingsUI.b paramb)
  {
  }

  public final void bV(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(55285);
    try
    {
      paramInt1 = this.oDx.oDv[paramInt1];
      SightSettingsUI.b(this.oDx.oDq).set(this.oDx.oDw, Integer.valueOf(paramInt1));
      SightSettingsUI.c(this.oDx.oDq).notifyDataSetChanged();
      AppMethodBeat.o(55285);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SightSettingsUI", localException, "", new Object[0]);
        AppMethodBeat.o(55285);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.SightSettingsUI.b.1
 * JD-Core Version:    0.6.2
 */