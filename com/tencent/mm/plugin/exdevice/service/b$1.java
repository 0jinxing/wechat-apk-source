package com.tencent.mm.plugin.exdevice.service;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.concurrent.CountDownLatch;

final class b$1
  implements Runnable
{
  b$1(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(19539);
    b.a(this.lwv, new com.tencent.mm.plugin.d.a.d.b(ah.getContext(), this.lwv, v.bpz().fPG));
    ab.i("MicroMsg.exdevice.BluetoothSDKAdapter", "now notify");
    b.a(this.lwv).countDown();
    AppMethodBeat.o(19539);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.b.1
 * JD-Core Version:    0.6.2
 */