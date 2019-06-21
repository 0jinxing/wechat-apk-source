package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.sdk.platformtools.ak;

public final class au$b
  implements ao.b.a
{
  int mPosition;
  w ryg = null;

  public au$b(w paramw, int paramInt)
  {
    this.ryg = paramw;
    this.mPosition = paramInt;
  }

  public final void o(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(39414);
    if (paramBoolean)
    {
      g.RQ();
      if (g.RN().QY())
        af.bCo().post(new au.b.1(this));
    }
    AppMethodBeat.o(39414);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.au.b
 * JD-Core Version:    0.6.2
 */