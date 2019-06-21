package com.tencent.mm.plugin.ipcall.a.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.ipcall.a.a.a.a;
import com.tencent.mm.plugin.ipcall.a.a.c;
import com.tencent.mm.plugin.ipcall.a.h;
import com.tencent.mm.plugin.ipcall.a.h.a;
import com.tencent.mm.protocal.protobuf.bmc;

public final class e extends com.tencent.mm.plugin.ipcall.a.a.a
  implements h.a
{
  private h nzq = null;

  public final void a(bmc parambmc)
  {
    AppMethodBeat.i(21907);
    this.nwr.a(8, parambmc, 0, 0);
    AppMethodBeat.o(21907);
  }

  public final void b(c paramc)
  {
  }

  public final int[] bHC()
  {
    return new int[0];
  }

  public final int getServiceType()
  {
    return 8;
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(21906);
    com.tencent.mm.sdk.b.a.xxA.d(this.nzq);
    AppMethodBeat.o(21906);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
  }

  public final void wO()
  {
    AppMethodBeat.i(21905);
    this.nzq = new h();
    this.nzq.nvS = this;
    com.tencent.mm.sdk.b.a.xxA.c(this.nzq);
    AppMethodBeat.o(21905);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.f.e
 * JD-Core Version:    0.6.2
 */