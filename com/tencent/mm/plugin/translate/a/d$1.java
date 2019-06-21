package com.tencent.mm.plugin.translate.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class d$1
  implements ap.a
{
  d$1(d paramd)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(26068);
    if (this.sKJ.sKF)
    {
      ab.e("MicroMsg.WorkingTranslate", "this work is time out, index: %s", new Object[] { Integer.valueOf(this.sKJ.index) });
      this.sKJ.cHJ();
      this.sKJ.sKH.a(-1, this.sKJ.sKE, null);
    }
    AppMethodBeat.o(26068);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.translate.a.d.1
 * JD-Core Version:    0.6.2
 */