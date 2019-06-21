package com.tencent.mm.plugin.gif;

import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class d$6
  implements Runnable
{
  d$6(d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(62385);
    if (d.h(this.npc))
    {
      ab.i("MicroMsg.GIF.MMGIFDrawable", "This gif had been recycle.");
      AppMethodBeat.o(62385);
    }
    while (true)
    {
      return;
      long l = System.currentTimeMillis();
      if (d.b(this.npc) + 1 > d.i(this.npc) - 1)
        d.a(this.npc, -1);
      d.a(this.npc, d.b(this.npc) + 1);
      if (MMGIFJNI.drawFramePixels(d.e(this.npc), d.j(this.npc), d.k(this.npc)))
        d.l(this.npc);
      d.b(this.npc, System.currentTimeMillis() - l);
      boolean bool;
      label321: int m;
      if (d.m(this.npc) != 0L)
      {
        d.c(this.npc, d.m(this.npc) - d.n(this.npc) - d.o(this.npc));
        if (d.g(this.npc) < 0L)
        {
          ab.d("MicroMsg.GIF.MMGIFDrawable", "Render time:%d InvalidateUseTime:%d NextRealInvalidateTime:%d mNextFrameDuration:%d mCurrentFrameIndex:%d", new Object[] { Long.valueOf(d.n(this.npc)), Long.valueOf(d.o(this.npc)), Long.valueOf(d.g(this.npc)), Long.valueOf(d.m(this.npc)), Integer.valueOf(d.k(this.npc)[5]) });
          h.pYm.a(401L, 0L, 1L, false);
          h.pYm.a(401L, 1L, Math.abs(d.g(this.npc)), false);
          if (d.g(this.npc) < -100L)
          {
            if ((!WXHardCoderJNI.hcGifEnable) && (!WXHardCoderJNI.hcGifFrameEnable))
              break label473;
            bool = true;
            WXHardCoderJNI.stopPerformance(bool, d.p(this.npc));
            locald = this.npc;
            bool = WXHardCoderJNI.hcGifFrameEnable;
            int i = WXHardCoderJNI.hcGifFrameDelay;
            int j = WXHardCoderJNI.hcGifFrameCPU;
            int k = WXHardCoderJNI.hcGifFrameIO;
            if (!WXHardCoderJNI.hcGifFrameThr)
              break label478;
            m = Process.myTid();
            label369: d.b(locald, WXHardCoderJNI.startPerformance(bool, i, j, k, m, WXHardCoderJNI.hcGifFrameTimeout, 602, WXHardCoderJNI.hcGifFrameAction, "MicroMsg.GIF.MMGIFDrawable"));
          }
        }
      }
      d locald = this.npc;
      Runnable localRunnable = d.f(this.npc);
      if (d.g(this.npc) > 0L);
      for (l = d.g(this.npc); ; l = 0L)
      {
        d.a(locald, localRunnable, l);
        if (d.k(this.npc)[2] != 1)
          break label489;
        d.d(this.npc, 5000L);
        AppMethodBeat.o(62385);
        break;
        label473: bool = false;
        break label321;
        label478: m = 0;
        break label369;
      }
      label489: d.d(this.npc, d.k(this.npc)[4]);
      AppMethodBeat.o(62385);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gif.d.6
 * JD-Core Version:    0.6.2
 */