package com.google.android.exoplayer2.h;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.exoplayer2.i.a;
import com.google.android.exoplayer2.i.t;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

@SuppressLint({"HandlerLeak"})
final class s$b<T extends s.c> extends Handler
  implements Runnable
{
  private final T bqL;
  private final s.a<T> bqM;
  public final int bqN;
  private final long bqO;
  private IOException bqP;
  private int bqQ;
  private volatile Thread bqR;
  private volatile boolean released;

  public s$b(Looper paramLooper, T paramT, s.a<T> parama, int paramInt, long paramLong)
  {
    super(paramT);
    this.bqL = parama;
    this.bqM = paramInt;
    this.bqN = paramLong;
    Object localObject;
    this.bqO = localObject;
  }

  private void execute()
  {
    AppMethodBeat.i(95848);
    this.bqP = null;
    this.bqS.bqJ.execute(this.bqS.bqK);
    AppMethodBeat.o(95848);
  }

  private void finish()
  {
    this.bqS.bqK = null;
  }

  public final void cancel(boolean paramBoolean)
  {
    AppMethodBeat.i(95845);
    this.released = paramBoolean;
    this.bqP = null;
    if (hasMessages(0))
    {
      removeMessages(0);
      if (!paramBoolean)
        sendEmptyMessage(1);
    }
    while (true)
    {
      if (paramBoolean)
      {
        finish();
        long l = SystemClock.elapsedRealtime();
        this.bqM.a(this.bqL, l, l - this.bqO, true);
      }
      AppMethodBeat.o(95845);
      return;
      this.bqL.se();
      if (this.bqR != null)
        this.bqR.interrupt();
    }
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(95847);
    if (this.released)
      AppMethodBeat.o(95847);
    long l1;
    long l2;
    while (true)
    {
      return;
      if (paramMessage.what == 0)
      {
        execute();
        AppMethodBeat.o(95847);
      }
      else
      {
        if (paramMessage.what == 4)
        {
          paramMessage = (Error)paramMessage.obj;
          AppMethodBeat.o(95847);
          throw paramMessage;
        }
        finish();
        l1 = SystemClock.elapsedRealtime();
        l2 = l1 - this.bqO;
        if (!this.bqL.sf())
          break;
        this.bqM.a(this.bqL, l1, l2, false);
        AppMethodBeat.o(95847);
      }
    }
    switch (paramMessage.what)
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    do
    {
      AppMethodBeat.o(95847);
      break;
      this.bqM.a(this.bqL, l1, l2, false);
      AppMethodBeat.o(95847);
      break;
      this.bqM.a(this.bqL, l1, l2);
      AppMethodBeat.o(95847);
      break;
      this.bqP = ((IOException)paramMessage.obj);
      i = this.bqM.a(this.bqL, l1, l2, this.bqP);
      if (i == 3)
      {
        this.bqS.biw = this.bqP;
        AppMethodBeat.o(95847);
        break;
      }
    }
    while (i == 2);
    if (i == 1);
    for (int i = 1; ; i = this.bqQ + 1)
    {
      this.bqQ = i;
      start(Math.min((this.bqQ - 1) * 1000, 5000));
      break;
    }
  }

  public final void run()
  {
    AppMethodBeat.i(95846);
    try
    {
      this.bqR = Thread.currentThread();
      if (!this.bqL.sf())
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("load:");
        t.beginSection(this.bqL.getClass().getSimpleName());
      }
      try
      {
        this.bqL.sg();
        t.endSection();
        if (!this.released)
          sendEmptyMessage(2);
        AppMethodBeat.o(95846);
        return;
      }
      finally
      {
        t.endSection();
        AppMethodBeat.o(95846);
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        if (!this.released)
          obtainMessage(3, localIOException).sendToTarget();
        AppMethodBeat.o(95846);
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
      {
        a.checkState(this.bqL.sf());
        if (!this.released)
          sendEmptyMessage(2);
        AppMethodBeat.o(95846);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        if (!this.released)
          obtainMessage(3, new s.f(localException)).sendToTarget();
        AppMethodBeat.o(95846);
      }
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      while (true)
      {
        if (!this.released)
          obtainMessage(3, new s.f(localOutOfMemoryError)).sendToTarget();
        AppMethodBeat.o(95846);
      }
    }
    catch (Error localError)
    {
      if (!this.released)
        obtainMessage(4, localError).sendToTarget();
      AppMethodBeat.o(95846);
      throw localError;
    }
  }

  public final void start(long paramLong)
  {
    AppMethodBeat.i(95844);
    boolean bool;
    if (this.bqS.bqK == null)
    {
      bool = true;
      a.checkState(bool);
      this.bqS.bqK = this;
      if (paramLong <= 0L)
        break label53;
      sendEmptyMessageDelayed(0, paramLong);
      AppMethodBeat.o(95844);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label53: execute();
      AppMethodBeat.o(95844);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.h.s.b
 * JD-Core Version:    0.6.2
 */