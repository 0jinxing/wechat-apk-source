package com.tencent.mm.plugin.wallet_index.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.model.at;
import com.tencent.mm.plugin.wallet_index.c.m;
import java.util.HashMap;

public class a
  implements at
{
  private m tQP;

  public a()
  {
    AppMethodBeat.i(48162);
    this.tQP = new m();
    AppMethodBeat.o(48162);
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
    AppMethodBeat.i(48163);
    com.tencent.mm.sdk.b.a.xxA.c(this.tQP.tRl);
    com.tencent.mm.sdk.b.a.xxA.c(this.tQP.tRm);
    AppMethodBeat.o(48163);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(48164);
    com.tencent.mm.sdk.b.a.xxA.d(this.tQP.tRl);
    com.tencent.mm.sdk.b.a.xxA.d(this.tQP.tRm);
    AppMethodBeat.o(48164);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.a.a
 * JD-Core Version:    0.6.2
 */