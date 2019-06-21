package com.tencent.mm.plugin.appbrand.game.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.CopyOnWriteArrayList;

public final class a$1
  implements Runnable
{
  public a$1(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(130324);
    a.a(this.huk, a.a(this.huk).size());
    ab.i("MicroMsg.MBNiReporter", "hy: onFirstFrameRendered picnum:%d", new Object[] { Integer.valueOf(a.b(this.huk)) });
    AppMethodBeat.o(130324);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.f.a.1
 * JD-Core Version:    0.6.2
 */