package com.tencent.mm.plugin.mmsight.model.b;

import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class g$a
  implements Runnable
{
  volatile int eVU;
  int fYT;
  boolean fYU;
  final Object fYV;

  private g$a(g paramg)
  {
    AppMethodBeat.i(76724);
    this.fYV = new Object();
    AppMethodBeat.o(76724);
  }

  public final void run()
  {
    AppMethodBeat.i(76725);
    if (this.fYT == -1)
    {
      this.fYT = Process.myTid();
      Process.setThreadPriority(Process.myTid(), -2);
      ab.i("MicroMsg.MMSightRemuxX264Encoder", "encodeTid: %s", new Object[] { Integer.valueOf(this.fYT) });
    }
    this.eVU = 0;
    while (true)
    {
      int i;
      synchronized (this.fYV)
      {
        if (this.fYU)
          break label196;
        l = bo.yz();
        ab.i("MicroMsg.MMSightRemuxX264Encoder", "try trigger encode");
        i = MP4MuxerJNI.triggerEncodeForSegmentLock(Math.max(0, this.eVU), false);
        ab.i("MicroMsg.MMSightRemuxX264Encoder", "ing: trigger encode use %dms, Encode index[%d, %d), threadId: %s", new Object[] { Long.valueOf(bo.az(l)), Integer.valueOf(this.eVU), Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()) });
        int j = this.eVU;
        if (i != j);
      }
      try
      {
        Thread.sleep(10L);
        this.eVU = i;
        continue;
        localObject2 = finally;
        AppMethodBeat.o(76725);
        throw localObject2;
      }
      catch (Exception localException)
      {
        while (true)
          ab.e("MicroMsg.MMSightRemuxX264Encoder", "thread sleep error");
      }
    }
    label196: long l = bo.yz();
    this.eVU = MP4MuxerJNI.triggerEncodeForSegmentLock(this.eVU, true);
    ab.i("MicroMsg.MMSightRemuxX264Encoder", "end: trigger encode use %dms, curEncode index %d, threadId: %s", new Object[] { Long.valueOf(bo.az(l)), Integer.valueOf(this.eVU), Long.valueOf(Thread.currentThread().getId()) });
    AppMethodBeat.o(76725);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.b.g.a
 * JD-Core Version:    0.6.2
 */