package com.tencent.mm.bj;

import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class h$b
  implements Runnable
{
  volatile int eVU;
  int fYT;
  boolean fYU;
  Object fYV;

  private h$b(h paramh)
  {
    AppMethodBeat.i(50947);
    this.fYV = new Object();
    AppMethodBeat.o(50947);
  }

  public final void run()
  {
    AppMethodBeat.i(50948);
    if (this.fYT == -1)
    {
      this.fYT = Process.myTid();
      Process.setThreadPriority(Process.myTid(), -2);
      ab.i("MicroMsg.VideoTranscoder", "encodeTid: %s", new Object[] { Integer.valueOf(this.fYT) });
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
        ab.i("MicroMsg.VideoTranscoder", "try trigger encode");
        i = MP4MuxerJNI.triggerEncodeForSegmentLock(Math.max(0, this.eVU), false);
        ab.i("MicroMsg.VideoTranscoder", "ing: trigger encode use %dms, Encode index[%d, %d), threadId: %s", new Object[] { Long.valueOf(bo.az(l)), Integer.valueOf(this.eVU), Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()) });
        int j = this.eVU;
        if (i != j);
      }
      try
      {
        Thread.sleep(5L);
        this.eVU = i;
        continue;
        localObject2 = finally;
        AppMethodBeat.o(50948);
        throw localObject2;
      }
      catch (Exception localException)
      {
        while (true)
          ab.e("MicroMsg.VideoTranscoder", "thread sleep error");
      }
    }
    label196: long l = bo.yz();
    this.eVU = MP4MuxerJNI.triggerEncodeForSegmentLock(this.eVU, true);
    ab.i("MicroMsg.VideoTranscoder", "end: trigger encode use %dms, curEncode index %d, threadId: %s", new Object[] { Long.valueOf(bo.az(l)), Integer.valueOf(this.eVU), Long.valueOf(Thread.currentThread().getId()) });
    AppMethodBeat.o(50948);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bj.h.b
 * JD-Core Version:    0.6.2
 */