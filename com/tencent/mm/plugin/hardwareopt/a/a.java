package com.tencent.mm.plugin.hardwareopt.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.hardwareopt.c.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.vending.g.c;
import com.tencent.mm.vending.g.d;
import com.tencent.mm.vending.g.d.a;
import com.tencent.mm.vending.g.e;

public final class a
  implements com.tencent.mm.plugin.hardwareopt.a.a.a
{
  public final void hX(boolean paramBoolean)
  {
    AppMethodBeat.i(59272);
    new e().C(new Object[] { ah.getContext() }).e(new com.tencent.mm.plugin.hardwareopt.c.a()).d(new b(paramBoolean)).a(new d.a()
    {
      public final void bi(Object paramAnonymousObject)
      {
        AppMethodBeat.i(59271);
        ab.w("MicroMsg.HardwareProvider", "hy: on interrupt.");
        AppMethodBeat.o(59271);
      }
    }).a(new a.1(this));
    AppMethodBeat.o(59272);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hardwareopt.a.a
 * JD-Core Version:    0.6.2
 */