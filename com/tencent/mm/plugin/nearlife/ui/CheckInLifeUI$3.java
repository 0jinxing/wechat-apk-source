package com.tencent.mm.plugin.nearlife.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.Addr;
import com.tencent.mm.modelgeo.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class CheckInLifeUI$3
  implements c.a
{
  CheckInLifeUI$3(CheckInLifeUI paramCheckInLifeUI)
  {
  }

  public final void b(Addr paramAddr)
  {
    AppMethodBeat.i(22955);
    ab.i("MicroMsg.CheckInLifeUI", "get info %s", new Object[] { paramAddr.toString() });
    if (!bo.isNullOrNil(CheckInLifeUI.a(this.oSq)))
      AppMethodBeat.o(22955);
    while (true)
    {
      return;
      CheckInLifeUI.a(this.oSq, paramAddr.fBi);
      if (!bo.isNullOrNil(CheckInLifeUI.a(this.oSq)))
        CheckInLifeUI.b(this.oSq).fs(CheckInLifeUI.a(this.oSq), paramAddr.fBq);
      AppMethodBeat.o(22955);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearlife.ui.CheckInLifeUI.3
 * JD-Core Version:    0.6.2
 */