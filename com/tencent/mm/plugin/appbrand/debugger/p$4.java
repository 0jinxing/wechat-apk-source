package com.tencent.mm.plugin.appbrand.debugger;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import com.tencent.mm.protocal.protobuf.cqs;
import com.tencent.mm.protocal.protobuf.crj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.TimerTask;

final class p$4 extends TimerTask
{
  p$4(p paramp)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(101860);
    if ((p.a(this.hks).isBusy()) && (this.hks.azl()))
      ab.i("MicroMsg.RemoteDebugMsgMrg", "testServer");
    while (true)
    {
      al.d(new u.7(p.d(this.hks)));
      AppMethodBeat.o(101860);
      return;
      this.hks.azk();
      long l = System.currentTimeMillis();
      if (l - p.a(this.hks).hjx >= 10000L)
      {
        p localp = this.hks;
        Object localObject = new crj();
        ((crj)localObject).xoU = localp.hjR.hjo;
        ((crj)localObject).xoV = localp.hjR.ayZ();
        localObject = t.a(1001, (a)localObject);
        localp.hjT.a((cqs)localObject);
      }
      if ((p.a(this.hks).isReady()) && (l - p.a(this.hks).hjy >= 30000L))
        this.hks.cV(p.a(this.hks).ayZ(), 2147483647);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.debugger.p.4
 * JD-Core Version:    0.6.2
 */