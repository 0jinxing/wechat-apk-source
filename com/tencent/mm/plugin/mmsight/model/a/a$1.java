package com.tencent.mm.plugin.mmsight.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class a$1
  implements b.a
{
  a$1(a parama)
  {
  }

  public final void a(final b paramb)
  {
    AppMethodBeat.i(76563);
    a.a(this.ovn).post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(76562);
        a.a(a.1.this.ovn, paramb);
        AppMethodBeat.o(76562);
      }
    });
    AppMethodBeat.o(76563);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.a.a.1
 * JD-Core Version:    0.6.2
 */