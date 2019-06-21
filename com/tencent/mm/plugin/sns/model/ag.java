package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.i.b;

public final class ag
  implements ae
{
  private b qMn;
  private int scene = 0;

  public final int bFf()
  {
    return this.scene;
  }

  public final b cnj()
  {
    AppMethodBeat.i(36525);
    if (this.qMn == null)
      this.qMn = new b();
    b localb = this.qMn;
    AppMethodBeat.o(36525);
    return localb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.ag
 * JD-Core Version:    0.6.2
 */