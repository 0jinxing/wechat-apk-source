package com.tencent.mm.ui.contact;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class k$1
  implements ap.a
{
  k$1(k paramk)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(33712);
    ab.d("MicroMsg.FMessageContactView", "refresh timer expired, update");
    k.dHS();
    k.a(this.zmB);
    AppMethodBeat.o(33712);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.k.1
 * JD-Core Version:    0.6.2
 */