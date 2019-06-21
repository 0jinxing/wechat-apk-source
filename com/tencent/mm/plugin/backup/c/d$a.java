package com.tencent.mm.plugin.backup.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.plugin.backup.h.b;
import com.tencent.mm.sdk.platformtools.bo;

final class d$a
{
  private long beginTime;
  private long jsG = -1L;
  boolean jsH = false;

  private d$a(d paramd)
  {
  }

  public final void aSR()
  {
    AppMethodBeat.i(17201);
    if (bo.gb(this.beginTime) > 500L)
      end();
    try
    {
      Thread.sleep(5L);
      label30: begin();
      this.beginTime = bo.anU();
      AppMethodBeat.o(17201);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label30;
    }
  }

  public final void begin()
  {
    AppMethodBeat.i(17199);
    if (com.tencent.mm.plugin.backup.h.d.aUr().aUs().eJN != null)
    {
      this.jsG = com.tencent.mm.plugin.backup.h.d.aUr().aUs().eJN.iV(Thread.currentThread().getId());
      this.jsH = true;
      this.beginTime = bo.anU();
    }
    AppMethodBeat.o(17199);
  }

  public final void end()
  {
    AppMethodBeat.i(17200);
    if ((this.jsH) && (com.tencent.mm.plugin.backup.h.d.aUr().aUs().eJN != null))
    {
      com.tencent.mm.plugin.backup.h.d.aUr().aUs().eJN.mB(this.jsG);
      this.jsH = false;
    }
    AppMethodBeat.o(17200);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.c.d.a
 * JD-Core Version:    0.6.2
 */