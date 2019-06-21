package com.tencent.mm.plugin.auto.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.model.at;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

public final class b
  implements at
{
  private a jqB;

  public b()
  {
    AppMethodBeat.i(17106);
    this.jqB = new a();
    AppMethodBeat.o(17106);
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(17107);
    ab.i("MicroMsg.auto.SubCoreAuto", "onAccountPostReset");
    a locala = this.jqB;
    com.tencent.mm.sdk.b.a.xxA.c(locala.jqz);
    AppMethodBeat.o(17107);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(17108);
    ab.i("MicroMsg.auto.SubCoreAuto", "onAccountRelease");
    a locala = this.jqB;
    com.tencent.mm.sdk.b.a.xxA.d(locala.jqz);
    AppMethodBeat.o(17108);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.auto.a.b
 * JD-Core Version:    0.6.2
 */