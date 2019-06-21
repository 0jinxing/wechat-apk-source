package com.tencent.mm.ui.contact;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;

final class k$2
  implements k.a
{
  k$2(k paramk)
  {
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(33713);
    ab.d("MicroMsg.FMessageContactView", "onNotifyChange, fmsg change");
    if (!k.b(this.zmB).doT())
      k.b(this.zmB).stopTimer();
    paramString = k.b(this.zmB);
    if (k.c(this.zmB));
    for (long l = 500L; ; l = 1000L)
    {
      paramString.ae(l, l);
      AppMethodBeat.o(33713);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.k.2
 * JD-Core Version:    0.6.2
 */