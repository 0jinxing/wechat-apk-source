package com.tencent.mm.be;

import com.tencent.map.swlocation.api.SwEngine;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;

final class b$2
  implements Runnable
{
  b$2(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(78528);
    ab.i("MicroMsg.SenseWhereHelper", "it stop sense where sdk.");
    a.xxA.d(b.f(this.fNG));
    SwEngine.stopContinousLocationUpdate();
    SwEngine.onDestroy();
    if (b.g(this.fNG) != null)
    {
      b.g(this.fNG).finish();
      b.a(this.fNG, null);
    }
    b.l(this.fNG);
    b.m(this.fNG);
    b.n(this.fNG);
    b.a(this.fNG, false);
    AppMethodBeat.o(78528);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.be.b.2
 * JD-Core Version:    0.6.2
 */