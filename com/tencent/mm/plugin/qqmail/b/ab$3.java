package com.tencent.mm.plugin.qqmail.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

final class ab$3
  implements ab.c
{
  ab$3(ab paramab)
  {
  }

  public final void ccz()
  {
    AppMethodBeat.i(68039);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.ShareModeMailAppService", "uploadMsgImg, finshed upload all msg img");
    this.pvy.Br(90);
    ab localab = this.pvy;
    if ((localab.pvq != null) && (localab.pvq.size() > 0))
      localab.pvq.clear();
    this.pvy.ccy();
    AppMethodBeat.o(68039);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.ab.3
 * JD-Core Version:    0.6.2
 */