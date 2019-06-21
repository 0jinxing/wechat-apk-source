package com.tencent.mm.plugin.exdevice.b;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import junit.framework.Assert;

final class k$d
  implements Runnable
{
  private long lqN;

  public k$d(k paramk, long paramLong)
  {
    AppMethodBeat.i(19055);
    this.lqN = -1L;
    if (paramLong >= 0L);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      this.lqN = paramLong;
      AppMethodBeat.o(19055);
      return;
    }
  }

  public final void run()
  {
    AppMethodBeat.i(19056);
    ab.w("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "Time Out Sequnence(%d)", new Object[] { Long.valueOf(this.lqN) });
    k.a(this.lqK).obtainMessage(0, Long.valueOf(this.lqN)).sendToTarget();
    AppMethodBeat.o(19056);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.b.k.d
 * JD-Core Version:    0.6.2
 */