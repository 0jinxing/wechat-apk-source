package com.tencent.mm.plugin.mmsight.segment;

import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class h$a
  implements Runnable
{
  volatile int eVU;
  int fYT;
  boolean fYU;
  Object fYV;

  private h$a(h paramh)
  {
    AppMethodBeat.i(3654);
    this.fYV = new Object();
    AppMethodBeat.o(3654);
  }

  public final void run()
  {
    AppMethodBeat.i(3655);
    if (this.fYT == -1)
    {
      this.fYT = Process.myTid();
      Process.setThreadPriority(Process.myTid(), -2);
      ab.i("MicroMsg.MediaCodecFFMpegTranscoder", "encodeTid: %s", new Object[] { Integer.valueOf(this.fYT) });
    }
    this.eVU = 0;
    while (true)
    {
      int i;
      synchronized (this.fYV)
      {
        if (this.fYU)
          break label198;
        l = bo.yz();
        ab.i("MicroMsg.MediaCodecFFMpegTranscoder", "try trigger encode");
        i = MP4MuxerJNI.triggerEncodeForSegment(Math.max(0, this.eVU), false);
        ab.i("MicroMsg.MediaCodecFFMpegTranscoder", "ing: trigger encode use %dms, Encode index[%d, %d), threadId: %s", new Object[] { Long.valueOf(bo.az(l)), Integer.valueOf(this.eVU), Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()) });
        int j = this.eVU;
        if (i != j);
      }
      try
      {
        Thread.sleep(20L);
        this.eVU = i;
        continue;
        localObject2 = finally;
        AppMethodBeat.o(3655);
        throw localObject2;
      }
      catch (Exception localException)
      {
        while (true)
          ab.e("MicroMsg.MediaCodecFFMpegTranscoder", "thread sleep error");
      }
    }
    label198: long l = bo.yz();
    this.eVU = MP4MuxerJNI.triggerEncodeForSegment(this.eVU, true);
    ab.i("MicroMsg.MediaCodecFFMpegTranscoder", "end: trigger encode use %dms, curEncode index %d, threadId: %s", new Object[] { Long.valueOf(bo.az(l)), Integer.valueOf(this.eVU), Long.valueOf(Thread.currentThread().getId()) });
    AppMethodBeat.o(3655);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.h.a
 * JD-Core Version:    0.6.2
 */