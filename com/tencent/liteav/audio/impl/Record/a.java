package com.tencent.liteav.audio.impl.Record;

import android.content.Context;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public class a
  implements Runnable
{
  private WeakReference<h> a;
  private Context b;
  private int c;
  private int d;
  private int e;
  private boolean f;
  private Thread g;
  private byte[] h;

  private void a(byte[] paramArrayOfByte, int paramInt, long paramLong)
  {
    AppMethodBeat.i(66647);
    h localh = null;
    while (true)
    {
      try
      {
        if (this.a != null)
          localh = (h)this.a.get();
        if (localh != null)
        {
          localh.onAudioRecordPCM(paramArrayOfByte, paramInt, paramLong);
          AppMethodBeat.o(66647);
          return;
        }
      }
      finally
      {
        AppMethodBeat.o(66647);
      }
      TXCLog.e("AudioCenter:TXCAudioBGMRecord", "onRecordPcmData:no callback");
      AppMethodBeat.o(66647);
    }
  }

  private void c()
  {
    AppMethodBeat.i(66648);
    h localh = null;
    while (true)
    {
      try
      {
        if (this.a != null)
          localh = (h)this.a.get();
        if (localh != null)
        {
          localh.onAudioRecordStart();
          AppMethodBeat.o(66648);
          return;
        }
      }
      finally
      {
        AppMethodBeat.o(66648);
      }
      TXCLog.e("AudioCenter:TXCAudioBGMRecord", "onRecordStart:no callback");
      AppMethodBeat.o(66648);
    }
  }

  private void d()
  {
    AppMethodBeat.i(66649);
    h localh = null;
    while (true)
    {
      try
      {
        if (this.a != null)
          localh = (h)this.a.get();
        if (localh != null)
        {
          localh.onAudioRecordStop();
          AppMethodBeat.o(66649);
          return;
        }
      }
      finally
      {
        AppMethodBeat.o(66649);
      }
      TXCLog.e("AudioCenter:TXCAudioBGMRecord", "onRecordStop:no callback");
      AppMethodBeat.o(66649);
    }
  }

  public void a()
  {
    AppMethodBeat.i(66646);
    this.f = false;
    long l = System.currentTimeMillis();
    if ((this.g != null) && (this.g.isAlive()) && (Thread.currentThread().getId() != this.g.getId()));
    try
    {
      this.g.join();
      TXCLog.i("AudioCenter:TXCAudioBGMRecord", "stop record cost time(MS): " + (System.currentTimeMillis() - l));
      this.g = null;
      AppMethodBeat.o(66646);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        TXCLog.e("AudioCenter:TXCAudioBGMRecord", "record stop Exception: " + localException.getMessage());
    }
  }

  public void a(Context paramContext, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(66645);
    a();
    this.b = paramContext;
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = true;
    this.g = new Thread(this, "AudioSysRecord Thread");
    this.g.start();
    AppMethodBeat.o(66645);
  }

  public void a(h paramh)
  {
    try
    {
      AppMethodBeat.i(66644);
      if (paramh == null)
      {
        this.a = null;
        AppMethodBeat.o(66644);
      }
      while (true)
      {
        return;
        WeakReference localWeakReference = new java/lang/ref/WeakReference;
        localWeakReference.<init>(paramh);
        this.a = localWeakReference;
        AppMethodBeat.o(66644);
      }
    }
    finally
    {
    }
    throw paramh;
  }

  public boolean b()
  {
    return this.f;
  }

  public void run()
  {
    AppMethodBeat.i(66650);
    if (!this.f)
    {
      TXCLog.w("AudioCenter:TXCAudioBGMRecord", "audio record: abandom start audio sys record thread!");
      AppMethodBeat.o(66650);
    }
    while (true)
    {
      return;
      c();
      int i = this.c;
      int j = this.d;
      int k = this.e;
      int m = j * 1024 * k / 8;
      this.h = new byte[m];
      Arrays.fill(this.h, (byte)0);
      long l1 = 0L;
      long l2 = System.currentTimeMillis();
      while ((this.f) && (!Thread.interrupted()))
        if ((System.currentTimeMillis() - l2) * i * j * k / 8L / 1000L - l1 < m)
        {
          try
          {
            Thread.sleep(10L);
          }
          catch (InterruptedException localInterruptedException)
          {
          }
        }
        else
        {
          l1 += this.h.length;
          a(this.h, this.h.length, TXCTimeUtil.getTimeTick());
        }
      d();
      AppMethodBeat.o(66650);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.audio.impl.Record.a
 * JD-Core Version:    0.6.2
 */