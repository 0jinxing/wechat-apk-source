package com.tencent.mm.plugin.gif;

import android.graphics.Bitmap;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.sdk.platformtools.ab;

final class h$4
  implements Runnable
{
  h$4(h paramh)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(62428);
    if (h.h(this.npu))
    {
      ab.d("MicroMsg.GIF.MMWXGFDrawable", "Cpan Render Task is Running.");
      AppMethodBeat.o(62428);
    }
    long l;
    while (true)
    {
      return;
      if (h.a(this.npu))
      {
        ab.i("MicroMsg.GIF.MMWXGFDrawable", "Cpan This WXGF had been recycle.");
        AppMethodBeat.o(62428);
      }
      else if ((h.i(this.npu) == null) || (h.i(this.npu).isRecycled()))
      {
        ab.i("MicroMsg.GIF.MMWXGFDrawable", "Cpan This WXGF is null or had been recycle.");
        AppMethodBeat.o(62428);
      }
      else if (h.g(this.npu) == 0L)
      {
        ab.i("MicroMsg.GIF.MMWXGFDrawable", "Cpan This WXGF JNIHandle is null.");
        com.tencent.mm.plugin.report.service.h.pYm.a(401L, 18L, 1L, false);
        AppMethodBeat.o(62428);
      }
      else
      {
        h.a(this.npu, true);
        l = System.currentTimeMillis();
        i = MMWXGFJNI.nativeDecodeBufferFrame(h.g(this.npu), null, 0, h.i(this.npu), h.j(this.npu));
        if (i == -904)
        {
          ab.i("MicroMsg.GIF.MMWXGFDrawable", "nativeDecodeBufferFrame failed. func is null.");
          com.tencent.mm.plugin.report.service.h.pYm.a(401L, 8L, 1L, false);
          AppMethodBeat.o(62428);
        }
        else
        {
          if (i == -909)
          {
            ab.i("MicroMsg.GIF.MMWXGFDrawable", "nativeDecodeBufferFrame failed. frame is null.");
            com.tencent.mm.plugin.report.service.h.pYm.a(401L, 11L, 1L, false);
          }
          while (i != -1)
          {
            h.a(this.npu, h.b(this.npu) + 1);
            if ((h.b(this.npu) < h.k(this.npu) - 1) && (i != 1))
              break label357;
            h.a(this.npu, -1);
            i = MMWXGFJNI.nativeRewindBuffer(h.g(this.npu));
            if (i == 0)
              break label357;
            if (i == -905)
              com.tencent.mm.plugin.report.service.h.pYm.a(711L, 9L, 1L, false);
            ab.w("MicroMsg.GIF.MMWXGFDrawable", "Cpan Rewind buffer failed.");
            AppMethodBeat.o(62428);
            break;
          }
          ab.i("MicroMsg.GIF.MMWXGFDrawable", "nativeDecodeBufferFrame failed.");
          AppMethodBeat.o(62428);
        }
      }
    }
    label357: h.b(this.npu, System.currentTimeMillis() - l);
    boolean bool;
    if (h.l(this.npu) != 0L)
    {
      h.c(this.npu, h.l(this.npu) - h.m(this.npu) - h.n(this.npu));
      if (h.f(this.npu) < 0L)
      {
        ab.d("MicroMsg.GIF.MMWXGFDrawable", "Render time:%d InvalidateUseTime:%d NextRealInvalidateTime:%d mNextFrameDuration:%d mCurrentFrameIndex:%d", new Object[] { Long.valueOf(h.m(this.npu)), Long.valueOf(h.n(this.npu)), Long.valueOf(h.f(this.npu)), Long.valueOf(h.l(this.npu)), Integer.valueOf(h.b(this.npu)) });
        if (h.f(this.npu) < -100L)
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(401L, 16L, 1L, false);
          com.tencent.mm.plugin.report.service.h.pYm.a(401L, 17L, Math.abs(h.f(this.npu)), false);
          if ((!WXHardCoderJNI.hcGifEnable) && (!WXHardCoderJNI.hcGifFrameEnable))
            break label737;
          bool = true;
          label567: WXHardCoderJNI.stopPerformance(bool, h.o(this.npu));
          localh = this.npu;
          bool = WXHardCoderJNI.hcGifFrameEnable;
          int j = WXHardCoderJNI.hcGifFrameDelay;
          int k = WXHardCoderJNI.hcGifFrameCPU;
          int m = WXHardCoderJNI.hcGifFrameIO;
          if (!WXHardCoderJNI.hcGifFrameThr)
            break label743;
          i = Process.myTid();
          label616: h.b(localh, WXHardCoderJNI.startPerformance(bool, j, k, m, i, WXHardCoderJNI.hcGifFrameTimeout, 602, WXHardCoderJNI.hcGifFrameAction, "MicroMsg.GIF.MMWXGFDrawable"));
        }
      }
    }
    h localh = this.npu;
    Runnable localRunnable = h.e(this.npu);
    if (h.f(this.npu) > 0L)
    {
      l = h.f(this.npu);
      label680: h.a(localh, localRunnable, l);
      if (h.j(this.npu)[0] <= 0)
        break label753;
    }
    label737: label743: label753: for (int i = h.j(this.npu)[0]; ; i = 100)
    {
      h.d(this.npu, i);
      h.a(this.npu, false);
      AppMethodBeat.o(62428);
      break;
      bool = false;
      break label567;
      i = 0;
      break label616;
      l = 0L;
      break label680;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gif.h.4
 * JD-Core Version:    0.6.2
 */