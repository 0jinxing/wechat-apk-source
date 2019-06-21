package com.tencent.mm.plugin.gallery.model;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

public final class g
{
  private ak fbD;
  HandlerThread mOa;
  HandlerThread mOb;
  HandlerThread mOc;
  ak mOd;
  ak mOe;
  ak mOf;

  public g()
  {
    AppMethodBeat.i(21273);
    ab.d("MicroMsg.GalleryHandlerThread", "galleryhandlerthread init");
    this.mOa = new HandlerThread("galleryDecodeHanlderThread", 10);
    this.mOd = null;
    this.mOa.start();
    this.mOb = new HandlerThread("galleryQueryHandlerThread", 1);
    this.mOe = null;
    this.mOb.start();
    this.mOc = new HandlerThread("galleryAfterTakePicThreadThread", 0);
    this.mOf = null;
    this.mOc.start();
    AppMethodBeat.o(21273);
  }

  private ak bCm()
  {
    AppMethodBeat.i(21274);
    if ((this.mOd == null) && (this.mOa != null))
      this.mOd = new ak(this.mOa.getLooper());
    ak localak = this.mOd;
    AppMethodBeat.o(21274);
    return localak;
  }

  public final void W(Runnable paramRunnable)
  {
    AppMethodBeat.i(21278);
    ak localak = bCm();
    if (localak == null)
    {
      ab.e("MicroMsg.GalleryHandlerThread", "post to decode worker, but decode handler is null");
      AppMethodBeat.o(21278);
    }
    while (true)
    {
      return;
      localak.post(paramRunnable);
      AppMethodBeat.o(21278);
    }
  }

  public final void X(Runnable paramRunnable)
  {
    AppMethodBeat.i(21279);
    ak localak = bCm();
    if (localak == null)
    {
      ab.e("MicroMsg.GalleryHandlerThread", "post at front of queue, but decode handler is null");
      AppMethodBeat.o(21279);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.GalleryHandlerThread", "postAtFrontOfQueue:[%b]", new Object[] { Boolean.valueOf(localak.postAtFrontOfQueueV2(paramRunnable)) });
      AppMethodBeat.o(21279);
    }
  }

  public final ak bCn()
  {
    AppMethodBeat.i(21276);
    if (this.mOe == null)
      this.mOe = new ak(this.mOb.getLooper());
    ak localak = this.mOe;
    AppMethodBeat.o(21276);
    return localak;
  }

  public final ak bCo()
  {
    AppMethodBeat.i(21277);
    if (this.fbD == null)
      this.fbD = new ak(Looper.getMainLooper());
    ak localak = this.fbD;
    AppMethodBeat.o(21277);
    return localak;
  }

  public final void bCp()
  {
    AppMethodBeat.i(21280);
    ak localak = bCm();
    if (localak == null)
    {
      ab.e("MicroMsg.GalleryHandlerThread", "remove all work handler callbacks, but decode handler is null");
      AppMethodBeat.o(21280);
    }
    while (true)
    {
      return;
      localak.removeCallbacksAndMessages(null);
      AppMethodBeat.o(21280);
    }
  }

  public final void d(Runnable paramRunnable)
  {
    AppMethodBeat.i(21281);
    bCo().post(paramRunnable);
    AppMethodBeat.o(21281);
  }

  public final void wp(int paramInt)
  {
    AppMethodBeat.i(21275);
    try
    {
      Process.setThreadPriority(this.mOc.getThreadId(), paramInt);
      AppMethodBeat.o(21275);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.GalleryHandlerThread", localException, "", new Object[0]);
        AppMethodBeat.o(21275);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.model.g
 * JD-Core Version:    0.6.2
 */