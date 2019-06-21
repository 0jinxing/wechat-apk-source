package com.tencent.mm.plugin.voip_cs.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.TimerTask;

final class b$7 extends TimerTask
{
  b$7(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135325);
    b.p(this.tet).post(new b.7.1(this));
    AppMethodBeat.o(135325);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.b.a.b.7
 * JD-Core Version:    0.6.2
 */