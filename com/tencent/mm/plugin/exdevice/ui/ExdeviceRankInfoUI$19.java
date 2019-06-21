package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.e;
import com.tencent.mm.m.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;

final class ExdeviceRankInfoUI$19
  implements n.c
{
  ExdeviceRankInfoUI$19(ExdeviceRankInfoUI paramExdeviceRankInfoUI)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(20157);
    if (ab.getLogLevel() == 0);
    for (int i = 2; ; i = g.Nu().getInt("WeRunLaunchGroupRankWeAppSwitch", 0))
    {
      if (i == 2)
        paraml.a(3, this.lDC.getString(2131299347), 2131231019);
      paraml.a(0, this.lDC.getString(2131299345), 2131231019);
      paraml.a(1, this.lDC.getString(2131299348), 2131231005);
      paraml.a(2, this.lDC.getString(2131299344), 2131230992);
      AppMethodBeat.o(20157);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI.19
 * JD-Core Version:    0.6.2
 */