package com.tencent.mm.plugin.ext.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.ext.c.a.a;
import com.tencent.mm.sdk.platformtools.bj;

public final class e$2 extends bj<Boolean>
{
  public e$2(e parame, Boolean paramBoolean, String paramString, int paramInt1, int paramInt2)
  {
    super(5000L, paramBoolean);
  }

  private Boolean aKg()
  {
    AppMethodBeat.i(20421);
    g.RO().eJo.a(782, new e.2.1(this));
    g.RO().eJo.a(new a(this.val$url, this.hHu, this.hHv), 0);
    Boolean localBoolean = Boolean.TRUE;
    AppMethodBeat.o(20421);
    return localBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.c.e.2
 * JD-Core Version:    0.6.2
 */