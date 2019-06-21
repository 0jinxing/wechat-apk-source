package com.tencent.liteav.audio.impl.Record;

import android.content.Context;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class d extends b
  implements Runnable
{
  private boolean d;
  private Thread e;
  private byte[] f;
  private int g;
  private int h;

  public d()
  {
    AppMethodBeat.i(66663);
    this.d = false;
    this.e = null;
    this.f = new byte[20480];
    this.g = 0;
    this.h = 0;
    AppMethodBeat.o(66663);
  }

  private int e()
  {
    return (this.g + this.f.length - this.h) % this.f.length;
  }

  private int f()
  {
    AppMethodBeat.i(66667);
    int i = this.f.length;
    int j = e();
    AppMethodBeat.o(66667);
    return i - j;
  }

  public void a(Context paramContext, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(66664);
    super.a(paramContext, paramInt1, paramInt2, paramInt3);
    c();
    this.d = true;
    this.e = new Thread(this, "AudioCustomRecord Thread");
    this.e.start();
    AppMethodBeat.o(66664);
  }

  public void a(byte[] paramArrayOfByte)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(66666);
        if ((paramArrayOfByte == null) || (f() < paramArrayOfByte.length))
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("缓冲区不够. 自定义数据长度 = ");
          if (paramArrayOfByte == null)
          {
            i = -1;
            TXCLog.e("AudioCenter:TXCAudioCustomRecord", i + ", 剩余缓冲区长度 = " + f());
            AppMethodBeat.o(66666);
            return;
          }
          i = paramArrayOfByte.length;
          continue;
        }
        if (this.g + paramArrayOfByte.length <= this.f.length)
        {
          System.arraycopy(paramArrayOfByte, 0, this.f, this.g, paramArrayOfByte.length);
          this.g += paramArrayOfByte.length;
          AppMethodBeat.o(66666);
          continue;
        }
      }
      finally
      {
      }
      int i = this.f.length - this.g;
      System.arraycopy(paramArrayOfByte, 0, this.f, this.g, i);
      this.g = (paramArrayOfByte.length - i);
      System.arraycopy(paramArrayOfByte, i, this.f, 0, this.g);
      AppMethodBeat.o(66666);
    }
  }

  public void c()
  {
    AppMethodBeat.i(66665);
    this.d = false;
    long l = System.currentTimeMillis();
    if ((this.e != null) && (this.e.isAlive()) && (Thread.currentThread().getId() != this.e.getId()));
    try
    {
      this.e.join();
      TXCLog.i("AudioCenter:TXCAudioCustomRecord", "stop record cost time(MS): " + (System.currentTimeMillis() - l));
      this.e = null;
      AppMethodBeat.o(66665);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
        TXCLog.e("AudioCenter:TXCAudioCustomRecord", "custom record stop Exception: " + localInterruptedException.getMessage());
    }
  }

  public boolean d()
  {
    return this.d;
  }

  public void run()
  {
    AppMethodBeat.i(66668);
    if (!this.d)
    {
      TXCLog.w("AudioCenter:TXCAudioCustomRecord", "audio custom record: abandom start audio sys record thread!");
      AppMethodBeat.o(66668);
    }
    while (true)
    {
      return;
      a();
      int i = this.b * 1024 * this.c / 8;
      byte[] arrayOfByte = new byte[i];
      while ((this.d) && (!Thread.interrupted()))
        if (i <= e())
          try
          {
            if (this.h + i <= this.f.length)
            {
              System.arraycopy(this.f, this.h, arrayOfByte, 0, i);
              this.h += i;
            }
            while (true)
            {
              a(arrayOfByte, i, TXCTimeUtil.getTimeTick());
              break;
              int j = this.f.length - this.h;
              System.arraycopy(this.f, this.h, arrayOfByte, 0, j);
              this.h = (i - j);
              System.arraycopy(this.f, 0, arrayOfByte, j, this.h);
            }
          }
          finally
          {
            AppMethodBeat.o(66668);
          }
        else
          try
          {
            Thread.sleep(10L);
          }
          catch (InterruptedException localInterruptedException)
          {
          }
      b();
      AppMethodBeat.o(66668);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.audio.impl.Record.d
 * JD-Core Version:    0.6.2
 */